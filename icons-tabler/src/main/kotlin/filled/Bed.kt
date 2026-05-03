package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bed: ImageVector
    get() {
        if (_bed != null) return _bed!!
        _bed = tablerFilledIcon(
            name = "Bed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 6.000 C 3.507 6.000 3.934 6.380 3.993 6.883 L 4.000 7.000 L 4.000 13.000 L 10.000 13.000 L 10.000 8.000 C 10.000 7.493 10.380 7.066 10.883 7.007 L 11.000 7.000 L 19.000 7.000 C 20.589 7.000 21.902 8.238 21.995 9.824 L 22.000 10.000 L 22.000 18.000 C 21.999 18.529 21.587 18.966 21.059 18.997 C 20.530 19.028 20.069 18.642 20.007 18.117 L 20.000 18.000 L 20.000 15.000 L 4.000 15.000 L 4.000 18.000 C 3.999 18.529 3.587 18.966 3.059 18.997 C 2.530 19.028 2.069 18.642 2.007 18.117 L 2.000 18.000 L 2.000 7.000 C 2.000 6.448 2.448 6.000 3.000 6.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 7.000 8.000 C 8.085 8.000 8.972 8.866 8.999 9.950 C 9.026 11.035 8.183 11.943 7.099 11.998 C 6.016 12.052 5.086 11.232 5.005 10.150 L 5.000 10.000 L 5.005 9.850 C 5.083 8.806 5.953 8.000 7.000 8.000 Z"),
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
        return _bed!!
    }

private var _bed: ImageVector? = null
