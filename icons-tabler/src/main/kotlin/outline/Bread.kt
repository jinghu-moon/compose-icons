package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bread: ImageVector
    get() {
        if (_bread != null) return _bread!!
        _bread = tablerOutlineIcon(
            name = "Bread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 4.000 C 19.243 4.000 20.358 4.768 20.801 5.929 C 21.245 7.091 20.926 8.406 20.000 9.235 L 20.000 18.000 C 20.000 19.105 19.105 20.000 18.000 20.000 L 6.000 20.000 C 4.895 20.000 4.000 19.105 4.000 18.000 L 4.000 9.236 C 3.097 8.428 2.768 7.156 3.167 6.012 C 3.566 4.868 4.614 4.076 5.824 4.005 L 18.000 4.005 L 18.000 4.000"),
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
        return _bread!!
    }

private var _bread: ImageVector? = null
