package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileC: ImageVector
    get() {
        if (_fileC != null) return _fileC!!
        _fileC = phosphorLightIcon(
            name = "FileC",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 46.000 180.000 C 46.000 192.130 54.070 202.000 64.000 202.000 C 68.449 201.914 72.668 200.005 75.670 196.720 C 77.983 194.439 81.690 194.413 84.035 196.660 C 86.379 198.908 86.510 202.613 84.330 205.020 C 79.078 210.684 71.724 213.932 64.000 214.000 C 47.460 214.000 34.000 198.750 34.000 180.000 C 34.000 161.250 47.460 146.000 64.000 146.000 C 71.727 146.073 79.082 149.329 84.330 155.000 C 86.510 157.407 86.379 161.112 84.035 163.360 C 81.690 165.607 77.983 165.581 75.670 163.300 C 72.672 160.007 68.452 158.091 64.000 158.000 C 54.070 158.000 46.000 167.870 46.000 180.000 ZM 214.000 88.000 L 214.000 216.000 C 214.000 223.732 207.732 230.000 200.000 230.000 L 120.000 230.000 C 116.686 230.000 114.000 227.314 114.000 224.000 C 114.000 220.686 116.686 218.000 120.000 218.000 L 200.000 218.000 C 201.105 218.000 202.000 217.105 202.000 216.000 L 202.000 94.000 L 152.000 94.000 C 148.686 94.000 146.000 91.314 146.000 88.000 L 146.000 38.000 L 56.000 38.000 C 54.895 38.000 54.000 38.895 54.000 40.000 L 54.000 112.000 C 54.000 115.314 51.314 118.000 48.000 118.000 C 44.686 118.000 42.000 115.314 42.000 112.000 L 42.000 40.000 C 42.000 32.268 48.268 26.000 56.000 26.000 L 152.000 26.000 C 153.594 25.999 155.123 26.632 156.250 27.760 L 212.250 83.760 C 213.372 84.886 214.001 86.411 214.000 88.000 ZM 158.000 82.000 L 193.520 82.000 L 158.000 46.480 Z"),
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
        return _fileC!!
    }

private var _fileC: ImageVector? = null
