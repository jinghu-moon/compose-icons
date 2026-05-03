package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HelpSquareRounded: ImageVector
    get() {
        if (_helpSquareRounded != null) return _helpSquareRounded!!
        _helpSquareRounded = tablerFilledIcon(
            name = "HelpSquareRounded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 L 12.642 2.005 L 13.258 2.022 L 13.557 2.035 L 14.136 2.069 L 14.689 2.115 C 19.376 2.570 21.339 4.448 21.855 9.021 L 21.885 9.311 L 21.931 9.864 L 21.972 10.591 L 21.978 10.741 L 21.995 11.358 L 22.000 12.000 L 21.995 12.642 L 21.978 13.258 L 21.965 13.557 L 21.931 14.136 L 21.885 14.689 C 21.430 19.376 19.552 21.339 14.979 21.855 L 14.689 21.885 L 14.136 21.931 L 13.409 21.972 L 13.259 21.978 L 12.642 21.995 L 12.000 22.000 L 11.358 21.995 L 10.742 21.978 L 10.443 21.965 L 9.864 21.931 L 9.311 21.885 C 4.624 21.430 2.661 19.552 2.145 14.979 L 2.115 14.689 L 2.069 14.136 L 2.028 13.409 L 2.022 13.259 L 2.005 12.642 L 2.001 12.324 L 2.001 11.676 L 2.005 11.358 L 2.022 10.742 L 2.035 10.443 L 2.069 9.864 L 2.115 9.311 C 2.570 4.624 4.448 2.661 9.021 2.145 L 9.311 2.115 L 9.864 2.069 L 10.591 2.028 L 10.741 2.022 L 11.358 2.005 C 11.568 2.002 11.782 2.000 12.000 2.000 ZM 12.000 15.000 C 11.493 15.000 11.066 15.380 11.007 15.883 L 11.000 16.000 L 11.007 16.127 C 11.067 16.630 11.493 17.009 12.000 17.009 C 12.507 17.009 12.933 16.630 12.993 16.127 L 13.000 16.010 L 12.993 15.883 C 12.934 15.380 12.507 15.000 12.000 15.000 ZM 13.368 8.327 C 12.135 7.697 10.631 7.998 9.737 9.055 C 9.393 9.458 9.423 10.059 9.805 10.426 C 10.187 10.792 10.788 10.798 11.177 10.438 L 11.348 10.258 C 11.650 9.981 12.093 9.921 12.458 10.108 C 12.852 10.308 13.069 10.743 12.991 11.178 C 12.912 11.613 12.557 11.945 12.118 11.994 L 11.886 12.006 C 11.358 12.064 10.967 12.525 10.997 13.056 C 11.026 13.586 11.466 14.001 11.997 14.000 C 13.386 14.004 14.596 13.055 14.922 11.705 C 15.248 10.355 14.605 8.957 13.368 8.327 Z"),
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
        return _helpSquareRounded!!
    }

private var _helpSquareRounded: ImageVector? = null
