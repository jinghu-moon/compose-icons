package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Keyhole: ImageVector
    get() {
        if (_keyhole != null) return _keyhole!!
        _keyhole = phosphorFillIcon(
            name = "Keyhole",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM157.52 170.39c.544 1.237 .427 2.664-.312 3.796-.738 1.131-1.997 1.814-3.348 1.814h-51.72c-1.351-.001-2.61-.683-3.348-1.814-.738-1.131-.855-2.559-.312-3.796L112 139.72C99.457 132.478 93.342 117.715 97.09 103.725 100.839 89.735 113.517 80.007 128 80.007c14.483 0 27.161 9.728 30.91 23.718 3.749 13.99-2.367 28.753-14.91 35.995Z"),
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
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
