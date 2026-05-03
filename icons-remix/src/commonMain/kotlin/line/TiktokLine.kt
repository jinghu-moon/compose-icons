package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TiktokLine: ImageVector
    get() {
        if (_tiktokLine != null) return _tiktokLine!!
        _tiktokLine = remixIcon(
            name = "TiktokLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 2.000 L 11.000 8.414 C 10.595 8.339 10.177 8.300 9.750 8.300 C 5.967 8.300 2.900 11.367 2.900 15.150 C 2.900 18.933 5.967 22.000 9.750 22.000 C 13.533 22.000 16.600 18.933 16.600 15.150 L 16.600 11.414 C 17.637 11.854 18.766 12.100 20.000 12.100 L 21.000 12.100 L 21.000 6.500 L 20.000 6.500 C 18.097 6.500 16.600 4.963 16.600 3.000 L 16.600 2.000 L 11.000 2.000 ZM 13.000 4.000 L 14.688 4.000 C 15.082 6.220 16.767 7.996 19.000 8.409 L 19.000 10.028 C 17.962 9.876 17.025 9.486 16.157 8.905 L 14.600 7.863 L 14.600 15.150 C 14.600 17.829 12.429 20.000 9.750 20.000 C 7.072 20.000 4.900 17.829 4.900 15.150 C 4.900 12.471 7.072 10.300 9.750 10.300 C 9.834 10.300 9.918 10.302 10.000 10.306 L 10.000 11.910 C 9.918 11.903 9.835 11.900 9.750 11.900 C 7.955 11.900 6.500 13.355 6.500 15.150 C 6.500 16.945 7.955 18.400 9.750 18.400 C 11.545 18.400 13.000 16.945 13.000 15.150 C 13.000 11.433 12.999 7.717 13.000 4.000 ZM 8.500 15.150 C 8.500 14.460 9.060 13.900 9.750 13.900 C 10.441 13.900 11.000 14.460 11.000 15.150 C 11.000 15.840 10.441 16.400 9.750 16.400 C 9.060 16.400 8.500 15.840 8.500 15.150 Z"),
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
        return _tiktokLine!!
    }

private var _tiktokLine: ImageVector? = null
