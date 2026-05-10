package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FolderShield2Fill: ImageVector
    get() {
        if (_folderShield2Fill != null) return _folderShield2Fill!!
        _folderShield2Fill = remixIcon(
            name = "FolderShield2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 10h-10v7.382c0 1.408 .632 2.734 1.705 3.618h-10.705C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h7.414l2 2h8.586c.552 0 1 .448 1 1v4ZM14 12h8v5.382c0 .896-.446 1.733-1.188 2.231L18 21.498 15.188 19.613C14.446 19.116 14 18.279 14 17.382v-5.382Z"),
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
        return _folderShield2Fill!!
    }

private var _folderShield2Fill: ImageVector? = null
