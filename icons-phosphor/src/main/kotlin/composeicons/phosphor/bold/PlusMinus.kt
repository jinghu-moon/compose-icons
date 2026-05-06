package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PlusMinus: ImageVector
    get() {
        if (_plusMinus != null) return _plusMinus!!
        _plusMinus = phosphorBoldIcon(
            name = "PlusMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208.49 64.49 64.49 208.49c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L191.49 47.49c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17ZM60 112c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-28h28c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-28v-28C84 25.373 78.627 20 72 20 65.373 20 60 25.373 60 32v28h-28C25.373 60 20 65.373 20 72c0 6.627 5.373 12 12 12h28ZM224 172h-80c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h80c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _plusMinus!!
    }

private var _plusMinus: ImageVector? = null
