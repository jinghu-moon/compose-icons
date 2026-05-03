package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Speaker3Fill: ImageVector
    get() {
        if (_speaker3Fill != null) return _speaker3Fill!!
        _speaker3Fill = remixIcon(
            name = "Speaker3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 3.000 L 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 ZM 12.000 16.000 C 9.791 16.000 8.000 14.209 8.000 12.000 C 8.000 9.791 9.791 8.000 12.000 8.000 C 14.209 8.000 16.000 9.791 16.000 12.000 C 16.000 14.209 14.209 16.000 12.000 16.000 ZM 12.000 18.000 C 15.314 18.000 18.000 15.314 18.000 12.000 C 18.000 8.686 15.314 6.000 12.000 6.000 C 8.686 6.000 6.000 8.686 6.000 12.000 C 6.000 15.314 8.686 18.000 12.000 18.000 ZM 6.000 7.000 C 6.552 7.000 7.000 6.552 7.000 6.000 C 7.000 5.448 6.552 5.000 6.000 5.000 C 5.448 5.000 5.000 5.448 5.000 6.000 C 5.000 6.552 5.448 7.000 6.000 7.000 ZM 18.000 7.000 C 18.552 7.000 19.000 6.552 19.000 6.000 C 19.000 5.448 18.552 5.000 18.000 5.000 C 17.448 5.000 17.000 5.448 17.000 6.000 C 17.000 6.552 17.448 7.000 18.000 7.000 ZM 18.000 19.000 C 18.552 19.000 19.000 18.552 19.000 18.000 C 19.000 17.448 18.552 17.000 18.000 17.000 C 17.448 17.000 17.000 17.448 17.000 18.000 C 17.000 18.552 17.448 19.000 18.000 19.000 ZM 6.000 19.000 C 6.552 19.000 7.000 18.552 7.000 18.000 C 7.000 17.448 6.552 17.000 6.000 17.000 C 5.448 17.000 5.000 17.448 5.000 18.000 C 5.000 18.552 5.448 19.000 6.000 19.000 ZM 12.000 13.500 C 12.828 13.500 13.500 12.828 13.500 12.000 C 13.500 11.172 12.828 10.500 12.000 10.500 C 11.172 10.500 10.500 11.172 10.500 12.000 C 10.500 12.828 11.172 13.500 12.000 13.500 Z"),
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
        return _speaker3Fill!!
    }

private var _speaker3Fill: ImageVector? = null
