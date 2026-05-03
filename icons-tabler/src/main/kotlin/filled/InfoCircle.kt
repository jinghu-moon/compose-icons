package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InfoCircle: ImageVector
    get() {
        if (_infoCircle != null) return _infoCircle!!
        _infoCircle = tablerFilledIcon(
            name = "InfoCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.004 17.463 17.624 21.918 12.162 22.007 C 6.700 22.095 2.178 17.784 2.005 12.324 L 2.000 12.000 L 2.004 11.720 C 2.152 6.327 6.570 2.000 12.000 2.000 ZM 12.000 11.000 L 11.000 11.000 L 10.883 11.007 C 10.380 11.067 10.001 11.493 10.001 12.000 C 10.001 12.507 10.380 12.933 10.883 12.993 L 11.000 13.000 L 11.000 16.000 L 11.007 16.117 C 11.061 16.576 11.424 16.939 11.883 16.993 L 12.000 17.000 L 13.000 17.000 L 13.117 16.993 C 13.576 16.939 13.939 16.576 13.993 16.117 L 14.000 16.000 L 13.993 15.883 C 13.944 15.465 13.639 15.122 13.229 15.026 L 13.117 15.006 L 13.000 15.000 L 13.000 12.000 L 12.993 11.883 C 12.939 11.424 12.576 11.061 12.117 11.007 L 12.000 11.000 ZM 12.010 8.000 L 11.883 8.007 C 11.380 8.067 11.001 8.493 11.001 9.000 C 11.001 9.507 11.380 9.933 11.883 9.993 L 12.000 10.000 L 12.127 9.993 C 12.630 9.933 13.009 9.507 13.009 9.000 C 13.009 8.493 12.630 8.067 12.127 8.007 L 12.010 8.000 Z"),
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
        return _infoCircle!!
    }

private var _infoCircle: ImageVector? = null
