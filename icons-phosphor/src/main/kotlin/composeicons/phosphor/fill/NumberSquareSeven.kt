package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberSquareSeven: ImageVector
    get() {
        if (_numberSquareSeven != null) return _numberSquareSeven!!
        _numberSquareSeven = phosphorFillIcon(
            name = "NumberSquareSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM159.52 90.73l-32 88c-1.149 3.164-4.154 5.27-7.52 5.27-.931 .002-1.855-.16-2.73-.48-1.994-.724-3.62-2.211-4.518-4.133-.898-1.922-.996-4.123-.272-6.117L140.58 96h-36.58c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h48c2.609-0 5.054 1.272 6.551 3.409 1.497 2.137 1.859 4.869 .969 7.321Z"),
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
        return _numberSquareSeven!!
    }

private var _numberSquareSeven: ImageVector? = null
