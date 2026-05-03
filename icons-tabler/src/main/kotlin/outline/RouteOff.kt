package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RouteOff: ImageVector
    get() {
        if (_routeOff != null) return _routeOff!!
        _routeOff = tablerOutlineIcon(
            name = "RouteOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 19.000 C 4.000 20.105 4.895 21.000 6.000 21.000 C 7.105 21.000 8.000 20.105 8.000 19.000 C 8.000 17.895 7.105 17.000 6.000 17.000 C 4.895 17.000 4.000 17.895 4.000 19.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 16.000 5.000 C 16.000 6.105 16.895 7.000 18.000 7.000 C 19.105 7.000 20.000 6.105 20.000 5.000 C 20.000 3.895 19.105 3.000 18.000 3.000 C 16.895 3.000 16.000 3.895 16.000 5.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 12.000 19.000 L 16.500 19.000 C 17.210 19.000 17.872 18.788 18.424 18.424M 19.969 15.965 C 20.103 14.965 19.799 13.955 19.134 13.195 C 18.470 12.436 17.509 12.000 16.500 12.000 L 16.001 12.000M 12.001 12.000 L 8.500 12.000 C 7.085 12.000 5.810 11.148 5.268 9.841 C 4.726 8.534 5.024 7.030 6.023 6.028M 8.500 5.000 L 12.000 5.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _routeOff!!
    }

private var _routeOff: ImageVector? = null
