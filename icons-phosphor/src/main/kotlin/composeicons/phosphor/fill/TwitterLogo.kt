package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) return _twitterLogo!!
        _twitterLogo = phosphorFillIcon(
            name = "TwitterLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245.66 77.66l-29.9 29.9C209.72 177.58 150.67 232 80 232c-14.52 0-26.49-2.3-35.58-6.84-7.33-3.67-10.33-7.6-11.08-8.72-1.355-2.032-1.707-4.571-.957-6.895 .75-2.324 2.52-4.178 4.807-5.035 .26-.1 24.24-9.31 39.47-26.84C68.214 170.726 60.841 162.571 54.78 153.47 42.38 135.06 28.5 103.08 32.78 55.29c.277-3.1 2.327-5.759 5.256-6.814 2.928-1.055 6.203-.317 8.394 1.894 .35 .35 33.28 33.1 73.54 43.72v-6.09c-.031-12.901 5.147-25.269 14.36-34.3C143.278 44.765 155.456 39.824 168.1 40c17.077 .168 32.816 9.277 41.47 24h30.43c3.238-.003 6.158 1.947 7.397 4.938 1.239 2.991 .554 6.434-1.737 8.722Z"),
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
        return _twitterLogo!!
    }

private var _twitterLogo: ImageVector? = null
