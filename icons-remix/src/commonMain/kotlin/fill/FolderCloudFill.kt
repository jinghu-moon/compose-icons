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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 4.000 C 2.000 3.448 2.448 3.000 3.000 3.000 L 10.414 3.000 L 12.414 5.000 L 21.000 5.000 C 21.552 5.000 22.000 5.448 22.000 6.000 L 22.000 12.360 C 21.002 10.941 19.354 10.000 17.500 10.000 C 14.898 10.000 12.701 11.853 12.139 14.282 C 10.851 15.131 10.000 16.589 10.000 18.250 C 10.000 19.275 10.325 20.224 10.877 21.000 L 3.000 21.000 C 2.448 21.000 2.000 20.552 2.000 20.000 L 2.000 4.000 ZM 14.002 15.603 C 12.847 15.929 12.000 16.991 12.000 18.250 C 12.000 19.769 13.231 21.000 14.750 21.000 L 20.250 21.000 C 21.769 21.000 23.000 19.769 23.000 18.250 C 23.000 16.991 22.153 15.929 20.999 15.603 C 21.055 13.658 19.448 12.000 17.500 12.000 C 15.552 12.000 13.945 13.658 14.002 15.603 Z"),
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
        return _folderCloudFill!!
    }

private var _folderCloudFill: ImageVector? = null
