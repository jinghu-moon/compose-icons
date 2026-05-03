package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowLeftSquare: ImageVector
    get() {
        if (_arrowLeftSquare != null) return _arrowLeftSquare!!
        _arrowLeftSquare = tablerFilledIcon(
            name = "ArrowLeftSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.707 8.293 C 7.097 8.684 7.097 9.316 6.707 9.707 L 5.415 11.000 L 16.000 11.000 L 16.000 10.000 C 16.000 9.448 16.448 9.000 17.000 9.000 L 21.000 9.000 C 21.552 9.000 22.000 9.448 22.000 10.000 L 22.000 14.000 C 22.000 14.552 21.552 15.000 21.000 15.000 L 17.000 15.000 C 16.448 15.000 16.000 14.552 16.000 14.000 L 16.000 13.000 L 5.415 13.000 L 6.707 14.293 C 7.063 14.649 7.099 15.215 6.790 15.613 L 6.707 15.707 C 6.317 16.097 5.683 16.097 5.293 15.707 L 2.293 12.707 C 2.258 12.672 2.226 12.635 2.196 12.595 L 2.125 12.485 L 2.071 12.371 L 2.036 12.266 L 2.011 12.148 L 2.004 12.090 L 2.000 12.000 L 2.003 11.925 L 2.020 11.799 L 2.050 11.688 L 2.094 11.577 L 2.146 11.479 L 2.213 11.383 L 2.293 11.293 L 5.293 8.293 C 5.683 7.903 6.317 7.903 6.707 8.293"),
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
        return _arrowLeftSquare!!
    }

private var _arrowLeftSquare: ImageVector? = null
