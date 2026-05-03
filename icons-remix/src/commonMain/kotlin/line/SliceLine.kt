package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SliceLine: ImageVector
    get() {
        if (_sliceLine != null) return _sliceLine!!
        _sliceLine = remixIcon(
            name = "SliceLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.691 12.915 L 17.459 14.682 C 11.448 20.693 6.498 20.693 2.256 19.279 L 17.812 3.722 L 21.348 7.258 L 15.691 12.915 ZM 12.863 12.915 L 18.519 7.258 L 17.812 6.551 L 6.314 18.048 C 9.046 18.156 11.672 17.142 14.581 14.633 L 12.863 12.915 Z"),
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
        return _sliceLine!!
    }

private var _sliceLine: ImageVector? = null
