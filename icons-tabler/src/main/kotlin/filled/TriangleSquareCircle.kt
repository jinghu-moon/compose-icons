package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TriangleSquareCircle: ImageVector
    get() {
        if (_triangleSquareCircle != null) return _triangleSquareCircle!!
        _triangleSquareCircle = tablerFilledIcon(
            name = "TriangleSquareCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.132 2.504 L 7.132 9.504 C 6.955 9.813 6.957 10.194 7.135 10.502 C 7.314 10.810 7.644 11.000 8.000 11.000 L 16.000 11.000 C 16.356 11.000 16.686 10.810 16.865 10.502 C 17.043 10.194 17.045 9.813 16.868 9.504 L 12.868 2.504 C 12.690 2.193 12.359 2.001 12.000 2.001 C 11.641 2.001 11.310 2.193 11.132 2.504 Z"),
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
                pathData = parseSvgPathData("M 17.000 13.000 C 19.183 13.000 20.963 14.750 20.999 16.933 C 21.036 19.116 19.315 20.925 17.133 20.998 C 14.951 21.071 13.114 19.380 13.005 17.200 L 13.000 17.000 L 13.005 16.800 C 13.112 14.671 14.869 13.000 17.000 13.000 Z"),
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
                pathData = parseSvgPathData("M 9.000 13.000 L 5.000 13.000 C 3.895 13.000 3.000 13.895 3.000 15.000 L 3.000 19.000 C 3.000 20.105 3.895 21.000 5.000 21.000 L 9.000 21.000 C 10.105 21.000 11.000 20.105 11.000 19.000 L 11.000 15.000 C 11.000 13.895 10.105 13.000 9.000 13.000 Z"),
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
        return _triangleSquareCircle!!
    }

private var _triangleSquareCircle: ImageVector? = null
