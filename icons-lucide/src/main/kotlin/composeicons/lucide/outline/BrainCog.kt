package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BrainCog: ImageVector
    get() {
        if (_brainCog != null) return _brainCog!!
        _brainCog = lucideOutlineIcon(
            name = "BrainCog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.852 14.772l-.383 .923")
            addPathData("M10.852 9.228l-.383-.923")
            addPathData("M13.148 14.772l.382 .924")
            addPathData("M13.531 8.305l-.383 .923")
            addPathData("M14.772 10.852l.923-.383")
            addPathData("M14.772 13.148l.923 .383")
            addPathData("M17.598 6.5c.631-1.092 .511-2.462-.3-3.428C16.487 2.105 15.159 1.749 13.974 2.181 12.789 2.612 12 3.739 12 5 12.001 3.63 11.074 2.433 9.746 2.092 8.419 1.751 7.029 2.353 6.37 3.554c-.264 .48-.391 1.024-.368 1.571C4.811 5.431 3.827 6.269 3.334 7.396c-.493 1.127-.44 2.418 .143 3.5")
            addPathData("M17.998 5.125c1.191 .306 2.175 1.144 2.668 2.271 .493 1.127 .44 2.418-.143 3.5")
            addPathData("M19.505 10.294c1.772 .72 2.787 2.593 2.421 4.47-.365 1.877-2.009 3.233-3.921 3.236")
            addPathData("M4.032 17.483c-.248 1.892 .875 3.697 2.683 4.309 1.808 .612 3.796-.138 4.749-1.792 .18-.311 .892-.311 1.072 0 .953 1.653 2.941 2.404 4.748 1.792 1.808-.612 2.931-2.416 2.684-4.308")
            addPathData("M4.5 10.291c-1.776 .717-2.794 2.593-2.429 4.473C2.437 16.644 4.085 18.001 6 18")
            addPathData("M6.002 5.125c.02 .484 .158 .956 .4 1.375")
            addPathData("M9.228 10.852l-.923-.383")
            addPathData("M9.228 13.148l-.923 .383")
            addPathData("M15 12c0 1.657-1.343 3-3 3C10.343 15 9 13.657 9 12 9 10.343 10.343 9 12 9c1.657 0 3 1.343 3 3Z")
        }
        return _brainCog!!
    }

private var _brainCog: ImageVector? = null
