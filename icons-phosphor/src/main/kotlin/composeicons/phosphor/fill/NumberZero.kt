package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberZero: ImageVector
    get() {
        if (_numberZero != null) return _numberZero!!
        _numberZero = phosphorFillIcon(
            name = "NumberZero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M157.68 88.39C164.34 98.52 168 112.59 168 128c0 15.41-3.66 29.47-10.32 39.61C150.55 178.49 140.56 184 128 184c-12.56 0-22.55-5.51-29.68-16.39C91.66 157.47 88 143.41 88 128 88 112.59 91.66 98.52 98.32 88.39 105.45 77.51 115.44 72 128 72c12.56 0 22.55 5.51 29.68 16.39ZM216 40v176c0 8.837-7.163 16-16 16h-144c-8.837 0-16-7.163-16-16v-176C40 31.163 47.163 24 56 24h144c8.837 0 16 7.163 16 16ZM184 128c0-18.49-4.6-35.68-12.94-48.39C160.92 64.16 146 56 128 56 110 56 95.08 64.16 84.94 79.61 76.6 92.32 72 109.51 72 128c0 18.49 4.6 35.68 12.94 48.39C95.08 191.84 110 200 128 200c18 0 32.92-8.16 43.06-23.61C179.4 163.68 184 146.49 184 128Z"),
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
        return _numberZero!!
    }

private var _numberZero: ImageVector? = null
