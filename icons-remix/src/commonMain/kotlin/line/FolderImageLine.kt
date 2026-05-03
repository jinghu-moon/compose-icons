package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderImageLine: ImageVector
    get() {
        if (_folderImageLine != null) return _folderImageLine!!
        _folderImageLine = remixIcon(
            name = "FolderImageLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 5.000 L 4.000 19.000 L 20.000 19.000 L 20.000 7.000 L 11.586 7.000 L 9.586 5.000 L 4.000 5.000 ZM 12.414 5.000 L 21.000 5.000 C 21.552 5.000 22.000 5.448 22.000 6.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 10.414 3.000 L 12.414 5.000 ZM 10.000 10.500 C 10.000 11.328 9.328 12.000 8.500 12.000 C 7.672 12.000 7.000 11.328 7.000 10.500 C 7.000 9.672 7.672 9.000 8.500 9.000 C 9.328 9.000 10.000 9.672 10.000 10.500 ZM 18.000 17.000 L 14.000 11.000 L 7.000 17.000 L 18.000 17.000 Z"),
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
        return _folderImageLine!!
    }

private var _folderImageLine: ImageVector? = null
