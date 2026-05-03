package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareX: ImageVector
    get() {
        if (_squareX != null) return _squareX!!
        _squareX = tablerFilledIcon(
            name = "SquareX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 2.000 L 5.000 2.000 C 3.343 2.000 2.000 3.343 2.000 5.000 L 2.000 19.000 C 2.000 20.657 3.343 22.000 5.000 22.000 L 19.000 22.000 C 20.657 22.000 22.000 20.657 22.000 19.000 L 22.000 5.000 C 22.000 3.343 20.657 2.000 19.000 2.000 ZM 9.613 8.210 L 9.707 8.293 L 12.000 10.585 L 14.293 8.293 C 14.666 7.921 15.265 7.903 15.660 8.251 C 16.056 8.600 16.113 9.196 15.790 9.613 L 15.707 9.707 L 13.415 12.000 L 15.707 14.293 C 16.079 14.666 16.097 15.265 15.749 15.660 C 15.400 16.056 14.804 16.113 14.387 15.790 L 14.293 15.707 L 12.000 13.415 L 9.707 15.707 C 9.334 16.079 8.735 16.097 8.340 15.749 C 7.944 15.400 7.887 14.804 8.210 14.387 L 8.293 14.293 L 10.585 12.000 L 8.293 9.707 C 7.921 9.334 7.903 8.735 8.251 8.340 C 8.600 7.944 9.196 7.887 9.613 8.210 Z"),
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
        return _squareX!!
    }

private var _squareX: ImageVector? = null
