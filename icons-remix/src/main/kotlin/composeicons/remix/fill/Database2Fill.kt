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
                pathData = parseSvgPathData("M21 9.5v3C21 14.985 16.971 17 12 17 7.029 17 3 14.985 3 12.5v-3C3 11.985 7.029 14 12 14c4.971 0 9-2.015 9-4.5ZM3 14.5C3 16.985 7.029 19 12 19c4.971 0 9-2.015 9-4.5v3C21 19.985 16.971 22 12 22 7.029 22 3 19.985 3 17.5v-3ZM12 12C7.029 12 3 9.985 3 7.5 3 5.015 7.029 3 12 3c4.971 0 9 2.015 9 4.5C21 9.985 16.971 12 12 12Z"),
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
