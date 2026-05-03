package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedNumber0: ImageVector
    get() {
        if (_squareRoundedNumber0 != null) return _squareRoundedNumber0!!
        _squareRoundedNumber0 = tablerFilledIcon(
            name = "SquareRoundedNumber0",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 L 12.642 2.005 L 13.258 2.022 L 13.557 2.035 L 14.136 2.069 L 14.689 2.115 C 19.376 2.570 21.339 4.448 21.855 9.021 L 21.885 9.311 L 21.931 9.864 L 21.972 10.591 L 21.978 10.741 L 21.995 11.358 L 22.000 12.000 L 21.995 12.642 L 21.978 13.258 L 21.965 13.557 L 21.931 14.136 L 21.885 14.689 C 21.430 19.376 19.552 21.339 14.979 21.855 L 14.689 21.885 L 14.136 21.931 L 13.409 21.972 L 13.259 21.978 L 12.642 21.995 L 12.000 22.000 L 11.358 21.995 L 10.742 21.978 L 10.443 21.965 L 9.864 21.931 L 9.311 21.885 C 4.624 21.430 2.661 19.552 2.145 14.979 L 2.115 14.689 L 2.069 14.136 L 2.028 13.409 L 2.022 13.259 L 2.005 12.642 L 2.001 12.324 L 2.001 11.676 L 2.005 11.358 L 2.022 10.742 L 2.035 10.443 L 2.069 9.864 L 2.115 9.311 C 2.570 4.624 4.448 2.661 9.021 2.145 L 9.311 2.115 L 9.864 2.069 L 10.591 2.028 L 10.741 2.022 L 11.358 2.005 C 11.568 2.002 11.782 2.000 12.000 2.000 ZM 12.000 7.000 C 10.343 7.000 9.000 8.343 9.000 10.000 L 9.000 14.000 C 9.000 15.657 10.343 17.000 12.000 17.000 C 13.657 17.000 15.000 15.657 15.000 14.000 L 15.000 10.000 C 15.000 8.343 13.657 7.000 12.000 7.000 ZM 12.000 9.000 C 12.552 9.000 13.000 9.448 13.000 10.000 L 13.000 14.000 C 13.000 14.552 12.552 15.000 12.000 15.000 C 11.448 15.000 11.000 14.552 11.000 14.000 L 11.000 10.000 C 11.000 9.448 11.448 9.000 12.000 9.000 Z"),
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
        return _squareRoundedNumber0!!
    }

private var _squareRoundedNumber0: ImageVector? = null
