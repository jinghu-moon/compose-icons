package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = phosphorRegularIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164.44 105.34l-48-32c-2.455-1.638-5.614-1.791-8.216-.398C105.622 74.335 103.998 77.048 104 80v64c-.002 2.952 1.622 5.665 4.224 7.058 2.602 1.393 5.76 1.24 8.216-.398l48-32c2.229-1.483 3.568-3.983 3.568-6.66 0-2.677-1.339-5.177-3.568-6.66ZM120 129.05v-34.05l25.58 17ZM216 40h-176C31.163 40 24 47.163 24 56v112c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-112c0-8.837-7.163-16-16-16ZM216 168h-176v-112h176v112ZM232 208c0 4.418-3.582 8-8 8h-192c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h192c4.418 0 8 3.582 8 8Z"),
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
