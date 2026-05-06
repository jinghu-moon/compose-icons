package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Intersect: ImageVector
    get() {
        if (_intersect != null) return _intersect!!
        _intersect = phosphorFillIcon(
            name = "Intersect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174.63 81.37C167.254 41.643 131.412 13.653 91.082 16.124 50.752 18.595 18.595 50.752 16.124 91.082c-2.471 40.33 25.519 76.172 65.246 83.548 7.376 39.727 43.218 67.717 83.548 65.246 40.33-2.471 72.487-34.628 74.958-74.958C242.347 124.588 214.357 88.746 174.63 81.37ZM32 96C31.936 63.723 55.918 36.45 87.938 32.384 119.958 28.318 149.994 48.732 158 80c-42.598 1.119-76.858 35.402-77.95 78C51.784 150.686 32.03 125.197 32 96ZM160 224c-29.183-.024-54.667-19.754-62-48 42.617-1.093 76.907-35.383 78-78 31.268 8.006 51.682 38.042 47.616 70.062C219.55 200.082 192.277 224.064 160 224Z"),
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
        return _intersect!!
    }

private var _intersect: ImageVector? = null
