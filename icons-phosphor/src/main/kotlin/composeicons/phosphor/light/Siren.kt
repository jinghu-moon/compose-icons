package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Siren: ImageVector
    get() {
        if (_siren != null) return _siren!!
        _siren = phosphorLightIcon(
            name = "Siren",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M122 16v-8c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v8c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6ZM200 46c1.591-.001 3.116-.634 4.24-1.76l8-8c1.605-1.496 2.266-3.748 1.723-5.874-.543-2.126-2.203-3.786-4.329-4.329-2.126-.543-4.379 .118-5.874 1.723l-8 8c-1.714 1.716-2.226 4.295-1.298 6.535 .928 2.241 3.113 3.702 5.538 3.705ZM51.76 44.24c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333l-8-8c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333ZM137 74.08c-3.27-.552-6.368 1.65-6.92 4.92-.552 3.27 1.65 6.368 4.92 6.92 20 3.34 35 21.44 35 42.08 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C182 101.57 162.65 78.39 137 74.08ZM230 176v24c0 7.732-6.268 14-14 14h-176c-7.732 0-14-6.268-14-14v-24c0-7.732 6.268-14 14-14h2v-34C42 80.504 80.504 42 128 42h.65C175.71 42.35 214 81.38 214 129v33h2c7.732 0 14 6.268 14 14ZM54 162h148v-33C202 88 169.06 54.3 128.56 54h-.56C87.131 54 54 87.131 54 128ZM218 176c0-1.105-.895-2-2-2h-176c-1.105 0-2 .895-2 2v24c0 1.105 .895 2 2 2h176c1.105 0 2-.895 2-2Z"),
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
        return _siren!!
    }

private var _siren: ImageVector? = null
