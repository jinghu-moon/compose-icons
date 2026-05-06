package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BellRinging2: ImageVector
    get() {
        if (_bellRinging2 != null) return _bellRinging2!!
        _bellRinging2 = tablerFilledIcon(
            name = "BellRinging2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.63 17.531c.612 .611 .211 1.658-.652 1.706C7.842 19.301 6.732 18.877 5.928 18.071 5.123 17.267 4.699 16.158 4.763 15.022c.046-.826 1.005-1.228 1.624-.726l.082 .074 3.161 3.16Z")
            addPathData("M20.071 3.929c.96 .96 1.134 2.41 .52 3.547l-.09 .153-.024 .036c.689 2.473 .152 5.127-1.446 7.137l-.183 .223-.191 .218-2.073 2.072-.08 .112c-.424 .617-.602 1.371-.499 2.113l.035 .201 .045 .185c.264 .952-.853 1.645-1.585 1.051l-.086-.078L3.101 9.586C2.374 8.859 3.084 7.641 4.074 7.915c.854 .237 1.769 .084 2.5-.418l.116-.086L8.791 5.311C10.754 3.524 13.476 2.827 16.056 3.451l.278 .071 .037-.023c1.071-.662 2.441-.585 3.432 .192l.14 .117 .128 .12Z")
        }
        return _bellRinging2!!
    }

private var _bellRinging2: ImageVector? = null
