package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Syringe: ImageVector
    get() {
        if (_syringe != null) return _syringe!!
        _syringe = phosphorBoldIcon(
            name = "Syringe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240.49 63.51l-48-48c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L191 48 168 71 136.49 39.51c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L123 60 41.86 141.17c-3.764 3.741-5.874 8.833-5.86 14.14v47.69L15.51 223.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L53 220h47.72c5.307 .014 10.399-2.096 14.14-5.86L196 133l3.51 3.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L185 88 208 65l15.51 15.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17ZM99 196h-39v-39L74 143l17.51 17.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L91 126l11-11 17.51 17.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L119 98 140 77l39 39Z"),
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
        return _syringe!!
    }

private var _syringe: ImageVector? = null
