package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.JewishStar: ImageVector
    get() {
        if (_jewishStar != null) return _jewishStar!!
        _jewishStar = tablerOutlineIcon(
            name = "JewishStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 L 15.000 7.000 L 21.000 7.000 L 18.000 12.000 L 21.000 17.000 L 15.000 17.000 L 12.000 22.000 L 9.000 17.000 L 3.000 17.000 L 6.000 12.000 L 3.000 7.000 L 9.000 7.000 L 12.000 2.000"),
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
        return _jewishStar!!
    }

private var _jewishStar: ImageVector? = null
