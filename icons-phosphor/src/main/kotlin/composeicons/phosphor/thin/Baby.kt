package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Baby: ImageVector
    get() {
        if (_baby != null) return _baby!!
        _baby = phosphorThinIcon(
            name = "Baby",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 136c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM164 120c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM153.87 164.62c-15.841 9.848-35.899 9.848-51.74 0-1.858-1.047-4.211-.452-5.348 1.352-1.137 1.804-.659 4.183 1.088 5.408 18.445 11.486 41.815 11.486 60.26 0 1.286-.725 2.068-2.098 2.035-3.574-.033-1.476-.876-2.813-2.193-3.48-1.317-.666-2.894-.553-4.103 .294ZM228 128c0 55.228-44.772 100-100 100C72.772 228 28 183.228 28 128 28 72.772 72.772 28 128 28c55.203 .061 99.939 44.797 100 100ZM220 128C219.953 77.962 179.966 37.114 129.94 36 116.26 54.07 116 71.83 116 72c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4 0 11.046-8.954 20-20 20C116.954 92 108 83.046 108 72c0-.78 .16-17.31 12-35.64C70.416 40.688 33.266 83.664 36.155 133.352c2.889 49.688 44.771 88.069 94.522 86.62C180.428 218.524 220.006 177.772 220 128Z"),
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
        return _baby!!
    }

private var _baby: ImageVector? = null
