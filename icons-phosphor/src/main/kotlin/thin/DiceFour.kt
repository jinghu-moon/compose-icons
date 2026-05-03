package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DiceFour: ImageVector
    get() {
        if (_diceFour != null) return _diceFour!!
        _diceFour = phosphorThinIcon(
            name = "DiceFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 36.000 L 64.000 36.000 C 48.536 36.000 36.000 48.536 36.000 64.000 L 36.000 192.000 C 36.000 207.464 48.536 220.000 64.000 220.000 L 192.000 220.000 C 207.464 220.000 220.000 207.464 220.000 192.000 L 220.000 64.000 C 220.000 48.536 207.464 36.000 192.000 36.000 ZM 212.000 192.000 C 212.000 203.046 203.046 212.000 192.000 212.000 L 64.000 212.000 C 52.954 212.000 44.000 203.046 44.000 192.000 L 44.000 64.000 C 44.000 52.954 52.954 44.000 64.000 44.000 L 192.000 44.000 C 203.046 44.000 212.000 52.954 212.000 64.000 ZM 108.000 100.000 C 108.000 104.418 104.418 108.000 100.000 108.000 C 95.582 108.000 92.000 104.418 92.000 100.000 C 92.000 95.582 95.582 92.000 100.000 92.000 C 104.418 92.000 108.000 95.582 108.000 100.000 ZM 164.000 100.000 C 164.000 104.418 160.418 108.000 156.000 108.000 C 151.582 108.000 148.000 104.418 148.000 100.000 C 148.000 95.582 151.582 92.000 156.000 92.000 C 160.418 92.000 164.000 95.582 164.000 100.000 ZM 108.000 156.000 C 108.000 160.418 104.418 164.000 100.000 164.000 C 95.582 164.000 92.000 160.418 92.000 156.000 C 92.000 151.582 95.582 148.000 100.000 148.000 C 104.418 148.000 108.000 151.582 108.000 156.000 ZM 164.000 156.000 C 164.000 160.418 160.418 164.000 156.000 164.000 C 151.582 164.000 148.000 160.418 148.000 156.000 C 148.000 151.582 151.582 148.000 156.000 148.000 C 160.418 148.000 164.000 151.582 164.000 156.000 Z"),
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
        return _diceFour!!
    }

private var _diceFour: ImageVector? = null
