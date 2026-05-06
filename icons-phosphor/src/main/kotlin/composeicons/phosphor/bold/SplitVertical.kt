package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SplitVertical: ImageVector
    get() {
        if (_splitVertical != null) return _splitVertical!!
        _splitVertical = phosphorBoldIcon(
            name = "SplitVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 152c0 6.627-5.373 12-12 12h-68v39l11.51-11.52c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17l-32 32c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529l-32-32c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L116 203v-39h-68c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h160c6.627 0 12 5.373 12 12ZM48 116h160c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-68v-39l11.51 11.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17l-32-32c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529l-32 32c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L116 53v39h-68c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12Z"),
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
        return _splitVertical!!
    }

private var _splitVertical: ImageVector? = null
