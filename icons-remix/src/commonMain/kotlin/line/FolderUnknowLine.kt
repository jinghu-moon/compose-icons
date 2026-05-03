package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderUnknowLine: ImageVector
    get() {
        if (_folderUnknowLine != null) return _folderUnknowLine!!
        _folderUnknowLine = remixIcon(
            name = "FolderUnknowLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.414 5.000 L 21.000 5.000 C 21.552 5.000 22.000 5.448 22.000 6.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 10.414 3.000 L 12.414 5.000 ZM 4.000 5.000 L 4.000 19.000 L 20.000 19.000 L 20.000 7.000 L 11.586 7.000 L 9.586 5.000 L 4.000 5.000 ZM 11.000 16.000 L 13.000 16.000 L 13.000 18.000 L 11.000 18.000 L 11.000 16.000 ZM 8.567 10.814 C 8.886 9.209 10.302 8.000 12.000 8.000 C 13.933 8.000 15.500 9.567 15.500 11.500 C 15.500 13.433 13.933 15.000 12.000 15.000 L 11.000 15.000 L 11.000 13.000 L 12.000 13.000 C 12.828 13.000 13.500 12.328 13.500 11.500 C 13.500 10.672 12.828 10.000 12.000 10.000 C 11.272 10.000 10.666 10.518 10.529 11.206 L 8.567 10.814 Z"),
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
        return _folderUnknowLine!!
    }

private var _folderUnknowLine: ImageVector? = null
