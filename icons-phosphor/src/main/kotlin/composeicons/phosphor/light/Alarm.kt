package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Alarm: ImageVector
    get() {
        if (_alarm != null) return _alarm!!
        _alarm = phosphorLightIcon(
            name = "Alarm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 42C76.085 42 34 84.085 34 136c0 51.915 42.085 94 94 94 51.915 0 94-42.085 94-94C221.939 84.11 179.89 42.061 128 42ZM128 218C82.713 218 46 181.287 46 136 46 90.713 82.713 54 128 54c45.287 0 82 36.713 82 82-.055 45.265-36.735 81.945-82 82ZM60.24 36.24 28.24 68.24c-1.496 1.605-3.748 2.266-5.874 1.723-2.126-.543-3.786-2.203-4.329-4.329-.543-2.126 .118-4.379 1.723-5.874L51.76 27.76c1.496-1.605 3.748-2.266 5.874-1.723 2.126 .543 3.786 2.203 4.329 4.329 .543 2.126-.118 4.379-1.723 5.874ZM236.24 68.24c-2.343 2.34-6.137 2.34-8.48 0l-32-32c-2.203-2.364-2.138-6.048 .147-8.333 2.285-2.285 5.969-2.35 8.333-.147l32 32c2.34 2.343 2.34 6.137 0 8.48ZM184 130c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-56c-3.314 0-6-2.686-6-6v-56c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v50Z"),
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
        return _alarm!!
    }

private var _alarm: ImageVector? = null
