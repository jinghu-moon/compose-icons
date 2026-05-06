package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartPie: ImageVector
    get() {
        if (_chartPie != null) return _chartPie!!
        _chartPie = tablerFilledIcon(
            name = "ChartPie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.883 2.207c.987-.116 1.896 .547 2.087 1.522l.025 .167L12 4v7c0 .507 .38 .934 .883 .993L13 12h6.8c1.105 0 2 .895 2 2-0 .076-.009 .152-.026 .226-1.107 4.777-5.515 8.046-10.408 7.72C6.474 21.619 2.539 17.793 2.077 12.912 1.614 8.03 4.76 3.533 9.504 2.293l.27-.067 .11-.02Z")
            addPathData("M14 3.5v5.5c0 .552 .448 1 1 1h5.5c.324-0 .628-.157 .816-.422 .187-.265 .235-.604 .127-.91C20.437 5.811 18.19 3.563 15.333 2.557c-.306-.108-.646-.061-.911 .127-.265 .187-.422 .492-.422 .816Z")
        }
        return _chartPie!!
    }

private var _chartPie: ImageVector? = null
