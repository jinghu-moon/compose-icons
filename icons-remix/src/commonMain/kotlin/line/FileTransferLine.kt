package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileTransferLine: ImageVector
    get() {
        if (_fileTransferLine != null) return _fileTransferLine!!
        _fileTransferLine = remixIcon(
            name = "FileTransferLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 4.000 L 5.000 4.000 L 5.000 20.000 L 19.000 20.000 L 19.000 8.000 L 15.000 8.000 L 15.000 4.000 ZM 3.000 2.992 C 3.000 2.444 3.447 2.000 3.999 2.000 L 16.000 2.000 L 21.000 7.000 L 21.000 20.993 C 21.000 21.549 20.555 22.000 20.007 22.000 L 3.993 22.000 C 3.445 22.000 3.000 21.545 3.000 21.008 L 3.000 2.992 ZM 12.000 11.000 L 12.000 8.000 L 16.000 12.000 L 12.000 16.000 L 12.000 13.000 L 8.000 13.000 L 8.000 11.000 L 12.000 11.000 Z"),
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
        return _fileTransferLine!!
    }

private var _fileTransferLine: ImageVector? = null
