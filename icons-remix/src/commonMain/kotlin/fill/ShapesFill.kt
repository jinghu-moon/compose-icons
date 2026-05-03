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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 1.000 L 18.000 11.000 L 6.000 11.000 L 12.000 1.000 ZM 13.000 13.500 L 21.000 13.500 L 21.000 21.500 L 13.000 21.500 L 13.000 13.500 ZM 6.750 22.000 C 9.373 22.000 11.500 19.873 11.500 17.250 C 11.500 14.627 9.373 12.500 6.750 12.500 C 4.127 12.500 2.000 14.627 2.000 17.250 C 2.000 19.873 4.127 22.000 6.750 22.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _shapesFill!!
    }

private var _shapesFill: ImageVector? = null
