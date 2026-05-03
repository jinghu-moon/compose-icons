package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileCloudFill: ImageVector
    get() {
        if (_fileCloudFill != null) return _fileCloudFill!!
        _fileCloudFill = remixIcon(
            name = "FileCloudFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.997 2.000 L 21.000 8.000 L 21.001 12.261 C 20.050 11.472 18.830 11.000 17.500 11.000 L 17.279 11.004 C 14.784 11.103 12.716 12.863 12.152 15.209 L 12.136 15.283 L 12.107 15.302 C 10.822 16.163 10.000 17.625 10.000 19.250 C 10.000 20.273 10.324 21.223 10.877 22.001 L 3.993 22.000 C 3.484 22.000 3.064 21.617 3.007 21.124 L 3.000 21.008 L 3.000 2.992 C 3.000 2.494 3.387 2.065 3.885 2.007 L 4.002 2.000 L 14.997 2.000 ZM 17.500 13.000 C 19.433 13.000 21.000 14.567 21.000 16.500 L 20.999 16.603 C 22.153 16.928 23.000 17.990 23.000 19.250 C 23.000 20.712 21.858 21.908 20.417 21.995 L 20.250 22.000 L 14.750 22.000 L 14.583 21.995 C 13.142 21.908 12.000 20.712 12.000 19.250 C 12.000 17.990 12.847 16.928 14.003 16.603 L 14.000 16.500 C 14.000 14.567 15.567 13.000 17.500 13.000 Z"),
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
        return _fileCloudFill!!
    }

private var _fileCloudFill: ImageVector? = null
