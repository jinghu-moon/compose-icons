package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Swap2Fill: ImageVector
    get() {
        if (_swap2Fill != null) return _swap2Fill!!
        _swap2Fill = remixIcon(
            name = "Swap2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.207 2.293 L 15.793 3.707 L 18.086 6.000 L 13.000 6.000 L 13.000 8.000 L 18.086 8.000 L 15.793 10.293 L 17.207 11.707 L 21.914 7.000 L 17.207 2.293 ZM 7.000 11.500 C 9.485 11.500 11.500 9.485 11.500 7.000 C 11.500 4.515 9.485 2.500 7.000 2.500 C 4.515 2.500 2.500 4.515 2.500 7.000 C 2.500 9.485 4.515 11.500 7.000 11.500 ZM 5.914 18.000 L 8.207 20.293 L 6.793 21.707 L 2.086 17.000 L 6.793 12.293 L 8.207 13.707 L 5.914 16.000 L 11.000 16.000 L 11.000 18.000 L 5.914 18.000 ZM 14.000 13.000 C 13.448 13.000 13.000 13.448 13.000 14.000 L 13.000 20.000 C 13.000 20.552 13.448 21.000 14.000 21.000 L 20.000 21.000 C 20.552 21.000 21.000 20.552 21.000 20.000 L 21.000 14.000 C 21.000 13.448 20.552 13.000 20.000 13.000 L 14.000 13.000 Z"),
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
        return _swap2Fill!!
    }

private var _swap2Fill: ImageVector? = null
