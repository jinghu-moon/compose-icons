package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Equalizer: ImageVector
    get() {
        if (_equalizer != null) return _equalizer!!
        _equalizer = phosphorFillIcon(
            name = "Equalizer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 80.000 96.000 C 80.000 100.418 76.418 104.000 72.000 104.000 L 24.000 104.000 C 19.582 104.000 16.000 100.418 16.000 96.000 C 16.000 91.582 19.582 88.000 24.000 88.000 L 72.000 88.000 C 76.418 88.000 80.000 91.582 80.000 96.000 ZM 152.000 120.000 L 104.000 120.000 C 99.582 120.000 96.000 123.582 96.000 128.000 C 96.000 132.418 99.582 136.000 104.000 136.000 L 152.000 136.000 C 156.418 136.000 160.000 132.418 160.000 128.000 C 160.000 123.582 156.418 120.000 152.000 120.000 ZM 184.000 72.000 L 232.000 72.000 C 236.418 72.000 240.000 68.418 240.000 64.000 C 240.000 59.582 236.418 56.000 232.000 56.000 L 184.000 56.000 C 179.582 56.000 176.000 59.582 176.000 64.000 C 176.000 68.418 179.582 72.000 184.000 72.000 ZM 72.000 120.000 L 24.000 120.000 C 19.582 120.000 16.000 123.582 16.000 128.000 L 16.000 192.000 C 16.000 196.418 19.582 200.000 24.000 200.000 L 72.000 200.000 C 76.418 200.000 80.000 196.418 80.000 192.000 L 80.000 128.000 C 80.000 123.582 76.418 120.000 72.000 120.000 ZM 232.000 88.000 L 184.000 88.000 C 179.582 88.000 176.000 91.582 176.000 96.000 L 176.000 192.000 C 176.000 196.418 179.582 200.000 184.000 200.000 L 232.000 200.000 C 236.418 200.000 240.000 196.418 240.000 192.000 L 240.000 96.000 C 240.000 91.582 236.418 88.000 232.000 88.000 ZM 152.000 152.000 L 104.000 152.000 C 99.582 152.000 96.000 155.582 96.000 160.000 L 96.000 192.000 C 96.000 196.418 99.582 200.000 104.000 200.000 L 152.000 200.000 C 156.418 200.000 160.000 196.418 160.000 192.000 L 160.000 160.000 C 160.000 155.582 156.418 152.000 152.000 152.000 Z"),
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
        return _equalizer!!
    }

private var _equalizer: ImageVector? = null
