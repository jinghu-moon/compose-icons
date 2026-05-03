package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NewsLine: ImageVector
    get() {
        if (_newsLine != null) return _newsLine!!
        _newsLine = remixIcon(
            name = "NewsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 ZM 4.000 5.000 L 4.000 19.000 L 20.000 19.000 L 20.000 5.000 L 4.000 5.000 ZM 6.000 7.000 L 12.000 7.000 L 12.000 13.000 L 6.000 13.000 L 6.000 7.000 ZM 8.000 9.000 L 8.000 11.000 L 10.000 11.000 L 10.000 9.000 L 8.000 9.000 ZM 14.000 9.000 L 18.000 9.000 L 18.000 7.000 L 14.000 7.000 L 14.000 9.000 ZM 18.000 13.000 L 14.000 13.000 L 14.000 11.000 L 18.000 11.000 L 18.000 13.000 ZM 6.000 15.000 L 6.000 17.000 L 18.000 17.000 L 18.000 15.000 L 6.000 15.000 Z"),
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
        return _newsLine!!
    }

private var _newsLine: ImageVector? = null
