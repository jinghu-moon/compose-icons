package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Meteor: ImageVector
    get() {
        if (_meteor != null) return _meteor!!
        _meteor = phosphorLightIcon(
            name = "Meteor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 122c-20.987 0-38 17.013-38 38 0 20.987 17.013 38 38 38 20.987 0 38-17.013 38-38 0-20.987-17.013-38-38-38ZM96 186C81.641 186 70 174.359 70 160c0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26 0 14.359-11.641 26-26 26ZM220.24 123.76c2.34 2.343 2.34 6.137 0 8.48l-48 48c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333l48-48c2.343-2.34 6.137-2.34 8.48 0ZM164.24 132.24c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333l24-24c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333ZM228.24 68.24l-16 16c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333l16-16c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333ZM123.76 91.76 195.76 19.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333l-72 72c-1.496 1.605-3.748 2.266-5.874 1.723-2.126-.543-3.786-2.203-4.329-4.329-.543-2.126 .118-4.379 1.723-5.874ZM145.5 201c1.127 1.125 1.76 2.653 1.76 4.245 0 1.592-.633 3.12-1.76 4.245-27.338 27.338-71.662 27.338-99 0-27.338-27.338-27.338-71.662 0-99L129.25 27.75c1.496-1.605 3.748-2.266 5.874-1.723 2.126 .543 3.786 2.203 4.329 4.329 .543 2.126-.118 4.379-1.723 5.874L55 119C39.751 133.523 33.571 155.171 38.856 175.556c5.285 20.385 21.204 36.303 41.588 41.588 20.385 5.285 42.032-.895 56.556-16.144 1.126-1.13 2.655-1.765 4.25-1.765 1.595 0 3.124 .635 4.25 1.765Z"),
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
        return _meteor!!
    }

private var _meteor: ImageVector? = null
