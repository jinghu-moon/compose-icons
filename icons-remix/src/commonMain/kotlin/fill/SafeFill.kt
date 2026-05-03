package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SafeFill: ImageVector
    get() {
        if (_safeFill != null) return _safeFill!!
        _safeFill = remixIcon(
            name = "SafeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.005 20.000 L 6.005 20.000 L 6.005 22.000 L 4.005 22.000 L 4.005 20.000 L 3.005 20.000 C 2.453 20.000 2.005 19.552 2.005 19.000 L 2.005 4.000 C 2.005 3.447 2.453 3.000 3.005 3.000 L 21.005 3.000 C 21.557 3.000 22.005 3.447 22.005 4.000 L 22.005 19.000 C 22.005 19.552 21.557 20.000 21.005 20.000 L 20.005 20.000 L 20.005 22.000 L 18.005 22.000 L 18.005 20.000 ZM 11.005 13.874 L 11.005 17.000 L 13.005 17.000 L 13.005 13.874 C 14.730 13.430 16.005 11.864 16.005 10.000 C 16.005 7.791 14.214 6.000 12.005 6.000 C 9.796 6.000 8.005 7.791 8.005 10.000 C 8.005 11.864 9.280 13.430 11.005 13.874 ZM 12.005 12.000 C 10.900 12.000 10.005 11.104 10.005 10.000 C 10.005 8.895 10.900 8.000 12.005 8.000 C 13.109 8.000 14.005 8.895 14.005 10.000 C 14.005 11.104 13.109 12.000 12.005 12.000 Z"),
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
        return _safeFill!!
    }

private var _safeFill: ImageVector? = null
