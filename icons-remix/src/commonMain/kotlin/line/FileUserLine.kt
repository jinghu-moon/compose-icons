package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileUserLine: ImageVector
    get() {
        if (_fileUserLine != null) return _fileUserLine!!
        _fileUserLine = remixIcon(
            name = "FileUserLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 4.000 L 5.000 4.000 L 5.000 20.000 L 19.000 20.000 L 19.000 8.000 L 15.000 8.000 L 15.000 4.000 ZM 3.000 2.992 C 3.000 2.444 3.447 2.000 3.999 2.000 L 16.000 2.000 L 21.000 7.000 L 21.000 20.993 C 21.000 21.549 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.545 3.000 21.008 L 3.000 2.992 ZM 12.000 11.500 C 10.619 11.500 9.500 10.381 9.500 9.000 C 9.500 7.619 10.619 6.500 12.000 6.500 C 13.381 6.500 14.500 7.619 14.500 9.000 C 14.500 10.381 13.381 11.500 12.000 11.500 ZM 7.527 17.000 C 7.776 14.750 9.684 13.000 12.000 13.000 C 14.316 13.000 16.224 14.750 16.472 17.000 L 7.527 17.000 Z"),
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
        return _fileUserLine!!
    }

private var _fileUserLine: ImageVector? = null
