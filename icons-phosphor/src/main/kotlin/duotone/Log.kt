package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Log: ImageVector
    get() {
        if (_log != null) return _log!!
        _log = phosphorDuotoneIcon(
            name = "Log",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 240.000 136.000 C 240.000 171.350 222.090 200.000 200.000 200.000 C 177.910 200.000 160.000 171.350 160.000 136.000 C 160.000 100.650 177.910 72.000 200.000 72.000 C 222.090 72.000 240.000 100.650 240.000 136.000 Z"),
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
        pathData = parseSvgPathData("M 212.000 136.000 C 212.000 142.627 206.627 148.000 200.000 148.000 C 193.373 148.000 188.000 142.627 188.000 136.000 C 188.000 129.373 193.373 124.000 200.000 124.000 C 206.627 124.000 212.000 129.373 212.000 136.000 ZM 248.000 136.000 C 248.000 176.370 226.920 208.000 200.000 208.000 L 56.000 208.000 C 29.080 208.000 8.000 176.370 8.000 136.000 C 8.000 95.630 29.080 64.000 56.000 64.000 L 92.690 64.000 L 130.340 26.340 C 131.842 24.840 133.878 23.998 136.000 24.000 L 168.000 24.000 C 172.418 24.000 176.000 27.582 176.000 32.000 C 176.000 36.418 172.418 40.000 168.000 40.000 L 139.310 40.000 L 115.310 64.000 L 200.000 64.000 C 226.920 64.000 248.000 95.630 248.000 136.000 ZM 56.000 192.000 L 169.510 192.000 C 163.833 184.856 159.536 176.717 156.840 168.000 L 80.000 168.000 C 75.582 168.000 72.000 164.418 72.000 160.000 C 72.000 155.582 75.582 152.000 80.000 152.000 L 153.160 152.000 C 152.387 146.702 151.999 141.354 152.000 136.000 C 152.000 113.140 158.760 93.100 169.510 80.000 L 56.000 80.000 C 43.530 80.000 32.450 93.260 27.200 112.000 L 104.000 112.000 C 108.418 112.000 112.000 115.582 112.000 120.000 C 112.000 124.418 108.418 128.000 104.000 128.000 L 24.350 128.000 Q 24.010 131.930 24.000 136.000 C 24.000 166.360 38.650 192.000 56.000 192.000 ZM 232.000 136.000 C 232.000 105.640 217.350 80.000 200.000 80.000 C 182.650 80.000 168.000 105.640 168.000 136.000 C 168.000 166.360 182.650 192.000 200.000 192.000 C 217.350 192.000 232.000 166.360 232.000 136.000 Z"),
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
        return _log!!
    }

private var _log: ImageVector? = null
