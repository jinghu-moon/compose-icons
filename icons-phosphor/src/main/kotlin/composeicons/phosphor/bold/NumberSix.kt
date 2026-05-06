package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberSix: ImageVector
    get() {
        if (_numberSix != null) return _numberSix!!
        _numberSix = phosphorBoldIcon(
            name = "NumberSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 100c-2.612 .004-5.221 .181-7.81 .53L146.46 53.89c3.253-5.777 1.207-13.097-4.57-16.35-5.777-3.253-13.097-1.207-16.35 4.57L76 130.13c-13.514 23.543-9.538 53.226 9.696 72.382 19.234 19.156 48.933 23.012 72.421 9.403 23.488-13.609 34.912-41.293 27.858-67.507C178.921 118.195 155.146 99.984 128 100ZM128 196C108.118 196 92 179.882 92 160c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36Z"),
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
