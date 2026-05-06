package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Headlights: ImageVector
    get() {
        if (_headlights != null) return _headlights!!
        _headlights = phosphorDuotoneIcon(
            name = "Headlights",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M136 64v128c0 4.418-3.582 8-8 8h-40c-19.191 .001-37.589-7.661-51.107-21.282C23.374 165.096 15.853 146.641 16 127.45 16.3 87.75 49.2 56 88.9 56h39.1c4.418 0 8 3.582 8 8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M160 80c0-4.418 3.582-8 8-8h72c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-72c-4.418 0-8-3.582-8-8ZM240 168h-72c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h72c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM240 104h-72c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h72c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM240 136h-72c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h72c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM144 64v128c0 8.837-7.163 16-16 16h-40c-21.323 .001-41.765-8.512-56.785-23.647C16.194 169.218 7.837 148.713 8 127.39 8.33 83.62 44.62 48 88.9 48h39.1c8.837 0 16 7.163 16 16ZM128 64h-39.1C53.38 64 24.26 92.49 24 127.51c-.131 17.059 6.555 33.463 18.571 45.572C54.588 185.19 70.941 192.001 88 192h40Z"),
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
        return _headlights!!
    }

private var _headlights: ImageVector? = null
