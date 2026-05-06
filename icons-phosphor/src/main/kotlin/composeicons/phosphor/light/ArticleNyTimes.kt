package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArticleNyTimes: ImageVector
    get() {
        if (_articleNyTimes != null) return _articleNyTimes!!
        _articleNyTimes = phosphorLightIcon(
            name = "ArticleNyTimes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 98h104c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-104c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6ZM232 130h-104c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h104c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM232 162h-152c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h152c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM232 194h-152c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h152c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM96 142c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-10v-68h36v10c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-16c0-3.314-2.686-6-6-6h-96c-3.314 0-6 2.686-6 6v16c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-10h36v68h-10c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6Z"),
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
        return _articleNyTimes!!
    }

private var _articleNyTimes: ImageVector? = null
