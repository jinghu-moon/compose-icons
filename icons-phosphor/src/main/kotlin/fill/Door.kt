package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Door: ImageVector
    get() {
        if (_door != null) return _door!!
        _door = phosphorFillIcon(
            name = "Door",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 216.000 L 208.000 216.000 L 208.000 40.000 C 208.000 31.163 200.837 24.000 192.000 24.000 L 64.000 24.000 C 55.163 24.000 48.000 31.163 48.000 40.000 L 48.000 216.000 L 24.000 216.000 C 19.582 216.000 16.000 219.582 16.000 224.000 C 16.000 228.418 19.582 232.000 24.000 232.000 L 232.000 232.000 C 236.418 232.000 240.000 228.418 240.000 224.000 C 240.000 219.582 236.418 216.000 232.000 216.000 ZM 164.000 144.000 C 157.373 144.000 152.000 138.627 152.000 132.000 C 152.000 125.373 157.373 120.000 164.000 120.000 C 170.627 120.000 176.000 125.373 176.000 132.000 C 176.000 138.627 170.627 144.000 164.000 144.000 Z"),
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
