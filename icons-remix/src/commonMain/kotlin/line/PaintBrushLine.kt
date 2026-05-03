package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PaintBrushLine: ImageVector
    get() {
        if (_paintBrushLine != null) return _paintBrushLine!!
        _paintBrushLine = remixIcon(
            name = "PaintBrushLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.000 4.997 L 5.000 7.997 L 19.000 7.997 L 19.000 4.997 L 5.000 4.997 ZM 4.000 2.997 L 20.000 2.997 C 20.552 2.997 21.000 3.444 21.000 3.997 L 21.000 8.997 C 21.000 9.549 20.552 9.997 20.000 9.997 L 4.000 9.997 C 3.448 9.997 3.000 9.549 3.000 8.997 L 3.000 3.997 C 3.000 3.444 3.448 2.997 4.000 2.997 ZM 6.000 11.997 L 12.000 11.997 C 12.552 11.997 13.000 12.444 13.000 12.997 L 13.000 15.997 L 14.000 15.997 L 14.000 21.997 L 10.000 21.997 L 10.000 15.997 L 11.000 15.997 L 11.000 13.997 L 5.000 13.997 C 4.448 13.997 4.000 13.549 4.000 12.997 L 4.000 10.997 L 6.000 10.997 L 6.000 11.997 ZM 17.732 13.729 L 19.500 11.961 L 21.268 13.729 C 22.244 14.705 22.244 16.288 21.268 17.264 C 20.292 18.241 18.708 18.241 17.732 17.264 C 16.756 16.288 16.756 14.705 17.732 13.729 Z"),
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
        return _paintBrushLine!!
    }

private var _paintBrushLine: ImageVector? = null
