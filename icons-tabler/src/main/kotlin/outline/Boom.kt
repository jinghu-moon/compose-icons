package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Boom: ImageVector
    get() {
        if (_boom != null) return _boom!!
        _boom = tablerOutlineIcon(
            name = "Boom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 9.662 C 5.000 12.000 5.000 14.000 3.000 16.000 C 6.000 16.500 7.500 17.000 8.000 20.000 C 10.000 17.000 14.000 16.000 17.000 20.000 C 17.000 17.000 18.000 16.000 21.000 15.996 Q 18.000 13.001 21.000 10.000 C 18.000 10.000 16.000 8.000 16.000 5.000 C 14.000 9.000 11.000 8.000 8.500 4.000 C 8.000 7.000 6.000 9.000 3.000 9.662"),
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
        return _boom!!
    }

private var _boom: ImageVector? = null
