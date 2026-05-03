package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileZipLine: ImageVector
    get() {
        if (_fileZipLine != null) return _fileZipLine!!
        _fileZipLine = remixIcon(
            name = "FileZipLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 3.000 C 3.000 2.448 3.448 2.000 4.000 2.000 L 20.000 2.000 C 20.552 2.000 21.000 2.448 21.000 3.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 ZM 19.000 20.000 L 19.000 4.000 L 5.000 4.000 L 5.000 20.000 L 19.000 20.000 ZM 14.000 12.000 L 14.000 17.000 L 10.000 17.000 L 10.000 14.000 L 12.000 14.000 L 12.000 12.000 L 14.000 12.000 ZM 12.000 4.000 L 14.000 4.000 L 14.000 6.000 L 12.000 6.000 L 12.000 4.000 ZM 10.000 6.000 L 12.000 6.000 L 12.000 8.000 L 10.000 8.000 L 10.000 6.000 ZM 12.000 8.000 L 14.000 8.000 L 14.000 10.000 L 12.000 10.000 L 12.000 8.000 ZM 10.000 10.000 L 12.000 10.000 L 12.000 12.000 L 10.000 12.000 L 10.000 10.000 Z"),
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
        return _fileZipLine!!
    }

private var _fileZipLine: ImageVector? = null
