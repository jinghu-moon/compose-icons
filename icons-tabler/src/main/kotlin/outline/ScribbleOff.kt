package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScribbleOff: ImageVector
    get() {
        if (_scribbleOff != null) return _scribbleOff!!
        _scribbleOff = tablerOutlineIcon(
            name = "ScribbleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 15.000 C 5.000 18.000 7.000 19.000 10.000 19.000 C 11.950 19.000 14.324 17.732 15.746 15.744M 16.927 12.932 C 16.976 12.624 17.000 12.312 17.000 12.000 C 17.000 8.000 14.000 5.000 11.000 5.000 C 10.358 5.000 9.761 5.069 9.220 5.201M 6.728 6.716 C 6.258 7.333 6.000 8.102 6.000 9.000 C 6.000 11.500 8.000 14.000 12.000 14.000 C 12.597 14.000 13.203 13.945 13.808 13.844M 16.910 12.923 C 19.145 11.970 21.062 10.500 22.000 9.000"),
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
        return _scribbleOff!!
    }

private var _scribbleOff: ImageVector? = null
