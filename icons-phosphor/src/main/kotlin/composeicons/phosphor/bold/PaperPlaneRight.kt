package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) return _paperPlaneRight!!
        _paperPlaneRight = phosphorBoldIcon(
            name = "PaperPlaneRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M233.86 110.48 65.8 14.58C58.545 10.516 49.532 11.365 43.164 16.713c-6.368 5.348-8.763 14.078-6.014 21.927L67.33 128 37.15 217.36c-2.153 6.117-1.206 12.898 2.539 18.192 3.746 5.294 9.826 8.443 16.311 8.448 3.437-.007 6.814-.895 9.81-2.58l.09-.06L233.9 145.29c6.271-3.55 10.148-10.199 10.148-17.405 0-7.206-3.877-13.855-10.148-17.405ZM63.19 215.26 88.61 140h55.39c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-55.39L63.18 40.72l152.76 87.17Z"),
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
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
