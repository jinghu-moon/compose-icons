package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Compass: ImageVector
    get() {
        if (_compass != null) return _compass!!
        _compass = phosphorFillIcon(
            name = "Compass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 179.580 81.790 L 147.580 145.790 C 147.188 146.561 146.561 147.188 145.790 147.580 L 81.790 179.580 C 80.249 180.354 78.385 180.054 77.166 178.834 C 75.946 177.615 75.646 175.751 76.420 174.210 L 108.420 110.210 C 108.812 109.439 109.439 108.812 110.210 108.420 L 174.210 76.420 C 175.751 75.646 177.615 75.946 178.834 77.166 C 180.054 78.385 180.354 80.249 179.580 81.790 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _compass!!
    }

private var _compass: ImageVector? = null
