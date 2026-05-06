package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Share: ImageVector
    get() {
        if (_share != null) return _share!!
        _share = phosphorBoldIcon(
            name = "Share",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.49 112.49l-48 48c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L195 116h-30c-38.314-.012-71.781 25.903-81.36 63-1.657 6.418-8.202 10.277-14.62 8.62C62.602 185.963 58.743 179.418 60.4 173 72.696 125.293 115.734 91.965 165 92h30L167.51 64.48c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0l48 48c2.26 2.255 3.528 5.317 3.524 8.509-.004 3.192-1.279 6.251-3.544 8.501ZM192 204h-148v-116C44 81.373 38.627 76 32 76 25.373 76 20 81.373 20 88v128c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _share!!
    }

private var _share: ImageVector? = null
