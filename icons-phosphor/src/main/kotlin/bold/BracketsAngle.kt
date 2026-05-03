package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BracketsAngle: ImageVector
    get() {
        if (_bracketsAngle != null) return _bracketsAngle!!
        _bracketsAngle = phosphorBoldIcon(
            name = "BracketsAngle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 90.120 46.440 L 38.220 128.000 L 90.120 209.560 C 92.566 213.177 92.854 217.838 90.872 221.730 C 88.890 225.621 84.950 228.128 80.586 228.275 C 76.221 228.423 72.121 226.188 69.880 222.440 L 13.880 134.440 C 11.381 130.510 11.381 125.490 13.880 121.560 L 69.880 33.560 C 73.520 28.178 80.781 26.670 86.263 30.158 C 91.744 33.647 93.454 40.864 90.120 46.440 ZM 242.120 121.560 L 186.120 33.560 C 183.879 29.812 179.779 27.577 175.414 27.725 C 171.050 27.872 167.110 30.379 165.128 34.270 C 163.146 38.162 163.434 42.823 165.880 46.440 L 217.780 128.000 L 165.880 209.560 C 163.434 213.177 163.146 217.838 165.128 221.730 C 167.110 225.621 171.050 228.128 175.414 228.275 C 179.779 228.423 183.879 226.188 186.120 222.440 L 242.120 134.440 C 244.619 130.510 244.619 125.490 242.120 121.560 Z"),
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
        return _bracketsAngle!!
    }

private var _bracketsAngle: ImageVector? = null
