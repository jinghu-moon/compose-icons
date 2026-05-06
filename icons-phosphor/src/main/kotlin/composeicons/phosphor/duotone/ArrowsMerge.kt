package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowsMerge: ImageVector
    get() {
        if (_arrowsMerge != null) return _arrowsMerge!!
        _arrowsMerge = phosphorDuotoneIcon(
            name = "ArrowsMerge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 40v64l-56 56L72 104v-64Z"),
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
                pathData = parseSvgPathData("M192 40v64c.002 2.122-.84 4.158-2.34 5.66L136 163.31v49.38l18.34-18.35c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32l-32 32c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346l-32-32c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L120 212.69v-49.38L66.34 109.66C64.84 108.158 63.998 106.122 64 104v-64c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v60.69l48 48 48-48v-60.69c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _arrowsMerge!!
    }

private var _arrowsMerge: ImageVector? = null
