package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Box3Fill: ImageVector
    get() {
        if (_box3Fill != null) return _box3Fill!!
        _box3Fill = remixIcon(
            name = "Box3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.502 5.922 L 12.000 1.000 L 3.498 5.922 L 12.000 10.844 L 20.502 5.922 ZM 2.500 7.655 L 2.500 17.500 L 11.000 22.421 L 11.000 12.576 L 2.500 7.655 ZM 13.000 22.421 L 21.500 17.500 L 21.500 7.655 L 13.000 12.576 L 13.000 22.421 Z"),
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
        return _box3Fill!!
    }

private var _box3Fill: ImageVector? = null
