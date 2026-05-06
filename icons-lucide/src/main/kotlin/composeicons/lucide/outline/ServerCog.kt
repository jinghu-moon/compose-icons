package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ServerCog: ImageVector
    get() {
        if (_serverCog != null) return _serverCog!!
        _serverCog = lucideOutlineIcon(
            name = "ServerCog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.852 14.772l-.383 .923")
            addPathData("M13.148 14.772c1.531-.634 2.258-2.389 1.624-3.92C14.138 9.321 12.383 8.594 10.852 9.228l-.383-.923")
            addPathData("M13.148 9.228l.383-.923")
            addPathData("M13.53 15.696l-.382-.924c-1.531 .634-3.286-.093-3.92-1.624C8.594 11.617 9.321 9.862 10.852 9.228")
            addPathData("M14.772 10.852l.923-.383")
            addPathData("M14.772 13.148l.923 .383")
            addPathData("M4.5 10h-.5C2.895 10 2 9.105 2 8v-4C2 2.895 2.895 2 4 2h16c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-.5")
            addPathData("M4.5 14h-.5c-1.105 0-2 .895-2 2v4c0 1.105 .895 2 2 2h16c1.105 0 2-.895 2-2v-4c0-1.105-.895-2-2-2h-.5")
            addPathData("M6 18h.01")
            addPathData("M6 6h.01")
            addPathData("M9.228 10.852l-.923-.383")
            addPathData("M9.228 13.148l-.923 .383")
        }
        return _serverCog!!
    }

private var _serverCog: ImageVector? = null
