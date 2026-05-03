package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Binoculars: ImageVector
    get() {
        if (_binoculars != null) return _binoculars!!
        _binoculars = tablerFilledIcon(
            name = "Binoculars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.887 6.748 C 8.724 6.748 8.550 6.764 8.381 6.805 C 8.209 6.846 7.799 6.970 7.543 7.367 L 7.529 7.387 L 6.922 8.437 C 6.615 8.642 6.388 8.897 6.229 9.154 L 6.215 9.174 L 3.643 13.824 C 3.540 13.982 3.449 14.147 3.369 14.318 L 3.363 14.328 C 3.123 14.853 2.999 15.423 3.000 16.000 C 3.000 18.209 4.791 20.000 7.000 20.000 C 9.209 20.000 11.000 18.209 11.000 16.000 L 11.000 15.000 L 13.000 15.000 L 13.000 16.000 C 13.000 17.636 13.997 19.107 15.516 19.714 C 17.036 20.321 18.772 19.941 19.899 18.755 C 21.026 17.570 21.318 15.817 20.635 14.330 L 20.631 14.318 C 20.551 14.147 20.460 13.982 20.357 13.824 L 17.785 9.174 L 17.771 9.154 C 17.594 8.868 17.358 8.624 17.078 8.438 L 16.471 7.387 L 16.457 7.367 C 16.201 6.970 15.790 6.847 15.619 6.805 C 15.401 6.755 15.178 6.738 14.955 6.754 C 14.721 6.767 14.491 6.820 14.275 6.910 C 14.091 6.991 13.637 7.237 13.521 7.799 L 13.514 7.836 L 13.374 8.936 C 13.154 9.219 13.000 9.576 13.000 10.000 L 13.000 11.000 L 11.000 11.000 L 11.000 10.000 C 11.000 9.576 10.846 9.219 10.627 8.936 L 10.487 7.836 L 10.479 7.799 C 10.363 7.237 9.909 6.991 9.725 6.910 C 9.509 6.820 9.279 6.767 9.045 6.754 C 8.992 6.750 8.940 6.748 8.887 6.748 ZM 7.000 14.000 C 7.883 14.000 8.662 14.580 8.915 15.427 C 9.168 16.273 8.836 17.185 8.098 17.671 C 7.360 18.156 6.391 18.100 5.714 17.533 C 5.037 16.965 4.813 16.020 5.162 15.209 L 5.352 14.867 C 5.712 14.344 6.316 14.000 7.000 14.000 ZM 17.000 14.000 C 17.684 14.000 18.288 14.344 18.648 14.867 L 18.838 15.209 C 19.187 16.020 18.963 16.965 18.286 17.533 C 17.609 18.100 16.640 18.156 15.902 17.671 C 15.164 17.185 14.832 16.273 15.085 15.427 C 15.338 14.580 16.117 14.000 17.000 14.000 Z"),
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
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
