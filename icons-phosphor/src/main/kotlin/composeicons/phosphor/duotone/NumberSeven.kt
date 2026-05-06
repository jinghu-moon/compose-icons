package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberSeven: ImageVector
    get() {
        if (_numberSeven != null) return _numberSeven!!
        _numberSeven = phosphorDuotoneIcon(
            name = "NumberSeven",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40v176c0 8.837-7.163 16-16 16h-144c-8.837 0-16-7.163-16-16v-176C40 31.163 47.163 24 56 24h144c8.837 0 16 7.163 16 16Z"),
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
                pathData = parseSvgPathData("M175.66 50.3l-48 160c-1.346 4.132-5.745 6.434-9.907 5.184-4.162-1.25-6.566-5.594-5.413-9.784L157.25 56h-69.25c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h80c2.529 .001 4.908 1.197 6.417 3.226 1.509 2.029 1.97 4.652 1.243 7.074Z"),
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
        return _numberSeven!!
    }

private var _numberSeven: ImageVector? = null
