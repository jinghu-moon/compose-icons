package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Subtract: ImageVector
    get() {
        if (_subtract != null) return _subtract!!
        _subtract = phosphorBoldIcon(
            name = "Subtract",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M178 78C169.084 37.21 131.562 9.161 89.917 12.154 48.272 15.146 15.146 48.272 12.154 89.917 9.161 131.562 37.21 169.084 78 178c8.916 40.79 46.438 68.839 88.083 65.846 41.645-2.992 74.771-36.118 77.764-77.764C246.839 124.438 218.79 86.916 178 78ZM220 160c-.005 2.222-.132 4.442-.38 6.65l-44-44c2.096-6.282 3.439-12.791 4-19.39 24.215 8.324 40.448 31.134 40.38 56.74ZM36 96C36 62.863 62.863 36 96 36c33.137 0 60 26.863 60 60 0 33.137-26.863 60-60 60C62.879 155.961 36.039 129.121 36 96ZM103.28 179.66c6.599-.561 13.108-1.904 19.39-4l44 44c-2.215 .236-4.442 .349-6.67 .34-25.588 .066-48.385-16.148-56.72-40.34ZM191.81 210.84 145.08 164.11c7.301-5.286 13.714-11.699 19-19l46.73 46.73c-4.828 7.679-11.321 14.172-19 19Z"),
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
        return _subtract!!
    }

private var _subtract: ImageVector? = null
