package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Boot: ImageVector
    get() {
        if (_boot != null) return _boot!!
        _boot = phosphorDuotoneIcon(
            name = "Boot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 32.000 168.000 C 41.220 135.940 44.000 79.350 32.000 48.000 L 144.000 48.000 C 148.418 48.000 152.000 51.582 152.000 56.000 L 152.000 120.000 L 192.000 120.000 C 218.510 120.000 240.000 141.490 240.000 168.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 192.000 112.000 L 160.000 112.000 L 160.000 56.000 C 160.000 47.163 152.837 40.000 144.000 40.000 L 32.000 40.000 C 29.367 40.000 26.902 41.297 25.410 43.466 C 23.918 45.636 23.589 48.401 24.530 50.860 C 35.590 79.700 33.290 134.570 24.310 165.790 C 24.107 166.509 24.003 167.253 24.000 168.000 L 24.000 200.000 C 24.000 208.837 31.163 216.000 40.000 216.000 L 66.110 216.000 C 68.596 216.000 71.047 215.422 73.270 214.310 L 85.890 208.000 L 102.110 208.000 L 114.730 214.310 C 116.953 215.422 119.404 216.000 121.890 216.000 L 150.110 216.000 C 152.596 216.000 155.047 215.422 157.270 214.310 L 169.890 208.000 L 186.110 208.000 L 198.730 214.310 C 200.953 215.422 203.404 216.000 205.890 216.000 L 232.000 216.000 C 240.837 216.000 248.000 208.837 248.000 200.000 L 248.000 168.000 C 247.967 137.086 222.914 112.033 192.000 112.000 ZM 144.000 56.000 L 144.000 80.000 L 112.000 80.000 C 107.582 80.000 104.000 83.582 104.000 88.000 C 104.000 92.418 107.582 96.000 112.000 96.000 L 144.000 96.000 L 144.000 112.000 L 112.000 112.000 C 107.582 112.000 104.000 115.582 104.000 120.000 C 104.000 124.418 107.582 128.000 112.000 128.000 L 192.000 128.000 C 211.001 128.023 227.373 141.388 231.200 160.000 L 42.250 160.000 C 48.990 129.160 50.410 85.830 42.860 56.000 ZM 205.890 200.000 L 193.270 193.690 C 191.047 192.578 188.596 192.000 186.110 192.000 L 169.890 192.000 C 167.404 192.000 164.953 192.578 162.730 193.690 L 150.110 200.000 L 121.890 200.000 L 109.270 193.690 C 107.047 192.578 104.596 192.000 102.110 192.000 L 85.890 192.000 C 83.404 192.000 80.953 192.578 78.730 193.690 L 66.110 200.000 L 40.000 200.000 L 40.000 176.000 L 232.000 176.000 L 232.000 200.000 Z"),
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
