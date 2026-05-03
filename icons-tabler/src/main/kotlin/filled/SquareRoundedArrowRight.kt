package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedArrowRight: ImageVector
    get() {
        if (_squareRoundedArrowRight != null) return _squareRoundedArrowRight!!
        _squareRoundedArrowRight = tablerFilledIcon(
            name = "SquareRoundedArrowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 11.782 2.000 11.568 2.002 11.358 2.005 L 10.742 2.022 L 10.443 2.035 L 9.864 2.069 L 9.311 2.115 C 4.526 2.579 2.579 4.526 2.115 9.311 L 2.069 9.864 L 2.035 10.443 C 2.030 10.541 2.025 10.641 2.022 10.742 L 2.005 11.358 L 2.001 11.676 L 2.000 12.000 C 2.000 12.218 2.002 12.432 2.005 12.642 L 2.022 13.258 L 2.035 13.557 L 2.069 14.136 L 2.115 14.689 C 2.579 19.474 4.526 21.421 9.311 21.885 L 9.864 21.931 L 10.443 21.965 C 10.541 21.970 10.641 21.975 10.742 21.978 L 11.358 21.995 L 12.000 22.000 L 12.642 21.995 L 13.258 21.978 L 13.557 21.965 L 14.136 21.931 L 14.689 21.885 C 19.474 21.421 21.421 19.474 21.885 14.689 L 21.931 14.136 L 21.965 13.557 C 21.970 13.459 21.975 13.359 21.978 13.258 L 21.995 12.642 L 22.000 12.000 L 21.995 11.358 L 21.978 10.742 L 21.965 10.443 L 21.931 9.864 L 21.885 9.311 C 21.421 4.526 19.474 2.579 14.689 2.115 L 14.136 2.069 L 13.557 2.035 C 13.457 2.030 13.358 2.026 13.258 2.022 L 12.642 2.005 L 12.324 2.001 L 12.000 2.000 ZM 12.613 7.210 L 12.707 7.293 L 16.707 11.293 C 16.742 11.328 16.775 11.365 16.804 11.405 L 16.875 11.515 L 16.929 11.629 L 16.964 11.734 L 16.994 11.882 L 17.000 12.000 L 16.997 12.075 L 16.980 12.201 L 16.950 12.312 L 16.906 12.423 L 16.854 12.521 L 16.780 12.625 L 16.707 12.707 L 12.707 16.707 C 12.334 17.079 11.735 17.097 11.340 16.749 C 10.944 16.400 10.887 15.804 11.210 15.387 L 11.293 15.293 L 13.585 13.000 L 8.000 13.000 C 7.471 12.999 7.034 12.587 7.003 12.059 C 6.972 11.530 7.358 11.069 7.883 11.007 L 8.000 11.000 L 13.585 11.000 L 11.293 8.707 C 10.937 8.351 10.901 7.785 11.210 7.387 L 11.293 7.293 C 11.649 6.937 12.215 6.901 12.613 7.210 Z"),
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
        return _squareRoundedArrowRight!!
    }

private var _squareRoundedArrowRight: ImageVector? = null
