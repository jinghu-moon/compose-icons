package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BoxingLine: ImageVector
    get() {
        if (_boxingLine != null) return _boxingLine!!
        _boxingLine = remixIcon(
            name = "BoxingLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.500 2.000 C 19.538 2.000 22.000 4.462 22.000 7.500 L 22.000 10.000 C 22.000 10.888 21.614 11.686 21.001 12.235 L 21.000 17.000 C 21.000 18.306 20.166 19.417 19.001 19.829 L 19.000 21.000 C 19.000 21.552 18.552 22.000 18.000 22.000 L 6.000 22.000 C 5.448 22.000 5.000 21.552 5.000 21.000 L 5.000 19.829 C 3.835 19.417 3.000 18.306 3.000 17.000 L 3.000 6.000 C 3.000 3.791 4.791 2.000 7.000 2.000 L 16.500 2.000 ZM 9.500 11.000 L 5.000 11.000 L 5.000 17.000 C 5.000 17.513 5.386 17.935 5.883 17.993 L 6.000 18.000 L 18.000 18.000 C 18.513 18.000 18.935 17.614 18.993 17.117 L 19.000 17.000 L 19.000 13.000 L 12.964 13.001 C 12.721 14.697 11.263 16.000 9.500 16.000 L 6.000 16.000 L 6.000 14.000 L 9.500 14.000 C 10.280 14.000 10.920 13.405 10.993 12.644 L 11.000 12.500 C 11.000 11.720 10.405 11.080 9.644 11.007 L 9.500 11.000 ZM 16.500 4.000 L 7.000 4.000 C 5.946 4.000 5.082 4.816 5.005 5.851 L 5.000 6.000 L 5.000 9.000 L 9.500 9.000 C 10.896 9.000 12.101 9.818 12.663 11.000 L 19.000 11.000 C 19.513 11.000 19.935 10.614 19.993 10.117 L 20.000 10.000 L 20.000 7.500 C 20.000 5.631 18.536 4.105 16.692 4.005 L 16.500 4.000 Z"),
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
        return _boxingLine!!
    }

private var _boxingLine: ImageVector? = null
