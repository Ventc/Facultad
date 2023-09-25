import { Router } from "express";
import { profile, signin, signup, singout } from "../controllers/auth.controller";

const router = Router();

router.post("/signin", signin);

router.post("/signup", signup);

router.post("/signout", singout);

router.post("/profile", profile);

export default router;