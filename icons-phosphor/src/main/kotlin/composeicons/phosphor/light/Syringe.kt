package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Syringe: ImageVector
    get() {
        if (_syringe != null) return _syringe!!
        _syringe = phosphorLightIcon(
            name = "Syringe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.24 67.76l-48-48c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L199.51 48 168 79.51 132.24 43.76c-1.496-1.605-3.748-2.266-5.874-1.723-2.126 .543-3.786 2.203-4.329 4.329-.543 2.126 .118 4.379 1.723 5.874L131.51 60 46.1 145.41c-2.631 2.622-4.107 6.186-4.1 9.9v50.2L19.76 227.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723L50.49 214h50.2c3.714 .007 7.278-1.469 9.9-4.1L196 124.49l7.76 7.75c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333L176.49 88 208 56.49l19.76 19.75c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333ZM102.1 201.41c-.373 .376-.88 .588-1.41 .59h-46.69v-46.69c.002-.53 .214-1.037 .59-1.41L74 134.49l21.76 21.75c1.496 1.605 3.748 2.266 5.874 1.723 2.126-.543 3.786-2.203 4.329-4.329 .543-2.126-.118-4.379-1.723-5.874L82.49 126 98 110.49l21.76 21.75c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333L106.49 102 140 68.49 187.51 116Z"),
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
        return _syringe!!
    }

private var _syringe: ImageVector? = null
