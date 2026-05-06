package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bread: ImageVector
    get() {
        if (_bread != null) return _bread!!
        _bread = phosphorBoldIcon(
            name = "Bread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 80C243.972 55.711 224.289 36.028 200 36h-152C27.678 36.02 10.014 49.954 5.262 69.713 .511 89.471 9.909 109.913 28 119.17v80.83c0 11.046 8.954 20 20 20h152c11.046 0 20-8.954 20-20v-80.83C234.722 111.657 243.992 96.528 244 80ZM52 123.3c5.489-1.962 8.775-7.585 7.789-13.33C58.802 104.224 53.829 100.019 48 100 36.954 100 28 91.046 28 80 28 68.954 36.954 60 48 60h92c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20-5.829 .019-10.802 4.224-11.789 9.97-.986 5.745 2.299 11.369 7.789 13.33v72.7h-84ZM200 100c-5.829 .019-10.802 4.224-11.789 9.97-.986 5.745 2.299 11.369 7.789 13.33v72.7h-36v-76.83c10.4-5.292 18.267-14.506 21.863-25.607C185.46 82.462 184.491 70.386 179.17 60h20.83c11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20Z"),
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
        return _bread!!
    }

private var _bread: ImageVector? = null
