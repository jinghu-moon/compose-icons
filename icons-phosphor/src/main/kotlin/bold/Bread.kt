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
                pathData = parseSvgPathData("M 244.000 80.000 C 243.972 55.711 224.289 36.028 200.000 36.000 L 48.000 36.000 C 27.678 36.020 10.014 49.954 5.262 69.713 C 0.511 89.471 9.909 109.913 28.000 119.170 L 28.000 200.000 C 28.000 211.046 36.954 220.000 48.000 220.000 L 200.000 220.000 C 211.046 220.000 220.000 211.046 220.000 200.000 L 220.000 119.170 C 234.722 111.657 243.992 96.528 244.000 80.000 ZM 52.000 123.300 C 57.489 121.338 60.775 115.715 59.789 109.970 C 58.802 104.224 53.829 100.019 48.000 100.000 C 36.954 100.000 28.000 91.046 28.000 80.000 C 28.000 68.954 36.954 60.000 48.000 60.000 L 140.000 60.000 C 151.046 60.000 160.000 68.954 160.000 80.000 C 160.000 91.046 151.046 100.000 140.000 100.000 C 134.171 100.019 129.198 104.224 128.211 109.970 C 127.225 115.715 130.511 121.338 136.000 123.300 L 136.000 196.000 L 52.000 196.000 ZM 200.000 100.000 C 194.171 100.019 189.198 104.224 188.211 109.970 C 187.225 115.715 190.511 121.338 196.000 123.300 L 196.000 196.000 L 160.000 196.000 L 160.000 119.170 C 170.400 113.878 178.267 104.664 181.863 93.563 C 185.460 82.462 184.491 70.386 179.170 60.000 L 200.000 60.000 C 211.046 60.000 220.000 68.954 220.000 80.000 C 220.000 91.046 211.046 100.000 200.000 100.000 Z"),
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
