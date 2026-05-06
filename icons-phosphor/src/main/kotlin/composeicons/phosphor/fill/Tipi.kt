package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Tipi: ImageVector
    get() {
        if (_tipi != null) return _tipi!!
        _tipi = phosphorFillIcon(
            name = "Tipi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238.74 211.69 137.5 53.5 158.74 20.31c2.38-3.722 1.292-8.67-2.43-11.05-3.722-2.38-8.67-1.292-11.05 2.43L128 38.66l-17.26-27C108.36 7.938 103.412 6.85 99.69 9.23c-3.722 2.38-4.81 7.328-2.43 11.05l21.24 33.22L17.26 211.69c-1.575 2.463-1.681 5.588-.277 8.152 1.404 2.564 4.094 4.158 7.017 4.158h208c2.923 0 5.614-1.594 7.017-4.158 1.404-2.564 1.297-5.689-.277-8.152ZM188.74 208l-54-84.31c-1.47-2.299-4.011-3.69-6.74-3.69-2.729 0-5.27 1.391-6.74 3.69L67.3 208h-28.68L128 68.34 217.38 208Z"),
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
        return _tipi!!
    }

private var _tipi: ImageVector? = null
