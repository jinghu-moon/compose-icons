package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Box1Fill: ImageVector
    get() {
        if (_box1Fill != null) return _box1Fill!!
        _box1Fill = remixIcon(
            name = "Box1Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 1.000 L 21.500 6.500 L 21.500 17.500 L 13.000 22.421 L 13.000 11.423 L 3.498 5.922 L 12.000 1.000 ZM 2.500 7.655 L 2.500 17.500 L 11.000 22.421 L 11.000 12.576 L 2.500 7.655 Z"),
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
        return _box1Fill!!
    }

private var _box1Fill: ImageVector? = null
