package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Belt: ImageVector
    get() {
        if (_belt != null) return _belt!!
        _belt = phosphorRegularIcon(
            name = "Belt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.000 160.000 L 192.000 160.000 L 192.000 96.000 L 248.000 96.000 C 252.418 96.000 256.000 92.418 256.000 88.000 C 256.000 83.582 252.418 80.000 248.000 80.000 L 189.830 80.000 C 186.977 75.058 181.707 72.009 176.000 72.000 L 112.000 72.000 C 106.293 72.009 101.023 75.058 98.170 80.000 L 64.000 80.000 C 64.000 75.582 60.418 72.000 56.000 72.000 C 51.582 72.000 48.000 75.582 48.000 80.000 L 8.000 80.000 C 3.582 80.000 0.000 83.582 0.000 88.000 C 0.000 92.418 3.582 96.000 8.000 96.000 L 48.000 96.000 L 48.000 160.000 L 8.000 160.000 C 3.582 160.000 0.000 163.582 0.000 168.000 C 0.000 172.418 3.582 176.000 8.000 176.000 L 48.000 176.000 C 48.000 180.418 51.582 184.000 56.000 184.000 C 60.418 184.000 64.000 180.418 64.000 176.000 L 98.170 176.000 C 101.023 180.942 106.293 183.991 112.000 184.000 L 176.000 184.000 C 181.707 183.991 186.977 180.942 189.830 176.000 L 248.000 176.000 C 252.418 176.000 256.000 172.418 256.000 168.000 C 256.000 163.582 252.418 160.000 248.000 160.000 ZM 64.000 96.000 L 96.000 96.000 L 96.000 160.000 L 64.000 160.000 ZM 112.000 168.000 L 112.000 88.000 L 176.000 88.000 L 176.000 120.000 L 144.000 120.000 C 139.582 120.000 136.000 123.582 136.000 128.000 C 136.000 132.418 139.582 136.000 144.000 136.000 L 176.000 136.000 L 176.000 167.800 C 176.000 167.870 176.000 167.930 176.000 168.000 Z"),
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
        return _belt!!
    }

private var _belt: ImageVector? = null
