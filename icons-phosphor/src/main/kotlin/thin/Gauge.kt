package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Gauge: ImageVector
    get() {
        if (_gauge != null) return _gauge!!
        _gauge = phosphorThinIcon(
            name = "Gauge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.230 75.500 C 183.935 55.176 156.342 43.830 127.620 44.000 C 68.280 44.210 20.000 93.160 20.000 153.130 L 20.000 176.000 C 20.000 182.627 25.373 188.000 32.000 188.000 L 224.000 188.000 C 230.627 188.000 236.000 182.627 236.000 176.000 L 236.000 152.000 C 236.082 123.274 224.638 95.716 204.230 75.500 ZM 228.000 176.000 C 228.000 178.209 226.209 180.000 224.000 180.000 L 111.850 180.000 L 171.230 98.350 C 172.162 97.201 172.385 95.632 171.808 94.269 C 171.231 92.907 169.949 91.974 168.475 91.845 C 167.001 91.715 165.576 92.409 164.770 93.650 L 102.000 180.000 L 32.000 180.000 C 29.791 180.000 28.000 178.209 28.000 176.000 L 28.000 153.130 C 28.001 148.740 28.282 144.354 28.840 140.000 L 56.000 140.000 C 58.209 140.000 60.000 138.209 60.000 136.000 C 60.000 133.791 58.209 132.000 56.000 132.000 L 30.210 132.000 C 39.590 87.660 77.840 53.930 124.000 52.090 L 124.000 80.000 C 124.000 82.209 125.791 84.000 128.000 84.000 C 130.209 84.000 132.000 82.209 132.000 80.000 L 132.000 52.080 C 177.981 53.940 216.768 86.917 226.000 132.000 L 200.000 132.000 C 197.791 132.000 196.000 133.791 196.000 136.000 C 196.000 138.209 197.791 140.000 200.000 140.000 L 227.290 140.000 C 227.763 143.982 228.000 147.989 228.000 152.000 Z"),
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
        return _gauge!!
    }

private var _gauge: ImageVector? = null
