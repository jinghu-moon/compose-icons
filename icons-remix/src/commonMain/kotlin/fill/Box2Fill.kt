package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Box2Fill: ImageVector
    get() {
        if (_box2Fill != null) return _box2Fill!!
        _box2Fill = remixIcon(
            name = "Box2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 1.000 L 21.500 6.500 L 21.500 17.500 L 12.000 23.000 L 2.500 17.500 L 2.500 6.500 L 12.000 1.000 ZM 4.500 7.658 L 4.500 16.347 L 12.000 20.689 L 12.000 12.000 L 4.500 7.658 Z"),
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
        return _box2Fill!!
    }

private var _box2Fill: ImageVector? = null
