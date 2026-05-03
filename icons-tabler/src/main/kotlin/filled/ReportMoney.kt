package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ReportMoney: ImageVector
    get() {
        if (_reportMoney != null) return _reportMoney!!
        _reportMoney = tablerFilledIcon(
            name = "ReportMoney",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.997 4.170 C 19.197 4.593 20.000 5.727 20.000 7.000 L 20.000 19.000 C 20.000 20.657 18.657 22.000 17.000 22.000 L 7.000 22.000 C 5.343 22.000 4.000 20.657 4.000 19.000 L 4.000 7.000 C 4.000 5.727 4.803 4.593 6.003 4.170 C 6.094 6.311 7.857 8.000 10.000 8.000 L 14.000 8.000 C 16.053 8.000 17.773 6.446 17.980 4.403 ZM 12.000 10.000 C 11.448 10.000 11.000 10.448 11.000 11.000 L 11.000 11.050 C 9.741 11.306 8.881 12.473 9.010 13.751 C 9.139 15.029 10.216 16.001 11.500 16.000 L 12.500 16.000 C 12.776 16.000 13.000 16.224 13.000 16.500 C 13.000 16.776 12.776 17.000 12.500 17.000 L 10.000 17.000 C 9.448 17.000 9.000 17.448 9.000 18.000 C 9.000 18.552 9.448 19.000 10.000 19.000 L 11.000 19.000 C 11.000 19.552 11.448 20.000 12.000 20.000 C 12.552 20.000 13.000 19.552 13.000 19.000 L 13.000 18.950 C 14.259 18.694 15.119 17.527 14.990 16.249 C 14.861 14.971 13.784 13.999 12.500 14.000 L 11.500 14.000 C 11.224 14.000 11.000 13.776 11.000 13.500 C 11.000 13.224 11.224 13.000 11.500 13.000 L 14.000 13.000 C 14.552 13.000 15.000 12.552 15.000 12.000 C 15.000 11.448 14.552 11.000 14.000 11.000 L 13.000 11.000 C 13.000 10.448 12.552 10.000 12.000 10.000M 14.000 2.000 C 15.105 2.000 16.000 2.895 16.000 4.000 C 16.000 5.105 15.105 6.000 14.000 6.000 L 10.000 6.000 C 8.895 6.000 8.000 5.105 8.000 4.000 C 8.000 2.895 8.895 2.000 10.000 2.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _reportMoney!!
    }

private var _reportMoney: ImageVector? = null
