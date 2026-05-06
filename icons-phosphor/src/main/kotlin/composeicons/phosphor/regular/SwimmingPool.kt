package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SwimmingPool: ImageVector
    get() {
        if (_swimmingPool != null) return _swimmingPool!!
        _swimmingPool = phosphorRegularIcon(
            name = "SwimmingPool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 149.39c4.418 0 8-3.582 8-8v-13.39h64v15.29c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-111.29c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16h-64v-16c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v109.39c0 4.418 3.582 8 8 8ZM96 112v-16h64v16ZM160 64v16h-64v-16ZM24 168c0-4.418 3.582-8 8-8 14.42 0 22.19 5.18 28.44 9.34C66 173.06 70.42 176 80 176c9.58 0 14-2.94 19.56-6.66 6.24-4.16 14-9.34 28.43-9.34 14.43 0 22.2 5.18 28.44 9.34 5.58 3.72 10 6.66 19.57 6.66 9.57 0 14-2.94 19.56-6.66 6.25-4.16 14-9.34 28.44-9.34 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-9.58 0-14 2.94-19.56 6.66-6.25 4.16-14 9.34-28.44 9.34-14.44 0-22.2-5.18-28.44-9.34C142 178.94 137.57 176 128 176c-9.57 0-14 2.94-19.56 6.66-6.24 4.16-14 9.34-28.43 9.34-14.43 0-22.19-5.18-28.44-9.34C46 178.94 41.58 176 32 176c-4.418 0-8-3.582-8-8ZM232 208c0 4.418-3.582 8-8 8-9.58 0-14 2.94-19.56 6.66-6.25 4.16-14 9.34-28.44 9.34-14.44 0-22.2-5.18-28.44-9.34C142 218.94 137.57 216 128 216c-9.57 0-14 2.94-19.56 6.66-6.24 4.16-14 9.34-28.43 9.34-14.43 0-22.19-5.18-28.44-9.34C46 218.94 41.58 216 32 216c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 14.42 0 22.19 5.18 28.44 9.34C66 213.06 70.42 216 80 216c9.58 0 14-2.94 19.56-6.66 6.24-4.16 14-9.34 28.43-9.34 14.43 0 22.2 5.18 28.44 9.34 5.58 3.72 10 6.66 19.57 6.66 9.57 0 14-2.94 19.56-6.66 6.25-4.16 14-9.34 28.44-9.34 4.418 0 8 3.582 8 8Z"),
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
