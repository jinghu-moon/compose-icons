package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowSquareIn: ImageVector
    get() {
        if (_arrowSquareIn != null) return _arrowSquareIn!!
        _arrowSquareIn = phosphorBoldIcon(
            name = "ArrowSquareIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M132 136v64c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-35L48.49 224.49c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L91 148h-35c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h64c6.627 0 12 5.373 12 12ZM208 28h-128C68.954 28 60 36.954 60 48v44c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-40h120v120h-40c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h44c11.046 0 20-8.954 20-20v-128C228 36.954 219.046 28 208 28Z"),
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
        return _arrowSquareIn!!
    }

private var _arrowSquareIn: ImageVector? = null
