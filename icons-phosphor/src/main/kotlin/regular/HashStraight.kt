package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HashStraight: ImageVector
    get() {
        if (_hashStraight != null) return _hashStraight!!
        _hashStraight = phosphorRegularIcon(
            name = "HashStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 152.000 L 168.000 152.000 L 168.000 104.000 L 216.000 104.000 C 220.418 104.000 224.000 100.418 224.000 96.000 C 224.000 91.582 220.418 88.000 216.000 88.000 L 168.000 88.000 L 168.000 40.000 C 168.000 35.582 164.418 32.000 160.000 32.000 C 155.582 32.000 152.000 35.582 152.000 40.000 L 152.000 88.000 L 104.000 88.000 L 104.000 40.000 C 104.000 35.582 100.418 32.000 96.000 32.000 C 91.582 32.000 88.000 35.582 88.000 40.000 L 88.000 88.000 L 40.000 88.000 C 35.582 88.000 32.000 91.582 32.000 96.000 C 32.000 100.418 35.582 104.000 40.000 104.000 L 88.000 104.000 L 88.000 152.000 L 40.000 152.000 C 35.582 152.000 32.000 155.582 32.000 160.000 C 32.000 164.418 35.582 168.000 40.000 168.000 L 88.000 168.000 L 88.000 216.000 C 88.000 220.418 91.582 224.000 96.000 224.000 C 100.418 224.000 104.000 220.418 104.000 216.000 L 104.000 168.000 L 152.000 168.000 L 152.000 216.000 C 152.000 220.418 155.582 224.000 160.000 224.000 C 164.418 224.000 168.000 220.418 168.000 216.000 L 168.000 168.000 L 216.000 168.000 C 220.418 168.000 224.000 164.418 224.000 160.000 C 224.000 155.582 220.418 152.000 216.000 152.000 ZM 104.000 152.000 L 104.000 104.000 L 152.000 104.000 L 152.000 152.000 Z"),
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
        return _hashStraight!!
    }

private var _hashStraight: ImageVector? = null
