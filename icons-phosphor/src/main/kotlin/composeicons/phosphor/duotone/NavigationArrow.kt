package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NavigationArrow: ImageVector
    get() {
        if (_navigationArrow != null) return _navigationArrow!!
        _navigationArrow = phosphorDuotoneIcon(
            name = "NavigationArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.35 129 152 152l-23 82.35c-1.015 3.311-4.044 5.594-7.507 5.655-3.463 .061-6.572-2.112-7.703-5.385L48.51 58.62c-.98-2.88-.241-6.066 1.906-8.222 2.147-2.155 5.33-2.907 8.214-1.938l176 65.28c3.313 1.109 5.522 4.24 5.458 7.733-.064 3.493-2.387 6.54-5.738 7.527Z"),
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
                pathData = parseSvgPathData("M237.33 106.21 61.41 41l-.16-.05C55.473 38.961 49.067 40.436 44.741 44.751c-4.326 4.315-5.816 10.717-3.841 16.499 .012 .055 .029 .108 .05 .16l65.26 175.92c2.198 6.433 8.272 10.733 15.07 10.67h.3c6.939-.053 13.029-4.636 15-11.29l.06-.2 21.84-78 78-21.84 .2-.06c6.598-2.03 11.15-8.064 11.291-14.966 .141-6.902-4.161-13.116-10.671-15.414ZM149.84 144.3c-2.686 .754-4.786 2.854-5.54 5.54l-23 82.16-.06-.17L56 56l175.82 65.22 .16 .06Z"),
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
        return _navigationArrow!!
    }

private var _navigationArrow: ImageVector? = null
