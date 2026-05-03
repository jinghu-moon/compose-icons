package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Cardholder: ImageVector
    get() {
        if (_cardholder != null) return _cardholder!!
        _cardholder = phosphorRegularIcon(
            name = "Cardholder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 48.000 L 48.000 48.000 C 34.745 48.000 24.000 58.745 24.000 72.000 L 24.000 184.000 C 24.000 197.255 34.745 208.000 48.000 208.000 L 208.000 208.000 C 221.255 208.000 232.000 197.255 232.000 184.000 L 232.000 72.000 C 232.000 58.745 221.255 48.000 208.000 48.000 ZM 40.000 96.000 L 216.000 96.000 L 216.000 112.000 L 160.000 112.000 C 155.582 112.000 152.000 115.582 152.000 120.000 C 152.000 133.255 141.255 144.000 128.000 144.000 C 114.745 144.000 104.000 133.255 104.000 120.000 C 104.000 115.582 100.418 112.000 96.000 112.000 L 40.000 112.000 ZM 48.000 64.000 L 208.000 64.000 C 212.418 64.000 216.000 67.582 216.000 72.000 L 216.000 80.000 L 40.000 80.000 L 40.000 72.000 C 40.000 67.582 43.582 64.000 48.000 64.000 ZM 208.000 192.000 L 48.000 192.000 C 43.582 192.000 40.000 188.418 40.000 184.000 L 40.000 128.000 L 88.800 128.000 C 92.586 146.643 108.977 160.040 128.000 160.040 C 147.023 160.040 163.414 146.643 167.200 128.000 L 216.000 128.000 L 216.000 184.000 C 216.000 188.418 212.418 192.000 208.000 192.000 Z"),
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
        return _cardholder!!
    }

private var _cardholder: ImageVector? = null
