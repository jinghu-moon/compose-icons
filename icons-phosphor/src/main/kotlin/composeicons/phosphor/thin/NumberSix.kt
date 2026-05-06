package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberSix: ImageVector
    get() {
        if (_numberSix != null) return _numberSix!!
        _numberSix = phosphorThinIcon(
            name = "NumberSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 108c-8.641-.012-17.148 2.144-24.74 6.27L139.49 50c1.082-1.933 .393-4.378-1.54-5.46-1.933-1.082-4.378-.393-5.46 1.54L83 134.05c-11.745 20.396-8.327 46.138 8.334 62.761 16.661 16.624 42.411 19.984 62.78 8.192 20.369-11.791 30.279-35.794 24.16-58.521C172.156 123.756 151.536 107.972 128 108ZM128 204C103.699 204 84 184.301 84 160c0-24.301 19.699-44 44-44 24.301 0 44 19.699 44 44-.028 24.289-19.711 43.972-44 44Z"),
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
