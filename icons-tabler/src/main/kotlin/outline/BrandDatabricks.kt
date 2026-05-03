package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandDatabricks: ImageVector
    get() {
        if (_brandDatabricks != null) return _brandDatabricks!!
        _brandDatabricks = tablerOutlineIcon(
            name = "BrandDatabricks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 17.000 L 12.000 22.000 L 21.000 17.000 L 21.000 14.000 L 12.000 19.000 L 3.000 14.000 L 3.000 11.000 L 12.000 16.000 L 21.000 11.000 L 21.000 8.000 L 12.000 13.000 L 3.000 8.000 L 12.000 3.000 L 17.418 6.010"),
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
        return _brandDatabricks!!
    }

private var _brandDatabricks: ImageVector? = null
