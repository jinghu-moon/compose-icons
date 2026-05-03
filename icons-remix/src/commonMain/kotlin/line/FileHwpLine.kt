package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileHwpLine: ImageVector
    get() {
        if (_fileHwpLine != null) return _fileHwpLine!!
        _fileHwpLine = remixIcon(
            name = "FileHwpLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 2.000 L 21.000 7.000 L 21.000 20.993 C 21.000 21.549 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.545 3.000 21.008 L 3.000 2.992 C 3.000 2.444 3.447 2.000 3.999 2.000 L 16.000 2.000 ZM 16.000 8.667 L 8.000 8.667 L 8.000 7.333 L 11.333 7.333 L 11.333 6.000 L 12.667 6.000 L 12.666 7.333 L 14.999 7.333 L 15.000 4.000 L 5.000 4.000 L 5.000 20.000 L 19.000 20.000 L 19.000 8.000 L 16.000 7.999 L 16.000 8.667 ZM 9.333 14.667 L 9.333 16.666 L 16.000 16.667 L 16.000 18.000 L 8.000 18.000 L 8.000 14.667 L 9.333 14.667 ZM 12.000 14.333 C 12.552 14.333 13.000 14.781 13.000 15.333 C 13.000 15.886 12.552 16.333 12.000 16.333 C 11.448 16.333 11.000 15.886 11.000 15.333 C 11.000 14.781 11.448 14.333 12.000 14.333 ZM 12.000 9.000 C 13.381 9.000 14.500 10.119 14.500 11.500 C 14.500 12.881 13.381 14.000 12.000 14.000 C 10.619 14.000 9.500 12.881 9.500 11.500 C 9.500 10.119 10.619 9.000 12.000 9.000 ZM 12.000 10.333 C 11.356 10.333 10.833 10.856 10.833 11.500 C 10.833 12.144 11.356 12.667 12.000 12.667 C 12.644 12.667 13.167 12.144 13.167 11.500 C 13.167 10.856 12.644 10.333 12.000 10.333 Z"),
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
        return _fileHwpLine!!
    }

private var _fileHwpLine: ImageVector? = null
