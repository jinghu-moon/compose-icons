package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FolderCheckFill: ImageVector
    get() {
        if (_folderCheckFill != null) return _folderCheckFill!!
        _folderCheckFill = remixIcon(
            name = "FolderCheckFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 13.000 C 20.093 13.000 21.118 13.292 22.000 13.803 L 22.000 6.000 C 22.000 5.448 21.552 5.000 21.000 5.000 L 12.414 5.000 L 10.414 3.000 L 3.000 3.000 C 2.448 3.000 2.000 3.448 2.000 4.000 L 2.000 20.000 C 2.000 20.552 2.448 21.000 3.000 21.000 L 13.341 21.000 C 13.120 20.374 13.000 19.701 13.000 19.000 C 13.000 15.686 15.686 13.000 19.000 13.000 ZM 15.465 18.465 L 19.000 22.000 L 23.950 17.051 L 22.535 15.636 L 19.000 19.172 L 16.879 17.051 L 15.465 18.465 Z"),
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
        return _folderCheckFill!!
    }

private var _folderCheckFill: ImageVector? = null
