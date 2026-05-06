package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BeerOff: ImageVector
    get() {
        if (_beerOff != null) return _beerOff!!
        _beerOff = tablerOutlineIcon(
            name = "BeerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 7v1.111c0 1.242 .29 2.467 .845 3.578l.31 .622c.556 1.111 .845 2.336 .845 3.578v4.111h6v-4.111c-0-.284 .015-.568 .045-.85M15.998 12.004l.157-.315c.556-1.111 .845-2.336 .845-3.578v-4.111h-9")
            addPathData("M7 8h1M12 8h5")
            addPathData("M3 3 21 21")
        }
        return _beerOff!!
    }

private var _beerOff: ImageVector? = null
