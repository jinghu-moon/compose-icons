package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GreaterThan: ImageVector
    get() {
        if (_greaterThan != null) return _greaterThan!!
        _greaterThan = phosphorBoldIcon(
            name = "GreaterThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 128c-.001 4.635-2.672 8.855-6.86 10.84l-152 72c-5.974 2.748-13.046 .176-15.86-5.767-2.814-5.943-.321-13.044 5.59-15.923L188 128 58.87 66.85C52.959 63.97 50.466 56.87 53.28 50.927c2.814-5.943 9.886-8.514 15.86-5.767l152 72c4.188 1.985 6.859 6.205 6.86 10.84Z"),
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
        return _greaterThan!!
    }

private var _greaterThan: ImageVector? = null
