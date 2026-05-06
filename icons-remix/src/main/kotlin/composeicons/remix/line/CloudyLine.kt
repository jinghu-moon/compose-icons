package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CloudyLine: ImageVector
    get() {
        if (_cloudyLine != null) return _cloudyLine!!
        _cloudyLine = remixIcon(
            name = "CloudyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.5 6C5.91 6 3 8.91 3 12.5 3 16.09 5.91 19 9.5 19h7C18.985 19 21 16.985 21 14.5 21 12.015 18.985 10 16.5 10c-.328 0-.648 .035-.957 .102C14.589 7.699 12.243 6 9.5 6ZM16.5 21h-7C4.806 21 1 17.194 1 12.5 1 7.806 4.806 4 9.5 4c3.043 0 5.713 1.599 7.215 4.003C20.205 8.117 23 10.982 23 14.5 23 18.09 20.09 21 16.5 21Z"),
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
        return _cloudyLine!!
    }

private var _cloudyLine: ImageVector? = null
