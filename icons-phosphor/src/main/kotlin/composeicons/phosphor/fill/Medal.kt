package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Medal: ImageVector
    get() {
        if (_medal != null) return _medal!!
        _medal = phosphorFillIcon(
            name = "Medal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 96C216.024 55.119 187.891 19.604 148.09 10.272 108.288 .939 67.3 20.246 49.149 56.877 30.998 93.508 40.465 137.815 72 163.83v76.17c-.002 2.774 1.433 5.351 3.793 6.81 2.359 1.459 5.306 1.591 7.787 .35L128 225l44.43 22.21c1.114 .533 2.335 .803 3.57 .79 4.418 0 8-3.582 8-8v-76.17C204.267 147.138 216.006 122.256 216 96ZM56 96C56 56.235 88.235 24 128 24c39.764 0 72 32.235 72 72 0 39.764-32.236 72-72 72C88.254 167.956 56.044 135.746 56 96ZM72 96C72 65.072 97.072 40 128 40c30.928 0 56 25.072 56 56 0 30.928-25.072 56-56 56C97.086 151.967 72.033 126.914 72 96Z"),
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
        return _medal!!
    }

private var _medal: ImageVector? = null
