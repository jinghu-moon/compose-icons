package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RewindForward50: ImageVector
    get() {
        if (_rewindForward50 != null) return _rewindForward50!!
        _rewindForward50 = tablerOutlineIcon(
            name = "RewindForward50",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.007 16.478C3.149 14.821 2.507 12.189 3.394 9.863 4.28 7.537 6.511 6 9 6h11")
            addPathData("M15 15.5v3c0 .828 .672 1.5 1.5 1.5C17.328 20 18 19.328 18 18.5v-3C18 14.672 17.328 14 16.5 14 15.672 14 15 14.672 15 15.5")
            addPathData("M17 9 20 6 17 3")
            addPathData("M9 20h1.5C11.328 20 12 19.328 12 18.5 12 17.672 11.328 17 10.5 17h-1.5v-3h3")
        }
        return _rewindForward50!!
    }

private var _rewindForward50: ImageVector? = null
