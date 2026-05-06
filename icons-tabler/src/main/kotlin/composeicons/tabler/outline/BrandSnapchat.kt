package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSnapchat: ImageVector
    get() {
        if (_brandSnapchat != null) return _brandSnapchat!!
        _brandSnapchat = tablerOutlineIcon(
            name = "BrandSnapchat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.882 7.842C16.882 5.146 14.696 2.96 12 2.96 9.304 2.96 7.118 5.146 7.118 7.842c0 4.273-.213 6.409-4.118 8.118 2 .882 2 .882 3 3 3 0 4 2 6 2 2 0 3-2 6-2 1-2.118 1-2.118 3-3C17.094 14.251 16.882 12.115 16.882 7.842M3 15.961C7 13.843 7 11.843 4 8.843M21 15.961C17 13.843 17 11.843 20 8.843"),
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
        return _brandSnapchat!!
    }

private var _brandSnapchat: ImageVector? = null
