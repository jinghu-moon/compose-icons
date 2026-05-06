package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WheatOff: ImageVector
    get() {
        if (_wheatOff != null) return _wheatOff!!
        _wheatOff = tablerOutlineIcon(
            name = "WheatOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3 21 21")
            addPathData("M12 21.5v-3.75")
            addPathData("M5.916 9.49l-.43 1.604c-.712 2.659 .866 5.392 3.524 6.104 .997 .268 1.994 .535 2.99 .802v-3.44C11.836 12.455 10.363 10.681 8.323 10.134L5.916 9.49")
            addPathData("M10.249 4.251c.007-.007 .014-.014 .021-.021L12 2.5")
            addPathData("M10.27 11.15C9.681 10.561 9.253 9.832 9.024 9.032")
            addPathData("M14.988 8.988c.229-.834 .234-1.713 .013-2.549C14.78 5.603 14.342 4.841 13.73 4.23L12 2.5")
            addPathData("M16.038 10.037l2.046-.547 .431 1.604c.142 .53 .193 1.063 .162 1.583")
            addPathData("M16.506 16.505c-.45 .307-.959 .544-1.516 .694-.997 .268-1.994 .535-2.99 .801v-3.44c.055-.708 .259-1.379 .582-1.978")
        }
        return _wheatOff!!
    }

private var _wheatOff: ImageVector? = null
