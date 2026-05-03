package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareChevronsDown: ImageVector
    get() {
        if (_squareChevronsDown != null) return _squareChevronsDown!!
        _squareChevronsDown = tablerFilledIcon(
            name = "SquareChevronsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 9.613 12.210 C 9.196 11.887 8.600 11.944 8.251 12.340 C 7.903 12.735 7.921 13.334 8.293 13.707 L 11.293 16.707 L 11.387 16.790 C 11.785 17.099 12.351 17.063 12.707 16.707 L 15.707 13.707 L 15.790 13.613 C 16.099 13.215 16.063 12.649 15.707 12.293 L 15.613 12.210 C 15.215 11.901 14.649 11.937 14.293 12.293 L 12.000 14.585 L 9.707 12.293 ZM 9.613 7.210 C 9.196 6.887 8.600 6.944 8.251 7.340 C 7.903 7.735 7.921 8.334 8.293 8.707 L 11.293 11.707 L 11.387 11.790 C 11.785 12.099 12.351 12.063 12.707 11.707 L 15.707 8.707 L 15.790 8.613 C 16.099 8.215 16.063 7.649 15.707 7.293 L 15.613 7.210 C 15.215 6.901 14.649 6.937 14.293 7.293 L 12.000 9.585 L 9.707 7.293 Z"),
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
        return _squareChevronsDown!!
    }

private var _squareChevronsDown: ImageVector? = null
