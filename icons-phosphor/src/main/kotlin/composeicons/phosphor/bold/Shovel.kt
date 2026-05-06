package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Shovel: ImageVector
    get() {
        if (_shovel != null) return _shovel!!
        _shovel = phosphorBoldIcon(
            name = "Shovel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248.49 55.51l-48-48c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L199 40l-65.37 65.37L102.14 73.86c-7.81-7.808-20.47-7.808-28.28 0l-56 56C14.1 133.604 11.99 138.694 12 144v80c0 11.046 8.954 20 20 20h80c5.307 .014 10.399-2.096 14.14-5.86l56-56c7.808-7.81 7.808-20.47 0-28.28L150.63 122.34 216 57l15.51 15.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17ZM162.34 168l-52 52h-74.34v-74.34l52-52 28.69 28.68L79.51 159.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0l37.17-37.18Z"),
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
        return _shovel!!
    }

private var _shovel: ImageVector? = null
