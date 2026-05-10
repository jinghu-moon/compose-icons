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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.414 5h8.586c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h7.414l2 2ZM8 9v4.904c0 .892 .446 1.724 1.187 2.219L12 17.998l2.812-1.875C15.554 15.628 16 14.796 16 13.904v-4.904h-8ZM10 13.904v-2.904h4v2.904c0 .223-.111 .431-.297 .555L12 15.594 10.297 14.459C10.111 14.335 10 14.127 10 13.904Z"),
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
        return _folderShieldFill!!
    }

private var _folderShieldFill: ImageVector? = null
