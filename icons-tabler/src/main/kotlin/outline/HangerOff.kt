package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HangerOff: ImageVector
    get() {
        if (_hangerOff != null) return _hangerOff!!
        _hangerOff = tablerOutlineIcon(
            name = "HangerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 6.000 C 14.000 4.895 13.105 4.000 12.000 4.000 C 10.895 4.000 10.000 4.895 10.000 6.000M 16.506 12.506 L 19.967 14.428 C 20.602 14.781 20.996 15.450 20.996 16.177 L 20.996 17.000M 18.996 19.000 L 4.996 19.000 C 3.891 19.000 2.996 18.105 2.996 17.000 L 2.996 16.177 C 2.996 15.450 3.390 14.781 4.025 14.428 L 10.698 10.721"),
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
        return _hangerOff!!
    }

private var _hangerOff: ImageVector? = null
