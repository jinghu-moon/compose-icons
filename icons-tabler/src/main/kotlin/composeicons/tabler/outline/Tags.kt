package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tags: ImageVector
    get() {
        if (_tags != null) return _tags!!
        _tags = tablerOutlineIcon(
            name = "Tags",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 8v4.172c0 .53 .211 1.039 .586 1.414l5.71 5.71c.941 .941 2.467 .941 3.408 0l3.592-3.592c.941-.941 .941-2.467 0-3.408L10.586 6.586C10.211 6.211 9.702 6 9.172 6h-4.172C3.895 6 3 6.895 3 8")
            addPathData("M18 19l1.592-1.592c1.882-1.882 1.882-4.934 0-6.816L15 6")
            addPathData("M7 10h-.01")
        }
        return _tags!!
    }

private var _tags: ImageVector? = null
