package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Wheat: ImageVector
    get() {
        if (_wheat != null) return _wheat!!
        _wheat = tablerOutlineIcon(
            name = "Wheat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.014 21.514 L 12.014 17.764"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 5.930 9.504 L 5.500 11.108 C 4.788 13.767 6.366 16.499 9.024 17.213 C 10.021 17.481 11.017 17.748 12.014 18.014 L 12.014 14.574 C 11.850 12.469 10.377 10.695 8.338 10.148 L 5.930 9.504"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 13.744 11.164 C 14.198 10.710 14.559 10.170 14.805 9.577 C 15.051 8.983 15.177 8.347 15.177 7.704 C 15.177 7.061 15.051 6.425 14.805 5.832 C 14.559 5.238 14.199 4.699 13.744 4.244 L 12.014 2.514 L 10.284 4.244 C 9.830 4.698 9.469 5.238 9.224 5.832 C 8.978 6.426 8.852 7.062 8.851 7.704 C 8.851 8.347 8.978 8.983 9.224 9.577 C 9.470 10.171 9.830 10.710 10.284 11.164"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 18.099 9.504 L 18.529 11.108 C 19.241 13.767 17.663 16.499 15.004 17.213 C 14.007 17.481 13.010 17.748 12.014 18.014 L 12.014 14.574 C 12.178 12.469 13.651 10.695 15.691 10.148 L 18.099 9.504"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _wheat!!
    }

private var _wheat: ImageVector? = null
