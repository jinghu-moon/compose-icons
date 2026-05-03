package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AccountPinBoxFill: ImageVector
    get() {
        if (_accountPinBoxFill != null) return _accountPinBoxFill!!
        _accountPinBoxFill = remixIcon(
            name = "AccountPinBoxFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 21.000 L 12.000 23.000 L 10.000 21.000 L 4.995 21.000 C 3.893 21.000 3.000 20.107 3.000 19.005 L 3.000 4.995 C 3.000 3.893 3.893 3.000 4.995 3.000 L 19.005 3.000 C 20.107 3.000 21.000 3.893 21.000 4.995 L 21.000 19.005 C 21.000 20.107 20.107 21.000 19.005 21.000 L 14.000 21.000 ZM 6.357 18.000 L 17.847 18.000 C 16.583 16.187 14.481 15.000 12.102 15.000 C 9.723 15.000 7.622 16.187 6.357 18.000 ZM 12.000 13.000 C 13.933 13.000 15.500 11.433 15.500 9.500 C 15.500 7.567 13.933 6.000 12.000 6.000 C 10.067 6.000 8.500 7.567 8.500 9.500 C 8.500 11.433 10.067 13.000 12.000 13.000 Z"),
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
        return _accountPinBoxFill!!
    }

private var _accountPinBoxFill: ImageVector? = null
