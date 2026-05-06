package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cctv: ImageVector
    get() {
        if (_cctv != null) return _cctv!!
        _cctv = lucideOutlineIcon(
            name = "Cctv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.75 12h3.632c.346 0 .668 .18 .85 .474 .182 .295 .199 .663 .044 .973l-2.034 4.069c-.157 .314-.467 .522-.816 .55-.35 .027-.688-.13-.892-.416L15.41 14.68")
            addPathData("M17.106 9.053c.494 .247 .694 .847 .447 1.341l-3.106 6.211c-.119 .237-.327 .418-.578 .502-.252 .084-.526 .064-.764-.055L3.61 12.3C2.174 11.577 1.593 9.829 2.31 8.39L3.69 5.6C4.037 4.908 4.646 4.382 5.381 4.138c.735-.244 1.537-.186 2.229 .162Z")
            addPathData("M2 19h3.76c.76 .005 1.458-.421 1.8-1.1L9 15")
            addPathData("M2 21v-4")
            addPathData("M7 9h.01")
        }
        return _cctv!!
    }

private var _cctv: ImageVector? = null
