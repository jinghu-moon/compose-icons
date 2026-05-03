package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FolderVideoFill: ImageVector
    get() {
        if (_folderVideoFill != null) return _folderVideoFill!!
        _folderVideoFill = remixIcon(
            name = "FolderVideoFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 5.000 L 12.414 5.000 L 10.414 3.000 L 3.000 3.000 C 2.448 3.000 2.000 3.448 2.000 4.000 L 2.000 20.000 C 2.000 20.552 2.448 21.000 3.000 21.000 L 21.000 21.000 C 21.552 21.000 22.000 20.552 22.000 20.000 L 22.000 6.000 C 22.000 5.448 21.552 5.000 21.000 5.000 ZM 15.001 12.667 C 15.185 12.790 15.234 13.038 15.112 13.222 C 15.082 13.266 15.045 13.303 15.001 13.333 L 10.122 16.585 C 9.938 16.708 9.690 16.658 9.567 16.474 C 9.523 16.409 9.500 16.331 9.500 16.252 L 9.500 9.747 C 9.500 9.526 9.679 9.347 9.900 9.347 C 9.979 9.347 10.056 9.371 10.122 9.414 L 15.001 12.667 Z"),
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
        return _folderVideoFill!!
    }

private var _folderVideoFill: ImageVector? = null
