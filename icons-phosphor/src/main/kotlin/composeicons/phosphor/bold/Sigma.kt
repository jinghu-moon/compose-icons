package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sigma: ImageVector
    get() {
        if (_sigma != null) return _sigma!!
        _sigma = phosphorBoldIcon(
            name = "Sigma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 72v-12h-91l48.4 60.5c3.51 4.384 3.51 10.616 0 15L89 196h91v-12c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v24c0 6.627-5.373 12-12 12h-128c-4.614 .001-8.82-2.644-10.819-6.803-1.998-4.159-1.435-9.095 1.449-12.697L112.63 128 54.63 55.5C51.746 51.898 51.183 46.962 53.181 42.803 55.18 38.644 59.386 35.999 64 36h128c6.627 0 12 5.373 12 12v24c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12Z"),
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
        return _sigma!!
    }

private var _sigma: ImageVector? = null
