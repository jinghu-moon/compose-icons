package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = phosphorBoldIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 36h-176C28.954 36 20 44.954 20 56v104c0 11.046 8.954 20 20 20h176c11.046 0 20-8.954 20-20v-104C236 44.954 227.046 36 216 36ZM212 156h-168v-96h168ZM236 208c0 6.627-5.373 12-12 12h-192c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h192c6.627 0 12 5.373 12 12ZM104 128v-40c-.001-4.363 2.365-8.383 6.181-10.499 3.816-2.116 8.479-1.994 12.179 .319l32 20c3.512 2.192 5.646 6.04 5.646 10.18 0 4.14-2.134 7.988-5.646 10.18l-32 20c-3.7 2.312-8.363 2.434-12.179 .319C106.365 136.383 103.999 132.363 104 128Z"),
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
