package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PolaroidLine: ImageVector
    get() {
        if (_polaroidLine != null) return _polaroidLine!!
        _polaroidLine = remixIcon(
            name = "PolaroidLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 6.000 L 19.000 6.000 L 19.000 5.000 L 5.000 5.000 L 5.000 19.000 L 19.000 19.000 L 19.000 18.000 L 21.000 18.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 4.000 C 3.000 3.448 3.448 3.000 4.000 3.000 L 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 L 21.000 6.000 ZM 6.000 6.000 L 8.000 6.000 L 8.000 9.000 L 6.000 9.000 L 6.000 6.000 ZM 15.000 16.000 C 17.209 16.000 19.000 14.209 19.000 12.000 C 19.000 9.791 17.209 8.000 15.000 8.000 C 12.791 8.000 11.000 9.791 11.000 12.000 C 11.000 14.209 12.791 16.000 15.000 16.000 ZM 15.000 18.000 C 11.686 18.000 9.000 15.314 9.000 12.000 C 9.000 8.686 11.686 6.000 15.000 6.000 C 18.314 6.000 21.000 8.686 21.000 12.000 C 21.000 15.314 18.314 18.000 15.000 18.000 ZM 15.000 14.000 C 13.895 14.000 13.000 13.105 13.000 12.000 C 13.000 10.895 13.895 10.000 15.000 10.000 C 16.105 10.000 17.000 10.895 17.000 12.000 C 17.000 13.105 16.105 14.000 15.000 14.000 Z"),
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
        return _polaroidLine!!
    }

private var _polaroidLine: ImageVector? = null
