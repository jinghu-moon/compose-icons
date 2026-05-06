package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Dna2: ImageVector
    get() {
        if (_dna2 != null) return _dna2!!
        _dna2 = tablerOutlineIcon(
            name = "Dna2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 3v1c-.01 3.352-1.68 6.023-5.008 8.014-3.328 1.99 3.336-2 .008-.014C8.672 13.99 7 16.662 6.992 20.014v1")
            addPathData("M17 21.014v-1C16.99 16.662 15.32 13.991 11.992 12c-3.328-1.99 3.336 2 .008 .014C8.672 10.023 7 7.352 6.992 4v-1")
            addPathData("M7 4h10")
            addPathData("M7 20h10")
            addPathData("M8 8h8")
            addPathData("M8 16h8")
        }
        return _dna2!!
    }

private var _dna2: ImageVector? = null
