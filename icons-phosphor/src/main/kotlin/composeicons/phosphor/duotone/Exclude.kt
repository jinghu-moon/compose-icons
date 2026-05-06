package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Exclude: ImageVector
    get() {
        if (_exclude != null) return _exclude!!
        _exclude = phosphorDuotoneIcon(
            name = "Exclude",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 160c.002 2.539 .135 5.075 .4 7.6C50.816 163.609 22.715 131.236 24.047 93.464 25.38 55.692 55.692 25.38 93.464 24.047c37.772-1.332 70.145 26.768 74.136 64.353C165.075 88.135 162.539 88.002 160 88c-39.765 0-72 32.235-72 72ZM167.6 88.4c.265 2.525 .398 5.061 .4 7.6 0 39.764-32.236 72-72 72-2.539-.002-5.075-.135-7.6-.4 3.991 37.584 36.364 65.685 74.136 64.353 37.772-1.332 68.084-31.645 69.417-69.417C233.285 124.764 205.184 92.391 167.6 88.4Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M174.63 81.37C167.254 41.643 131.412 13.653 91.082 16.124 50.752 18.595 18.595 50.752 16.124 91.082c-2.471 40.33 25.519 76.172 65.246 83.548 7.376 39.727 43.218 67.717 83.548 65.246 40.33-2.471 72.487-34.628 74.958-74.958C242.347 124.588 214.357 88.746 174.63 81.37ZM32 96C31.936 63.723 55.918 36.45 87.938 32.384 119.958 28.318 149.994 48.732 158 80c-42.598 1.119-76.858 35.402-77.95 78C51.784 150.686 32.03 125.197 32 96ZM160 96c-.039 35.33-28.67 63.961-64 64 .039-35.33 28.67-63.961 64-64ZM160 224c-29.183-.024-54.667-19.754-62-48 42.617-1.093 76.907-35.383 78-78 31.268 8.006 51.682 38.042 47.616 70.062C219.55 200.082 192.277 224.064 160 224Z"),
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
        return _exclude!!
    }

private var _exclude: ImageVector? = null
