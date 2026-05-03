package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderOpenLine: ImageVector
    get() {
        if (_folderOpenLine != null) return _folderOpenLine!!
        _folderOpenLine = remixIcon(
            name = "FolderOpenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 10.414 3.000 L 12.414 5.000 L 20.000 5.000 C 20.552 5.000 21.000 5.448 21.000 6.000 L 21.000 9.000 L 19.000 9.000 L 19.000 7.000 L 11.586 7.000 L 9.586 5.000 L 4.000 5.000 L 4.000 16.998 L 5.500 11.000 L 22.500 11.000 L 20.189 20.243 C 20.078 20.688 19.678 21.000 19.219 21.000 L 3.000 21.000 ZM 19.938 13.000 L 7.062 13.000 L 5.562 19.000 L 18.438 19.000 L 19.938 13.000 Z"),
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
        return _folderOpenLine!!
    }

private var _folderOpenLine: ImageVector? = null
