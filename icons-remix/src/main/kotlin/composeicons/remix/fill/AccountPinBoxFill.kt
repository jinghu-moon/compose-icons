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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 21l-2 2L10 21h-5.005C3.893 21 3 20.107 3 19.005v-14.01C3 3.893 3.893 3 4.995 3h14.01C20.107 3 21 3.893 21 4.995v14.01C21 20.107 20.107 21 19.005 21h-5.005ZM6.357 18h11.491C16.583 16.187 14.481 15 12.102 15 9.723 15 7.622 16.187 6.357 18ZM12 13c1.933 0 3.5-1.567 3.5-3.5C15.5 7.567 13.933 6 12 6 10.067 6 8.5 7.567 8.5 9.5 8.5 11.433 10.067 13 12 13Z"),
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
        return _accountPinBoxFill!!
    }

private var _accountPinBoxFill: ImageVector? = null
