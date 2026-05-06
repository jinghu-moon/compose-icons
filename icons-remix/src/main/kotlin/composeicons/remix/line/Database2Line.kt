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
                pathData = parseSvgPathData("M5 12.5c0 .313 .461 .858 1.53 1.393C7.914 14.585 9.877 15 12 15c2.123 0 4.086-.415 5.469-1.107C18.539 13.358 19 12.813 19 12.5v-2.171C17.35 11.348 14.827 12 12 12 9.173 12 6.65 11.348 5 10.329v2.171ZM19 15.329C17.35 16.348 14.827 17 12 17 9.173 17 6.65 16.348 5 15.329v2.171c0 .313 .461 .858 1.53 1.393C7.914 19.585 9.877 20 12 20c2.123 0 4.086-.415 5.469-1.107C18.539 18.358 19 17.813 19 17.5v-2.171ZM3 17.5v-10C3 5.015 7.029 3 12 3c4.971 0 9 2.015 9 4.5v10C21 19.985 16.971 22 12 22 7.029 22 3 19.985 3 17.5ZM12 10c2.123 0 4.086-.415 5.469-1.107C18.539 8.358 19 7.813 19 7.5c0-.313-.461-.858-1.531-1.393C16.086 5.415 14.123 5 12 5 9.877 5 7.914 5.415 6.53 6.107 5.461 6.642 5 7.187 5 7.5c0 .313 .461 .858 1.53 1.393C7.914 9.585 9.877 10 12 10Z"),
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
