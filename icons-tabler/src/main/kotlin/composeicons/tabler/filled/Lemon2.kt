package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Lemon2: ImageVector
    get() {
        if (_lemon2 != null) return _lemon2!!
        _lemon2 = tablerFilledIcon(
            name = "Lemon2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 3c1.123-0 2.153 .627 2.667 1.626 .515 .999 .428 2.201-.224 3.116l-.06 .076 .037 .087c1.269 3.187 .428 7.084-2.203 9.872L18 18c-2.8 2.8-6.823 3.723-10.095 2.42l-.087-.036-.133 .098c-.618 .42-1.37 .594-2.11 .488l-.205-.036C4.394 20.725 3.586 20.044 3.214 19.117c-.371-.927-.258-1.977 .304-2.803l.098-.134-.036-.085C2.311 12.908 3.152 9.011 5.783 6.223L6 6C8.8 3.2 12.823 2.277 16.095 3.58l.085 .037 .124-.091c.442-.304 .958-.483 1.493-.52Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _lemon2!!
    }

private var _lemon2: ImageVector? = null
