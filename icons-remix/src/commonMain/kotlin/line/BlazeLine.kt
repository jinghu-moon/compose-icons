package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BlazeLine: ImageVector
    get() {
        if (_blazeLine != null) return _blazeLine!!
        _blazeLine = remixIcon(
            name = "BlazeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 9.000 C 19.667 10.061 20.000 11.394 20.000 13.000 C 20.000 16.000 16.500 17.000 15.000 22.000 C 14.333 21.425 14.000 20.592 14.000 19.500 C 14.000 16.018 19.000 14.210 19.000 9.000 ZM 14.500 5.000 C 15.167 6.238 15.500 7.572 15.500 9.000 C 15.500 14.000 9.500 15.000 11.500 22.000 C 9.833 20.839 9.000 19.173 9.000 17.000 C 9.000 13.675 14.500 11.000 14.500 5.000 ZM 10.000 1.000 C 10.667 2.333 11.000 3.833 11.000 5.500 C 11.000 11.500 2.000 13.000 8.000 22.000 C 5.500 21.500 3.500 19.000 3.500 16.000 C 3.500 9.500 10.000 8.500 10.000 1.000 Z"),
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
        return _blazeLine!!
    }

private var _blazeLine: ImageVector? = null
