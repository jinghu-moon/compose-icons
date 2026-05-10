package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ShapesFill: ImageVector
    get() {
        if (_shapesFill != null) return _shapesFill!!
        _shapesFill = remixIcon(
            name = "ShapesFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1 18 11h-12L12 1ZM13 13.5h8v8h-8v-8ZM6.75 22c2.623 0 4.75-2.127 4.75-4.75 0-2.623-2.127-4.75-4.75-4.75C4.127 12.5 2 14.627 2 17.25 2 19.873 4.127 22 6.75 22Z"),
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
        return _shapesFill!!
    }

private var _shapesFill: ImageVector? = null
