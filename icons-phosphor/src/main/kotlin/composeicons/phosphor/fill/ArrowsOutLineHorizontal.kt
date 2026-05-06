package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsOutLineHorizontal: ImageVector
    get() {
        if (_arrowsOutLineHorizontal != null) return _arrowsOutLineHorizontal!!
        _arrowsOutLineHorizontal = phosphorFillIcon(
            name = "ArrowsOutLineHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M104 128c0 4.418-3.582 8-8 8h-40v24c.003 3.238-1.947 6.158-4.938 7.397-2.991 1.239-6.434 .554-8.722-1.737l-32-32C8.838 132.159 7.994 130.123 7.994 128c0-2.123 .844-4.159 2.346-5.66l32-32c2.288-2.291 5.731-2.976 8.722-1.737C54.053 89.842 56.003 92.762 56 96v24h40c4.418 0 8 3.582 8 8ZM245.66 122.34l-32-32c-2.288-2.291-5.731-2.976-8.722-1.737C201.947 89.842 199.997 92.762 200 96v24h-40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h40v24c-.003 3.238 1.947 6.158 4.938 7.397 2.991 1.239 6.434 .554 8.722-1.737l32-32c1.502-1.501 2.346-3.537 2.346-5.66 0-2.123-.844-4.159-2.346-5.66ZM128 32c-4.418 0-8 3.582-8 8v176c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-176c0-4.418-3.582-8-8-8Z"),
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
        return _arrowsOutLineHorizontal!!
    }

private var _arrowsOutLineHorizontal: ImageVector? = null
