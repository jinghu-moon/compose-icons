package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BookmarksSimple: ImageVector
    get() {
        if (_bookmarksSimple != null) return _bookmarksSimple!!
        _bookmarksSimple = phosphorLightIcon(
            name = "BookmarksSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M160 58h-96C56.268 58 50 64.268 50 72v152c0 2.248 1.257 4.307 3.256 5.335 1.999 1.028 4.405 .852 6.234-.455L112 191.37l52.52 37.51c1.828 1.302 4.23 1.474 6.226 .447 1.996-1.027 3.251-3.082 3.254-5.327v-152c0-7.732-6.268-14-14-14ZM162 212.34 115.48 179.12c-2.092-1.502-4.908-1.502-7 0L62 212.34v-140.34c0-1.105 .895-2 2-2h96c1.105 0 2 .895 2 2ZM206 40v152c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-152c0-1.105-.895-2-2-2h-104c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h104c7.732 0 14 6.268 14 14Z"),
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
        return _bookmarksSimple!!
    }

private var _bookmarksSimple: ImageVector? = null
