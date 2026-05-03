package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedNumber5: ImageVector
    get() {
        if (_squareRoundedNumber5 != null) return _squareRoundedNumber5!!
        _squareRoundedNumber5 = tablerFilledIcon(
            name = "SquareRoundedNumber5",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 L 12.642 2.005 L 13.258 2.022 L 13.557 2.035 L 14.136 2.069 L 14.689 2.115 C 19.376 2.570 21.339 4.448 21.855 9.021 L 21.885 9.311 L 21.931 9.864 L 21.972 10.591 L 21.978 10.741 L 21.995 11.358 L 22.000 12.000 L 21.995 12.642 L 21.978 13.258 L 21.965 13.557 L 21.931 14.136 L 21.885 14.689 C 21.430 19.376 19.552 21.339 14.979 21.855 L 14.689 21.885 L 14.136 21.931 L 13.409 21.972 L 13.259 21.978 L 12.642 21.995 L 12.000 22.000 L 11.358 21.995 L 10.742 21.978 L 10.443 21.965 L 9.864 21.931 L 9.311 21.885 C 4.624 21.430 2.661 19.552 2.145 14.979 L 2.115 14.689 L 2.069 14.136 L 2.028 13.409 L 2.022 13.259 L 2.005 12.642 L 2.001 12.324 L 2.001 11.676 L 2.005 11.358 L 2.022 10.742 L 2.035 10.443 L 2.069 9.864 L 2.115 9.311 C 2.570 4.624 4.448 2.661 9.021 2.145 L 9.311 2.115 L 9.864 2.069 L 10.591 2.028 L 10.741 2.022 L 11.358 2.005 C 11.568 2.002 11.782 2.000 12.000 2.000 ZM 14.000 7.000 L 10.000 7.000 C 9.493 7.000 9.066 7.380 9.007 7.883 L 9.000 8.000 L 9.000 12.000 C 9.000 12.507 9.380 12.934 9.883 12.993 L 10.000 13.000 L 13.000 13.000 L 13.000 15.000 L 11.000 15.000 L 10.993 14.883 C 10.931 14.358 10.470 13.972 9.941 14.003 C 9.413 14.034 9.001 14.471 9.000 15.000 C 9.000 16.047 9.806 16.917 10.850 16.995 L 11.000 17.000 L 13.000 17.000 C 14.047 17.000 14.917 16.194 14.995 15.150 L 15.000 15.000 L 15.000 13.000 C 15.000 11.953 14.194 11.083 13.150 11.005 L 13.000 11.000 L 11.000 11.000 L 11.000 9.000 L 14.000 9.000 C 14.507 9.000 14.934 8.620 14.993 8.117 L 15.000 8.000 C 15.000 7.493 14.620 7.066 14.117 7.007 L 14.000 7.000 Z"),
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
        return _squareRoundedNumber5!!
    }

private var _squareRoundedNumber5: ImageVector? = null
