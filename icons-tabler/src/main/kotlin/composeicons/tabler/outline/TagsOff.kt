package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TagsOff: ImageVector
    get() {
        if (_tagsOff != null) return _tagsOff!!
        _tagsOff = tablerOutlineIcon(
            name = "TagsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.296 12.296 10.586 6.586")
            addPathData("M6 6h-1C3.895 6 3 6.895 3 8v4.172c0 .53 .211 1.039 .586 1.414l5.71 5.71c.941 .941 2.467 .941 3.408 0l3.278-3.278")
            addPathData("M18 19l.496-.496")
            addPathData("M20.384 16.367c1.061-1.885 .737-4.245-.792-5.775L15 6")
            addPathData("M7 10h-.01")
            addPathData("M3 3 21 21")
        }
        return _tagsOff!!
    }

private var _tagsOff: ImageVector? = null
