package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BracketsAngle: ImageVector
    get() {
        if (_bracketsAngle != null) return _bracketsAngle!!
        _bracketsAngle = phosphorThinIcon(
            name = "BracketsAngle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 83.370 42.150 L 28.740 128.000 L 83.370 213.850 C 84.556 215.711 84.010 218.182 82.150 219.370 C 81.508 219.781 80.762 219.999 80.000 220.000 C 78.635 219.999 77.364 219.301 76.630 218.150 L 20.630 130.150 C 19.794 128.839 19.794 127.161 20.630 125.850 L 76.630 37.850 C 77.372 36.589 78.744 35.834 80.206 35.881 C 81.669 35.928 82.989 36.771 83.648 38.077 C 84.308 39.383 84.201 40.945 83.370 42.150 ZM 235.370 125.850 L 179.370 37.850 C 178.628 36.589 177.256 35.834 175.794 35.881 C 174.331 35.928 173.011 36.771 172.352 38.077 C 171.692 39.383 171.799 40.945 172.630 42.150 L 227.260 128.000 L 172.630 213.850 C 171.444 215.711 171.990 218.182 173.850 219.370 C 174.492 219.781 175.238 219.999 176.000 220.000 C 177.365 219.999 178.636 219.301 179.370 218.150 L 235.370 130.150 C 236.206 128.839 236.206 127.161 235.370 125.850 Z"),
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
        return _bracketsAngle!!
    }

private var _bracketsAngle: ImageVector? = null
