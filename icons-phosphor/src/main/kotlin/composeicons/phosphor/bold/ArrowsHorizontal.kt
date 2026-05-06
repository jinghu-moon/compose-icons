package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowsHorizontal: ImageVector
    get() {
        if (_arrowsHorizontal != null) return _arrowsHorizontal!!
        _arrowsHorizontal = phosphorBoldIcon(
            name = "ArrowsHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240.49 136.49l-32 32c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L203 140h-150l11.52 11.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0l-32-32c-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5l32-32c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17L53 116h150L191.48 104.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0l32 32c2.261 2.25 3.533 5.308 3.534 8.498 .002 3.19-1.266 6.249-3.524 8.502Z"),
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
        return _arrowsHorizontal!!
    }

private var _arrowsHorizontal: ImageVector? = null
