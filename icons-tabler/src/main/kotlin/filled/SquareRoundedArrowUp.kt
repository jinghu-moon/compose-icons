package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedArrowUp: ImageVector
    get() {
        if (_squareRoundedArrowUp != null) return _squareRoundedArrowUp!!
        _squareRoundedArrowUp = tablerFilledIcon(
            name = "SquareRoundedArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 11.782 2.000 11.568 2.002 11.358 2.005 L 10.742 2.022 L 10.443 2.035 L 9.864 2.069 L 9.311 2.115 C 4.526 2.579 2.579 4.526 2.115 9.311 L 2.069 9.864 L 2.035 10.443 C 2.030 10.541 2.025 10.641 2.022 10.742 L 2.005 11.358 L 2.001 11.676 L 2.000 12.000 C 2.000 12.218 2.002 12.432 2.005 12.642 L 2.022 13.258 L 2.035 13.557 L 2.069 14.136 L 2.115 14.689 C 2.579 19.474 4.526 21.421 9.311 21.885 L 9.864 21.931 L 10.443 21.965 C 10.541 21.970 10.641 21.975 10.742 21.978 L 11.358 21.995 L 12.000 22.000 L 12.642 21.995 L 13.258 21.978 L 13.557 21.965 L 14.136 21.931 L 14.689 21.885 C 19.474 21.421 21.421 19.474 21.885 14.689 L 21.931 14.136 L 21.965 13.557 C 21.970 13.459 21.975 13.359 21.978 13.258 L 21.995 12.642 L 22.000 12.000 L 21.995 11.358 L 21.978 10.742 L 21.965 10.443 L 21.931 9.864 L 21.885 9.311 C 21.421 4.526 19.474 2.579 14.689 2.115 L 14.136 2.069 L 13.557 2.035 C 13.457 2.030 13.358 2.026 13.258 2.022 L 12.642 2.005 L 12.324 2.001 L 12.000 2.000 ZM 11.852 7.011 L 11.910 7.004 L 12.000 7.000 L 12.075 7.003 L 12.201 7.020 L 12.312 7.050 L 12.423 7.094 L 12.521 7.146 L 12.625 7.220 L 12.707 7.293 L 16.707 11.293 C 17.079 11.666 17.097 12.265 16.749 12.660 C 16.400 13.056 15.804 13.113 15.387 12.790 L 15.293 12.707 L 13.000 10.415 L 13.000 16.000 C 12.999 16.529 12.587 16.966 12.059 16.997 C 11.530 17.028 11.069 16.642 11.007 16.117 L 11.000 16.000 L 11.000 10.415 L 8.707 12.707 C 8.351 13.063 7.785 13.099 7.387 12.790 L 7.293 12.707 C 6.937 12.351 6.901 11.785 7.210 11.387 L 7.293 11.293 L 11.293 7.293 C 11.328 7.258 11.365 7.225 11.405 7.196 L 11.515 7.125 L 11.629 7.071 L 11.734 7.036 L 11.852 7.011 Z"),
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
        return _squareRoundedArrowUp!!
    }

private var _squareRoundedArrowUp: ImageVector? = null
