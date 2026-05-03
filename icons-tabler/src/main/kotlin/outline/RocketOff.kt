package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RocketOff: ImageVector
    get() {
        if (_rocketOff != null) return _rocketOff!!
        _rocketOff = tablerOutlineIcon(
            name = "RocketOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 9.290 9.275 C 9.183 9.512 9.086 9.754 9.000 10.000 C 6.927 10.068 5.036 11.203 4.000 13.000 C 7.670 13.436 10.564 16.330 11.000 20.000 C 12.797 18.964 13.932 17.073 14.000 15.000 C 14.241 14.915 14.478 14.820 14.708 14.717M 17.136 13.107 C 18.846 11.520 19.873 9.330 20.000 7.000 C 20.000 5.343 18.657 4.000 17.000 4.000 C 14.670 4.127 12.480 5.154 10.893 6.864"),
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
                pathData = parseSvgPathData("M 7.000 14.000 C 4.871 15.202 3.684 17.576 4.000 20.000 C 6.424 20.316 8.798 19.129 10.000 17.000"),
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
                pathData = parseSvgPathData("M 14.000 9.000 C 14.000 9.552 14.448 10.000 15.000 10.000 C 15.552 10.000 16.000 9.552 16.000 9.000 C 16.000 8.448 15.552 8.000 15.000 8.000 C 14.448 8.000 14.000 8.448 14.000 9.000"),
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
        return _rocketOff!!
    }

private var _rocketOff: ImageVector? = null
