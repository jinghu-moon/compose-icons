package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAppgallery: ImageVector
    get() {
        if (_brandAppgallery != null) return _brandAppgallery!!
        _brandAppgallery = tablerOutlineIcon(
            name = "BrandAppgallery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 8.000 C 4.000 5.791 5.791 4.000 8.000 4.000 L 16.000 4.000 C 18.209 4.000 20.000 5.791 20.000 8.000 L 20.000 16.000 C 20.000 18.209 18.209 20.000 16.000 20.000 L 8.000 20.000 C 5.791 20.000 4.000 18.209 4.000 16.000 L 4.000 8.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 9.000 8.000 C 9.000 9.657 10.343 11.000 12.000 11.000 C 13.657 11.000 15.000 9.657 15.000 8.000"),
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
        return _brandAppgallery!!
    }

private var _brandAppgallery: ImageVector? = null
