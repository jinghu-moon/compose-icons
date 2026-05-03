package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderCloudLine: ImageVector
    get() {
        if (_folderCloudLine != null) return _folderCloudLine!!
        _folderCloudLine = remixIcon(
            name = "FolderCloudLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 3.000 C 2.448 3.000 2.000 3.448 2.000 4.000 L 2.000 20.000 C 2.000 20.552 2.448 21.000 3.000 21.000 L 10.000 21.000 L 10.000 19.000 L 4.000 19.000 L 4.000 5.000 L 9.586 5.000 L 11.586 7.000 L 20.000 7.000 L 20.000 11.000 L 22.000 11.000 L 22.000 6.000 C 22.000 5.448 21.552 5.000 21.000 5.000 L 12.414 5.000 L 10.414 3.000 L 3.000 3.000 ZM 12.000 18.250 C 12.000 16.991 12.847 15.929 14.002 15.603 C 13.945 13.658 15.552 12.000 17.500 12.000 C 19.448 12.000 21.055 13.658 20.999 15.603 C 22.153 15.929 23.000 16.991 23.000 18.250 C 23.000 19.769 21.769 21.000 20.250 21.000 L 14.750 21.000 C 13.231 21.000 12.000 19.769 12.000 18.250 ZM 17.500 14.000 C 16.672 14.000 16.000 14.672 16.000 15.500 C 16.000 15.964 16.024 16.475 16.057 16.961 C 15.093 17.165 14.000 17.552 14.000 18.250 C 14.000 18.664 14.336 19.000 14.750 19.000 L 20.250 19.000 C 20.664 19.000 21.000 18.664 21.000 18.250 C 21.000 17.552 19.907 17.165 18.943 16.961 C 18.976 16.475 19.000 15.964 19.000 15.500 C 19.000 14.672 18.328 14.000 17.500 14.000 Z"),
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
        return _folderCloudLine!!
    }

private var _folderCloudLine: ImageVector? = null
