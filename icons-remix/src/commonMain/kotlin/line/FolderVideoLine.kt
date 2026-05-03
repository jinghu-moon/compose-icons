package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderVideoLine: ImageVector
    get() {
        if (_folderVideoLine != null) return _folderVideoLine!!
        _folderVideoLine = remixIcon(
            name = "FolderVideoLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 19.000 L 4.000 5.000 L 9.586 5.000 L 11.586 7.000 L 20.000 7.000 L 20.000 19.000 L 4.000 19.000 ZM 21.000 5.000 L 12.414 5.000 L 10.414 3.000 L 3.000 3.000 C 2.448 3.000 2.000 3.448 2.000 4.000 L 2.000 20.000 C 2.000 20.552 2.448 21.000 3.000 21.000 L 21.000 21.000 C 21.552 21.000 22.000 20.552 22.000 20.000 L 22.000 6.000 C 22.000 5.448 21.552 5.000 21.000 5.000 ZM 15.001 12.667 L 10.122 9.414 C 10.056 9.371 9.979 9.347 9.900 9.347 C 9.679 9.347 9.500 9.526 9.500 9.747 L 9.500 16.252 C 9.500 16.331 9.523 16.409 9.567 16.474 C 9.690 16.658 9.938 16.708 10.122 16.585 L 15.001 13.333 C 15.045 13.303 15.082 13.266 15.112 13.222 C 15.234 13.038 15.185 12.790 15.001 12.667 Z"),
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
        return _folderVideoLine!!
    }

private var _folderVideoLine: ImageVector? = null
