package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SwimmingPool: ImageVector
    get() {
        if (_swimmingPool != null) return _swimmingPool!!
        _swimmingPool = phosphorFillIcon(
            name = "SwimmingPool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M24 168c0-4.418 3.582-8 8-8 14.42 0 22.19 5.18 28.44 9.34C66 173.06 70.42 176 80 176c9.58 0 14-2.94 19.56-6.66 6.24-4.16 14-9.34 28.43-9.34 14.43 0 22.2 5.18 28.44 9.34 5.58 3.72 10 6.66 19.57 6.66 9.57 0 14-2.94 19.56-6.66 6.25-4.16 14-9.34 28.44-9.34 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-9.58 0-14 2.94-19.56 6.66-6.25 4.16-14 9.34-28.44 9.34-14.44 0-22.2-5.18-28.44-9.34C142 178.94 137.57 176 128 176c-9.57 0-14 2.94-19.56 6.66-6.24 4.16-14 9.34-28.43 9.34-14.43 0-22.19-5.18-28.44-9.34C46 178.94 41.58 176 32 176c-4.418 0-8-3.582-8-8ZM224 200c-14.42 0-22.19 5.18-28.44 9.34C190 213.06 185.58 216 176 216c-9.58 0-14-2.94-19.57-6.66-6.24-4.16-14-9.34-28.44-9.34-14.44 0-22.19 5.18-28.43 9.34C94 213.06 89.57 216 80 216c-9.57 0-14-2.94-19.56-6.66C54.19 205.18 46.42 200 32 200c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 9.58 0 14 2.94 19.56 6.66C57.81 226.82 65.56 232 80 232c14.44 0 22.19-5.18 28.43-9.34 5.58-3.72 10-6.66 19.56-6.66 9.56 0 14 2.94 19.57 6.66 6.24 4.16 14 9.34 28.44 9.34 14.44 0 22.19-5.18 28.44-9.34 5.57-3.72 10-6.66 19.56-6.66 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM80 141.39v-109.39c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v8h64v-8c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v111.29c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-7.29h-64v5.39c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM96 72c0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-48c-4.418 0-8 3.582-8 8ZM96 104c0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-48c-4.418 0-8 3.582-8 8Z"),
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
