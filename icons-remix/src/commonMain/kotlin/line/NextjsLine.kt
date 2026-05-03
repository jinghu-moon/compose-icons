package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NextjsLine: ImageVector
    get() {
        if (_nextjsLine != null) return _nextjsLine!!
        _nextjsLine = remixIcon(
            name = "NextjsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.664 17.649 L 10.260 8.000 L 8.000 8.000 L 8.000 16.000 L 10.000 16.000 L 10.000 10.946 L 16.087 18.879 C 14.891 19.591 13.493 20.000 12.000 20.000 C 7.582 20.000 4.000 16.418 4.000 12.000 C 4.000 7.582 7.582 4.000 12.000 4.000 C 16.418 4.000 20.000 7.582 20.000 12.000 C 20.000 14.205 19.108 16.202 17.664 17.649 ZM 12.000 22.000 C 17.523 22.000 22.000 17.523 22.000 12.000 C 22.000 6.477 17.523 2.000 12.000 2.000 C 6.477 2.000 2.000 6.477 2.000 12.000 C 2.000 17.523 6.477 22.000 12.000 22.000 ZM 14.000 12.000 L 14.000 8.000 L 16.000 8.000 L 16.000 12.000 L 14.000 12.000 Z"),
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
        return _nextjsLine!!
    }

private var _nextjsLine: ImageVector? = null
