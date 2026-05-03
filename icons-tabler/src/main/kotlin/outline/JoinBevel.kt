package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.JoinBevel: ImageVector
    get() {
        if (_joinBevel != null) return _joinBevel!!
        _joinBevel = tablerOutlineIcon(
            name = "JoinBevel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 4.000 L 9.000 4.000 C 10.105 4.000 11.000 4.895 11.000 6.000 L 11.000 12.000 C 11.000 12.552 11.448 13.000 12.000 13.000 L 18.000 13.000 C 19.105 13.000 20.000 13.895 20.000 15.000 L 20.000 18.000 C 20.000 19.105 19.105 20.000 18.000 20.000 L 11.414 20.000 C 11.149 20.000 10.894 19.895 10.707 19.707 L 4.293 13.293 C 4.105 13.106 4.000 12.851 4.000 12.586 L 4.000 6.000 C 4.000 4.895 4.895 4.000 6.000 4.000"),
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
        return _joinBevel!!
    }

private var _joinBevel: ImageVector? = null
