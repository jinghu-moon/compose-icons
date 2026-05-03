package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ProhibitedLine: ImageVector
    get() {
        if (_prohibitedLine != null) return _prohibitedLine!!
        _prohibitedLine = remixIcon(
            name = "ProhibitedLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.094 5.680 L 18.320 16.906 C 19.374 15.551 20.000 13.849 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 10.151 4.000 8.449 4.626 7.094 5.680 ZM 16.906 18.320 L 5.680 7.094 C 4.626 8.449 4.000 10.151 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 13.849 20.000 15.551 19.374 16.906 18.320 ZM 4.929 4.929 C 6.737 3.120 9.239 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 14.761 20.880 17.263 19.071 19.071 C 17.263 20.880 14.761 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 9.239 3.120 6.737 4.929 4.929 Z"),
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
        return _prohibitedLine!!
    }

private var _prohibitedLine: ImageVector? = null
