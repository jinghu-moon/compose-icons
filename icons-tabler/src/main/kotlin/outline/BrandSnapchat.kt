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
                pathData = parseSvgPathData("M 16.882 7.842 C 16.882 5.146 14.696 2.960 12.000 2.960 C 9.304 2.960 7.118 5.146 7.118 7.842 C 7.118 12.115 6.905 14.251 3.000 15.960 C 5.000 16.842 5.000 16.842 6.000 18.960 C 9.000 18.960 10.000 20.960 12.000 20.960 C 14.000 20.960 15.000 18.960 18.000 18.960 C 19.000 16.842 19.000 16.842 21.000 15.960 C 17.094 14.251 16.882 12.115 16.882 7.842M 3.000 15.961 C 7.000 13.843 7.000 11.843 4.000 8.843M 21.000 15.961 C 17.000 13.843 17.000 11.843 20.000 8.843"),
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
