package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedChevronsDown: ImageVector
    get() {
        if (_squareRoundedChevronsDown != null) return _squareRoundedChevronsDown!!
        _squareRoundedChevronsDown = tablerFilledIcon(
            name = "SquareRoundedChevronsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 11.782 2.000 11.568 2.002 11.358 2.005 L 10.742 2.022 L 10.443 2.035 L 9.864 2.069 L 9.311 2.115 C 4.526 2.579 2.579 4.526 2.115 9.311 L 2.069 9.864 L 2.035 10.443 C 2.030 10.541 2.025 10.641 2.022 10.742 L 2.005 11.358 L 2.001 11.676 L 2.000 12.000 C 2.000 12.218 2.002 12.432 2.005 12.642 L 2.022 13.258 L 2.035 13.557 L 2.069 14.136 L 2.115 14.689 C 2.579 19.474 4.526 21.421 9.311 21.885 L 9.864 21.931 L 10.443 21.965 C 10.541 21.970 10.641 21.975 10.742 21.978 L 11.358 21.995 L 12.000 22.000 L 12.642 21.995 L 13.258 21.978 L 13.557 21.965 L 14.136 21.931 L 14.689 21.885 C 19.474 21.421 21.421 19.474 21.885 14.689 L 21.931 14.136 L 21.965 13.557 C 21.970 13.459 21.975 13.359 21.978 13.258 L 21.995 12.642 L 22.000 12.000 L 21.995 11.358 L 21.978 10.742 L 21.965 10.443 L 21.931 9.864 L 21.885 9.311 C 21.421 4.526 19.474 2.579 14.689 2.115 L 14.136 2.069 L 13.557 2.035 C 13.457 2.030 13.358 2.026 13.258 2.022 L 12.642 2.005 L 12.324 2.001 L 12.000 2.000 ZM 8.293 8.293 C 8.649 7.937 9.215 7.901 9.613 8.210 L 9.707 8.293 L 12.000 10.585 L 14.293 8.293 C 14.649 7.937 15.215 7.901 15.613 8.210 L 15.707 8.293 C 16.063 8.649 16.099 9.215 15.790 9.613 L 15.707 9.707 L 12.707 12.707 C 12.351 13.063 11.785 13.099 11.387 12.790 L 11.293 12.707 L 8.293 9.707 C 7.903 9.316 7.903 8.684 8.293 8.293 ZM 8.293 12.293 C 8.649 11.937 9.215 11.901 9.613 12.210 L 9.707 12.293 L 12.000 14.585 L 14.293 12.293 C 14.649 11.937 15.215 11.901 15.613 12.210 L 15.707 12.293 C 16.063 12.649 16.099 13.215 15.790 13.613 L 15.707 13.707 L 12.707 16.707 C 12.351 17.063 11.785 17.099 11.387 16.790 L 11.293 16.707 L 8.293 13.707 C 7.903 13.316 7.903 12.684 8.293 12.293 Z"),
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
        return _squareRoundedChevronsDown!!
    }

private var _squareRoundedChevronsDown: ImageVector? = null
