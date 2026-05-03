package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ComputerFill: ImageVector
    get() {
        if (_computerFill != null) return _computerFill!!
        _computerFill = remixIcon(
            name = "ComputerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.000 18.000 L 13.000 20.000 L 17.000 20.000 L 17.000 22.000 L 7.000 22.000 L 7.000 20.000 L 11.000 20.000 L 11.000 18.000 L 2.992 18.000 C 2.444 18.000 2.000 17.551 2.000 16.993 L 2.000 4.007 C 2.000 3.451 2.455 3.000 2.992 3.000 L 21.008 3.000 C 21.556 3.000 22.000 3.449 22.000 4.007 L 22.000 16.993 C 22.000 17.549 21.545 18.000 21.008 18.000 L 13.000 18.000 Z"),
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
        return _computerFill!!
    }

private var _computerFill: ImageVector? = null
