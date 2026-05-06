package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BeefOff: ImageVector
    get() {
        if (_beefOff != null) return _beefOff!!
        _beefOff = lucideOutlineIcon(
            name = "BeefOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.771 6.109c.883-.269 1.843-.029 2.496 .624 .653 .653 .893 1.613 .624 2.496")
            addPathData("M17.852 12.185C19.625 9.604 19.305 6.125 17.092 3.91 14.878 1.695 11.399 1.373 8.817 3.145")
            addPathData("M18.013 18.013C15.029 20.349 10.831 22 7 22 5.865 21.998 4.827 21.356 4.32 20.34L2.4 16.5")
            addPathData("M18.5 6l2.19 4.5c.467 1.436 .418 2.99-.139 4.393")
            addPathData("M2 2 22 22")
            addPathData("M6.355 6.37c-.026 .076-.051 .153-.075 .23C5.18 9.73 5.5 10.5 3.1 12.68c-.98 .803-1.349 2.136-.923 3.329C2.603 17.202 3.733 17.999 5 18c3.356 0 6.993-1.267 9.85-3.151")
        }
        return _beefOff!!
    }

private var _beefOff: ImageVector? = null
