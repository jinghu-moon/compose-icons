package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileTxt: ImageVector
    get() {
        if (_fileTxt != null) return _fileTxt!!
        _fileTxt = phosphorDuotoneIcon(
            name = "FileTxt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 208.000 88.000 L 152.000 88.000 L 152.000 32.000 Z"),
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
        pathData = parseSvgPathData("M 48.000 120.000 C 52.418 120.000 56.000 116.418 56.000 112.000 L 56.000 40.000 L 144.000 40.000 L 144.000 88.000 C 144.000 92.418 147.582 96.000 152.000 96.000 L 200.000 96.000 L 200.000 112.000 C 200.000 116.418 203.582 120.000 208.000 120.000 C 212.418 120.000 216.000 116.418 216.000 112.000 L 216.000 88.000 C 216.002 85.878 215.160 83.842 213.660 82.340 L 157.660 26.340 C 156.158 24.840 154.122 23.998 152.000 24.000 L 56.000 24.000 C 47.163 24.000 40.000 31.163 40.000 40.000 L 40.000 112.000 C 40.000 116.418 43.582 120.000 48.000 120.000 ZM 160.000 51.310 L 188.690 80.000 L 160.000 80.000 ZM 154.510 156.650 L 137.830 180.000 L 154.510 203.350 C 156.842 206.938 155.937 211.726 152.457 214.216 C 148.976 216.706 144.153 216.016 141.510 212.650 L 128.000 193.760 L 114.510 212.650 C 112.906 215.118 110.076 216.506 107.143 216.263 C 104.210 216.021 101.646 214.187 100.470 211.489 C 99.293 208.791 99.692 205.665 101.510 203.350 L 118.170 180.000 L 101.490 156.650 C 99.672 154.335 99.273 151.209 100.450 148.511 C 101.626 145.813 104.190 143.979 107.123 143.737 C 110.056 143.494 112.886 144.882 114.490 147.350 L 128.000 166.240 L 141.490 147.350 C 144.133 143.984 148.956 143.294 152.437 145.784 C 155.917 148.274 156.822 153.062 154.490 156.650 ZM 92.000 152.000 C 92.000 156.418 88.418 160.000 84.000 160.000 L 72.000 160.000 L 72.000 208.000 C 72.000 212.418 68.418 216.000 64.000 216.000 C 59.582 216.000 56.000 212.418 56.000 208.000 L 56.000 160.000 L 44.000 160.000 C 39.582 160.000 36.000 156.418 36.000 152.000 C 36.000 147.582 39.582 144.000 44.000 144.000 L 84.000 144.000 C 88.418 144.000 92.000 147.582 92.000 152.000 ZM 220.000 152.000 C 220.000 156.418 216.418 160.000 212.000 160.000 L 200.000 160.000 L 200.000 208.000 C 200.000 212.418 196.418 216.000 192.000 216.000 C 187.582 216.000 184.000 212.418 184.000 208.000 L 184.000 160.000 L 172.000 160.000 C 167.582 160.000 164.000 156.418 164.000 152.000 C 164.000 147.582 167.582 144.000 172.000 144.000 L 212.000 144.000 C 216.418 144.000 220.000 147.582 220.000 152.000 Z"),
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
        return _fileTxt!!
    }

private var _fileTxt: ImageVector? = null
