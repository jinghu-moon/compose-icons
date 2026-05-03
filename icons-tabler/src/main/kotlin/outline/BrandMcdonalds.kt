package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMcdonalds: ImageVector
    get() {
        if (_brandMcdonalds != null) return _brandMcdonalds!!
        _brandMcdonalds = tablerOutlineIcon(
            name = "BrandMcdonalds",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 20.000 C 20.000 16.048 19.034 4.000 15.962 4.000 C 12.890 4.000 12.000 13.087 12.000 18.756 C 12.000 13.087 11.104 4.000 8.038 4.000 C 4.973 4.000 4.000 16.048 4.000 20.000"),
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
        return _brandMcdonalds!!
    }

private var _brandMcdonalds: ImageVector? = null
