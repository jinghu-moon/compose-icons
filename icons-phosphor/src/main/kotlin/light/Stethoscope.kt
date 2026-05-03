package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) return _stethoscope!!
        _stethoscope = phosphorLightIcon(
            name = "Stethoscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 218.000 160.000 C 218.000 165.523 213.523 170.000 208.000 170.000 C 202.477 170.000 198.000 165.523 198.000 160.000 C 198.000 154.477 202.477 150.000 208.000 150.000 C 213.523 150.000 218.000 154.477 218.000 160.000 ZM 213.650 197.580 C 210.809 220.640 191.235 237.972 168.000 238.000 L 144.000 238.000 C 118.609 237.967 98.033 217.391 98.000 192.000 L 98.000 149.710 C 66.232 146.621 41.999 119.918 42.000 88.000 L 42.000 40.000 C 42.000 36.686 44.686 34.000 48.000 34.000 L 72.000 34.000 C 75.314 34.000 78.000 36.686 78.000 40.000 C 78.000 43.314 75.314 46.000 72.000 46.000 L 54.000 46.000 L 54.000 88.000 C 54.000 115.614 76.386 138.000 104.000 138.000 L 104.670 138.000 C 131.870 137.640 154.000 114.840 154.000 87.170 L 154.000 46.000 L 136.000 46.000 C 132.686 46.000 130.000 43.314 130.000 40.000 C 130.000 36.686 132.686 34.000 136.000 34.000 L 160.000 34.000 C 163.314 34.000 166.000 36.686 166.000 40.000 L 166.000 87.170 C 166.000 119.600 141.320 146.610 110.000 149.690 L 110.000 192.000 C 110.000 210.778 125.222 226.000 144.000 226.000 L 168.000 226.000 C 184.669 225.978 198.872 213.891 201.560 197.440 C 182.039 194.062 168.389 176.254 170.198 156.526 C 172.008 136.798 188.670 121.770 208.479 121.999 C 228.289 122.228 244.599 137.638 245.951 157.403 C 247.303 177.168 233.244 194.655 213.650 197.580 ZM 234.000 160.000 C 234.000 145.641 222.359 134.000 208.000 134.000 C 193.641 134.000 182.000 145.641 182.000 160.000 C 182.000 174.359 193.641 186.000 208.000 186.000 C 222.359 186.000 234.000 174.359 234.000 160.000 Z"),
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
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
