package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FunnelPlus: ImageVector
    get() {
        if (_funnelPlus != null) return _funnelPlus!!
        _funnelPlus = lucideOutlineIcon(
            name = "FunnelPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.354 3h-10.354c-.395 0-.753 .233-.913 .594-.16 .361-.093 .783 .171 1.076l7.225 7.989c.333 .368 .517 .845 .517 1.341v6c-0 .379 .214 .726 .553 .895l2 1c.31 .155 .678 .138 .973-.044 .295-.182 .474-.504 .474-.851v-7c0-.496 .184-.973 .517-1.341l1.218-1.348")
            addPathData("M16 6h6")
            addPathData("M19 3v6")
        }
        return _funnelPlus!!
    }

private var _funnelPlus: ImageVector? = null
