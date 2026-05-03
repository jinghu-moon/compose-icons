package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Hockey: ImageVector
    get() {
        if (_hockey != null) return _hockey!!
        _hockey = phosphorDuotoneIcon(
            name = "Hockey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 200.000 160.000 L 200.000 208.000 L 171.700 208.000 C 169.351 208.001 167.121 206.970 165.600 205.180 L 127.600 160.480 L 90.400 205.120 C 88.879 206.946 86.626 208.001 84.250 208.000 L 56.000 208.000 L 56.000 160.000 L 200.000 160.000 Z"),
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
        pathData = parseSvgPathData("M 224.000 152.000 L 130.900 152.000 L 38.100 42.820 C 35.239 39.451 30.189 39.039 26.820 41.900 C 23.451 44.761 23.039 49.811 25.900 53.180 L 159.510 210.360 C 162.549 213.937 167.006 215.999 171.700 216.000 L 224.000 216.000 C 232.837 216.000 240.000 208.837 240.000 200.000 L 240.000 168.000 C 240.000 159.163 232.837 152.000 224.000 152.000 ZM 144.500 168.000 L 192.000 168.000 L 192.000 200.000 L 171.700 200.000 ZM 224.000 200.000 L 208.000 200.000 L 208.000 168.000 L 224.000 168.000 ZM 112.180 179.550 C 108.813 176.694 103.769 177.106 100.910 180.470 L 84.300 200.000 L 64.000 200.000 L 64.000 168.000 L 85.200 168.000 C 89.618 168.000 93.200 164.418 93.200 160.000 C 93.200 155.582 89.618 152.000 85.200 152.000 L 32.000 152.000 C 23.163 152.000 16.000 159.163 16.000 168.000 L 16.000 200.000 C 16.000 208.837 23.163 216.000 32.000 216.000 L 84.300 216.000 C 88.994 215.999 93.451 213.937 96.490 210.360 L 113.100 190.830 C 114.474 189.212 115.150 187.115 114.977 184.999 C 114.805 182.884 113.798 180.923 112.180 179.550 ZM 32.000 168.000 L 48.000 168.000 L 48.000 200.000 L 32.000 200.000 ZM 149.900 122.820 L 217.900 42.820 C 220.761 39.451 225.811 39.039 229.180 41.900 C 232.549 44.761 232.961 49.811 230.100 53.180 L 162.100 133.180 C 159.239 136.549 154.189 136.961 150.820 134.100 C 147.451 131.239 147.039 126.189 149.900 122.820 Z"),
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
        return _hockey!!
    }

private var _hockey: ImageVector? = null
