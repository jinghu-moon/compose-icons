package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowURightUp: ImageVector
    get() {
        if (_arrowURightUp != null) return _arrowURightUp!!
        _arrowURightUp = phosphorBoldIcon(
            name = "ArrowURightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224.49 88.49c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529L180 61v107c0 37.555-30.445 68-68 68C74.445 236 44 205.555 44 168v-88C44 73.373 49.373 68 56 68c6.627 0 12 5.373 12 12v88c0 24.301 19.699 44 44 44 24.301 0 44-19.699 44-44v-107L128.49 88.49c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L159.49 23.49c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529l48 48c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5Z"),
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
        return _arrowURightUp!!
    }

private var _arrowURightUp: ImageVector? = null
