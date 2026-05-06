package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowULeftUp: ImageVector
    get() {
        if (_arrowULeftUp != null) return _arrowULeftUp!!
        _arrowULeftUp = phosphorBoldIcon(
            name = "ArrowULeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 80v88c0 37.555-30.445 68-68 68C106.445 236 76 205.555 76 168v-107L48.49 88.49c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L79.49 23.49c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529l48 48c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L100 61v107c0 24.301 19.699 44 44 44 24.301 0 44-19.699 44-44v-88c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _arrowULeftUp!!
    }

private var _arrowULeftUp: ImageVector? = null
