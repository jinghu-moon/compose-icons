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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.691 12.915l1.768 1.768C11.448 20.693 6.498 20.693 2.256 19.279L17.812 3.722l3.535 3.536-5.657 5.657ZM12.863 12.915 18.519 7.258l-.707-.707L6.314 18.048c2.732 .107 5.358-.906 8.266-3.415L12.863 12.915Z"),
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
        return _sliceLine!!
    }

private var _sliceLine: ImageVector? = null
