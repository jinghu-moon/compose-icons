package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FunnelX: ImageVector
    get() {
        if (_funnelX != null) return _funnelX!!
        _funnelX = lucideOutlineIcon(
            name = "FunnelX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.531 3h-9.531c-.395 0-.753 .233-.913 .594-.16 .361-.093 .783 .171 1.076l7.225 7.989c.333 .368 .517 .845 .517 1.341v6c-0 .379 .214 .726 .553 .895l2 1c.31 .155 .678 .138 .973-.044 .295-.182 .474-.504 .474-.851v-7c0-.496 .184-.973 .517-1.341l.427-.473")
            addPathData("M16.5 3.5l5 5")
            addPathData("M21.5 3.5l-5 5")
        }
        return _funnelX!!
    }

private var _funnelX: ImageVector? = null
