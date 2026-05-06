package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RewindBackward30: ImageVector
    get() {
        if (_rewindBackward30 != null) return _rewindBackward30!!
        _rewindBackward30 = tablerOutlineIcon(
            name = "RewindBackward30",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.007 16.466c1.85-1.66 2.485-4.29 1.597-6.611C19.715 7.533 17.486 6 15 6h-11")
            addPathData("M12 15.5v3c0 .828 .672 1.5 1.5 1.5C14.328 20 15 19.328 15 18.5v-3C15 14.672 14.328 14 13.5 14 12.672 14 12 14.672 12 15.5")
            addPathData("M6 14h1.5C8.328 14 9 14.672 9 15.5 9 16.328 8.328 17 7.5 17h-.5 .5C8.328 17 9 17.672 9 18.5 9 19.328 8.328 20 7.5 20h-1.5")
            addPathData("M7 9 4 6 7 3")
        }
        return _rewindBackward30!!
    }

private var _rewindBackward30: ImageVector? = null
