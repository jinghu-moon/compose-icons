package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CameraAi2Fill: ImageVector
    get() {
        if (_cameraAi2Fill != null) return _cameraAi2Fill!!
        _cameraAi2Fill = remixIcon(
            name = "CameraAi2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.434 3.000 C 15.136 3.000 15.787 3.369 16.148 3.971 L 16.921 5.257 C 17.011 5.407 17.174 5.500 17.350 5.500 L 19.000 5.500 C 20.657 5.500 22.000 6.843 22.000 8.500 L 22.000 18.000 C 22.000 19.657 20.657 21.000 19.000 21.000 L 5.000 21.000 C 3.343 21.000 2.000 19.657 2.000 18.000 L 2.000 8.500 C 2.000 6.843 3.343 5.500 5.000 5.500 L 6.650 5.500 C 6.826 5.500 6.989 5.407 7.079 5.257 L 7.852 3.971 C 8.213 3.369 8.864 3.000 9.566 3.000 L 14.434 3.000 ZM 12.471 9.317 C 12.294 8.891 11.706 8.891 11.529 9.317 L 11.276 9.929 C 10.844 10.972 10.038 11.804 9.025 12.255 L 8.308 12.574 C 7.897 12.757 7.897 13.354 8.308 13.537 L 9.067 13.875 C 10.055 14.314 10.848 15.117 11.287 16.126 L 11.533 16.691 C 11.714 17.105 12.286 17.105 12.467 16.691 L 12.714 16.126 C 13.153 15.117 13.945 14.314 14.933 13.875 L 15.692 13.537 C 16.103 13.354 16.103 12.757 15.692 12.574 L 14.975 12.255 C 13.962 11.804 13.156 10.972 12.724 9.929 L 12.471 9.317 Z"),
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
        return _cameraAi2Fill!!
    }

private var _cameraAi2Fill: ImageVector? = null
