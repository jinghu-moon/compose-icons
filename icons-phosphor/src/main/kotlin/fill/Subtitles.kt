package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Subtitles: ImageVector
    get() {
        if (_subtitles != null) return _subtitles!!
        _subtitles = phosphorFillIcon(
            name = "Subtitles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 48.000 L 32.000 48.000 C 23.163 48.000 16.000 55.163 16.000 64.000 L 16.000 192.000 C 16.000 200.837 23.163 208.000 32.000 208.000 L 224.000 208.000 C 232.837 208.000 240.000 200.837 240.000 192.000 L 240.000 64.000 C 240.000 55.163 232.837 48.000 224.000 48.000 ZM 56.000 128.000 L 72.000 128.000 C 76.418 128.000 80.000 131.582 80.000 136.000 C 80.000 140.418 76.418 144.000 72.000 144.000 L 56.000 144.000 C 51.582 144.000 48.000 140.418 48.000 136.000 C 48.000 131.582 51.582 128.000 56.000 128.000 ZM 152.000 176.000 L 56.000 176.000 C 51.582 176.000 48.000 172.418 48.000 168.000 C 48.000 163.582 51.582 160.000 56.000 160.000 L 152.000 160.000 C 156.418 160.000 160.000 163.582 160.000 168.000 C 160.000 172.418 156.418 176.000 152.000 176.000 ZM 200.000 176.000 L 184.000 176.000 C 179.582 176.000 176.000 172.418 176.000 168.000 C 176.000 163.582 179.582 160.000 184.000 160.000 L 200.000 160.000 C 204.418 160.000 208.000 163.582 208.000 168.000 C 208.000 172.418 204.418 176.000 200.000 176.000 ZM 200.000 144.000 L 104.000 144.000 C 99.582 144.000 96.000 140.418 96.000 136.000 C 96.000 131.582 99.582 128.000 104.000 128.000 L 200.000 128.000 C 204.418 128.000 208.000 131.582 208.000 136.000 C 208.000 140.418 204.418 144.000 200.000 144.000 Z"),
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
        return _subtitles!!
    }

private var _subtitles: ImageVector? = null
