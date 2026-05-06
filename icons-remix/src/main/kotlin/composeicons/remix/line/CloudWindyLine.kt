package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CloudWindyLine: ImageVector
    get() {
        if (_cloudWindyLine != null) return _cloudWindyLine!!
        _cloudWindyLine = remixIcon(
            name = "CloudWindyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 18v-2h3.5C19.433 16 21 14.433 21 12.5 21 10.567 19.433 9 17.5 9c-.979 0-1.865 .402-2.5 1.051C15 10.034 15 10.017 15 10 15 6.686 12.314 4 9 4 5.686 4 3 6.686 3 10v.007h-2v-.007C1 5.582 4.582 2 9 2c3.395 0 6.296 2.115 7.458 5.099C16.795 7.034 17.144 7 17.5 7 20.538 7 23 9.462 23 12.5 23 15.538 20.538 18 17.5 18h-3.5ZM6 20h10v2h-10v-2ZM6 12h8v2h-8v-2ZM2 16h10v2h-10v-2Z"),
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
        return _cloudWindyLine!!
    }

private var _cloudWindyLine: ImageVector? = null
