package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Function: ImageVector
    get() {
        if (_function != null) return _function!!
        _function = phosphorBoldIcon(
            name = "Function",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 40c0 6.627-5.373 12-12 12h-29.29C161.033 51.984 152.732 58.899 151 68.42L142.38 116h41.62c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-46l-9.44 51.87C124.758 212.784 106.547 227.99 85.29 228h-29.29c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h29.29c9.677 .016 17.978-6.899 19.71-16.42L113.62 140h-41.62c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h46l9.44-51.87C131.242 43.216 149.453 28.01 170.71 28h29.29c6.627 0 12 5.373 12 12Z"),
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
        return _function!!
    }

private var _function: ImageVector? = null
