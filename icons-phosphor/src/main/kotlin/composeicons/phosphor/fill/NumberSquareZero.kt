package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberSquareZero: ImageVector
    get() {
        if (_numberSquareZero != null) return _numberSquareZero!!
        _numberSquareZero = phosphorFillIcon(
            name = "NumberSquareZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M156 128c0 14.86-5.9 40-28 40-22.1 0-28-25.14-28-40 0-14.86 5.9-40 28-40 22.1 0 28 25.14 28 40ZM224 48v160c0 8.837-7.163 16-16 16h-160c-8.837 0-16-7.163-16-16v-160C32 39.163 39.163 32 48 32h160c8.837 0 16 7.163 16 16ZM172 128c0-14.25-3.56-27.53-10-37.39C154 78.44 142.23 72 128 72c-14.23 0-26 6.44-34 18.61C87.53 100.47 84 113.75 84 128c0 14.25 3.56 27.53 10 37.39 8 12.17 19.74 18.61 34 18.61 14.26 0 26-6.44 34-18.61 6.44-9.86 10-23.14 10-37.39Z"),
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
        return _numberSquareZero!!
    }

private var _numberSquareZero: ImageVector? = null
