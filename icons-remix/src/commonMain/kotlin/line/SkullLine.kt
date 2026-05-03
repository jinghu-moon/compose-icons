package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SkullLine: ImageVector
    get() {
        if (_skullLine != null) return _skullLine!!
        _skullLine = remixIcon(
            name = "SkullLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 L 4.000 16.000 L 7.000 16.000 C 7.552 16.000 8.000 16.448 8.000 17.000 L 8.000 20.000 L 16.000 20.000 L 16.000 17.000 C 16.000 16.448 16.448 16.000 17.000 16.000 L 20.000 16.000 L 20.000 12.000 ZM 18.000 18.000 L 18.000 21.000 C 18.000 21.552 17.552 22.000 17.000 22.000 L 7.000 22.000 C 6.448 22.000 6.000 21.552 6.000 21.000 L 6.000 18.000 L 3.000 18.000 C 2.448 18.000 2.000 17.552 2.000 17.000 L 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 L 22.000 17.000 C 22.000 17.552 21.552 18.000 21.000 18.000 L 18.000 18.000 ZM 7.500 14.000 C 6.672 14.000 6.000 13.328 6.000 12.500 C 6.000 11.672 6.672 11.000 7.500 11.000 C 8.328 11.000 9.000 11.672 9.000 12.500 C 9.000 13.328 8.328 14.000 7.500 14.000 ZM 16.500 14.000 C 15.672 14.000 15.000 13.328 15.000 12.500 C 15.000 11.672 15.672 11.000 16.500 11.000 C 17.328 11.000 18.000 11.672 18.000 12.500 C 18.000 13.328 17.328 14.000 16.500 14.000 Z"),
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
        return _skullLine!!
    }

private var _skullLine: ImageVector? = null
