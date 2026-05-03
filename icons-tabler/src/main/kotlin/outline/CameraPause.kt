package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CameraPause: ImageVector
    get() {
        if (_cameraPause != null) return _cameraPause!!
        _cameraPause = tablerOutlineIcon(
            name = "CameraPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 20.000 L 5.000 20.000 C 3.895 20.000 3.000 19.105 3.000 18.000 L 3.000 9.000 C 3.000 7.895 3.895 7.000 5.000 7.000 L 6.000 7.000 C 7.105 7.000 8.000 6.105 8.000 5.000 C 8.000 4.448 8.448 4.000 9.000 4.000 L 15.000 4.000 C 15.552 4.000 16.000 4.448 16.000 5.000 C 16.000 6.105 16.895 7.000 18.000 7.000 L 19.000 7.000 C 20.105 7.000 21.000 7.895 21.000 9.000 L 21.000 13.000"),
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
                pathData = parseSvgPathData("M 14.958 13.506 C 15.190 12.150 14.469 10.810 13.209 10.255 C 11.950 9.701 10.475 10.075 9.631 11.162 C 8.787 12.249 8.791 13.770 9.640 14.853 C 10.490 15.935 11.966 16.302 13.223 15.741"),
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
                pathData = parseSvgPathData("M 17.000 17.000 L 17.000 22.000"),
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
                pathData = parseSvgPathData("M 21.000 17.000 L 21.000 22.000"),
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
        return _cameraPause!!
    }

private var _cameraPause: ImageVector? = null
