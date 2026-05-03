package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GroupFill: ImageVector
    get() {
        if (_groupFill != null) return _groupFill!!
        _groupFill = remixIcon(
            name = "GroupFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 22.000 C 2.000 17.582 5.582 14.000 10.000 14.000 C 14.418 14.000 18.000 17.582 18.000 22.000 L 2.000 22.000 ZM 10.000 13.000 C 6.685 13.000 4.000 10.315 4.000 7.000 C 4.000 3.685 6.685 1.000 10.000 1.000 C 13.315 1.000 16.000 3.685 16.000 7.000 C 16.000 10.315 13.315 13.000 10.000 13.000 ZM 17.363 15.233 C 20.448 16.022 22.768 18.723 22.984 22.000 L 20.000 22.000 C 20.000 19.390 19.000 17.014 17.363 15.233 ZM 15.340 12.957 C 16.973 11.492 18.000 9.366 18.000 7.000 C 18.000 5.583 17.631 4.251 16.985 3.097 C 19.275 3.554 21.000 5.575 21.000 8.000 C 21.000 10.762 18.763 13.000 16.000 13.000 C 15.776 13.000 15.556 12.985 15.340 12.957 Z"),
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
        return _groupFill!!
    }

private var _groupFill: ImageVector? = null
