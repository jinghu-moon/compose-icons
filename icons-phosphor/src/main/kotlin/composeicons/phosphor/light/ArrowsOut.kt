package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsOut: ImageVector
    get() {
        if (_arrowsOut != null) return _arrowsOut!!
        _arrowsOut = phosphorLightIcon(
            name = "ArrowsOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214 48v48c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-33.52l-45.76 45.76c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L193.52 54h-33.52c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h48c3.314 0 6 2.686 6 6ZM99.76 147.76 54 193.52v-33.52c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v48c0 3.314 2.686 6 6 6h48c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-33.52l45.76-45.76c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147ZM208 154c-3.314 0-6 2.686-6 6v33.52L156.24 147.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L193.52 202h-33.52c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h48c3.314 0 6-2.686 6-6v-48c0-3.314-2.686-6-6-6ZM62.48 54h33.52c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-48c-3.314 0-6 2.686-6 6v48c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-33.52l45.76 45.76c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333Z"),
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
        return _arrowsOut!!
    }

private var _arrowsOut: ImageVector? = null
