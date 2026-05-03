package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Door: ImageVector
    get() {
        if (_door != null) return _door!!
        _door = phosphorThinIcon(
            name = "Door",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 220.000 L 204.000 220.000 L 204.000 40.000 C 204.000 33.373 198.627 28.000 192.000 28.000 L 64.000 28.000 C 57.373 28.000 52.000 33.373 52.000 40.000 L 52.000 220.000 L 24.000 220.000 C 21.791 220.000 20.000 221.791 20.000 224.000 C 20.000 226.209 21.791 228.000 24.000 228.000 L 232.000 228.000 C 234.209 228.000 236.000 226.209 236.000 224.000 C 236.000 221.791 234.209 220.000 232.000 220.000 ZM 60.000 40.000 C 60.000 37.791 61.791 36.000 64.000 36.000 L 192.000 36.000 C 194.209 36.000 196.000 37.791 196.000 40.000 L 196.000 220.000 L 60.000 220.000 ZM 164.000 132.000 C 164.000 136.418 160.418 140.000 156.000 140.000 C 151.582 140.000 148.000 136.418 148.000 132.000 C 148.000 127.582 151.582 124.000 156.000 124.000 C 160.418 124.000 164.000 127.582 164.000 132.000 Z"),
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
        return _door!!
    }

private var _door: ImageVector? = null
