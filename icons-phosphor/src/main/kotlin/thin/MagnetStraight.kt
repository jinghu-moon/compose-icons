package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MagnetStraight: ImageVector
    get() {
        if (_magnetStraight != null) return _magnetStraight!!
        _magnetStraight = phosphorThinIcon(
            name = "MagnetStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 200.000 44.000 L 160.000 44.000 C 153.373 44.000 148.000 49.373 148.000 56.000 L 148.000 144.000 C 148.000 155.046 139.046 164.000 128.000 164.000 C 116.954 164.000 108.000 155.046 108.000 144.000 L 108.000 56.000 C 108.000 49.373 102.627 44.000 96.000 44.000 L 56.000 44.000 C 49.373 44.000 44.000 49.373 44.000 56.000 L 44.000 144.000 C 44.000 190.392 81.608 228.000 128.000 228.000 L 128.640 228.000 C 174.640 227.660 212.000 189.530 212.000 143.000 L 212.000 56.000 C 212.000 49.373 206.627 44.000 200.000 44.000 ZM 160.000 52.000 L 200.000 52.000 C 202.209 52.000 204.000 53.791 204.000 56.000 L 204.000 92.000 L 156.000 92.000 L 156.000 56.000 C 156.000 53.791 157.791 52.000 160.000 52.000 ZM 56.000 52.000 L 96.000 52.000 C 98.209 52.000 100.000 53.791 100.000 56.000 L 100.000 92.000 L 52.000 92.000 L 52.000 56.000 C 52.000 53.791 53.791 52.000 56.000 52.000 ZM 128.580 220.000 L 128.000 220.000 C 86.026 220.000 52.000 185.974 52.000 144.000 L 52.000 100.000 L 100.000 100.000 L 100.000 144.000 C 100.000 159.464 112.536 172.000 128.000 172.000 C 143.464 172.000 156.000 159.464 156.000 144.000 L 156.000 100.000 L 204.000 100.000 L 204.000 143.000 C 204.000 185.150 170.170 219.690 128.580 220.000 Z"),
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
        return _magnetStraight!!
    }

private var _magnetStraight: ImageVector? = null
