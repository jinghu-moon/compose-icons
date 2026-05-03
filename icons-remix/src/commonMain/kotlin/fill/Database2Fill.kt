package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Database2Fill: ImageVector
    get() {
        if (_database2Fill != null) return _database2Fill!!
        _database2Fill = remixIcon(
            name = "Database2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 9.500 L 21.000 12.500 C 21.000 14.985 16.971 17.000 12.000 17.000 C 7.029 17.000 3.000 14.985 3.000 12.500 L 3.000 9.500 C 3.000 11.985 7.029 14.000 12.000 14.000 C 16.971 14.000 21.000 11.985 21.000 9.500 ZM 3.000 14.500 C 3.000 16.985 7.029 19.000 12.000 19.000 C 16.971 19.000 21.000 16.985 21.000 14.500 L 21.000 17.500 C 21.000 19.985 16.971 22.000 12.000 22.000 C 7.029 22.000 3.000 19.985 3.000 17.500 L 3.000 14.500 ZM 12.000 12.000 C 7.029 12.000 3.000 9.985 3.000 7.500 C 3.000 5.015 7.029 3.000 12.000 3.000 C 16.971 3.000 21.000 5.015 21.000 7.500 C 21.000 9.985 16.971 12.000 12.000 12.000 Z"),
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
        return _database2Fill!!
    }

private var _database2Fill: ImageVector? = null
