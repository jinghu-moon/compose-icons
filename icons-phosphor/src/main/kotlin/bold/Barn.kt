package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Barn: ImageVector
    get() {
        if (_barn != null) return _barn!!
        _barn = phosphorBoldIcon(
            name = "Barn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 100.000 84.000 C 100.000 77.373 105.373 72.000 112.000 72.000 L 144.000 72.000 C 150.627 72.000 156.000 77.373 156.000 84.000 C 156.000 90.627 150.627 96.000 144.000 96.000 L 112.000 96.000 C 105.373 96.000 100.000 90.627 100.000 84.000 ZM 252.000 200.000 C 252.000 206.627 246.627 212.000 240.000 212.000 L 16.000 212.000 C 9.373 212.000 4.000 206.627 4.000 200.000 C 4.000 193.373 9.373 188.000 16.000 188.000 L 20.000 188.000 L 20.000 139.310 C 15.056 141.065 9.545 139.405 6.393 135.211 C 3.241 131.016 3.179 125.261 6.240 121.000 L 46.240 65.000 C 47.044 63.870 48.039 62.888 49.180 62.100 L 116.740 15.450 L 116.910 15.340 C 123.621 10.849 132.379 10.849 139.090 15.340 L 139.260 15.450 L 206.820 62.100 C 207.961 62.888 208.956 63.870 209.760 65.000 L 249.760 121.000 C 252.821 125.261 252.759 131.016 249.607 135.211 C 246.455 139.405 240.944 141.065 236.000 139.310 L 236.000 188.000 L 240.000 188.000 C 246.627 188.000 252.000 193.373 252.000 200.000 ZM 44.000 188.000 L 64.000 188.000 L 64.000 124.000 C 64.000 117.373 69.373 112.000 76.000 112.000 L 180.000 112.000 C 186.627 112.000 192.000 117.373 192.000 124.000 L 192.000 188.000 L 212.000 188.000 L 212.000 109.450 L 191.450 80.690 L 128.000 36.870 L 64.550 80.690 L 44.000 109.450 ZM 168.000 136.000 L 113.900 136.000 L 168.000 174.070 ZM 88.000 188.000 L 146.100 188.000 L 88.000 147.120 Z"),
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
        return _barn!!
    }

private var _barn: ImageVector? = null
