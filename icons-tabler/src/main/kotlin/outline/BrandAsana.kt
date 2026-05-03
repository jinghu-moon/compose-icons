package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAsana: ImageVector
    get() {
        if (_brandAsana != null) return _brandAsana!!
        _brandAsana = tablerOutlineIcon(
            name = "BrandAsana",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.000 7.000 C 9.000 8.657 10.343 10.000 12.000 10.000 C 13.657 10.000 15.000 8.657 15.000 7.000 C 15.000 5.343 13.657 4.000 12.000 4.000 C 10.343 4.000 9.000 5.343 9.000 7.000"),
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
        pathData = parseSvgPathData("M 14.000 16.000 C 14.000 17.657 15.343 19.000 17.000 19.000 C 18.657 19.000 20.000 17.657 20.000 16.000 C 20.000 14.343 18.657 13.000 17.000 13.000 C 15.343 13.000 14.000 14.343 14.000 16.000"),
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
        pathData = parseSvgPathData("M 4.000 16.000 C 4.000 17.657 5.343 19.000 7.000 19.000 C 8.657 19.000 10.000 17.657 10.000 16.000 C 10.000 14.343 8.657 13.000 7.000 13.000 C 5.343 13.000 4.000 14.343 4.000 16.000"),
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
        return _brandAsana!!
    }

private var _brandAsana: ImageVector? = null
