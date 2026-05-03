package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lightning: ImageVector
    get() {
        if (_lightning != null) return _lightning!!
        _lightning = phosphorBoldIcon(
            name = "Lightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 219.710 117.380 C 218.846 113.518 216.134 110.331 212.460 108.860 L 161.280 88.390 L 171.870 17.780 C 172.668 12.575 169.980 7.458 165.241 5.162 C 160.502 2.866 154.820 3.928 151.230 7.780 L 39.230 127.780 C 36.527 130.674 35.426 134.716 36.288 138.581 C 37.150 142.447 39.864 145.638 43.540 147.110 L 94.720 167.580 L 84.130 238.220 C 83.332 243.425 86.020 248.542 90.759 250.838 C 95.498 253.134 101.180 252.072 104.770 248.220 L 216.770 128.220 C 219.485 125.317 220.586 121.257 219.710 117.380 ZM 113.600 203.550 L 119.870 161.780 C 120.695 156.276 117.627 150.927 112.460 148.860 L 68.740 131.370 L 142.400 52.450 L 136.130 94.220 C 135.305 99.724 138.373 105.073 143.540 107.140 L 187.260 124.630 Z"),
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
        return _lightning!!
    }

private var _lightning: ImageVector? = null
