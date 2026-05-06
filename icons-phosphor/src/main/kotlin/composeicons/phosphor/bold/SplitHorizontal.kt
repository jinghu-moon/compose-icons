package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SplitHorizontal: ImageVector
    get() {
        if (_splitHorizontal != null) return _splitHorizontal!!
        _splitHorizontal = phosphorBoldIcon(
            name = "SplitHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 48v160c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-68h-39l11.52 11.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0l-32-32c-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5l32-32c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L53 116h39v-68c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM240.49 119.51l-32-32c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L203 116h-39v-68c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v160c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-68h39l-11.52 11.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0l32-32c2.261-2.25 3.533-5.308 3.534-8.498 .002-3.19-1.266-6.249-3.524-8.502Z"),
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
        return _splitHorizontal!!
    }

private var _splitHorizontal: ImageVector? = null
