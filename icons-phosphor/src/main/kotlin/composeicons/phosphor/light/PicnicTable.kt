package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PicnicTable: ImageVector
    get() {
        if (_picnicTable != null) return _picnicTable!!
        _picnicTable = phosphorLightIcon(
            name = "PicnicTable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 130h-48.29l-30-60h22.29c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-128c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h22.29l-30 60h-48.29c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h42.29L26.63 189.32c-1.48 2.966-.276 6.57 2.69 8.05 2.966 1.48 6.57 .276 8.05-2.69L63.71 142h128.58l26.34 52.68c1.48 2.966 5.084 4.17 8.05 2.69 2.966-1.48 4.17-5.084 2.69-8.05L205.71 142h42.29c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM69.71 130l30-60h56.58l30 60Z"),
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
        return _picnicTable!!
    }

private var _picnicTable: ImageVector? = null
