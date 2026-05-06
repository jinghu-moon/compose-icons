package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ScubaDivingTank: ImageVector
    get() {
        if (_scubaDivingTank != null) return _scubaDivingTank!!
        _scubaDivingTank = tablerFilledIcon(
            name = "ScubaDivingTank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 17v2c0 1.657-1.343 3-3 3h-4C8.343 22 7 20.657 7 19v-2Z")
            addPathData("M8 2c.715 0 1.375 .381 1.732 1h1.15c.284-.319 .691-.502 1.118-.502 .427 0 .834 .183 1.118 .502h1.882c.552 0 1 .448 1 1 0 .552-.448 1-1 1l-1.883 .001c-.037 .04-.075 .079-.115 .116v.983C15.33 6.576 17.001 8.624 17 11v4h-10v-4C7 8.624 8.672 6.575 11 6.1v-.983c-.041-.037-.08-.076-.117-.116h-1.151C9.246 5.841 8.228 6.211 7.316 5.879 6.404 5.547 5.862 4.608 6.031 3.653 6.199 2.697 7.03 2 8 2")
        }
        return _scubaDivingTank!!
    }

private var _scubaDivingTank: ImageVector? = null
