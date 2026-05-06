package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Dna: ImageVector
    get() {
        if (_dna != null) return _dna!!
        _dna = tablerOutlineIcon(
            name = "Dna",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.828 14.828c1.04-1.004 1.457-2.492 1.091-3.89C15.553 9.539 14.461 8.447 13.062 8.081 11.664 7.715 10.176 8.132 9.172 9.172c-1.516 1.57-1.494 4.064 .049 5.607 1.543 1.543 4.038 1.565 5.607 .049")
            addPathData("M9.172 20.485c1.562-1.562 1.562-4.095 0-5.657-1.562-1.562-4.095-1.562-5.657 0")
            addPathData("M14.828 3.515c-1.562 1.562-1.562 4.095 0 5.657 1.562 1.562 4.095 1.562 5.657 0")
        }
        return _dna!!
    }

private var _dna: ImageVector? = null
