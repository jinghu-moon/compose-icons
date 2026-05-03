package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Ticket: ImageVector
    get() {
        if (_ticket != null) return _ticket!!
        _ticket = phosphorFillIcon(
            name = "Ticket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 104.000 C 236.418 104.000 240.000 100.418 240.000 96.000 L 240.000 64.000 C 240.000 55.163 232.837 48.000 224.000 48.000 L 32.000 48.000 C 23.163 48.000 16.000 55.163 16.000 64.000 L 16.000 96.000 C 16.000 100.418 19.582 104.000 24.000 104.000 C 37.255 104.000 48.000 114.745 48.000 128.000 C 48.000 141.255 37.255 152.000 24.000 152.000 C 19.582 152.000 16.000 155.582 16.000 160.000 L 16.000 192.000 C 16.000 200.837 23.163 208.000 32.000 208.000 L 224.000 208.000 C 232.837 208.000 240.000 200.837 240.000 192.000 L 240.000 160.000 C 240.000 155.582 236.418 152.000 232.000 152.000 C 218.745 152.000 208.000 141.255 208.000 128.000 C 208.000 114.745 218.745 104.000 232.000 104.000 ZM 32.000 167.200 C 50.643 163.414 64.040 147.023 64.040 128.000 C 64.040 108.977 50.643 92.586 32.000 88.800 L 32.000 64.000 L 88.000 64.000 L 88.000 192.000 L 32.000 192.000 Z"),
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
        return _ticket!!
    }

private var _ticket: ImageVector? = null
