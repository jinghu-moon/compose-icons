package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Log: ImageVector
    get() {
        if (_log != null) return _log!!
        _log = phosphorFillIcon(
            name = "Log",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.000 136.000 C 212.000 142.627 206.627 148.000 200.000 148.000 C 193.373 148.000 188.000 142.627 188.000 136.000 C 188.000 129.373 193.373 124.000 200.000 124.000 C 206.627 124.000 212.000 129.373 212.000 136.000 ZM 248.000 136.000 C 248.000 176.370 226.920 208.000 200.000 208.000 L 56.000 208.000 C 29.080 208.000 8.000 176.370 8.000 136.000 C 8.000 95.630 29.080 64.000 56.000 64.000 L 92.690 64.000 L 130.340 26.340 C 131.842 24.840 133.878 23.998 136.000 24.000 L 168.000 24.000 C 172.418 24.000 176.000 27.582 176.000 32.000 C 176.000 36.418 172.418 40.000 168.000 40.000 L 139.310 40.000 L 115.310 64.000 L 200.000 64.000 C 226.920 64.000 248.000 95.630 248.000 136.000 ZM 104.000 128.000 C 108.418 128.000 112.000 124.418 112.000 120.000 C 112.000 115.582 108.418 112.000 104.000 112.000 L 33.260 112.000 C 28.842 112.000 25.260 115.582 25.260 120.000 C 25.260 124.418 28.842 128.000 33.260 128.000 ZM 154.910 160.000 C 154.910 155.582 151.328 152.000 146.910 152.000 L 80.000 152.000 C 75.582 152.000 72.000 155.582 72.000 160.000 C 72.000 164.418 75.582 168.000 80.000 168.000 L 146.910 168.000 C 151.328 168.000 154.910 164.418 154.910 160.000 ZM 232.000 136.000 C 232.000 105.640 217.350 80.000 200.000 80.000 C 182.650 80.000 168.000 105.640 168.000 136.000 C 168.000 166.360 182.650 192.000 200.000 192.000 C 217.350 192.000 232.000 166.360 232.000 136.000 Z"),
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
        return _log!!
    }

private var _log: ImageVector? = null
