package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Graph: ImageVector
    get() {
        if (_graph != null) return _graph!!
        _graph = tablerFilledIcon(
            name = "Graph",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 3.000 C 19.657 3.000 21.000 4.343 21.000 6.000 L 21.000 18.000 C 21.000 19.657 19.657 21.000 18.000 21.000 L 6.000 21.000 C 4.343 21.000 3.000 19.657 3.000 18.000 L 3.000 6.000 C 3.000 4.343 4.343 3.000 6.000 3.000 L 18.000 3.000 ZM 15.707 9.293 C 15.316 8.903 14.684 8.903 14.293 9.293 L 12.000 11.585 L 10.707 10.293 C 10.316 9.903 9.684 9.903 9.293 10.293 L 6.293 13.293 C 5.903 13.684 5.903 14.316 6.293 14.707 L 6.387 14.790 C 6.785 15.099 7.351 15.063 7.707 14.707 L 10.000 12.415 L 11.293 13.707 L 11.387 13.790 C 11.785 14.099 12.351 14.063 12.707 13.707 L 15.000 11.415 L 16.293 12.707 C 16.685 13.086 17.309 13.081 17.695 12.695 C 18.081 12.309 18.086 11.685 17.707 11.293 L 15.707 9.293 Z"),
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
        return _graph!!
    }

private var _graph: ImageVector? = null
