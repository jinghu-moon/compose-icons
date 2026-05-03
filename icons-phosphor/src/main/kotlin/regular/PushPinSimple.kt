package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PushPinSimple: ImageVector
    get() {
        if (_pushPinSimple != null) return _pushPinSimple!!
        _pushPinSimple = phosphorRegularIcon(
            name = "PushPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 168.000 L 206.710 168.000 L 185.540 48.000 L 192.000 48.000 C 196.418 48.000 200.000 44.418 200.000 40.000 C 200.000 35.582 196.418 32.000 192.000 32.000 L 64.000 32.000 C 59.582 32.000 56.000 35.582 56.000 40.000 C 56.000 44.418 59.582 48.000 64.000 48.000 L 70.460 48.000 L 49.290 168.000 L 40.000 168.000 C 35.582 168.000 32.000 171.582 32.000 176.000 C 32.000 180.418 35.582 184.000 40.000 184.000 L 120.000 184.000 L 120.000 240.000 C 120.000 244.418 123.582 248.000 128.000 248.000 C 132.418 248.000 136.000 244.418 136.000 240.000 L 136.000 184.000 L 216.000 184.000 C 220.418 184.000 224.000 180.418 224.000 176.000 C 224.000 171.582 220.418 168.000 216.000 168.000 ZM 86.710 48.000 L 169.290 48.000 L 190.460 168.000 L 65.540 168.000 Z"),
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
        return _pushPinSimple!!
    }

private var _pushPinSimple: ImageVector? = null
