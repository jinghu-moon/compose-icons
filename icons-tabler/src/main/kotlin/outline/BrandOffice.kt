package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandOffice: ImageVector
    get() {
        if (_brandOffice != null) return _brandOffice!!
        _brandOffice = tablerOutlineIcon(
            name = "BrandOffice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.000 18.000 L 13.000 18.000 L 13.000 6.000 L 8.000 8.000 L 8.000 13.000 L 4.000 15.000 L 4.000 7.000 L 13.000 3.000 L 20.000 5.000 L 20.000 18.000 L 13.000 21.000 L 4.000 18.000"),
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
        return _brandOffice!!
    }

private var _brandOffice: ImageVector? = null
