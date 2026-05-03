package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DiceSix: ImageVector
    get() {
        if (_diceSix != null) return _diceSix!!
        _diceSix = phosphorThinIcon(
            name = "DiceSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 36.000 L 64.000 36.000 C 48.536 36.000 36.000 48.536 36.000 64.000 L 36.000 192.000 C 36.000 207.464 48.536 220.000 64.000 220.000 L 192.000 220.000 C 207.464 220.000 220.000 207.464 220.000 192.000 L 220.000 64.000 C 220.000 48.536 207.464 36.000 192.000 36.000 ZM 212.000 192.000 C 212.000 203.046 203.046 212.000 192.000 212.000 L 64.000 212.000 C 52.954 212.000 44.000 203.046 44.000 192.000 L 44.000 64.000 C 44.000 52.954 52.954 44.000 64.000 44.000 L 192.000 44.000 C 203.046 44.000 212.000 52.954 212.000 64.000 ZM 100.000 84.000 C 100.000 88.418 96.418 92.000 92.000 92.000 C 87.582 92.000 84.000 88.418 84.000 84.000 C 84.000 79.582 87.582 76.000 92.000 76.000 C 96.418 76.000 100.000 79.582 100.000 84.000 ZM 172.000 84.000 C 172.000 88.418 168.418 92.000 164.000 92.000 C 159.582 92.000 156.000 88.418 156.000 84.000 C 156.000 79.582 159.582 76.000 164.000 76.000 C 168.418 76.000 172.000 79.582 172.000 84.000 ZM 100.000 128.000 C 100.000 132.418 96.418 136.000 92.000 136.000 C 87.582 136.000 84.000 132.418 84.000 128.000 C 84.000 123.582 87.582 120.000 92.000 120.000 C 96.418 120.000 100.000 123.582 100.000 128.000 ZM 172.000 128.000 C 172.000 132.418 168.418 136.000 164.000 136.000 C 159.582 136.000 156.000 132.418 156.000 128.000 C 156.000 123.582 159.582 120.000 164.000 120.000 C 168.418 120.000 172.000 123.582 172.000 128.000 ZM 100.000 172.000 C 100.000 176.418 96.418 180.000 92.000 180.000 C 87.582 180.000 84.000 176.418 84.000 172.000 C 84.000 167.582 87.582 164.000 92.000 164.000 C 96.418 164.000 100.000 167.582 100.000 172.000 ZM 172.000 172.000 C 172.000 176.418 168.418 180.000 164.000 180.000 C 159.582 180.000 156.000 176.418 156.000 172.000 C 156.000 167.582 159.582 164.000 164.000 164.000 C 168.418 164.000 172.000 167.582 172.000 172.000 Z"),
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
        return _diceSix!!
    }

private var _diceSix: ImageVector? = null
