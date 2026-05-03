package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Assembly: ImageVector
    get() {
        if (_assembly != null) return _assembly!!
        _assembly = tablerFilledIcon(
            name = "Assembly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.666 1.429 L 20.416 5.409 Q 20.516 5.469 20.596 5.542 L 20.605 5.550 L 20.711 5.625 C 21.470 6.194 21.940 7.068 21.995 8.015 L 22.000 8.218 L 22.000 15.502 C 22.000 16.677 21.357 17.758 20.377 18.295 L 13.573 22.597 C 12.593 23.135 11.407 23.135 10.373 22.565 L 3.678 18.328 C 2.645 17.762 2.002 16.679 2.000 15.502 L 2.000 8.217 C 1.999 7.051 2.631 5.976 3.650 5.409 L 10.425 1.414 C 11.435 0.860 12.660 0.865 13.665 1.429M 13.025 6.772 C 12.407 6.416 11.648 6.411 11.025 6.758 L 8.002 8.562 C 7.380 8.918 6.997 9.581 7.000 10.298 L 7.000 13.576 C 7.000 14.303 7.394 14.973 8.030 15.326 L 10.976 17.216 C 11.633 17.583 12.366 17.583 12.970 17.249 L 16.024 15.294 C 16.606 14.972 17.000 14.302 17.000 13.575 L 17.000 10.298 L 16.995 10.134 C 16.953 9.591 16.691 9.089 16.270 8.743 L 16.178 8.673 L 16.122 8.626 C 16.091 8.603 16.059 8.581 16.026 8.562 Z"),
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
        return _assembly!!
    }

private var _assembly: ImageVector? = null
