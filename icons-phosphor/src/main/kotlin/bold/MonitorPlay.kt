package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MonitorPlay: ImageVector
    get() {
        if (_monitorPlay != null) return _monitorPlay!!
        _monitorPlay = phosphorBoldIcon(
            name = "MonitorPlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 120.000 C 167.999 123.916 166.088 127.585 162.880 129.830 L 122.880 157.830 C 119.214 160.395 114.426 160.708 110.458 158.642 C 106.490 156.576 104.001 152.474 104.000 148.000 L 104.000 92.000 C 104.001 87.526 106.490 83.424 110.458 81.358 C 114.426 79.292 119.214 79.605 122.880 82.170 L 162.880 110.170 C 166.088 112.415 167.999 116.084 168.000 120.000 ZM 236.000 64.000 L 236.000 176.000 C 236.000 191.464 223.464 204.000 208.000 204.000 L 48.000 204.000 C 32.536 204.000 20.000 191.464 20.000 176.000 L 20.000 64.000 C 20.000 48.536 32.536 36.000 48.000 36.000 L 208.000 36.000 C 223.464 36.000 236.000 48.536 236.000 64.000 ZM 212.000 64.000 C 212.000 61.791 210.209 60.000 208.000 60.000 L 48.000 60.000 C 45.791 60.000 44.000 61.791 44.000 64.000 L 44.000 176.000 C 44.000 178.209 45.791 180.000 48.000 180.000 L 208.000 180.000 C 210.209 180.000 212.000 178.209 212.000 176.000 ZM 160.000 216.000 L 96.000 216.000 C 89.373 216.000 84.000 221.373 84.000 228.000 C 84.000 234.627 89.373 240.000 96.000 240.000 L 160.000 240.000 C 166.627 240.000 172.000 234.627 172.000 228.000 C 172.000 221.373 166.627 216.000 160.000 216.000 Z"),
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
        return _monitorPlay!!
    }

private var _monitorPlay: ImageVector? = null
