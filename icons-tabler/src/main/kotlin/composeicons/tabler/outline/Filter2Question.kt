package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Question: ImageVector
    get() {
        if (_filter2Question != null) return _filter2Question!!
        _filter2Question = tablerOutlineIcon(
            name = "Filter2Question",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M6 12h10.5")
            addPathData("M9 18h5")
            addPathData("M19 22v.01")
            addPathData("M19 19c.448-.001 .883-.153 1.235-.431 .352-.278 .6-.666 .706-1.101 .105-.436 .061-.894-.125-1.302-.186-.408-.504-.742-.902-.948-.398-.204-.853-.267-1.291-.179-.438 .088-.834 .321-1.123 .662")
        }
        return _filter2Question!!
    }

private var _filter2Question: ImageVector? = null
