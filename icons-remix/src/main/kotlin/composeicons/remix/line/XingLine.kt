package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.XingLine: ImageVector
    get() {
        if (_xingLine != null) return _xingLine!!
        _xingLine = remixIcon(
            name = "XingLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.444 3.5 13.81 14.99 17.857 22h-2.31L11.502 14.991l-.002-.001L18.134 3.5h2.31ZM8.31 7l2.422 4.196-.002 .001L7.669 16.5h-2.308L8.422 11.195 6.001 7h2.309Z"),
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
        return _xingLine!!
    }

private var _xingLine: ImageVector? = null
