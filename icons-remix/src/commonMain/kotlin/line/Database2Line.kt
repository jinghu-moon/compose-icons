package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Database2Line: ImageVector
    get() {
        if (_database2Line != null) return _database2Line!!
        _database2Line = remixIcon(
            name = "Database2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 12.500 C 5.000 12.813 5.461 13.358 6.530 13.893 C 7.914 14.585 9.877 15.000 12.000 15.000 C 14.123 15.000 16.086 14.585 17.469 13.893 C 18.539 13.358 19.000 12.813 19.000 12.500 L 19.000 10.329 C 17.350 11.348 14.827 12.000 12.000 12.000 C 9.173 12.000 6.650 11.348 5.000 10.329 L 5.000 12.500 ZM 19.000 15.329 C 17.350 16.348 14.827 17.000 12.000 17.000 C 9.173 17.000 6.650 16.348 5.000 15.329 L 5.000 17.500 C 5.000 17.813 5.461 18.358 6.530 18.893 C 7.914 19.585 9.877 20.000 12.000 20.000 C 14.123 20.000 16.086 19.585 17.469 18.893 C 18.539 18.358 19.000 17.813 19.000 17.500 L 19.000 15.329 ZM 3.000 17.500 L 3.000 7.500 C 3.000 5.015 7.029 3.000 12.000 3.000 C 16.971 3.000 21.000 5.015 21.000 7.500 L 21.000 17.500 C 21.000 19.985 16.971 22.000 12.000 22.000 C 7.029 22.000 3.000 19.985 3.000 17.500 ZM 12.000 10.000 C 14.123 10.000 16.086 9.585 17.469 8.893 C 18.539 8.358 19.000 7.813 19.000 7.500 C 19.000 7.187 18.539 6.642 17.469 6.107 C 16.086 5.415 14.123 5.000 12.000 5.000 C 9.877 5.000 7.914 5.415 6.530 6.107 C 5.461 6.642 5.000 7.187 5.000 7.500 C 5.000 7.813 5.461 8.358 6.530 8.893 C 7.914 9.585 9.877 10.000 12.000 10.000 Z"),
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
        return _database2Line!!
    }

private var _database2Line: ImageVector? = null
