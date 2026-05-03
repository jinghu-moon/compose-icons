package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.QrCode: ImageVector
    get() {
        if (_qrCode != null) return _qrCode!!
        _qrCode = phosphorFillIcon(
            name = "QrCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 120.000 56.000 L 120.000 104.000 C 120.000 112.837 112.837 120.000 104.000 120.000 L 56.000 120.000 C 47.163 120.000 40.000 112.837 40.000 104.000 L 40.000 56.000 C 40.000 47.163 47.163 40.000 56.000 40.000 L 104.000 40.000 C 112.837 40.000 120.000 47.163 120.000 56.000 ZM 104.000 136.000 L 56.000 136.000 C 47.163 136.000 40.000 143.163 40.000 152.000 L 40.000 200.000 C 40.000 208.837 47.163 216.000 56.000 216.000 L 104.000 216.000 C 112.837 216.000 120.000 208.837 120.000 200.000 L 120.000 152.000 C 120.000 143.163 112.837 136.000 104.000 136.000 ZM 200.000 40.000 L 152.000 40.000 C 143.163 40.000 136.000 47.163 136.000 56.000 L 136.000 104.000 C 136.000 112.837 143.163 120.000 152.000 120.000 L 200.000 120.000 C 208.837 120.000 216.000 112.837 216.000 104.000 L 216.000 56.000 C 216.000 47.163 208.837 40.000 200.000 40.000 ZM 144.000 184.000 C 148.418 184.000 152.000 180.418 152.000 176.000 L 152.000 144.000 C 152.000 139.582 148.418 136.000 144.000 136.000 C 139.582 136.000 136.000 139.582 136.000 144.000 L 136.000 176.000 C 136.000 180.418 139.582 184.000 144.000 184.000 ZM 208.000 152.000 L 184.000 152.000 L 184.000 144.000 C 184.000 139.582 180.418 136.000 176.000 136.000 C 171.582 136.000 168.000 139.582 168.000 144.000 L 168.000 200.000 L 144.000 200.000 C 139.582 200.000 136.000 203.582 136.000 208.000 C 136.000 212.418 139.582 216.000 144.000 216.000 L 176.000 216.000 C 180.418 216.000 184.000 212.418 184.000 208.000 L 184.000 168.000 L 208.000 168.000 C 212.418 168.000 216.000 164.418 216.000 160.000 C 216.000 155.582 212.418 152.000 208.000 152.000 ZM 208.000 184.000 C 203.582 184.000 200.000 187.582 200.000 192.000 L 200.000 208.000 C 200.000 212.418 203.582 216.000 208.000 216.000 C 212.418 216.000 216.000 212.418 216.000 208.000 L 216.000 192.000 C 216.000 187.582 212.418 184.000 208.000 184.000 Z"),
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
        return _qrCode!!
    }

private var _qrCode: ImageVector? = null
