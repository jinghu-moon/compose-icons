package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Boot: ImageVector
    get() {
        if (_boot != null) return _boot!!
        _boot = phosphorFillIcon(
            name = "Boot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 112.000 L 112.270 112.000 C 107.987 112.058 104.387 108.798 104.020 104.530 C 103.873 102.322 104.648 100.151 106.160 98.535 C 107.672 96.918 109.787 96.001 112.000 96.000 L 156.000 96.000 C 158.209 96.000 160.000 94.209 160.000 92.000 L 160.000 84.000 C 160.000 81.791 158.209 80.000 156.000 80.000 L 112.270 80.000 C 107.979 80.068 104.367 76.805 104.000 72.530 C 103.853 70.318 104.631 68.144 106.147 66.527 C 107.664 64.910 109.783 63.995 112.000 64.000 L 156.000 64.000 C 158.209 64.000 160.000 62.209 160.000 60.000 L 160.000 56.000 C 160.000 47.163 152.837 40.000 144.000 40.000 L 32.220 40.000 C 30.391 39.967 28.604 40.544 27.140 41.640 C 24.322 43.795 23.260 47.548 24.530 50.860 C 35.590 79.700 33.290 134.570 24.310 165.790 C 24.104 166.509 24.000 167.252 24.000 168.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 66.110 216.000 C 68.596 216.000 71.047 215.422 73.270 214.310 L 85.890 208.000 L 102.110 208.000 L 114.730 214.310 C 116.953 215.422 119.404 216.000 121.890 216.000 L 150.110 216.000 C 152.596 216.000 155.047 215.422 157.270 214.310 L 169.890 208.000 L 186.110 208.000 L 198.730 214.310 C 200.953 215.422 203.404 216.000 205.890 216.000 L 232.000 216.000 C 240.837 216.000 248.000 208.837 248.000 200.000 L 248.000 168.000 C 248.000 137.072 222.928 112.000 192.000 112.000 ZM 232.000 200.000 L 205.890 200.000 L 193.270 193.690 C 191.047 192.578 188.596 192.000 186.110 192.000 L 169.890 192.000 C 167.404 192.000 164.953 192.578 162.730 193.690 L 150.110 200.000 L 121.890 200.000 L 109.270 193.690 C 107.047 192.578 104.596 192.000 102.110 192.000 L 85.890 192.000 C 83.404 192.000 80.953 192.578 78.730 193.690 L 66.110 200.000 L 40.000 200.000 L 40.000 176.000 L 232.000 176.000 Z"),
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
        return _boot!!
    }

private var _boot: ImageVector? = null
