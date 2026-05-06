package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowsIn: ImageVector
    get() {
        if (_arrowsIn != null) return _arrowsIn!!
        _arrowsIn = phosphorLightIcon(
            name = "ArrowsIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M146 104v-40c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v25.51L203.76 43.76c2.364-2.203 6.048-2.138 8.333 .147 2.285 2.285 2.35 5.969 .147 8.333L166.48 98h25.52c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-40c-3.314 0-6-2.686-6-6ZM104 146h-40c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h25.52L43.76 203.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723L98 166.48v25.52c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-40c0-3.314-2.686-6-6-6ZM166.48 158h25.52c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-40c-3.314 0-6 2.686-6 6v40c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-25.52l45.76 45.76c2.364 2.203 6.048 2.138 8.333-.147 2.285-2.285 2.35-5.969 .147-8.333ZM104 58c-3.314 0-6 2.686-6 6v25.51L52.24 43.76c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L89.52 98h-25.52c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h40c3.314 0 6-2.686 6-6v-40c0-3.314-2.686-6-6-6Z"),
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
        return _arrowsIn!!
    }

private var _arrowsIn: ImageVector? = null
