package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Translate: ImageVector
    get() {
        if (_translate != null) return _translate!!
        _translate = phosphorBoldIcon(
            name = "Translate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 250.730 210.630 L 194.730 98.630 C 192.696 94.568 188.543 92.003 184.000 92.003 C 179.457 92.003 175.304 94.568 173.270 98.630 L 152.750 139.630 C 138.926 138.422 125.614 133.815 114.000 126.220 C 128.114 109.807 136.942 89.515 139.330 68.000 L 160.000 68.000 C 166.627 68.000 172.000 62.627 172.000 56.000 C 172.000 49.373 166.627 44.000 160.000 44.000 L 108.000 44.000 L 108.000 32.000 C 108.000 25.373 102.627 20.000 96.000 20.000 C 89.373 20.000 84.000 25.373 84.000 32.000 L 84.000 44.000 L 32.000 44.000 C 25.373 44.000 20.000 49.373 20.000 56.000 C 20.000 62.627 25.373 68.000 32.000 68.000 L 115.130 68.000 C 112.879 83.639 106.247 98.322 96.000 110.350 C 91.000 104.499 86.827 97.988 83.600 91.000 C 81.879 86.999 78.126 84.245 73.793 83.803 C 69.461 83.362 65.229 85.302 62.736 88.873 C 60.244 92.444 59.882 97.085 61.790 101.000 C 65.988 110.129 71.444 118.625 78.000 126.240 C 64.343 135.229 48.349 140.013 32.000 140.000 C 25.373 140.000 20.000 145.373 20.000 152.000 C 20.000 158.627 25.373 164.000 32.000 164.000 C 55.040 164.019 77.477 156.632 96.000 142.930 C 109.433 152.816 124.966 159.468 141.390 162.370 L 117.260 210.630 C 115.218 214.478 115.423 219.131 117.793 222.785 C 120.164 226.440 124.330 228.522 128.676 228.226 C 133.022 227.930 136.866 225.302 138.720 221.360 L 151.410 196.000 L 216.580 196.000 L 229.260 221.360 C 232.223 227.289 239.431 229.693 245.360 226.730 C 251.289 223.767 253.693 216.559 250.730 210.630 ZM 163.410 172.000 L 184.000 130.830 L 204.580 172.000 Z"),
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
        return _translate!!
    }

private var _translate: ImageVector? = null
