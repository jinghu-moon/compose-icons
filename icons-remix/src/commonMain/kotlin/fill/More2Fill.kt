package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.More2Fill: ImageVector
    get() {
        if (_more2Fill != null) return _more2Fill!!
        _more2Fill = remixIcon(
            name = "More2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 3.000 C 10.900 3.000 10.000 3.900 10.000 5.000 C 10.000 6.100 10.900 7.000 12.000 7.000 C 13.100 7.000 14.000 6.100 14.000 5.000 C 14.000 3.900 13.100 3.000 12.000 3.000 ZM 12.000 17.000 C 10.900 17.000 10.000 17.900 10.000 19.000 C 10.000 20.100 10.900 21.000 12.000 21.000 C 13.100 21.000 14.000 20.100 14.000 19.000 C 14.000 17.900 13.100 17.000 12.000 17.000 ZM 12.000 10.000 C 10.900 10.000 10.000 10.900 10.000 12.000 C 10.000 13.100 10.900 14.000 12.000 14.000 C 13.100 14.000 14.000 13.100 14.000 12.000 C 14.000 10.900 13.100 10.000 12.000 10.000 Z"),
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
        return _more2Fill!!
    }

private var _more2Fill: ImageVector? = null
