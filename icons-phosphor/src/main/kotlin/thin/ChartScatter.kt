package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartScatter: ImageVector
    get() {
        if (_chartScatter != null) return _chartScatter!!
        _chartScatter = phosphorThinIcon(
            name = "ChartScatter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 208.000 C 228.000 210.209 226.209 212.000 224.000 212.000 L 32.000 212.000 C 29.791 212.000 28.000 210.209 28.000 208.000 L 28.000 48.000 C 28.000 45.791 29.791 44.000 32.000 44.000 C 34.209 44.000 36.000 45.791 36.000 48.000 L 36.000 204.000 L 224.000 204.000 C 226.209 204.000 228.000 205.791 228.000 208.000 ZM 132.000 156.000 C 136.418 156.000 140.000 152.418 140.000 148.000 C 140.000 143.582 136.418 140.000 132.000 140.000 C 127.582 140.000 124.000 143.582 124.000 148.000 C 124.000 152.418 127.582 156.000 132.000 156.000 ZM 108.000 100.000 C 112.418 100.000 116.000 96.418 116.000 92.000 C 116.000 87.582 112.418 84.000 108.000 84.000 C 103.582 84.000 100.000 87.582 100.000 92.000 C 100.000 96.418 103.582 100.000 108.000 100.000 ZM 76.000 172.000 C 80.418 172.000 84.000 168.418 84.000 164.000 C 84.000 159.582 80.418 156.000 76.000 156.000 C 71.582 156.000 68.000 159.582 68.000 164.000 C 68.000 168.418 71.582 172.000 76.000 172.000 ZM 172.000 124.000 C 176.418 124.000 180.000 120.418 180.000 116.000 C 180.000 111.582 176.418 108.000 172.000 108.000 C 167.582 108.000 164.000 111.582 164.000 116.000 C 164.000 120.418 167.582 124.000 172.000 124.000 ZM 196.000 84.000 C 200.418 84.000 204.000 80.418 204.000 76.000 C 204.000 71.582 200.418 68.000 196.000 68.000 C 191.582 68.000 188.000 71.582 188.000 76.000 C 188.000 80.418 191.582 84.000 196.000 84.000 ZM 188.000 172.000 C 192.418 172.000 196.000 168.418 196.000 164.000 C 196.000 159.582 192.418 156.000 188.000 156.000 C 183.582 156.000 180.000 159.582 180.000 164.000 C 180.000 168.418 183.582 172.000 188.000 172.000 Z"),
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
        return _chartScatter!!
    }

private var _chartScatter: ImageVector? = null
