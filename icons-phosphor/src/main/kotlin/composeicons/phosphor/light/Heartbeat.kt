package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) return _heartbeat!!
        _heartbeat = phosphorLightIcon(
            name = "Heartbeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M72 142h-40c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h36.79L83 108.67c1.112-1.676 2.989-2.683 5-2.683 2.011 0 3.888 1.007 5 2.683l27 40.51 11-16.51c1.115-1.671 2.992-2.673 5-2.67h24c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-20.79L125 163.33c-1.112 1.676-2.989 2.683-5 2.683-2.011 0-3.888-1.008-5-2.683L88 122.82 77 139.33c-1.115 1.671-2.991 2.673-5 2.67ZM178 42c-21 0-39.26 9.47-50 25.34C117.26 51.47 99 42 78 42 44.879 42.039 18.039 68.879 18 102q0 1.09 0 2.19c.105 3.314 2.876 5.915 6.19 5.81 3.314-.105 5.915-2.876 5.81-6.19 0-.6 0-1.21 0-1.81C30.028 75.502 51.502 54.028 78 54c20.28 0 37.31 10.83 44.45 28.27 .925 2.251 3.117 3.72 5.55 3.72 2.433 0 4.625-1.469 5.55-3.72C140.69 64.83 157.72 54 178 54c26.498 .028 47.972 21.502 48 48 0 55.73-81.61 105.65-98 115.11C118.16 211.45 84.91 191.29 59.84 163.95c-1.42-1.684-3.648-2.454-5.805-2.007-2.157 .447-3.895 2.04-4.529 4.15-.633 2.11-.06 4.397 1.493 5.958 30.94 33.77 72.41 56.29 74.16 57.23 1.773 .953 3.907 .953 5.68 0 18.84-10.591 36.61-22.982 53.06-37C219.8 161.59 238 131.2 238 102 237.961 68.879 211.121 42.039 178 42Z"),
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
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
