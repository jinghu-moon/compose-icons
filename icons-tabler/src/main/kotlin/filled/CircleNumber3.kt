package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber3: ImageVector
    get() {
        if (_circleNumber3 != null) return _circleNumber3!!
        _circleNumber3 = tablerFilledIcon(
            name = "CircleNumber3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 13.000 7.000 L 11.000 7.000 L 10.850 7.005 C 9.806 7.083 9.000 7.953 9.000 9.000 C 8.998 9.509 9.379 9.938 9.884 9.997 C 10.390 10.056 10.859 9.726 10.974 9.230 L 10.994 9.117 L 11.000 9.000 L 13.000 9.000 L 13.000 11.000 L 11.000 11.000 L 10.867 11.007 C 9.756 11.127 9.713 12.737 10.739 12.972 L 10.867 12.993 L 11.000 13.000 L 13.000 13.000 L 13.000 15.000 L 11.000 15.000 L 10.993 14.883 C 10.931 14.358 10.470 13.972 9.941 14.003 C 9.413 14.034 9.001 14.471 9.000 15.000 C 9.000 16.047 9.806 16.917 10.850 16.995 L 11.000 17.000 L 13.000 17.000 L 13.150 16.995 C 14.134 16.921 14.917 16.141 14.994 15.157 L 15.000 15.000 L 15.000 13.000 L 14.995 12.850 C 14.978 12.619 14.920 12.394 14.825 12.183 L 14.750 12.031 L 14.731 11.999 L 14.751 11.969 C 14.886 11.724 14.969 11.453 14.993 11.174 L 15.000 11.000 L 15.000 9.000 L 14.995 8.850 C 14.921 7.866 14.141 7.083 13.157 7.006 L 13.000 7.000 Z"),
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
        return _circleNumber3!!
    }

private var _circleNumber3: ImageVector? = null
