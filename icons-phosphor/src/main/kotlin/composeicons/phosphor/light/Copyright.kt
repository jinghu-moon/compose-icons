package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Copyright: ImageVector
    get() {
        if (_copyright != null) return _copyright!!
        _copyright = phosphorLightIcon(
            name = "Copyright",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM94 128c0 14.635 9.365 27.627 23.248 32.255 13.884 4.628 29.171-.148 37.952-11.855 1.991-2.651 5.754-3.186 8.405-1.195 2.651 1.991 3.186 5.754 1.195 8.405-11.883 15.835-32.564 22.291-51.345 16.027C94.674 165.374 82.007 147.798 82.007 128c0-19.798 12.667-37.374 31.448-43.637 18.781-6.263 39.462 .193 51.345 16.027 1.991 2.651 1.456 6.414-1.195 8.405-2.651 1.991-6.414 1.456-8.405-1.195C146.419 95.892 131.132 91.117 117.248 95.745 103.365 100.373 94 113.365 94 128Z"),
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
        return _copyright!!
    }

private var _copyright: ImageVector? = null
