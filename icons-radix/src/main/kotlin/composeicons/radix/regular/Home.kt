package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Home: ImageVector
    get() {
        if (_home != null) return _home!!
        _home = radixIcon(
            name = "Home",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.173 .147c.231-.151 .544-.125 .748 .075l6.75 6.64 .077 .094c.156 .232 .133 .548-.07 .755-.203 .207-.52 .235-.754 .083l-.095-.076-.829-.816v5.6c-0 .276-.224 .5-.5 .5h-10c-.276-0-.5-.224-.5-.5v-5.6l-.829 .816C.935 7.95 .554 7.947 .322 7.71 .09 7.474 .093 7.094 .329 6.862L7.079 .222 7.173 .147ZM3 5.917v6.083h3v-3.5l.01-.101c.046-.228 .249-.399 .49-.399h3l.101 .01c.228 .047 .399 .249 .399 .49v3.5h2v-6.083L7.5 1.491 3 5.917ZM7 12h2v-3h-2v3Z"),
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
        return _home!!
    }

private var _home: ImageVector? = null
