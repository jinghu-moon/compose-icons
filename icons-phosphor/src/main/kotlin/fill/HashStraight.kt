package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HashStraight: ImageVector
    get() {
        if (_hashStraight != null) return _hashStraight!!
        _hashStraight = phosphorFillIcon(
            name = "HashStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 112.000 112.000 L 144.000 112.000 L 144.000 144.000 L 112.000 144.000 ZM 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 160.000 144.000 L 160.000 112.000 L 192.000 112.000 C 196.418 112.000 200.000 108.418 200.000 104.000 C 200.000 99.582 196.418 96.000 192.000 96.000 L 160.000 96.000 L 160.000 64.000 C 160.000 59.582 156.418 56.000 152.000 56.000 C 147.582 56.000 144.000 59.582 144.000 64.000 L 144.000 96.000 L 112.000 96.000 L 112.000 64.000 C 112.000 59.582 108.418 56.000 104.000 56.000 C 99.582 56.000 96.000 59.582 96.000 64.000 L 96.000 96.000 L 64.000 96.000 C 59.582 96.000 56.000 99.582 56.000 104.000 C 56.000 108.418 59.582 112.000 64.000 112.000 L 96.000 112.000 L 96.000 144.000 L 64.000 144.000 C 59.582 144.000 56.000 147.582 56.000 152.000 C 56.000 156.418 59.582 160.000 64.000 160.000 L 96.000 160.000 L 96.000 192.000 C 96.000 196.418 99.582 200.000 104.000 200.000 C 108.418 200.000 112.000 196.418 112.000 192.000 L 112.000 160.000 L 144.000 160.000 L 144.000 192.000 C 144.000 196.418 147.582 200.000 152.000 200.000 C 156.418 200.000 160.000 196.418 160.000 192.000 L 160.000 160.000 L 192.000 160.000 C 196.418 160.000 200.000 156.418 200.000 152.000 C 200.000 147.582 196.418 144.000 192.000 144.000 Z"),
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
        return _hashStraight!!
    }

private var _hashStraight: ImageVector? = null
