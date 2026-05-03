package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScaleOutlineOff: ImageVector
    get() {
        if (_scaleOutlineOff != null) return _scaleOutlineOff!!
        _scaleOutlineOff = tablerOutlineIcon(
            name = "ScaleOutlineOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 3.000 L 17.000 3.000 C 19.209 3.000 21.000 4.791 21.000 7.000 L 21.000 17.000M 19.827 19.830 C 19.078 20.580 18.060 21.001 17.000 21.000 L 7.000 21.000 C 4.791 21.000 3.000 19.209 3.000 17.000 L 3.000 7.000 C 3.000 5.896 3.447 4.897 4.170 4.173"),
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
                pathData = parseSvgPathData("M 11.062 7.062 C 11.372 7.021 11.684 7.000 12.000 7.000 C 13.956 7.000 15.724 7.802 17.000 9.095 C 16.327 9.724 15.661 10.359 15.000 11.000M 11.277 11.288 C 10.786 11.410 10.333 11.654 9.962 11.998 L 7.006 9.095 C 7.352 8.741 7.735 8.426 8.148 8.153"),
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
        return _scaleOutlineOff!!
    }

private var _scaleOutlineOff: ImageVector? = null
