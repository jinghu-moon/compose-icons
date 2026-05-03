package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CreditCard: ImageVector
    get() {
        if (_creditCard != null) return _creditCard!!
        _creditCard = tablerFilledIcon(
            name = "CreditCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 10.000 L 22.000 16.000 C 22.000 18.209 20.209 20.000 18.000 20.000 L 6.000 20.000 C 3.791 20.000 2.000 18.209 2.000 16.000 L 2.000 10.000 L 22.000 10.000 ZM 7.010 14.000 L 7.000 14.000 C 6.448 14.003 6.002 14.453 6.005 15.005 C 6.008 15.557 6.458 16.003 7.010 16.000 C 7.562 16.000 8.010 15.552 8.010 15.000 C 8.010 14.448 7.562 14.000 7.010 14.000M 13.000 14.000 L 11.000 14.000 C 10.448 14.000 10.000 14.448 10.000 15.000 C 10.000 15.552 10.448 16.000 11.000 16.000 L 13.000 16.000 C 13.552 16.000 14.000 15.552 14.000 15.000 C 14.000 14.448 13.552 14.000 13.000 14.000 ZM 18.000 4.000 C 20.209 4.000 22.000 5.791 22.000 8.000 L 2.000 8.000 C 2.000 5.791 3.791 4.000 6.000 4.000 L 18.000 4.000 Z"),
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
        return _creditCard!!
    }

private var _creditCard: ImageVector? = null
