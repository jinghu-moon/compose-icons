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
                pathData = parseSvgPathData("M18 4c1.243 0 2.358 .768 2.801 1.929 .444 1.161 .125 2.476-.801 3.306v8.765c0 1.105-.895 2-2 2h-12C4.895 20 4 19.105 4 18v-8.764C3.097 8.428 2.768 7.156 3.167 6.012 3.566 4.868 4.614 4.076 5.824 4.005h12.176v-.005"),
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
