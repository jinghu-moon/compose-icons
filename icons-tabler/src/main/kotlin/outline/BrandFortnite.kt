package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandFortnite: ImageVector
    get() {
        if (_brandFortnite != null) return _brandFortnite!!
        _brandFortnite = tablerOutlineIcon(
            name = "BrandFortnite",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.000 3.000 L 15.500 3.000 L 15.000 7.000 L 12.000 7.000 L 12.000 10.000 L 15.000 10.000 L 15.000 13.500 L 12.000 13.500 L 12.000 20.000 L 8.000 21.000 L 8.000 3.000"),
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
        return _brandFortnite!!
    }

private var _brandFortnite: ImageVector? = null
