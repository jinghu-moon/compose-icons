package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderShield2Line: ImageVector
    get() {
        if (_folderShield2Line != null) return _folderShield2Line!!
        _folderShield2Line = remixIcon(
            name = "FolderShield2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 22.000 9.000 L 20.000 9.000 L 20.000 7.000 L 11.586 7.000 L 9.586 5.000 L 4.000 5.000 L 4.000 19.000 L 11.447 19.000 C 11.809 19.792 12.379 20.485 13.111 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 10.414 3.000 L 12.414 5.000 L 21.000 5.000 C 21.552 5.000 22.000 5.448 22.000 6.000 L 22.000 9.000 ZM 13.000 11.000 L 22.000 11.000 L 22.000 16.949 C 22.000 17.940 21.499 18.865 20.664 19.414 L 17.500 21.498 L 14.336 19.414 C 13.501 18.865 13.000 17.940 13.000 16.949 L 13.000 11.000 ZM 15.000 16.949 C 15.000 17.265 15.162 17.563 15.436 17.744 L 17.500 19.103 L 19.564 17.744 C 19.838 17.563 20.000 17.265 20.000 16.949 L 20.000 13.000 L 15.000 13.000 L 15.000 16.949 Z"),
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
        return _folderShield2Line!!
    }

private var _folderShield2Line: ImageVector? = null
