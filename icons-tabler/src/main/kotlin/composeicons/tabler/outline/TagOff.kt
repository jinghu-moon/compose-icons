package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TagOff: ImageVector
    get() {
        if (_tagOff != null) return _tagOff!!
        _tagOff = tablerOutlineIcon(
            name = "TagOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.149 7.144c-.147 .142-.192 .358-.115 .547 .077 .189 .262 .311 .466 .309 .127 0 .249-.048 .341-.135")
            addPathData("M3.883 3.875C3.317 4.437 2.999 5.202 3 6v5.172c0 .53 .211 1.039 .586 1.414l7.71 7.71c.941 .941 2.467 .941 3.408 0l2.796-2.796M19.505 15.495l.79-.79c.452-.452 .707-1.065 .707-1.705 0-.64-.254-1.253-.707-1.705L12.585 3.585C12.21 3.211 11.703 3 11.173 3h-4.173")
            addPathData("M3 3 21 21")
        }
        return _tagOff!!
    }

private var _tagOff: ImageVector? = null
