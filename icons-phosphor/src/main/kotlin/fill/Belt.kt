package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Belt: ImageVector
    get() {
        if (_belt != null) return _belt!!
        _belt = phosphorFillIcon(
            name = "Belt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 64.000 80.000 L 64.000 176.000 C 64.000 180.418 60.418 184.000 56.000 184.000 C 51.582 184.000 48.000 180.418 48.000 176.000 L 8.000 176.000 C 3.582 176.000 0.000 172.418 0.000 168.000 L 0.000 88.000 C 0.000 83.582 3.582 80.000 8.000 80.000 L 48.000 80.000 C 48.000 75.582 51.582 72.000 56.000 72.000 C 60.418 72.000 64.000 75.582 64.000 80.000 ZM 256.000 88.000 L 256.000 168.000 C 256.000 172.418 252.418 176.000 248.000 176.000 L 189.830 176.000 C 186.977 180.942 181.707 183.991 176.000 184.000 L 112.000 184.000 C 106.293 183.991 101.023 180.942 98.170 176.000 L 84.000 176.000 C 81.791 176.000 80.000 174.209 80.000 172.000 L 80.000 84.000 C 80.000 81.791 81.791 80.000 84.000 80.000 L 98.170 80.000 C 101.023 75.058 106.293 72.009 112.000 72.000 L 176.000 72.000 C 181.707 72.009 186.977 75.058 189.830 80.000 L 248.000 80.000 C 252.418 80.000 256.000 83.582 256.000 88.000 ZM 176.000 167.800 L 176.000 136.000 L 144.000 136.000 C 139.582 136.000 136.000 132.418 136.000 128.000 C 136.000 123.582 139.582 120.000 144.000 120.000 L 176.000 120.000 L 176.000 88.000 L 112.000 88.000 L 112.000 168.000 L 176.000 168.000 C 176.000 167.930 176.000 167.870 176.000 167.800 Z"),
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
        return _belt!!
    }

private var _belt: ImageVector? = null
