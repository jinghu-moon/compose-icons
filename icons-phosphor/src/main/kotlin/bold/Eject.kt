package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Eject: ImageVector
    get() {
        if (_eject != null) return _eject!!
        _eject = phosphorBoldIcon(
            name = "Eject",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 152.000 L 48.000 152.000 C 36.954 152.000 28.000 160.954 28.000 172.000 L 28.000 192.000 C 28.000 203.046 36.954 212.000 48.000 212.000 L 208.000 212.000 C 219.046 212.000 228.000 203.046 228.000 192.000 L 228.000 172.000 C 228.000 160.954 219.046 152.000 208.000 152.000 ZM 204.000 188.000 L 52.000 188.000 L 52.000 176.000 L 204.000 176.000 ZM 48.270 136.000 L 207.730 136.000 C 215.848 135.992 223.178 131.142 226.359 123.673 C 229.540 116.205 227.959 107.559 222.340 101.700 L 148.580 24.780 C 143.203 19.171 135.770 16.000 128.000 16.000 C 120.230 16.000 112.797 19.171 107.420 24.780 L 33.660 101.700 C 28.041 107.559 26.460 116.205 29.641 123.673 C 32.822 131.142 40.152 135.992 48.270 136.000 ZM 124.750 41.390 C 125.597 40.501 126.772 39.998 128.000 39.998 C 129.228 39.998 130.403 40.501 131.250 41.390 L 199.000 112.000 L 57.000 112.000 Z"),
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
        return _eject!!
    }

private var _eject: ImageVector? = null
