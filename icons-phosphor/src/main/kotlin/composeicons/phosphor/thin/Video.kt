package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = phosphorThinIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M162.22 108.67l-48-32c-1.228-.819-2.807-.896-4.108-.199-1.301 .697-2.113 2.053-2.112 3.529v64c-.002 1.476 .809 2.833 2.11 3.53 1.302 .697 2.882 .62 4.11-.2l48-32c1.114-.742 1.784-1.991 1.784-3.33 0-1.339-.67-2.588-1.784-3.33ZM116 136.53v-49.06L152.79 112ZM216 44h-176C33.373 44 28 49.373 28 56v112c0 6.627 5.373 12 12 12h176c6.627 0 12-5.373 12-12v-112c0-6.627-5.373-12-12-12ZM220 168c0 2.209-1.791 4-4 4h-176c-2.209 0-4-1.791-4-4v-112c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4ZM228 208c0 2.209-1.791 4-4 4h-192c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h192c2.209 0 4 1.791 4 4Z"),
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
        return _video!!
    }

private var _video: ImageVector? = null
