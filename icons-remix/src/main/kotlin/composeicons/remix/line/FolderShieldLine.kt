package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderShieldLine: ImageVector
    get() {
        if (_folderShieldLine != null) return _folderShieldLine!!
        _folderShieldLine = remixIcon(
            name = "FolderShieldLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.414 5h8.586c.552 0 1 .448 1 1v14c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h7.414l2 2ZM4 5v14h16v-12h-8.414L9.586 5h-5.586ZM8 9h8v4.904c0 .892-.446 1.724-1.188 2.219L12 17.998 9.187 16.123C8.446 15.628 8 14.796 8 13.904v-4.904ZM10 13.904c0 .223 .111 .431 .297 .555L12 15.594l1.703-1.135c.186-.124 .297-.332 .297-.555v-2.904h-4v2.904Z"),
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
        return _folderShieldLine!!
    }

private var _folderShieldLine: ImageVector? = null
