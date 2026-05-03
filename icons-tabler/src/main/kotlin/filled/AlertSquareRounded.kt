package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlertSquareRounded: ImageVector
    get() {
        if (_alertSquareRounded != null) return _alertSquareRounded!!
        _alertSquareRounded = tablerFilledIcon(
            name = "AlertSquareRounded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 12.642 2.005 L 13.258 2.022 L 13.557 2.035 L 14.136 2.069 L 14.689 2.115 C 19.376 2.570 21.339 4.448 21.855 9.021 L 21.885 9.311 L 21.931 9.864 L 21.972 10.591 L 21.978 10.741 L 21.995 11.358 L 22.000 12.000 L 21.995 12.642 L 21.978 13.258 L 21.965 13.557 L 21.931 14.136 L 21.885 14.689 C 21.430 19.376 19.552 21.339 14.979 21.855 L 14.689 21.885 L 14.136 21.931 L 13.409 21.972 L 13.259 21.978 L 12.642 21.995 L 12.000 22.000 L 11.358 21.995 L 10.742 21.978 L 10.443 21.965 L 9.864 21.931 L 9.311 21.885 C 4.624 21.430 2.661 19.552 2.145 14.979 L 2.115 14.689 L 2.069 14.136 L 2.028 13.409 L 2.022 13.259 L 2.005 12.642 L 2.001 12.324 L 2.001 11.676 L 2.005 11.358 L 2.022 10.742 L 2.035 10.443 L 2.069 9.864 L 2.115 9.311 C 2.570 4.624 4.448 2.661 9.021 2.145 L 9.311 2.115 L 9.864 2.069 L 10.591 2.028 L 10.741 2.022 L 11.358 2.005 C 11.568 2.002 11.782 2.000 12.000 2.000 ZM 12.010 15.000 L 11.883 15.007 C 11.380 15.067 11.001 15.493 11.001 16.000 C 11.001 16.507 11.380 16.933 11.883 16.993 L 12.000 17.000 L 12.127 16.993 C 12.630 16.933 13.009 16.507 13.009 16.000 C 13.009 15.493 12.630 15.067 12.127 15.007 L 12.010 15.000 ZM 12.000 7.000 C 11.493 7.000 11.066 7.380 11.007 7.883 L 11.000 8.000 L 11.000 12.000 L 11.007 12.117 C 11.067 12.620 11.493 12.999 12.000 12.999 C 12.507 12.999 12.933 12.620 12.993 12.117 L 13.000 12.000 L 13.000 8.000 L 12.993 7.883 C 12.934 7.380 12.507 7.000 12.000 7.000 Z"),
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
        return _alertSquareRounded!!
    }

private var _alertSquareRounded: ImageVector? = null
