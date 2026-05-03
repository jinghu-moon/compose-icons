package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CourtBasketball: ImageVector
    get() {
        if (_courtBasketball != null) return _courtBasketball!!
        _courtBasketball = phosphorThinIcon(
            name = "CourtBasketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 52.000 L 32.000 52.000 C 25.373 52.000 20.000 57.373 20.000 64.000 L 20.000 192.000 C 20.000 198.627 25.373 204.000 32.000 204.000 L 224.000 204.000 C 230.627 204.000 236.000 198.627 236.000 192.000 L 236.000 64.000 C 236.000 57.373 230.627 52.000 224.000 52.000 ZM 228.000 164.000 L 216.000 164.000 C 196.118 164.000 180.000 147.882 180.000 128.000 C 180.000 108.118 196.118 92.000 216.000 92.000 L 228.000 92.000 ZM 28.000 92.000 L 40.000 92.000 C 59.882 92.000 76.000 108.118 76.000 128.000 C 76.000 147.882 59.882 164.000 40.000 164.000 L 28.000 164.000 ZM 28.000 192.000 L 28.000 172.000 L 40.000 172.000 C 64.301 172.000 84.000 152.301 84.000 128.000 C 84.000 103.699 64.301 84.000 40.000 84.000 L 28.000 84.000 L 28.000 64.000 C 28.000 61.791 29.791 60.000 32.000 60.000 L 124.000 60.000 L 124.000 196.000 L 32.000 196.000 C 29.791 196.000 28.000 194.209 28.000 192.000 ZM 224.000 196.000 L 132.000 196.000 L 132.000 60.000 L 224.000 60.000 C 226.209 60.000 228.000 61.791 228.000 64.000 L 228.000 84.000 L 216.000 84.000 C 191.699 84.000 172.000 103.699 172.000 128.000 C 172.000 152.301 191.699 172.000 216.000 172.000 L 228.000 172.000 L 228.000 192.000 C 228.000 194.209 226.209 196.000 224.000 196.000 Z"),
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
        return _courtBasketball!!
    }

private var _courtBasketball: ImageVector? = null
