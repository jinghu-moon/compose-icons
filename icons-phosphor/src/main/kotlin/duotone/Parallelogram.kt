package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Parallelogram: ImageVector
    get() {
        if (_parallelogram != null) return _parallelogram!!
        _parallelogram = phosphorDuotoneIcon(
            name = "Parallelogram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 239.290 59.280 L 174.490 203.280 C 173.198 206.153 170.340 208.001 167.190 208.000 L 24.000 208.000 C 21.285 208.001 18.755 206.626 17.280 204.347 C 15.806 202.067 15.587 199.196 16.700 196.720 L 81.500 52.720 C 82.793 49.843 85.656 47.995 88.810 48.000 L 232.000 48.000 C 234.713 48.002 237.240 49.379 238.712 51.658 C 240.185 53.936 240.402 56.806 239.290 59.280 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 245.430 47.310 C 242.490 42.745 237.429 39.990 232.000 40.000 L 88.810 40.000 C 82.515 40.000 76.805 43.690 74.220 49.430 L 9.420 193.430 C 7.191 198.380 7.624 204.122 10.569 208.682 C 13.515 213.242 18.572 215.997 24.000 216.000 L 167.190 216.000 C 173.485 216.000 179.195 212.310 181.780 206.570 L 246.580 62.570 C 248.812 57.618 248.379 51.872 245.430 47.310 ZM 167.190 200.000 L 24.000 200.000 L 88.810 56.000 L 232.000 56.000 Z"),
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
        return _parallelogram!!
    }

private var _parallelogram: ImageVector? = null
