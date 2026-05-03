package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Camera: ImageVector
    get() {
        if (_camera != null) return _camera!!
        _camera = tablerFilledIcon(
            name = "Camera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 3.000 C 16.047 3.000 16.917 3.806 16.995 4.850 L 17.000 5.000 C 17.000 5.507 17.380 5.934 17.883 5.993 L 18.000 6.000 L 19.000 6.000 C 20.589 6.000 21.902 7.238 21.995 8.824 L 22.000 9.000 L 22.000 18.000 C 22.000 19.589 20.762 20.902 19.176 20.995 L 19.000 21.000 L 5.000 21.000 C 3.411 21.000 2.098 19.762 2.005 18.176 L 2.000 18.000 L 2.000 9.000 C 2.000 7.411 3.238 6.098 4.824 6.005 L 5.000 6.000 L 6.000 6.000 C 6.552 6.000 7.000 5.552 7.000 5.000 C 7.000 3.953 7.806 3.083 8.850 3.005 L 9.000 3.000 L 15.000 3.000 ZM 12.000 10.000 C 10.460 10.000 9.170 11.166 9.015 12.698 L 9.004 12.850 L 9.000 13.000 L 9.004 13.150 C 9.086 14.785 10.464 16.053 12.100 15.998 C 13.737 15.944 15.027 14.587 15.000 12.950 C 14.972 11.313 13.637 10.000 12.000 10.000 Z"),
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
        return _camera!!
    }

private var _camera: ImageVector? = null
