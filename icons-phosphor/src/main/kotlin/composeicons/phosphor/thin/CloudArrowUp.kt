package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudArrowUp: ImageVector
    get() {
        if (_cloudArrowUp != null) return _cloudArrowUp!!
        _cloudArrowUp = phosphorThinIcon(
            name = "CloudArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M186.83 162.83c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173L156 137.66v70.34c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-70.34l-25.17 25.17c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l32-32c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l32 32c.751 .75 1.173 1.768 1.173 2.83 0 1.062-.422 2.08-1.173 2.83ZM160 44C127.122 44.035 97.279 63.228 83.61 93.13 61.211 88.72 38.251 97.404 24.375 115.531 10.5 133.659 8.114 158.09 18.219 178.56 28.325 199.03 49.171 211.992 72 212h40c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-40C52.366 204.042 34.382 193.022 25.506 175.509c-8.877-17.513-7.132-38.532 4.51-54.342C41.657 105.357 61.212 97.452 80.57 100.73 77.541 109.503 75.996 118.719 76 128c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 .012-37.955 28.025-70.082 65.624-75.264 37.599-5.182 73.258 18.17 83.536 54.707 10.279 36.536-7.974 75.055-42.76 90.237-1.728 .762-2.688 2.629-2.302 4.478 .386 1.849 2.013 3.176 3.902 3.182 .551 .004 1.096-.109 1.6-.33 36.486-15.894 56.811-55.211 48.681-94.17C234.151 71.882 199.798 43.975 160 44Z"),
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
        return _cloudArrowUp!!
    }

private var _cloudArrowUp: ImageVector? = null
