package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShieldQuestion: ImageVector
    get() {
        if (_shieldQuestion != null) return _shieldQuestion!!
        _shieldQuestion = tablerOutlineIcon(
            name = "ShieldQuestion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.065 19.732 C 14.115 20.289 13.085 20.718 12.000 21.000 C 8.855 20.184 6.175 18.128 4.573 15.301 C 2.971 12.473 2.584 9.118 3.500 6.000 C 6.616 6.143 9.664 5.067 12.000 3.000 C 14.336 5.067 17.384 6.143 20.500 6.000 C 21.010 7.738 21.117 9.550 20.833 11.303"),
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
                pathData = parseSvgPathData("M 19.000 22.000 L 19.000 22.010"),
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
                pathData = parseSvgPathData("M 19.000 19.000 C 19.923 18.997 20.724 18.364 20.941 17.468 C 21.157 16.571 20.733 15.642 19.914 15.218 C 19.095 14.798 18.095 14.999 17.500 15.701"),
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
        return _shieldQuestion!!
    }

private var _shieldQuestion: ImageVector? = null
