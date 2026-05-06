package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowBendDoubleUpLeft: ImageVector
    get() {
        if (_arrowBendDoubleUpLeft != null) return _arrowBendDoubleUpLeft!!
        _arrowBendDoubleUpLeft = phosphorLightIcon(
            name = "ArrowBendDoubleUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M84.24 147.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L27.76 108.24c-2.34-2.343-2.34-6.137 0-8.48L75.76 51.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333L40.49 104ZM128 98h-33.51L132.24 60.24c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147l-48 48c-2.34 2.343-2.34 6.137 0 8.48l48 48c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333L94.49 110h33.51c49.683 .055 89.945 40.317 90 90 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C229.934 143.694 184.306 98.066 128 98Z"),
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
        return _arrowBendDoubleUpLeft!!
    }

private var _arrowBendDoubleUpLeft: ImageVector? = null
