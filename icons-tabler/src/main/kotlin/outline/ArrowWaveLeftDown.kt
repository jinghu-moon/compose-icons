package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowWaveLeftDown: ImageVector
    get() {
        if (_arrowWaveLeftDown != null) return _arrowWaveLeftDown!!
        _arrowWaveLeftDown = tablerOutlineIcon(
            name = "ArrowWaveLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 14.000 L 3.000 14.000 L 3.000 10.000"),
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
                pathData = parseSvgPathData("M 21.000 12.000 C 20.113 13.284 18.520 14.033 17.000 14.000 C 15.480 14.033 13.887 13.284 13.000 12.000 C 12.113 10.716 10.520 9.967 9.000 10.000 C 7.480 9.967 6.000 11.000 5.000 12.000 L 3.000 14.000"),
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
        return _arrowWaveLeftDown!!
    }

private var _arrowWaveLeftDown: ImageVector? = null
