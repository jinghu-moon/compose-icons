package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Perspective: ImageVector
    get() {
        if (_perspective != null) return _perspective!!
        _perspective = phosphorRegularIcon(
            name = "Perspective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 120h-16v-72c-.001-4.744-2.106-9.242-5.748-12.282-3.642-3.039-8.445-4.306-13.112-3.458l-160 29.09C37.532 62.732 32.001 69.357 32 77.09v42.91h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v42.91c.001 7.733 5.532 14.358 13.14 15.74l160 29.09c.944 .17 1.901 .257 2.86 .26 8.837 0 16-7.163 16-16v-72h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM48 77.09 208 48v72h-160ZM208 208 48 178.91v-42.91h160Z"),
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
        return _perspective!!
    }

private var _perspective: ImageVector? = null
