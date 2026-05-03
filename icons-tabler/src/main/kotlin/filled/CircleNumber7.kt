package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber7: ImageVector
    get() {
        if (_circleNumber7 != null) return _circleNumber7!!
        _circleNumber7 = tablerFilledIcon(
            name = "CircleNumber7",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 14.000 7.000 L 10.000 7.000 L 9.883 7.007 C 9.424 7.061 9.061 7.424 9.007 7.883 L 9.000 8.000 L 9.007 8.117 C 9.061 8.576 9.424 8.939 9.883 8.993 L 10.000 9.000 L 12.718 9.000 L 11.030 15.757 L 11.008 15.872 C 10.943 16.375 11.265 16.847 11.757 16.970 C 12.249 17.093 12.755 16.828 12.935 16.354 L 12.970 16.243 L 14.970 8.243 L 14.991 8.131 C 15.026 7.865 14.953 7.596 14.788 7.384 C 14.623 7.173 14.380 7.036 14.113 7.006 L 14.000 7.000 Z"),
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
        return _circleNumber7!!
    }

private var _circleNumber7: ImageVector? = null
