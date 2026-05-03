package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FolderSharedFill: ImageVector
    get() {
        if (_folderSharedFill != null) return _folderSharedFill!!
        _folderSharedFill = remixIcon(
            name = "FolderSharedFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 22.000 13.126 C 21.015 12.417 19.806 12.000 18.500 12.000 C 15.186 12.000 12.500 14.686 12.500 18.000 C 12.500 19.093 12.792 20.118 13.303 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 10.414 3.000 L 12.414 5.000 L 21.000 5.000 C 21.552 5.000 22.000 5.448 22.000 6.000 L 22.000 13.126 ZM 18.000 17.000 L 18.000 13.500 L 23.000 18.000 L 18.000 22.500 L 18.000 19.000 L 15.000 19.000 L 15.000 17.000 L 18.000 17.000 Z"),
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
        return _folderSharedFill!!
    }

private var _folderSharedFill: ImageVector? = null
