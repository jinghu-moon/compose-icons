package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedChevronsLeft: ImageVector
    get() {
        if (_squareRoundedChevronsLeft != null) return _squareRoundedChevronsLeft!!
        _squareRoundedChevronsLeft = tablerFilledIcon(
            name = "SquareRoundedChevronsLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 11.782 2.000 11.568 2.002 11.358 2.005 L 10.742 2.022 L 10.443 2.035 L 9.864 2.069 L 9.311 2.115 C 4.526 2.579 2.579 4.526 2.115 9.311 L 2.069 9.864 L 2.035 10.443 C 2.030 10.541 2.025 10.641 2.022 10.742 L 2.005 11.358 L 2.001 11.676 L 2.000 12.000 C 2.000 12.218 2.002 12.432 2.005 12.642 L 2.022 13.258 L 2.035 13.557 L 2.069 14.136 L 2.115 14.689 C 2.579 19.474 4.526 21.421 9.311 21.885 L 9.864 21.931 L 10.443 21.965 C 10.541 21.970 10.641 21.975 10.742 21.978 L 11.358 21.995 L 12.000 22.000 L 12.642 21.995 L 13.258 21.978 L 13.557 21.965 L 14.136 21.931 L 14.689 21.885 C 19.474 21.421 21.421 19.474 21.885 14.689 L 21.931 14.136 L 21.965 13.557 C 21.970 13.459 21.975 13.359 21.978 13.258 L 21.995 12.642 L 22.000 12.000 L 21.995 11.358 L 21.978 10.742 L 21.965 10.443 L 21.931 9.864 L 21.885 9.311 C 21.421 4.526 19.474 2.579 14.689 2.115 L 14.136 2.069 L 13.557 2.035 C 13.457 2.030 13.358 2.026 13.258 2.022 L 12.642 2.005 L 12.324 2.001 L 12.000 2.000 ZM 14.293 8.293 C 14.666 7.921 15.265 7.903 15.660 8.251 C 16.056 8.600 16.113 9.196 15.790 9.613 L 15.707 9.707 L 13.415 12.000 L 15.707 14.293 C 16.063 14.649 16.099 15.215 15.790 15.613 L 15.707 15.707 C 15.351 16.063 14.785 16.099 14.387 15.790 L 14.293 15.707 L 11.293 12.707 C 10.937 12.351 10.901 11.785 11.210 11.387 L 11.293 11.293 L 14.293 8.293 ZM 10.293 8.293 C 10.666 7.921 11.265 7.903 11.660 8.251 C 12.056 8.600 12.113 9.196 11.790 9.613 L 11.707 9.707 L 9.415 12.000 L 11.707 14.293 C 12.063 14.649 12.099 15.215 11.790 15.613 L 11.707 15.707 C 11.351 16.063 10.785 16.099 10.387 15.790 L 10.293 15.707 L 7.293 12.707 C 6.937 12.351 6.901 11.785 7.210 11.387 L 7.293 11.293 L 10.293 8.293 Z"),
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
        return _squareRoundedChevronsLeft!!
    }

private var _squareRoundedChevronsLeft: ImageVector? = null
