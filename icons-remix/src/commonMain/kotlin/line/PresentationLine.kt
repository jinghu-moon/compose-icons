package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PresentationLine: ImageVector
    get() {
        if (_presentationLine != null) return _presentationLine!!
        _presentationLine = remixIcon(
            name = "PresentationLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 4.000 C 8.000 5.105 7.105 6.000 6.000 6.000 C 4.895 6.000 4.000 5.105 4.000 4.000 C 4.000 2.895 4.895 2.000 6.000 2.000 C 7.105 2.000 8.000 2.895 8.000 4.000 ZM 5.000 16.000 L 5.000 22.000 L 3.000 22.000 L 3.000 10.000 C 3.000 8.343 4.343 7.000 6.000 7.000 C 6.821 7.000 7.564 7.329 8.106 7.863 L 10.480 10.106 L 12.793 7.793 L 14.207 9.207 L 10.520 12.894 L 9.000 11.459 L 9.000 22.000 L 7.000 22.000 L 7.000 16.000 L 5.000 16.000 ZM 6.000 9.000 C 5.448 9.000 5.000 9.448 5.000 10.000 L 5.000 14.000 L 7.000 14.000 L 7.000 10.000 C 7.000 9.448 6.552 9.000 6.000 9.000 ZM 19.000 5.000 L 10.000 5.000 L 10.000 3.000 L 20.000 3.000 C 20.552 3.000 21.000 3.448 21.000 4.000 L 21.000 15.000 C 21.000 15.552 20.552 16.000 20.000 16.000 L 16.576 16.000 L 19.399 22.000 L 17.189 22.000 L 14.365 16.000 L 10.000 16.000 L 10.000 14.000 L 19.000 14.000 L 19.000 5.000 Z"),
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
        return _presentationLine!!
    }

private var _presentationLine: ImageVector? = null
