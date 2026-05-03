package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Martini: ImageVector
    get() {
        if (_martini != null) return _martini!!
        _martini = phosphorBoldIcon(
            name = "Martini",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 243.090 35.410 C 241.233 30.924 236.855 27.999 232.000 28.000 L 24.000 28.000 C 19.145 28.000 14.769 30.925 12.913 35.411 C 11.056 39.897 12.085 45.059 15.520 48.490 L 116.000 149.000 L 116.000 204.000 L 88.000 204.000 C 81.373 204.000 76.000 209.373 76.000 216.000 C 76.000 222.627 81.373 228.000 88.000 228.000 L 168.000 228.000 C 174.627 228.000 180.000 222.627 180.000 216.000 C 180.000 209.373 174.627 204.000 168.000 204.000 L 140.000 204.000 L 140.000 149.000 L 240.480 48.490 C 243.916 45.060 244.946 39.897 243.090 35.410 ZM 203.000 52.000 L 191.000 64.000 L 65.000 64.000 L 53.000 52.000 ZM 128.000 127.000 L 89.000 88.000 L 167.000 88.000 Z"),
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
        return _martini!!
    }

private var _martini: ImageVector? = null
