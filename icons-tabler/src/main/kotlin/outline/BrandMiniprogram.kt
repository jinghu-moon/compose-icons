package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMiniprogram: ImageVector
    get() {
        if (_brandMiniprogram != null) return _brandMiniprogram!!
        _brandMiniprogram = tablerOutlineIcon(
            name = "BrandMiniprogram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.000 12.000 C 21.000 16.971 16.971 21.000 12.000 21.000 C 7.029 21.000 3.000 16.971 3.000 12.000 C 3.000 7.029 7.029 3.000 12.000 3.000 C 16.971 3.000 21.000 7.029 21.000 12.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 8.000 11.503 C 7.059 12.208 6.738 13.474 7.227 14.543 C 7.716 15.612 8.883 16.196 10.032 15.946 C 11.181 15.695 12.000 14.679 12.000 13.503 L 12.000 10.503 C 12.000 9.327 12.819 8.311 13.968 8.060 C 15.117 7.810 16.284 8.394 16.773 9.463 C 17.262 10.532 16.941 11.798 16.000 12.503"),
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
        return _brandMiniprogram!!
    }

private var _brandMiniprogram: ImageVector? = null
