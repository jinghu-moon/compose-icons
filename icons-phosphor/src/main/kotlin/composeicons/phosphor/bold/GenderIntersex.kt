package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GenderIntersex: ImageVector
    get() {
        if (_genderIntersex != null) return _genderIntersex!!
        _genderIntersex = phosphorBoldIcon(
            name = "GenderIntersex",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 20h-40c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h11L163.36 59.67C141.413 41.432 110.413 38.837 85.739 53.173 61.065 67.508 47.967 95.724 52.941 123.823c4.974 28.099 26.963 50.103 55.059 55.097v13.08h-20c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h20v16c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-16h20c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-20v-13.08c21.795-3.888 40.329-18.153 49.665-38.227 9.337-20.074 8.305-43.439-2.765-62.613L196 61v11c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-40c0-6.627-5.373-12-12-12ZM120 156C95.699 156 76 136.301 76 112 76 87.699 95.699 68 120 68c24.301 0 44 19.699 44 44-.028 24.289-19.711 43.972-44 44Z"),
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
        return _genderIntersex!!
    }

private var _genderIntersex: ImageVector? = null
