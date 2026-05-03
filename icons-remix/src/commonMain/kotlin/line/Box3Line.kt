package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Box3Line: ImageVector
    get() {
        if (_box3Line != null) return _box3Line!!
        _box3Line = remixIcon(
            name = "Box3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 1.000 L 21.500 6.500 L 21.500 17.500 L 12.000 23.000 L 2.500 17.500 L 2.500 6.500 L 12.000 1.000 ZM 5.494 7.078 L 12.000 10.844 L 18.506 7.078 L 12.000 3.311 L 5.494 7.078 ZM 4.500 8.813 L 4.500 16.347 L 11.000 20.110 L 11.000 12.576 L 4.500 8.813 ZM 13.000 20.110 L 19.500 16.347 L 19.500 8.813 L 13.000 12.576 L 13.000 20.110 Z"),
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
        return _box3Line!!
    }

private var _box3Line: ImageVector? = null
