package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandToyota: ImageVector
    get() {
        if (_brandToyota != null) return _brandToyota!!
        _brandToyota = tablerOutlineIcon(
            name = "BrandToyota",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 12.000 C 2.000 15.866 6.477 19.000 12.000 19.000 C 17.523 19.000 22.000 15.866 22.000 12.000 C 22.000 8.134 17.523 5.000 12.000 5.000 C 6.477 5.000 2.000 8.134 2.000 12.000"),
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
        pathData = parseSvgPathData("M 9.000 12.000 C 9.000 15.866 10.343 19.000 12.000 19.000 C 13.657 19.000 15.000 15.866 15.000 12.000 C 15.000 8.134 13.657 5.000 12.000 5.000 C 10.343 5.000 9.000 8.134 9.000 12.000"),
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
        pathData = parseSvgPathData("M 6.415 6.191 C 5.527 6.694 5.000 7.321 5.000 8.000 C 5.000 9.657 8.134 11.000 12.000 11.000 C 15.866 11.000 19.000 9.657 19.000 8.000 C 19.000 7.322 18.475 6.696 17.590 6.194"),
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
        return _brandToyota!!
    }

private var _brandToyota: ImageVector? = null
