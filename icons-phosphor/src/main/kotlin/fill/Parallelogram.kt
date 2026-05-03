package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Parallelogram: ImageVector
    get() {
        if (_parallelogram != null) return _parallelogram!!
        _parallelogram = phosphorFillIcon(
            name = "Parallelogram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 246.580 62.570 L 181.780 206.570 C 179.195 212.310 173.485 216.000 167.190 216.000 L 24.000 216.000 C 18.572 215.997 13.515 213.242 10.569 208.682 C 7.624 204.122 7.191 198.380 9.420 193.430 L 74.220 49.430 C 76.805 43.690 82.515 40.000 88.810 40.000 L 232.000 40.000 C 237.430 40.000 242.490 42.754 245.438 47.314 C 248.386 51.874 248.820 57.619 246.590 62.570 Z"),
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
        return _parallelogram!!
    }

private var _parallelogram: ImageVector? = null
