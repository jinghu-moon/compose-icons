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
                pathData = parseSvgPathData("M7.094 5.68 18.32 16.906C19.374 15.551 20 13.849 20 12 20 7.582 16.418 4 12 4 10.151 4 8.449 4.626 7.094 5.68ZM16.906 18.32 5.68 7.094C4.626 8.449 4 10.151 4 12c0 4.418 3.582 8 8 8 1.849 0 3.551-.626 4.906-1.68ZM4.929 4.929C6.737 3.12 9.239 2 12 2c5.523 0 10 4.477 10 10 0 2.761-1.12 5.263-2.929 7.071C17.263 20.88 14.761 22 12 22 6.477 22 2 17.523 2 12 2 9.239 3.12 6.737 4.929 4.929Z"),
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
