package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) return _bracketsRound!!
        _bracketsRound = phosphorFillIcon(
            name = "BracketsRound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 216.000 216.000 C 224.837 216.000 232.000 208.837 232.000 200.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 99.610 176.860 C 103.559 178.845 105.150 183.656 103.165 187.605 C 101.180 191.554 96.369 193.145 92.420 191.160 C 69.609 178.386 55.629 154.142 56.000 128.000 C 55.629 101.858 69.609 77.614 92.420 64.840 C 96.369 62.857 101.177 64.451 103.160 68.400 C 105.143 72.349 103.549 77.157 99.600 79.140 C 98.370 79.780 72.000 93.760 72.000 128.000 C 72.000 162.240 98.480 176.280 99.610 176.860 ZM 163.610 191.160 C 159.656 193.137 154.847 191.534 152.870 187.580 C 150.893 183.626 152.496 178.817 156.450 176.840 C 157.550 176.280 184.030 162.320 184.030 128.000 C 184.030 93.680 157.550 79.720 156.420 79.140 C 152.471 77.155 150.880 72.344 152.865 68.395 C 154.850 64.446 159.661 62.855 163.610 64.840 C 186.410 77.622 200.377 101.865 200.000 128.000 C 200.371 154.142 186.391 178.386 163.580 191.160 Z"),
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
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
