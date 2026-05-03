package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FastForward: ImageVector
    get() {
        if (_fastForward != null) return _fastForward!!
        _fastForward = phosphorThinIcon(
            name = "FastForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 246.520 118.000 L 158.330 61.870 C 154.643 59.535 149.979 59.385 146.150 61.480 C 142.336 63.525 139.969 67.513 140.000 71.840 L 140.000 116.430 L 54.330 61.870 C 50.643 59.535 45.979 59.385 42.150 61.480 C 38.336 63.525 35.969 67.513 36.000 71.840 L 36.000 184.160 C 35.969 188.487 38.336 192.475 42.150 194.520 C 45.979 196.615 50.643 196.465 54.330 194.130 L 140.000 139.570 L 140.000 184.160 C 139.969 188.487 142.336 192.475 146.150 194.520 C 149.979 196.615 154.643 196.465 158.330 194.130 L 246.520 138.000 C 249.932 135.833 251.999 132.072 251.999 128.030 C 251.999 123.988 249.932 120.227 246.520 118.060 ZM 138.220 131.190 L 50.000 187.380 C 48.792 188.154 47.256 188.204 46.000 187.510 C 44.761 186.854 43.990 185.562 44.000 184.160 L 44.000 71.840 C 43.990 70.438 44.761 69.146 46.000 68.490 C 46.585 68.166 47.242 67.994 47.910 67.990 C 48.666 67.991 49.405 68.210 50.040 68.620 L 138.220 124.780 C 139.329 125.475 140.002 126.691 140.002 128.000 C 140.002 129.309 139.329 130.525 138.220 131.220 ZM 242.220 131.190 L 154.000 187.380 C 152.792 188.154 151.256 188.204 150.000 187.510 C 148.761 186.854 147.990 185.562 148.000 184.160 L 148.000 71.840 C 147.990 70.438 148.761 69.146 150.000 68.490 C 150.585 68.166 151.242 67.994 151.910 67.990 C 152.666 67.991 153.405 68.210 154.040 68.620 L 242.220 124.780 C 243.329 125.475 244.002 126.691 244.002 128.000 C 244.002 129.309 243.329 130.525 242.220 131.220 Z"),
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
        return _fastForward!!
    }

private var _fastForward: ImageVector? = null
