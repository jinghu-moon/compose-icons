package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandZwift: ImageVector
    get() {
        if (_brandZwift != null) return _brandZwift!!
        _brandZwift = tablerOutlineIcon(
            name = "BrandZwift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.500 4.000 C 4.035 4.000 3.000 5.101 3.000 6.500 C 3.000 7.899 4.035 9.000 5.500 9.000 L 8.000 9.000 L 3.363 16.190 C 2.884 16.967 2.879 17.947 3.352 18.728 C 3.825 19.515 4.702 20.000 5.652 20.000 L 16.500 20.000 C 17.965 20.000 19.000 18.899 19.000 17.500 C 19.000 16.101 17.965 15.000 16.500 15.000 L 14.000 15.000 L 21.000 4.000 L 5.500 4.000"),
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
        return _brandZwift!!
    }

private var _brandZwift: ImageVector? = null
