package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ToiletPaper: ImageVector
    get() {
        if (_toiletPaper != null) return _toiletPaper!!
        _toiletPaper = phosphorLightIcon(
            name = "ToiletPaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M74 120c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM238 120v88c0 7.732-6.268 14-14 14h-112c-7.732 0-14-6.268-14-14v-29.52C89.65 195.49 77.6 206 64 206 38.21 206 18 168.22 18 120 18 71.78 38.21 34 64 34h128c25.79 0 46 37.78 46 86ZM98 120C98 75.74 80.42 46 64 46 47.58 46 30 75.74 30 120c0 44.26 17.58 74 34 74 16.42 0 34-29.73 34-74ZM226 208v-82h-18c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h17.88C224.37 73.08 207.67 46 192 46h-104.24c12.57 13.92 21.09 38.74 22.12 68h18.12c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-18v82c0 1.105 .895 2 2 2h112c1.105 0 2-.895 2-2ZM176 114h-16c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h16c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6Z"),
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
        return _toiletPaper!!
    }

private var _toiletPaper: ImageVector? = null
