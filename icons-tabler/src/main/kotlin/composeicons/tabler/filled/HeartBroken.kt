package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HeartBroken: ImageVector
    get() {
        if (_heartBroken != null) return _heartBroken!!
        _heartBroken = tablerFilledIcon(
            name = "HeartBroken",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.001 3.8 11 5.763 9.106 9.553l-.047 .11c-.148 .413-.01 .874 .341 1.137l3.332 2.499-1.626 3.254c-.07 .139-.106 .292-.106 .447v3.417L3.803 13.29C1.67 11.214 1.383 7.888 3.126 5.476 4.87 3.064 8.119 2.295 10.759 3.669ZM16.771 3.061l.246 .037c2.218 .383 4.035 1.975 4.707 4.124 .671 2.149 .083 4.492-1.523 6.069l-.044 .037L13 20.416v-3.181l1.894-3.788 .047-.11c.148-.413 .01-.874-.341-1.137L11.267 9.7 12.894 6.447C12.964 6.308 13 6.155 13 6v-2.187c1.14-.657 2.465-.922 3.77-.752"),
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
        return _heartBroken!!
    }

private var _heartBroken: ImageVector? = null
