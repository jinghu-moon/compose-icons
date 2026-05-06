package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Shovel: ImageVector
    get() {
        if (_shovel != null) return _shovel!!
        _shovel = phosphorLightIcon(
            name = "Shovel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244.24 59.76l-48-48c-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333L207.52 40l-73.86 73.86L97.9 78.1C95.274 75.474 91.713 73.999 88 73.999c-3.713 0-7.274 1.475-9.9 4.101L22.1 134.1C19.469 136.722 17.993 140.286 18 144v80c0 7.732 6.268 14 14 14h80c3.714 .007 7.278-1.469 9.9-4.1l56-56c2.626-2.626 4.101-6.187 4.101-9.9 0-3.713-1.475-7.274-4.101-9.9L142.14 122.34 216 48.48l19.76 19.76c1.496 1.605 3.748 2.266 5.874 1.723 2.126-.543 3.786-2.203 4.329-4.329 .543-2.126-.118-4.379-1.723-5.874ZM169.41 166.58c.379 .376 .592 .887 .592 1.42 0 .533-.213 1.044-.592 1.42l-56 56c-.375 .372-.882 .58-1.41 .58h-80c-1.105 0-2-.895-2-2v-80c-.003-.532 .206-1.043 .58-1.42l56-56c.377-.374 .888-.583 1.42-.58 .53 .004 1.038 .212 1.42 .58l35.75 35.76L83.76 163.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723l41.42-41.41Z"),
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
        return _shovel!!
    }

private var _shovel: ImageVector? = null
