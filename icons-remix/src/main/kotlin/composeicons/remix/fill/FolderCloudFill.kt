package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FolderCloudFill: ImageVector
    get() {
        if (_folderCloudFill != null) return _folderCloudFill!!
        _folderCloudFill = remixIcon(
            name = "FolderCloudFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 4C2 3.448 2.448 3 3 3h7.414l2 2h8.586c.552 0 1 .448 1 1v6.36C21.002 10.941 19.354 10 17.5 10c-2.602 0-4.799 1.853-5.361 4.282C10.851 15.131 10 16.589 10 18.25c0 1.025 .325 1.974 .877 2.75h-7.877C2.448 21 2 20.552 2 20v-16ZM14.002 15.603C12.847 15.929 12 16.991 12 18.25 12 19.769 13.231 21 14.75 21h5.5C21.769 21 23 19.769 23 18.25c0-1.259-.847-2.321-2.001-2.647C21.055 13.658 19.448 12 17.5 12c-1.948 0-3.555 1.658-3.498 3.603Z"),
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
        return _folderCloudFill!!
    }

private var _folderCloudFill: ImageVector? = null
