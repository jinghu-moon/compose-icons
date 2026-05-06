package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Bank: ImageVector
    get() {
        if (_bank != null) return _bank!!
        _bank = phosphorDuotoneIcon(
            name = "Bank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 96h-208L128 32Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M24 104h24v64h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h192c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-64h24c3.577-.004 6.716-2.381 7.69-5.822 .974-3.441-.455-7.111-3.5-8.988l-104-64c-2.57-1.58-5.81-1.58-8.38 0L19.81 89.19c-3.045 1.877-4.473 5.546-3.5 8.988 .974 3.441 4.113 5.819 7.69 5.822ZM64 104h32v64h-32ZM144 104v64h-32v-64ZM192 168h-32v-64h32ZM128 41.39 203.74 88h-151.48ZM248 208c0 4.418-3.582 8-8 8h-224c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h224c4.418 0 8 3.582 8 8Z"),
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
        return _bank!!
    }

private var _bank: ImageVector? = null
