package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Headlights: ImageVector
    get() {
        if (_headlights != null) return _headlights!!
        _headlights = phosphorFillIcon(
            name = "Headlights",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 160.000 80.000 C 160.000 75.582 163.582 72.000 168.000 72.000 L 240.000 72.000 C 244.418 72.000 248.000 75.582 248.000 80.000 C 248.000 84.418 244.418 88.000 240.000 88.000 L 168.000 88.000 C 163.582 88.000 160.000 84.418 160.000 80.000 ZM 240.000 168.000 L 168.000 168.000 C 163.582 168.000 160.000 171.582 160.000 176.000 C 160.000 180.418 163.582 184.000 168.000 184.000 L 240.000 184.000 C 244.418 184.000 248.000 180.418 248.000 176.000 C 248.000 171.582 244.418 168.000 240.000 168.000 ZM 240.000 104.000 L 168.000 104.000 C 163.582 104.000 160.000 107.582 160.000 112.000 C 160.000 116.418 163.582 120.000 168.000 120.000 L 240.000 120.000 C 244.418 120.000 248.000 116.418 248.000 112.000 C 248.000 107.582 244.418 104.000 240.000 104.000 ZM 240.000 136.000 L 168.000 136.000 C 163.582 136.000 160.000 139.582 160.000 144.000 C 160.000 148.418 163.582 152.000 168.000 152.000 L 240.000 152.000 C 244.418 152.000 248.000 148.418 248.000 144.000 C 248.000 139.582 244.418 136.000 240.000 136.000 ZM 128.000 48.000 L 88.900 48.000 C 44.620 48.000 8.330 83.620 8.000 127.390 C 7.837 148.713 16.194 169.218 31.215 184.353 C 46.235 199.488 66.677 208.001 88.000 208.000 L 128.000 208.000 C 136.837 208.000 144.000 200.837 144.000 192.000 L 144.000 64.000 C 144.000 55.163 136.837 48.000 128.000 48.000 Z"),
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
        return _headlights!!
    }

private var _headlights: ImageVector? = null
