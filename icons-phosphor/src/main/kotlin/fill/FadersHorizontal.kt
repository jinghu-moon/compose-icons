package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FadersHorizontal: ImageVector
    get() {
        if (_fadersHorizontal != null) return _fadersHorizontal!!
        _fadersHorizontal = phosphorFillIcon(
            name = "FadersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 184.000 80.000 C 184.000 75.582 187.582 72.000 192.000 72.000 L 216.000 72.000 C 220.418 72.000 224.000 75.582 224.000 80.000 C 224.000 84.418 220.418 88.000 216.000 88.000 L 192.000 88.000 C 187.582 88.000 184.000 84.418 184.000 80.000 ZM 40.000 88.000 L 136.000 88.000 L 136.000 104.000 C 136.000 108.418 139.582 112.000 144.000 112.000 L 160.000 112.000 C 164.418 112.000 168.000 108.418 168.000 104.000 L 168.000 56.000 C 168.000 51.582 164.418 48.000 160.000 48.000 L 144.000 48.000 C 139.582 48.000 136.000 51.582 136.000 56.000 L 136.000 72.000 L 40.000 72.000 C 35.582 72.000 32.000 75.582 32.000 80.000 C 32.000 84.418 35.582 88.000 40.000 88.000 ZM 216.000 168.000 L 128.000 168.000 C 123.582 168.000 120.000 171.582 120.000 176.000 C 120.000 180.418 123.582 184.000 128.000 184.000 L 216.000 184.000 C 220.418 184.000 224.000 180.418 224.000 176.000 C 224.000 171.582 220.418 168.000 216.000 168.000 ZM 96.000 144.000 L 80.000 144.000 C 75.582 144.000 72.000 147.582 72.000 152.000 L 72.000 168.000 L 40.000 168.000 C 35.582 168.000 32.000 171.582 32.000 176.000 C 32.000 180.418 35.582 184.000 40.000 184.000 L 72.000 184.000 L 72.000 200.000 C 72.000 204.418 75.582 208.000 80.000 208.000 L 96.000 208.000 C 100.418 208.000 104.000 204.418 104.000 200.000 L 104.000 152.000 C 104.000 147.582 100.418 144.000 96.000 144.000 Z"),
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
        return _fadersHorizontal!!
    }

private var _fadersHorizontal: ImageVector? = null
