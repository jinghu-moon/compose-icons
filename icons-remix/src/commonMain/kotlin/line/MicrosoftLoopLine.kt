package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MicrosoftLoopLine: ImageVector
    get() {
        if (_microsoftLoopLine != null) return _microsoftLoopLine!!
        _microsoftLoopLine = remixIcon(
            name = "MicrosoftLoopLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 4.000 C 16.418 4.000 20.000 7.582 20.000 12.000 C 20.000 16.418 16.418 20.000 12.000 20.000 L 7.690 20.000 C 8.593 19.059 9.215 17.848 9.424 16.500 L 12.000 16.500 C 14.485 16.500 16.500 14.485 16.500 12.000 C 16.500 9.515 14.485 7.500 12.000 7.500 C 9.515 7.500 7.500 9.515 7.500 12.000 L 7.500 15.500 C 7.500 17.642 6.004 19.434 4.000 19.889 L 4.000 12.000 C 4.000 7.582 7.582 4.000 12.000 4.000 ZM 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 C 22.000 6.477 17.523 2.000 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 L 2.000 22.000 L 12.000 22.000 ZM 9.500 14.500 L 9.500 12.000 C 9.500 10.619 10.619 9.500 12.000 9.500 C 13.381 9.500 14.500 10.619 14.500 12.000 C 14.500 13.381 13.381 14.500 12.000 14.500 L 9.500 14.500 Z"),
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
        return _microsoftLoopLine!!
    }

private var _microsoftLoopLine: ImageVector? = null
