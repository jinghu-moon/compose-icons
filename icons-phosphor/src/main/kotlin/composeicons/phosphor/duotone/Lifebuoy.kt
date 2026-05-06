package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) return _lifebuoy!!
        _lifebuoy = phosphorDuotoneIcon(
            name = "Lifebuoy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M195.88 195.88 156.28 156.28c15.615-15.62 15.615-40.94 0-56.56L195.88 60.12c37.487 37.49 37.487 98.27 0 135.76ZM60.12 60.12c-37.487 37.49-37.487 98.27 0 135.76L99.72 156.28c-15.615-15.62-15.615-40.94 0-56.56Z"),
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
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM167.1 155.79c11.866-16.627 11.866-38.953 0-55.58L195.6 71.72c27.201 32.59 27.201 79.97 0 112.56ZM96 128c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32C110.327 160 96 145.673 96 128ZM184.28 60.4 155.79 88.9c-16.627-11.866-38.953-11.866-55.58 0L71.72 60.4c32.59-27.201 79.97-27.201 112.56 0ZM60.4 71.72l28.5 28.49c-11.866 16.627-11.866 38.953 0 55.58L60.4 184.28C33.199 151.69 33.199 104.31 60.4 71.72ZM71.72 195.6l28.49-28.5c16.627 11.866 38.953 11.866 55.58 0l28.49 28.5c-32.59 27.201-79.97 27.201-112.56 0Z"),
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
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
