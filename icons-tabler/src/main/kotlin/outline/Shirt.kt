package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Shirt: ImageVector
    get() {
        if (_shirt != null) return _shirt!!
        _shirt = tablerOutlineIcon(
            name = "Shirt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 4.000 L 21.000 6.000 L 21.000 11.000 L 18.000 11.000 L 18.000 19.000 C 18.000 19.552 17.552 20.000 17.000 20.000 L 7.000 20.000 C 6.448 20.000 6.000 19.552 6.000 19.000 L 6.000 11.000 L 3.000 11.000 L 3.000 6.000 L 9.000 4.000 C 9.000 5.657 10.343 7.000 12.000 7.000 C 13.657 7.000 15.000 5.657 15.000 4.000"),
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
        return _shirt!!
    }

private var _shirt: ImageVector? = null
