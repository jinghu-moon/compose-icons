package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SwimmingPool: ImageVector
    get() {
        if (_swimmingPool != null) return _swimmingPool!!
        _swimmingPool = phosphorLightIcon(
            name = "SwimmingPool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 147.39c3.314 0 6-2.686 6-6v-15.39h68v17.29c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-111.29c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v18h-68v-18c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v109.39c0 3.314 2.686 6 6 6ZM94 114v-20h68v20ZM162 62v20h-68v-20ZM26 168c0-3.314 2.686-6 6-6 13.82 0 21 4.79 27.33 9 5.63 3.75 10.48 7 20.67 7 10.19 0 15-3.24 20.67-7 6.33-4.22 13.51-9 27.32-9 13.81 0 21 4.79 27.33 9 5.63 3.75 10.49 7 20.68 7 10.19 0 15-3.24 20.67-7 6.33-4.22 13.51-9 27.33-9 3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6-10.18 0-15 3.24-20.67 7-6.34 4.22-13.52 9-27.33 9-13.81 0-21-4.79-27.33-9-5.63-3.75-10.49-7-20.68-7-10.19 0-15 3.24-20.67 7-6.33 4.22-13.51 9-27.32 9-13.81 0-21-4.79-27.33-9C47 177.24 42.18 174 32 174c-3.314 0-6-2.686-6-6ZM230 208c0 3.314-2.686 6-6 6-10.18 0-15 3.24-20.67 7-6.34 4.22-13.52 9-27.33 9-13.81 0-21-4.79-27.33-9-5.63-3.75-10.49-7-20.68-7-10.19 0-15 3.24-20.67 7-6.33 4.22-13.51 9-27.32 9-13.81 0-21-4.79-27.33-9C47 217.24 42.18 214 32 214c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6 13.82 0 21 4.79 27.33 9 5.63 3.75 10.48 7 20.67 7 10.19 0 15-3.24 20.67-7 6.33-4.22 13.51-9 27.32-9 13.81 0 21 4.79 27.33 9 5.63 3.75 10.49 7 20.68 7 10.19 0 15-3.24 20.67-7 6.33-4.22 13.51-9 27.33-9 3.314 0 6 2.686 6 6Z"),
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
        return _swimmingPool!!
    }

private var _swimmingPool: ImageVector? = null
