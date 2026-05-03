package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BilibiliFill: ImageVector
    get() {
        if (_bilibiliFill != null) return _bilibiliFill!!
        _bilibiliFill = remixIcon(
            name = "BilibiliFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.223 3.086 C 18.711 3.574 18.711 4.366 18.223 4.854 L 17.080 5.996 L 18.250 5.997 C 20.321 5.997 22.000 7.676 22.000 9.747 L 22.000 17.247 C 22.000 19.318 20.321 20.997 18.250 20.997 L 5.750 20.997 C 3.679 20.997 2.000 19.318 2.000 17.247 L 2.000 9.747 C 2.000 7.676 3.679 5.997 5.750 5.997 L 6.916 5.996 L 5.775 4.855 C 5.287 4.367 5.287 3.575 5.775 3.087 C 6.263 2.599 7.054 2.599 7.542 3.087 L 10.194 5.739 C 10.273 5.818 10.339 5.904 10.392 5.996 L 13.605 5.997 C 13.658 5.904 13.724 5.817 13.804 5.738 L 16.455 3.086 C 16.943 2.598 17.735 2.598 18.223 3.086 ZM 18.250 8.507 L 5.750 8.507 C 5.091 8.507 4.551 9.017 4.503 9.663 L 4.500 9.757 L 4.500 17.257 C 4.500 17.916 5.010 18.455 5.657 18.503 L 5.750 18.507 L 18.250 18.507 C 18.909 18.507 19.449 17.997 19.497 17.350 L 19.500 17.257 L 19.500 9.757 C 19.500 9.066 18.940 8.507 18.250 8.507 ZM 8.250 11.007 C 8.940 11.007 9.500 11.566 9.500 12.257 L 9.500 13.507 C 9.500 14.197 8.940 14.757 8.250 14.757 C 7.560 14.757 7.000 14.197 7.000 13.507 L 7.000 12.257 C 7.000 11.566 7.560 11.007 8.250 11.007 ZM 15.750 11.007 C 16.440 11.007 17.000 11.566 17.000 12.257 L 17.000 13.507 C 17.000 14.197 16.440 14.757 15.750 14.757 C 15.060 14.757 14.500 14.197 14.500 13.507 L 14.500 12.257 C 14.500 11.566 15.060 11.007 15.750 11.007 Z"),
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
        return _bilibiliFill!!
    }

private var _bilibiliFill: ImageVector? = null
