package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NumberSix: ImageVector
    get() {
        if (_numberSix != null) return _numberSix!!
        _numberSix = phosphorFillIcon(
            name = "NumberSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 24h-144C47.163 24 40 31.163 40 40v176c0 8.837 7.163 16 16 16h144c8.837 0 16-7.163 16-16v-176c0-8.837-7.163-16-16-16ZM128 192c-15.638-.008-30.096-8.315-37.979-21.82-7.883-13.506-8.005-30.18-.321-43.8L123.38 68c2.209-3.827 7.103-5.139 10.93-2.93 3.827 2.209 5.139 7.103 2.93 10.93l-16.52 28.61c2.406-.401 4.841-.605 7.28-.61 24.301 0 44 19.699 44 44 0 24.301-19.699 44-44 44ZM156 148c0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28Z"),
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
        return _numberSix!!
    }

private var _numberSix: ImageVector? = null
