package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Door: ImageVector
    get() {
        if (_door != null) return _door!!
        _door = phosphorDuotoneIcon(
            name = "Door",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 200.000 40.000 L 200.000 224.000 L 56.000 224.000 L 56.000 40.000 C 56.000 35.582 59.582 32.000 64.000 32.000 L 192.000 32.000 C 196.418 32.000 200.000 35.582 200.000 40.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 232.000 216.000 L 208.000 216.000 L 208.000 40.000 C 208.000 31.163 200.837 24.000 192.000 24.000 L 64.000 24.000 C 55.163 24.000 48.000 31.163 48.000 40.000 L 48.000 216.000 L 24.000 216.000 C 19.582 216.000 16.000 219.582 16.000 224.000 C 16.000 228.418 19.582 232.000 24.000 232.000 L 232.000 232.000 C 236.418 232.000 240.000 228.418 240.000 224.000 C 240.000 219.582 236.418 216.000 232.000 216.000 ZM 64.000 40.000 L 192.000 40.000 L 192.000 216.000 L 64.000 216.000 ZM 168.000 132.000 C 168.000 138.627 162.627 144.000 156.000 144.000 C 149.373 144.000 144.000 138.627 144.000 132.000 C 144.000 125.373 149.373 120.000 156.000 120.000 C 162.627 120.000 168.000 125.373 168.000 132.000 Z"),
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
        return _door!!
    }

private var _door: ImageVector? = null
