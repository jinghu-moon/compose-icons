package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Hourglass2Line: ImageVector
    get() {
        if (_hourglass2Line != null) return _hourglass2Line!!
        _hourglass2Line = remixIcon(
            name = "Hourglass2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 2.000 L 20.000 2.000 L 20.000 6.460 L 13.537 12.000 L 20.000 17.540 L 20.000 22.000 L 4.000 22.000 L 4.000 17.540 L 10.463 12.000 L 4.000 6.460 L 4.000 2.000 ZM 12.000 10.683 L 18.000 5.540 L 18.000 4.000 L 6.000 4.000 L 6.000 5.540 L 12.000 10.683 ZM 12.000 13.317 L 6.000 18.460 L 6.000 20.000 L 18.000 20.000 L 18.000 18.460 L 12.000 13.317 Z"),
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
        return _hourglass2Line!!
    }

private var _hourglass2Line: ImageVector? = null
