package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberSquareZero: ImageVector
    get() {
        if (_numberSquareZero != null) return _numberSquareZero!!
        _numberSquareZero = phosphorDuotoneIcon(
            name = "NumberSquareZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 48v160c0 4.418-3.582 8-8 8h-160c-4.418 0-8-3.582-8-8v-160c0-4.418 3.582-8 8-8h160c4.418 0 8 3.582 8 8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M128 72c-14.23 0-26 6.44-34 18.61C87.53 100.47 84 113.75 84 128c0 14.25 3.56 27.53 10 37.39 8 12.17 19.74 18.61 34 18.61 14.26 0 26-6.44 34-18.61 6.47-9.86 10-23.14 10-37.39 0-14.25-3.56-27.53-10-37.39C154 78.44 142.23 72 128 72ZM128 168c-22.1 0-28-25.14-28-40 0-14.86 5.9-40 28-40 22.1 0 28 25.14 28 40 0 14.86-5.9 40-28 40ZM208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM208 208h-160v-160h160v160Z"),
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
