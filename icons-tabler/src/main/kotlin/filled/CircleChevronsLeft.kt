package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleChevronsLeft: ImageVector
    get() {
        if (_circleChevronsLeft != null) return _circleChevronsLeft!!
        _circleChevronsLeft = tablerFilledIcon(
            name = "CircleChevronsLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.927 2.133 C 17.421 2.093 21.919 6.492 22.000 11.985 L 22.000 12.280 C 21.919 17.773 17.421 22.173 11.927 22.132 C 6.433 22.092 2.001 17.627 2.001 12.132 C 2.001 6.638 6.433 2.173 11.927 2.132M 15.707 8.292 C 15.316 7.902 14.684 7.902 14.293 8.292 L 11.293 11.292 C 10.903 11.682 10.903 12.316 11.293 12.706 L 14.293 15.706 C 14.684 16.096 15.316 16.096 15.707 15.706 L 15.790 15.612 C 16.099 15.214 16.063 14.648 15.707 14.292 L 13.415 12.000 L 15.707 9.707 C 16.097 9.316 16.097 8.684 15.707 8.293M 11.707 8.293 C 11.316 7.903 10.684 7.903 10.293 8.293 L 7.293 11.293 C 6.903 11.684 6.903 12.316 7.293 12.707 L 10.293 15.707 C 10.684 16.097 11.316 16.097 11.707 15.707 L 11.790 15.613 C 12.099 15.215 12.063 14.649 11.707 14.293 L 9.415 12.000 L 11.707 9.707 C 12.097 9.316 12.097 8.684 11.707 8.293"),
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
        return _circleChevronsLeft!!
    }

private var _circleChevronsLeft: ImageVector? = null
