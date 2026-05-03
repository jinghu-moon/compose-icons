package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ThreeD: ImageVector
    get() {
        if (_threeD != null) return _threeD!!
        _threeD = phosphorDuotoneIcon(
            name = "ThreeD",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 48.000 L 224.000 208.000 L 32.000 208.000 L 32.000 48.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 96.000 148.000 C 96.000 136.954 87.046 128.000 76.000 128.000 C 73.017 127.999 70.282 126.339 68.905 123.692 C 67.528 121.046 67.738 117.853 69.450 115.410 L 88.630 88.000 L 56.000 88.000 C 51.582 88.000 48.000 84.418 48.000 80.000 C 48.000 75.582 51.582 72.000 56.000 72.000 L 104.000 72.000 C 106.983 72.001 109.718 73.661 111.095 76.308 C 112.472 78.954 112.262 82.147 110.550 84.590 L 89.550 114.590 C 105.584 121.024 114.786 137.941 111.476 154.898 C 108.166 171.854 93.276 184.069 76.000 184.000 C 66.319 184.031 57.040 180.129 50.290 173.190 C 48.161 171.176 47.304 168.159 48.055 165.327 C 48.807 162.495 51.047 160.300 53.894 159.606 C 56.741 158.912 59.740 159.831 61.710 162.000 C 67.397 167.808 76.034 169.596 83.560 166.523 C 91.086 163.451 96.003 156.129 96.000 148.000 ZM 160.000 72.000 C 190.928 72.000 216.000 97.072 216.000 128.000 C 216.000 158.928 190.928 184.000 160.000 184.000 L 136.000 184.000 C 131.582 184.000 128.000 180.418 128.000 176.000 L 128.000 80.000 C 128.000 75.582 131.582 72.000 136.000 72.000 ZM 160.000 88.000 L 144.000 88.000 L 144.000 168.000 L 160.000 168.000 C 182.091 168.000 200.000 150.091 200.000 128.000 C 200.000 105.909 182.091 88.000 160.000 88.000 ZM 32.000 56.000 L 224.000 56.000 C 228.418 56.000 232.000 52.418 232.000 48.000 C 232.000 43.582 228.418 40.000 224.000 40.000 L 32.000 40.000 C 27.582 40.000 24.000 43.582 24.000 48.000 C 24.000 52.418 27.582 56.000 32.000 56.000 ZM 224.000 200.000 L 32.000 200.000 C 27.582 200.000 24.000 203.582 24.000 208.000 C 24.000 212.418 27.582 216.000 32.000 216.000 L 224.000 216.000 C 228.418 216.000 232.000 212.418 232.000 208.000 C 232.000 203.582 228.418 200.000 224.000 200.000 Z"),
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
        return _threeD!!
    }

private var _threeD: ImageVector? = null
