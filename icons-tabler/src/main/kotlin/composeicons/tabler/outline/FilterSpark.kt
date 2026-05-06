package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FilterSpark: ImageVector
    get() {
        if (_filterSpark != null) return _filterSpark!!
        _filterSpark = tablerOutlineIcon(
            name = "FilterSpark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 12.5v-.5L19.414 7.586c.375-.375 .586-.884 .586-1.414v-2.172h-16v2.227c0 .497 .185 .977 .52 1.345L9 12.5v8.5l2-.667")
            addPathData("M18.5 22c.419-1.73 1.77-3.081 3.5-3.5C20.27 18.081 18.919 16.73 18.5 15c-.419 1.73-1.77 3.081-3.5 3.5 1.73 .419 3.081 1.77 3.5 3.5")
        }
        return _filterSpark!!
    }

private var _filterSpark: ImageVector? = null
