package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlphabetArabic: ImageVector
    get() {
        if (_alphabetArabic != null) return _alphabetArabic!!
        _alphabetArabic = tablerOutlineIcon(
            name = "AlphabetArabic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 6v4")
            addPathData("M13 14h8Q18.482 11 17 11")
            addPathData("M13 6v9.958c0 .963 0 1.444-.293 1.743C12.414 18 11.943 18 11 18h-1")
            addPathData("M7 6v9.958c0 .963 0 1.444-.293 1.743C6.414 18 5.943 18 5 18h-1")
        }
        return _alphabetArabic!!
    }

private var _alphabetArabic: ImageVector? = null
