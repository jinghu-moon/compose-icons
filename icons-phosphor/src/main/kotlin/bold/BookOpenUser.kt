package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BookOpenUser: ImageVector
    get() {
        if (_bookOpenUser != null) return _bookOpenUser!!
        _bookOpenUser = phosphorBoldIcon(
            name = "BookOpenUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 72.000 L 160.000 72.000 C 147.878 71.996 136.294 77.010 128.000 85.850 C 119.706 77.010 108.122 71.996 96.000 72.000 L 24.000 72.000 C 17.373 72.000 12.000 77.373 12.000 84.000 L 12.000 200.000 C 12.000 206.627 17.373 212.000 24.000 212.000 L 96.000 212.000 C 107.046 212.000 116.000 220.954 116.000 232.000 C 116.000 238.627 121.373 244.000 128.000 244.000 C 134.627 244.000 140.000 238.627 140.000 232.000 C 140.000 220.954 148.954 212.000 160.000 212.000 L 232.000 212.000 C 238.627 212.000 244.000 206.627 244.000 200.000 L 244.000 84.000 C 244.000 77.373 238.627 72.000 232.000 72.000 ZM 96.000 188.000 L 36.000 188.000 L 36.000 96.000 L 96.000 96.000 C 107.046 96.000 116.000 104.954 116.000 116.000 L 116.000 192.810 C 109.810 189.641 102.954 187.993 96.000 188.000 ZM 220.000 188.000 L 160.000 188.000 C 153.044 187.996 146.187 189.652 140.000 192.830 L 140.000 116.000 C 140.000 104.954 148.954 96.000 160.000 96.000 L 220.000 96.000 ZM 86.400 40.790 C 96.220 27.696 111.633 19.990 128.000 19.990 C 144.367 19.990 159.780 27.696 169.600 40.790 C 173.582 46.089 172.514 53.613 167.215 57.595 C 161.916 61.577 154.392 60.509 150.410 55.210 C 145.123 48.152 136.819 43.997 128.000 43.997 C 119.181 43.997 110.877 48.152 105.590 55.210 C 101.608 60.509 94.084 61.577 88.785 57.595 C 83.486 53.613 82.418 46.089 86.400 40.790 Z"),
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
        return _bookOpenUser!!
    }

private var _bookOpenUser: ImageVector? = null
