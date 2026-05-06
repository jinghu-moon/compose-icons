package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowUDownRight: ImageVector
    get() {
        if (_arrowUDownRight != null) return _arrowUDownRight!!
        _arrowUDownRight = phosphorBoldIcon(
            name = "ArrowUDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.49 176.49l-48 48c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L195 180h-107C50.445 180 20 149.555 20 112 20 74.445 50.445 44 88 44h88c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-88C63.699 68 44 87.699 44 112c0 24.301 19.699 44 44 44h107L167.48 128.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0l48 48c2.261 2.25 3.533 5.308 3.534 8.498 .002 3.19-1.266 6.249-3.524 8.502Z"),
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
        return _arrowUDownRight!!
    }

private var _arrowUDownRight: ImageVector? = null
