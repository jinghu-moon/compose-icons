package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaintBrushBroad: ImageVector
    get() {
        if (_paintBrushBroad != null) return _paintBrushBroad!!
        _paintBrushBroad = phosphorBoldIcon(
            name = "PaintBrushBroad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 20.000 L 72.000 20.000 C 47.711 20.028 28.028 39.711 28.000 64.000 L 28.000 136.000 C 28.000 151.464 40.536 164.000 56.000 164.000 L 95.640 164.000 L 92.000 207.000 C 92.000 207.330 92.000 207.670 92.000 208.000 C 92.000 227.882 108.118 244.000 128.000 244.000 C 147.882 244.000 164.000 227.882 164.000 208.000 C 164.000 207.670 164.000 207.330 164.000 207.000 L 160.400 164.000 L 200.000 164.000 C 215.464 164.000 228.000 151.464 228.000 136.000 L 228.000 32.000 C 228.000 25.373 222.627 20.000 216.000 20.000 ZM 72.000 44.000 L 160.000 44.000 L 160.000 68.000 C 160.000 74.627 165.373 80.000 172.000 80.000 C 178.627 80.000 184.000 74.627 184.000 68.000 L 184.000 44.000 L 204.000 44.000 L 204.000 96.000 L 52.000 96.000 L 52.000 64.000 C 52.000 52.954 60.954 44.000 72.000 44.000 ZM 200.000 140.000 L 156.000 140.000 C 150.279 140.002 144.832 142.453 141.037 146.736 C 137.242 151.018 135.463 156.720 136.150 162.400 L 139.990 208.400 C 139.990 215.027 134.617 220.400 127.990 220.400 C 121.363 220.400 115.990 215.027 115.990 208.400 L 119.830 162.400 C 120.516 156.723 118.740 151.024 114.950 146.743 C 111.159 142.462 105.718 140.007 100.000 140.000 L 56.000 140.000 C 53.791 140.000 52.000 138.209 52.000 136.000 L 52.000 120.000 L 204.000 120.000 L 204.000 136.000 C 204.000 138.209 202.209 140.000 200.000 140.000 Z"),
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
        return _paintBrushBroad!!
    }

private var _paintBrushBroad: ImageVector? = null
