package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Medal2Line: ImageVector
    get() {
        if (_medal2Line != null) return _medal2Line!!
        _medal2Line = remixIcon(
            name = "Medal2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 8.500 L 14.116 13.587 L 19.608 14.028 L 15.424 17.612 L 16.702 22.972 L 12.000 20.100 L 7.298 22.972 L 8.576 17.612 L 4.392 14.028 L 9.884 13.587 L 12.000 8.500 ZM 12.000 13.707 L 11.262 15.483 L 9.345 15.637 L 10.805 16.888 L 10.358 18.759 L 12.000 17.756 L 13.641 18.759 L 13.195 16.888 L 14.654 15.637 L 12.739 15.483 L 12.000 13.707 ZM 8.000 2.000 L 8.000 11.000 L 6.000 11.000 L 6.000 2.000 L 8.000 2.000 ZM 18.000 2.000 L 18.000 11.000 L 16.000 11.000 L 16.000 2.000 L 18.000 2.000 ZM 13.000 2.000 L 13.000 7.000 L 11.000 7.000 L 11.000 2.000 L 13.000 2.000 Z"),
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
        return _medal2Line!!
    }

private var _medal2Line: ImageVector? = null
