package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AtFill: ImageVector
    get() {
        if (_atFill != null) return _atFill!!
        _atFill = remixIcon(
            name = "AtFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 22C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM20 12C20 7.582 16.418 4 12 4 7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8 1.47 0 2.848-.397 4.032-1.089L15.024 17.184C14.136 17.703 13.103 18 12 18 8.686 18 6 15.314 6 12 6 8.686 8.686 6 12 6c3.314 0 6 2.686 6 6v1c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-4h-1.354C13.941 8.378 13.014 8 12 8 9.791 8 8 9.791 8 12c0 2.209 1.791 4 4 4 1.047 0 1.999-.402 2.712-1.06C15.262 15.589 16.083 16 17 16c1.657 0 3-1.343 3-3v-1ZM12 10c1.105 0 2 .895 2 2 0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2Z"),
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
        return _atFill!!
    }

private var _atFill: ImageVector? = null
