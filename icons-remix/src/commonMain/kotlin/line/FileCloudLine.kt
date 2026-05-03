package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileCloudLine: ImageVector
    get() {
        if (_fileCloudLine != null) return _fileCloudLine!!
        _fileCloudLine = remixIcon(
            name = "FileCloudLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.997 2.000 L 21.000 8.000 L 21.001 12.261 C 20.422 11.781 19.743 11.418 19.001 11.207 L 19.000 9.000 L 14.000 9.000 L 14.000 4.000 L 5.000 4.000 L 5.000 20.000 L 10.059 20.001 C 10.176 20.736 10.462 21.417 10.877 22.001 L 3.993 22.000 C 3.484 22.000 3.064 21.617 3.007 21.124 L 3.000 21.008 L 3.000 2.992 C 3.000 2.494 3.387 2.065 3.885 2.007 L 4.002 2.000 L 14.997 2.000 ZM 17.500 13.000 C 19.433 13.000 21.000 14.567 21.000 16.500 L 20.999 16.603 C 22.153 16.928 23.000 17.990 23.000 19.250 C 23.000 20.712 21.858 21.908 20.417 21.995 L 20.250 22.000 L 14.750 22.000 L 14.583 21.995 C 13.142 21.908 12.000 20.712 12.000 19.250 C 12.000 17.990 12.847 16.928 14.003 16.603 L 14.000 16.500 C 14.000 14.567 15.567 13.000 17.500 13.000 ZM 17.500 15.000 C 16.769 15.000 16.160 15.523 16.027 16.215 L 16.007 16.355 L 16.000 16.500 L 16.000 18.120 L 14.556 18.526 C 14.156 18.633 13.918 19.044 14.026 19.444 C 14.105 19.740 14.351 19.948 14.636 19.992 L 14.745 20.000 L 20.255 20.000 C 20.585 19.998 20.885 19.778 20.974 19.444 C 21.082 19.044 20.844 18.633 20.444 18.526 L 19.432 18.243 L 19.000 18.120 L 19.000 16.500 L 18.993 16.355 C 18.920 15.595 18.280 15.000 17.500 15.000 Z"),
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
        return _fileCloudLine!!
    }

private var _fileCloudLine: ImageVector? = null
