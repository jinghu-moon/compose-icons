package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Camera4Fill: ImageVector
    get() {
        if (_camera4Fill != null) return _camera4Fill!!
        _camera4Fill = remixIcon(
            name = "Camera4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.434 3.000 C 15.136 3.000 15.787 3.369 16.148 3.971 L 16.921 5.257 C 17.011 5.407 17.174 5.500 17.350 5.500 L 19.000 5.500 C 20.657 5.500 22.000 6.843 22.000 8.500 L 22.000 18.000 C 22.000 19.657 20.657 21.000 19.000 21.000 L 5.000 21.000 C 3.343 21.000 2.000 19.657 2.000 18.000 L 2.000 8.500 C 2.000 6.843 3.343 5.500 5.000 5.500 L 6.650 5.500 C 6.826 5.500 6.989 5.407 7.079 5.257 L 7.852 3.971 C 8.213 3.369 8.864 3.000 9.566 3.000 L 14.434 3.000 ZM 12.000 8.500 C 9.515 8.500 7.500 10.515 7.500 13.000 C 7.500 15.485 9.515 17.500 12.000 17.500 C 14.485 17.500 16.500 15.485 16.500 13.000 C 16.500 10.515 14.485 8.500 12.000 8.500 ZM 12.000 10.500 C 13.381 10.500 14.500 11.619 14.500 13.000 C 14.500 14.381 13.381 15.500 12.000 15.500 C 10.619 15.500 9.500 14.381 9.500 13.000 C 9.500 11.619 10.619 10.500 12.000 10.500 Z"),
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
        return _camera4Fill!!
    }

private var _camera4Fill: ImageVector? = null
