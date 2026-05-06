package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowFatLineDown: ImageVector
    get() {
        if (_arrowFatLineDown != null) return _arrowFatLineDown!!
        _arrowFatLineDown = phosphorBoldIcon(
            name = "ArrowFatLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.09 131.41C233.233 126.924 228.855 123.999 224 124h-36v-44c0-6.627-5.373-12-12-12h-96C73.373 68 68 73.373 68 80v44h-36c-4.855 0-9.231 2.925-11.087 7.411-1.856 4.486-.827 9.648 2.607 13.079l96 96c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l96-96c3.422-3.439 4.436-8.601 2.57-13.08ZM128 215 61 148h19c6.627 0 12-5.373 12-12v-44h72v44c0 6.627 5.373 12 12 12h19ZM68 40C68 33.373 73.373 28 80 28h96c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-96C73.373 52 68 46.627 68 40Z"),
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
        return _arrowFatLineDown!!
    }

private var _arrowFatLineDown: ImageVector? = null
