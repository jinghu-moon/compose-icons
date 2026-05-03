package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileUnknowLine: ImageVector
    get() {
        if (_fileUnknowLine != null) return _fileUnknowLine!!
        _fileUnknowLine = remixIcon(
            name = "FileUnknowLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 15.000 L 13.000 15.000 L 13.000 17.000 L 11.000 17.000 L 11.000 15.000 ZM 13.000 13.355 L 13.000 14.000 L 11.000 14.000 L 11.000 12.500 C 11.000 11.948 11.448 11.500 12.000 11.500 C 12.828 11.500 13.500 10.828 13.500 10.000 C 13.500 9.172 12.828 8.500 12.000 8.500 C 11.272 8.500 10.666 9.018 10.529 9.706 L 8.567 9.313 C 8.886 7.709 10.302 6.500 12.000 6.500 C 13.933 6.500 15.500 8.067 15.500 10.000 C 15.500 11.585 14.446 12.925 13.000 13.355 ZM 15.000 4.000 L 5.000 4.000 L 5.000 20.000 L 19.000 20.000 L 19.000 8.000 L 15.000 8.000 L 15.000 4.000 ZM 3.000 2.992 C 3.000 2.444 3.447 2.000 3.999 2.000 L 16.000 2.000 L 21.000 7.000 L 21.000 20.993 C 21.000 21.549 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.545 3.000 21.008 L 3.000 2.992 Z"),
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
        return _fileUnknowLine!!
    }

private var _fileUnknowLine: ImageVector? = null
