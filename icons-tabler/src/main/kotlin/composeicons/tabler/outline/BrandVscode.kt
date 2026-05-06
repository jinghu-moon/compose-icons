package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandVscode: ImageVector
    get() {
        if (_brandVscode != null) return _brandVscode!!
        _brandVscode = tablerOutlineIcon(
            name = "BrandVscode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 3v18l4-2.5v-13L16 3")
            addPathData("M9.165 13.903 5 17.5l-2-1L7.333 12M9.068 10.198 16 3v5l-4.795 4.141")
            addPathData("M16 16.5 5 6.5l-2 1L16 21")
        }
        return _brandVscode!!
    }

private var _brandVscode: ImageVector? = null
