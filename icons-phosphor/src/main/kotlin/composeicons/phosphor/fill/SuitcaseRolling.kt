package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SuitcaseRolling: ImageVector
    get() {
        if (_suitcaseRolling != null) return _suitcaseRolling!!
        _suitcaseRolling = phosphorFillIcon(
            name = "SuitcaseRolling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 48h-24v-24C168 10.745 157.255 0 144 0h-32C98.745 0 88 10.745 88 24v24h-24C55.163 48 48 55.163 48 64v144c0 8.837 7.163 16 16 16h16v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h64v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-16h16c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM96 192c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-112c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM136 192c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-112c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM152 48h-48v-24c0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8ZM176 192c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-112c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _suitcaseRolling!!
    }

private var _suitcaseRolling: ImageVector? = null
