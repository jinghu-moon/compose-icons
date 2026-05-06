package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) return _thumbsUp!!
        _thumbsUp = phosphorLightIcon(
            name = "ThumbsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.49 81.44C228.314 76.71 222.309 74.001 216 74h-58v-18C158 35.013 140.987 18 120 18c-2.275-.001-4.354 1.285-5.37 3.32L76.29 98h-44.29c-7.732 0-14 6.268-14 14v88c0 7.732 6.268 14 14 14h172c11.095 0 20.453-8.261 21.83-19.27l12-96c.782-6.262-1.162-12.559-5.34-17.29ZM30 200v-88c0-1.105 .895-2 2-2h42v92h-42c-1.105 0-2-.895-2-2ZM225.92 97.24l-12 96c-.625 5.003-4.878 8.759-9.92 8.76h-118v-96.58L123.58 30.25C136.432 32.037 145.999 43.025 146 56v24c0 3.314 2.686 6 6 6h64c2.868 .001 5.597 1.233 7.495 3.383 1.898 2.15 2.781 5.011 2.425 7.857Z"),
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
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
