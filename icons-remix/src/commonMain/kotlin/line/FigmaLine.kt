package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FigmaLine: ImageVector
    get() {
        if (_figmaLine != null) return _figmaLine!!
        _figmaLine = remixIcon(
            name = "FigmaLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.000 6.000 C 5.000 3.791 6.791 2.000 9.000 2.000 L 15.000 2.000 C 17.209 2.000 19.000 3.791 19.000 6.000 C 19.000 7.195 18.476 8.267 17.646 9.000 C 18.476 9.733 19.000 10.805 19.000 12.000 C 19.000 14.209 17.209 16.000 15.000 16.000 C 14.271 16.000 13.588 15.805 13.000 15.465 L 13.000 18.000 C 13.000 20.209 11.209 22.000 9.000 22.000 C 6.791 22.000 5.000 20.209 5.000 18.000 C 5.000 16.805 5.524 15.733 6.354 15.000 C 5.524 14.267 5.000 13.195 5.000 12.000 C 5.000 10.805 5.524 9.733 6.354 9.000 C 5.524 8.267 5.000 7.195 5.000 6.000 ZM 11.000 10.000 L 9.000 10.000 C 7.895 10.000 7.000 10.895 7.000 12.000 C 7.000 13.105 7.895 14.000 9.000 14.000 L 11.000 14.000 L 11.000 10.000 ZM 13.000 12.000 C 13.000 13.105 13.895 14.000 15.000 14.000 C 16.105 14.000 17.000 13.105 17.000 12.000 C 17.000 10.895 16.105 10.000 15.000 10.000 C 13.895 10.000 13.000 10.895 13.000 12.000 ZM 15.000 8.000 C 16.105 8.000 17.000 7.105 17.000 6.000 C 17.000 4.895 16.105 4.000 15.000 4.000 L 13.000 4.000 L 13.000 8.000 L 15.000 8.000 ZM 9.000 4.000 C 7.895 4.000 7.000 4.895 7.000 6.000 C 7.000 7.105 7.895 8.000 9.000 8.000 L 11.000 8.000 L 11.000 4.000 L 9.000 4.000 ZM 11.000 16.000 L 9.000 16.000 C 7.895 16.000 7.000 16.895 7.000 18.000 C 7.000 19.105 7.895 20.000 9.000 20.000 C 10.105 20.000 11.000 19.105 11.000 18.000 L 11.000 16.000 Z"),
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
        return _figmaLine!!
    }

private var _figmaLine: ImageVector? = null
