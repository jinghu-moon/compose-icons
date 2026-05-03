package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Shower: ImageVector
    get() {
        if (_shower != null) return _shower!!
        _shower = phosphorBoldIcon(
            name = "Shower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 68.000 236.000 C 68.000 244.837 60.837 252.000 52.000 252.000 C 43.163 252.000 36.000 244.837 36.000 236.000 C 36.000 227.163 43.163 220.000 52.000 220.000 C 60.837 220.000 68.000 227.163 68.000 236.000 ZM 84.000 188.000 C 75.163 188.000 68.000 195.163 68.000 204.000 C 68.000 212.837 75.163 220.000 84.000 220.000 C 92.837 220.000 100.000 212.837 100.000 204.000 C 100.000 195.163 92.837 188.000 84.000 188.000 ZM 20.000 188.000 C 11.163 188.000 4.000 195.163 4.000 204.000 C 4.000 212.837 11.163 220.000 20.000 220.000 C 28.837 220.000 36.000 212.837 36.000 204.000 C 36.000 195.163 28.837 188.000 20.000 188.000 ZM 52.000 188.000 C 60.837 188.000 68.000 180.837 68.000 172.000 C 68.000 163.163 60.837 156.000 52.000 156.000 C 43.163 156.000 36.000 163.163 36.000 172.000 C 36.000 180.837 43.163 188.000 52.000 188.000 ZM 256.000 40.000 C 256.000 46.627 250.627 52.000 244.000 52.000 L 221.000 52.000 L 195.190 77.790 L 173.740 203.330 C 172.489 210.706 167.227 216.768 160.099 219.041 C 152.971 221.315 145.171 219.420 139.880 214.130 L 41.880 116.130 C 36.577 110.835 34.679 103.020 36.963 95.883 C 39.246 88.745 45.328 83.483 52.720 82.250 L 178.220 60.810 L 207.510 31.510 C 209.762 29.260 212.816 27.997 216.000 28.000 L 244.000 28.000 C 250.627 28.000 256.000 33.373 256.000 40.000 ZM 169.320 86.680 L 64.320 104.620 L 151.390 191.690 Z"),
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
        return _shower!!
    }

private var _shower: ImageVector? = null
