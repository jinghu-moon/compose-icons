package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CircleNotch: ImageVector
    get() {
        if (_circleNotch != null) return _circleNotch!!
        _circleNotch = phosphorFillIcon(
            name = "CircleNotch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 200C95.408 200.005 66.877 178.116 58.442 146.634 50.007 115.153 63.772 81.931 92 65.64c3.811-2.069 8.576-.726 10.745 3.029 2.169 3.755 .951 8.554-2.745 10.821C78.05 92.163 67.348 117.999 73.908 142.481c6.56 24.482 28.746 41.506 54.092 41.506 25.346 0 47.532-17.024 54.092-41.506C188.652 117.999 177.95 92.163 156 79.49c-3.696-2.267-4.914-7.066-2.745-10.821 2.169-3.755 6.934-5.098 10.745-3.029 28.228 16.291 41.993 49.513 33.558 80.994C189.123 178.116 160.592 200.005 128 200Z"),
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
        return _circleNotch!!
    }

private var _circleNotch: ImageVector? = null
