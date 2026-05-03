package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSugarizer: ImageVector
    get() {
        if (_brandSugarizer != null) return _brandSugarizer!!
        _brandSugarizer = tablerOutlineIcon(
            name = "BrandSugarizer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.277 16.000 L 17.529 12.748 C 18.138 12.116 18.129 11.113 17.508 10.492 C 16.887 9.872 15.884 9.863 15.252 10.472 L 12.000 13.723 L 8.748 10.472 C 8.115 9.873 7.120 9.887 6.503 10.503 C 5.887 11.120 5.873 12.115 6.472 12.748 L 9.723 16.000 L 6.472 19.252 C 6.053 19.656 5.884 20.255 6.031 20.818 C 6.178 21.382 6.618 21.822 7.182 21.969 C 7.745 22.116 8.344 21.948 8.748 21.529 L 12.000 18.277 L 15.252 21.529 C 15.881 22.158 16.900 22.158 17.529 21.529 C 18.158 20.900 18.158 19.881 17.529 19.252 L 14.277 16.000"),
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
                pathData = parseSvgPathData("M 9.000 5.000 C 9.000 6.657 10.343 8.000 12.000 8.000 C 13.657 8.000 15.000 6.657 15.000 5.000 C 15.000 3.343 13.657 2.000 12.000 2.000 C 10.343 2.000 9.000 3.343 9.000 5.000"),
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
        return _brandSugarizer!!
    }

private var _brandSugarizer: ImageVector? = null
