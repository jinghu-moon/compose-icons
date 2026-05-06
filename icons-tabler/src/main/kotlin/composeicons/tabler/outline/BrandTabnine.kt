package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTabnine: ImageVector
    get() {
        if (_brandTabnine != null) return _brandTabnine!!
        _brandTabnine = tablerOutlineIcon(
            name = "BrandTabnine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 12 8 18.75 20 12 8 5.25 20 12v-4.527L12 3 8 5.25M20 12v4.5L12 21 8 18.75M8 5.25 4 7.472v9.028l4 2.25L20 12"),
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
        return _brandTabnine!!
    }

private var _brandTabnine: ImageVector? = null
