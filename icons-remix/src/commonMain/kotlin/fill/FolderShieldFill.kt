package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FolderShieldFill: ImageVector
    get() {
        if (_folderShieldFill != null) return _folderShieldFill!!
        _folderShieldFill = remixIcon(
            name = "FolderShieldFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.414 5.000 L 21.000 5.000 C 21.552 5.000 22.000 5.448 22.000 6.000 L 22.000 20.000 C 22.000 20.552 21.552 21.000 21.000 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 10.414 3.000 L 12.414 5.000 ZM 8.000 9.000 L 8.000 13.904 C 8.000 14.796 8.446 15.628 9.187 16.123 L 12.000 17.998 L 14.812 16.123 C 15.554 15.628 16.000 14.796 16.000 13.904 L 16.000 9.000 L 8.000 9.000 ZM 10.000 13.904 L 10.000 11.000 L 14.000 11.000 L 14.000 13.904 C 14.000 14.127 13.889 14.335 13.703 14.459 L 12.000 15.594 L 10.297 14.459 C 10.111 14.335 10.000 14.127 10.000 13.904 Z"),
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
        return _folderShieldFill!!
    }

private var _folderShieldFill: ImageVector? = null
