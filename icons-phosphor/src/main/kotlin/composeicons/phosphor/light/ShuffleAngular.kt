package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShuffleAngular: ImageVector
    get() {
        if (_shuffleAngular != null) return _shuffleAngular!!
        _shuffleAngular = phosphorLightIcon(
            name = "ShuffleAngular",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236.24 179.76c2.34 2.343 2.34 6.137 0 8.48l-24 24c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L217.52 190h-49.52c-1.936-0-3.754-.935-4.88-2.51L84.91 78h-52.91c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h56c1.936 0 3.754 .935 4.88 2.51L171.09 178h46.43L203.76 164.24c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147ZM144.17 105.36c1.296 .924 2.905 1.296 4.475 1.034 1.57-.263 2.971-1.138 3.895-2.434l18.55-26h46.43L203.76 91.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723l24-24c2.34-2.343 2.34-6.137 0-8.48l-24-24c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L217.52 66h-49.52c-1.936 0-3.754 .935-4.88 2.51L142.78 97c-1.92 2.693-1.299 6.433 1.39 8.36ZM111.83 150.64c-1.296-.924-2.905-1.296-4.475-1.034-1.57 .263-2.971 1.138-3.895 2.434L84.91 178h-52.91c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h56c1.936-0 3.754-.935 4.88-2.51L113.22 159c1.92-2.693 1.299-6.433-1.39-8.36Z"),
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
        return _shuffleAngular!!
    }

private var _shuffleAngular: ImageVector? = null
