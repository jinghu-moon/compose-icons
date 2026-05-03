package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedArrowDown: ImageVector
    get() {
        if (_squareRoundedArrowDown != null) return _squareRoundedArrowDown!!
        _squareRoundedArrowDown = tablerFilledIcon(
            name = "SquareRoundedArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 11.782 2.000 11.568 2.002 11.358 2.005 L 10.742 2.022 L 10.443 2.035 L 9.864 2.069 L 9.311 2.115 C 4.526 2.579 2.579 4.526 2.115 9.311 L 2.069 9.864 L 2.035 10.443 C 2.030 10.541 2.025 10.641 2.022 10.742 L 2.005 11.358 L 2.001 11.676 L 2.000 12.000 C 2.000 12.218 2.002 12.432 2.005 12.642 L 2.022 13.258 L 2.035 13.557 L 2.069 14.136 L 2.115 14.689 C 2.579 19.474 4.526 21.421 9.311 21.885 L 9.864 21.931 L 10.443 21.965 C 10.541 21.970 10.641 21.975 10.742 21.978 L 11.358 21.995 L 12.000 22.000 L 12.642 21.995 L 13.258 21.978 L 13.557 21.965 L 14.136 21.931 L 14.689 21.885 C 19.474 21.421 21.421 19.474 21.885 14.689 L 21.931 14.136 L 21.965 13.557 C 21.970 13.459 21.975 13.359 21.978 13.258 L 21.995 12.642 L 22.000 12.000 L 21.995 11.358 L 21.978 10.742 L 21.965 10.443 L 21.931 9.864 L 21.885 9.311 C 21.421 4.526 19.474 2.579 14.689 2.115 L 14.136 2.069 L 13.557 2.035 C 13.457 2.030 13.358 2.026 13.258 2.022 L 12.642 2.005 L 12.324 2.001 L 12.000 2.000 ZM 12.000 7.000 C 12.507 7.000 12.934 7.380 12.993 7.883 L 13.000 8.000 L 13.000 13.585 L 15.293 11.293 C 15.649 10.937 16.215 10.901 16.613 11.210 L 16.707 11.293 C 17.063 11.649 17.099 12.215 16.790 12.613 L 16.707 12.707 L 12.707 16.707 C 12.672 16.742 12.635 16.774 12.595 16.804 L 12.485 16.875 L 12.371 16.929 L 12.266 16.964 L 12.117 16.994 L 12.000 17.000 L 11.925 16.997 L 11.799 16.980 L 11.688 16.950 L 11.577 16.906 L 11.479 16.854 L 11.387 16.790 L 11.293 16.707 L 7.293 12.707 C 6.921 12.334 6.903 11.735 7.251 11.340 C 7.600 10.944 8.196 10.887 8.613 11.210 L 8.707 11.293 L 11.000 13.585 L 11.000 8.000 C 11.000 7.448 11.448 7.000 12.000 7.000 Z"),
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
        return _squareRoundedArrowDown!!
    }

private var _squareRoundedArrowDown: ImageVector? = null
