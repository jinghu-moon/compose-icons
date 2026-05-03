package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DiceFive: ImageVector
    get() {
        if (_diceFive != null) return _diceFive!!
        _diceFive = phosphorThinIcon(
            name = "DiceFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 192.000 36.000 L 64.000 36.000 C 48.536 36.000 36.000 48.536 36.000 64.000 L 36.000 192.000 C 36.000 207.464 48.536 220.000 64.000 220.000 L 192.000 220.000 C 207.464 220.000 220.000 207.464 220.000 192.000 L 220.000 64.000 C 220.000 48.536 207.464 36.000 192.000 36.000 ZM 212.000 192.000 C 212.000 203.046 203.046 212.000 192.000 212.000 L 64.000 212.000 C 52.954 212.000 44.000 203.046 44.000 192.000 L 44.000 64.000 C 44.000 52.954 52.954 44.000 64.000 44.000 L 192.000 44.000 C 203.046 44.000 212.000 52.954 212.000 64.000 ZM 100.000 92.000 C 100.000 96.418 96.418 100.000 92.000 100.000 C 87.582 100.000 84.000 96.418 84.000 92.000 C 84.000 87.582 87.582 84.000 92.000 84.000 C 96.418 84.000 100.000 87.582 100.000 92.000 ZM 136.000 128.000 C 136.000 132.418 132.418 136.000 128.000 136.000 C 123.582 136.000 120.000 132.418 120.000 128.000 C 120.000 123.582 123.582 120.000 128.000 120.000 C 132.418 120.000 136.000 123.582 136.000 128.000 ZM 172.000 92.000 C 172.000 96.418 168.418 100.000 164.000 100.000 C 159.582 100.000 156.000 96.418 156.000 92.000 C 156.000 87.582 159.582 84.000 164.000 84.000 C 168.418 84.000 172.000 87.582 172.000 92.000 ZM 100.000 164.000 C 100.000 168.418 96.418 172.000 92.000 172.000 C 87.582 172.000 84.000 168.418 84.000 164.000 C 84.000 159.582 87.582 156.000 92.000 156.000 C 96.418 156.000 100.000 159.582 100.000 164.000 ZM 172.000 164.000 C 172.000 168.418 168.418 172.000 164.000 172.000 C 159.582 172.000 156.000 168.418 156.000 164.000 C 156.000 159.582 159.582 156.000 164.000 156.000 C 168.418 156.000 172.000 159.582 172.000 164.000 Z"),
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
        return _diceFive!!
    }

private var _diceFive: ImageVector? = null
