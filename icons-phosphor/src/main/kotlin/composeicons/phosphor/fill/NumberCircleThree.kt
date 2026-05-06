package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberCircleThree: ImageVector
    get() {
        if (_numberCircleThree != null) return _numberCircleThree!!
        _numberCircleThree = phosphorFillIcon(
            name = "NumberCircleThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM124 188c-9.681 .031-18.96-3.871-25.71-10.81-2.129-2.014-2.986-5.031-2.235-7.863 .751-2.832 2.992-5.027 5.839-5.721 2.847-.694 5.846 .225 7.816 2.394 6.353 6.482 16.274 7.873 24.165 3.388 7.891-4.485 11.772-13.72 9.455-22.495C141.012 138.118 133.076 132.003 124 132c-2.983-.001-5.718-1.661-7.095-4.308-1.377-2.646-1.167-5.839 .545-8.282L136.63 92h-32.63c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h48c2.983 .001 5.718 1.661 7.095 4.308 1.377 2.646 1.167 5.839-.545 8.282l-21 30c16.034 6.434 25.236 23.351 21.926 40.308C156.166 175.854 141.276 188.069 124 188Z"),
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
        return _numberCircleThree!!
    }

private var _numberCircleThree: ImageVector? = null
