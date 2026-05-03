package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PolaroidFill: ImageVector
    get() {
        if (_polaroidFill != null) return _polaroidFill!!
        _polaroidFill = remixIcon(
            name = "PolaroidFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.659 10.000 C 19.835 7.670 17.612 6.000 15.000 6.000 C 11.686 6.000 9.000 8.686 9.000 12.000 C 9.000 15.314 11.686 18.000 15.000 18.000 C 17.612 18.000 19.835 16.330 20.659 14.000 L 21.000 14.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 L 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 L 21.000 10.000 L 20.659 10.000 ZM 5.000 6.000 L 5.000 9.000 L 7.000 9.000 L 7.000 6.000 L 5.000 6.000 ZM 15.000 16.000 C 12.791 16.000 11.000 14.209 11.000 12.000 C 11.000 9.791 12.791 8.000 15.000 8.000 C 17.209 8.000 19.000 9.791 19.000 12.000 C 19.000 14.209 17.209 16.000 15.000 16.000 ZM 15.000 14.000 C 16.105 14.000 17.000 13.105 17.000 12.000 C 17.000 10.895 16.105 10.000 15.000 10.000 C 13.895 10.000 13.000 10.895 13.000 12.000 C 13.000 13.105 13.895 14.000 15.000 14.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _polaroidFill!!
    }

private var _polaroidFill: ImageVector? = null
