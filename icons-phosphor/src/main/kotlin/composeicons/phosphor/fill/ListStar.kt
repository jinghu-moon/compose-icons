package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ListStar: ImageVector
    get() {
        if (_listStar != null) return _listStar!!
        _listStar = phosphorFillIcon(
            name = "ListStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM64 72h128c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-128c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM64 120h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM104 184h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h40c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM198.55 143.29 180.69 158l5.44 22c.388 1.563-.199 3.207-1.49 4.17-.693 .511-1.53 .787-2.39 .79-.703-.004-1.393-.194-2-.55L160 172.54l-20.22 11.91c-1.388 .816-3.129 .72-4.42-.242-1.29-.963-1.878-2.605-1.49-4.168l5.44-22L121.45 143.29c-1.256-1.039-1.756-2.736-1.263-4.29 .492-1.554 1.878-2.654 3.503-2.78l23.58-1.82 9.06-21c.634-1.463 2.076-2.409 3.67-2.409 1.594 0 3.036 .946 3.67 2.409l9.06 21 23.58 1.82c1.625 .126 3.011 1.226 3.503 2.78 .492 1.554-.008 3.251-1.263 4.29Z"),
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
        return _listStar!!
    }

private var _listStar: ImageVector? = null
