package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SmileyXEyes: ImageVector
    get() {
        if (_smileyXEyes != null) return _smileyXEyes!!
        _smileyXEyes = phosphorLightIcon(
            name = "SmileyXEyes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM188.24 100.24 176.49 112l11.75 11.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L168 120.49l-11.76 11.75c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L159.51 112 147.76 100.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L168 103.51 179.76 91.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333ZM108.24 100.24 96.49 112l11.75 11.76c1.605 1.496 2.266 3.748 1.723 5.874-.543 2.126-2.203 3.786-4.329 4.329-2.126 .543-4.379-.118-5.874-1.723L88 120.49 76.24 132.24c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L79.51 112 67.76 100.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147L88 103.51 99.76 91.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333ZM138 180c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _smileyXEyes!!
    }

private var _smileyXEyes: ImageVector? = null
