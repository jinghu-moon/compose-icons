package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Database: ImageVector
    get() {
        if (_database != null) return _database!!
        _database = tablerFilledIcon(
            name = "Database",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 15.731 C 4.968 17.238 8.234 18.000 12.000 18.000 C 15.760 18.000 19.025 17.240 21.000 15.748 L 21.000 18.000 C 21.000 20.425 17.105 21.936 12.307 21.998 L 12.000 22.000 C 7.062 22.000 3.000 20.477 3.000 18.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 3.000 9.731 C 4.968 11.238 8.234 12.000 12.000 12.000 C 15.760 12.000 19.025 11.240 21.000 9.748 L 21.000 12.000 C 21.000 14.477 16.938 16.000 12.000 16.000 C 7.202 16.000 3.230 14.562 3.021 12.205 L 3.005 12.104 L 3.000 12.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 13.041 2.000 14.044 2.068 14.977 2.198 L 15.446 2.269 Q 16.286 2.409 17.032 2.617 L 17.472 2.748 L 17.547 2.772 C 17.819 2.861 18.088 2.962 18.352 3.072 L 18.551 3.158 Q 19.086 3.400 19.518 3.688 Q 19.683 3.798 19.831 3.913 C 20.081 4.107 20.306 4.331 20.500 4.581 L 20.591 4.709 Q 20.661 4.814 20.720 4.920 L 20.790 5.059 Q 20.953 5.409 20.990 5.789 L 21.000 6.000 C 21.000 8.477 16.938 10.000 12.000 10.000 C 7.202 10.000 3.230 8.562 3.021 6.205 C 3.007 6.138 3.000 6.069 3.000 6.000 L 3.005 5.896 L 3.021 5.796 C 3.226 3.490 7.031 2.063 11.688 2.002 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _database!!
    }

private var _database: ImageVector? = null
