package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CopyleftFill: ImageVector
    get() {
        if (_copyleftFill != null) return _copyleftFill!!
        _copyleftFill = remixIcon(
            name = "CopyleftFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 22.000 C 6.480 22.000 2.000 17.520 2.000 12.000 C 2.000 6.480 6.480 2.000 12.000 2.000 C 17.520 2.000 22.000 6.480 22.000 12.000 C 22.000 17.520 17.520 22.000 12.000 22.000 ZM 12.000 17.000 C 14.760 17.000 17.000 14.760 17.000 12.000 C 17.000 9.240 14.760 7.000 12.000 7.000 C 10.181 7.000 8.587 7.973 7.712 9.428 L 9.427 10.456 C 9.952 9.583 10.907 9.000 12.000 9.000 C 13.658 9.000 15.000 10.342 15.000 12.000 C 15.000 13.658 13.658 15.000 12.000 15.000 C 10.907 15.000 9.951 14.416 9.426 13.543 L 7.712 14.572 C 8.587 16.027 10.181 17.000 12.000 17.000 Z"),
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
        return _copyleftFill!!
    }

private var _copyleftFill: ImageVector? = null
