package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Swap3Fill: ImageVector
    get() {
        if (_swap3Fill != null) return _swap3Fill!!
        _swap3Fill = remixIcon(
            name = "Swap3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 5.914 L 3.707 8.207 L 2.293 6.793 L 7.000 2.086 L 11.707 6.793 L 10.293 8.207 L 8.000 5.914 L 8.000 11.000 L 6.000 11.000 L 6.000 5.914 ZM 12.500 7.000 C 12.500 9.485 14.515 11.500 17.000 11.500 C 19.485 11.500 21.500 9.485 21.500 7.000 C 21.500 4.515 19.485 2.500 17.000 2.500 C 14.515 2.500 12.500 4.515 12.500 7.000 ZM 21.707 17.207 L 20.293 15.793 L 18.000 18.086 L 18.000 13.000 L 16.000 13.000 L 16.000 18.086 L 13.707 15.793 L 12.293 17.207 L 17.000 21.914 L 21.707 17.207 ZM 11.000 14.000 C 11.000 13.448 10.552 13.000 10.000 13.000 L 4.000 13.000 C 3.448 13.000 3.000 13.448 3.000 14.000 L 3.000 20.000 C 3.000 20.552 3.448 21.000 4.000 21.000 L 10.000 21.000 C 10.552 21.000 11.000 20.552 11.000 20.000 L 11.000 14.000 Z"),
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
        return _swap3Fill!!
    }

private var _swap3Fill: ImageVector? = null
