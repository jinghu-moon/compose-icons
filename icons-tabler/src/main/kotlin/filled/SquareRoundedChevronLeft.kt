package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedChevronLeft: ImageVector
    get() {
        if (_squareRoundedChevronLeft != null) return _squareRoundedChevronLeft!!
        _squareRoundedChevronLeft = tablerFilledIcon(
            name = "SquareRoundedChevronLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 12.324 2.001 L 12.642 2.005 L 13.258 2.022 L 13.557 2.035 L 14.136 2.069 L 14.689 2.115 C 19.474 2.579 21.421 4.526 21.885 9.311 L 21.931 9.864 L 21.965 10.443 C 21.970 10.541 21.975 10.641 21.978 10.742 L 21.995 11.358 L 22.000 12.000 L 21.995 12.642 L 21.978 13.258 L 21.965 13.557 L 21.931 14.136 L 21.885 14.689 C 21.421 19.474 19.474 21.421 14.689 21.885 L 14.136 21.931 L 13.557 21.965 C 13.459 21.970 13.359 21.975 13.258 21.978 L 12.642 21.995 L 12.000 22.000 L 11.358 21.995 L 10.742 21.978 L 10.443 21.965 L 9.864 21.931 L 9.311 21.885 C 4.526 21.421 2.579 19.474 2.115 14.689 L 2.069 14.136 L 2.035 13.557 C 2.030 13.457 2.026 13.358 2.022 13.258 L 2.005 12.642 C 2.002 12.432 2.000 12.218 2.000 12.000 L 2.001 11.676 L 2.005 11.358 L 2.022 10.742 L 2.035 10.443 L 2.069 9.864 L 2.115 9.311 C 2.579 4.526 4.526 2.579 9.311 2.115 L 9.864 2.069 L 10.443 2.035 C 10.541 2.030 10.641 2.025 10.742 2.022 L 11.358 2.005 C 11.568 2.002 11.782 2.000 12.000 2.000 ZM 13.707 8.293 C 13.316 7.903 12.684 7.903 12.293 8.293 L 9.293 11.293 L 9.210 11.387 C 8.901 11.785 8.937 12.351 9.293 12.707 L 12.293 15.707 L 12.387 15.790 C 12.785 16.099 13.351 16.063 13.707 15.707 L 13.790 15.613 C 14.099 15.215 14.063 14.649 13.707 14.293 L 11.415 12.000 L 13.707 9.707 L 13.790 9.613 C 14.099 9.215 14.063 8.649 13.707 8.293 Z"),
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
        return _squareRoundedChevronLeft!!
    }

private var _squareRoundedChevronLeft: ImageVector? = null
