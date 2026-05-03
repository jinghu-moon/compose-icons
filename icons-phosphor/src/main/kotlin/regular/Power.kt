package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Power: ImageVector
    get() {
        if (_power != null) return _power!!
        _power = phosphorRegularIcon(
            name = "Power",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 120.000 128.000 L 120.000 48.000 C 120.000 43.582 123.582 40.000 128.000 40.000 C 132.418 40.000 136.000 43.582 136.000 48.000 L 136.000 128.000 C 136.000 132.418 132.418 136.000 128.000 136.000 C 123.582 136.000 120.000 132.418 120.000 128.000 ZM 180.370 49.300 C 176.673 46.963 171.785 48.029 169.395 51.692 C 167.006 55.355 168.001 60.258 171.630 62.700 C 194.740 77.770 208.000 101.570 208.000 128.000 C 208.000 172.183 172.183 208.000 128.000 208.000 C 83.817 208.000 48.000 172.183 48.000 128.000 C 48.000 101.570 61.260 77.770 84.370 62.700 C 87.999 60.258 88.994 55.355 86.605 51.692 C 84.215 48.029 79.327 46.963 75.630 49.300 C 47.900 67.380 32.000 96.060 32.000 128.000 C 32.000 181.019 74.981 224.000 128.000 224.000 C 181.019 224.000 224.000 181.019 224.000 128.000 C 224.000 96.060 208.100 67.380 180.370 49.300 Z"),
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
        return _power!!
    }

private var _power: ImageVector? = null
