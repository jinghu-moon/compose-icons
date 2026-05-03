package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandShopee: ImageVector
    get() {
        if (_brandShopee != null) return _brandShopee!!
        _brandShopee = tablerOutlineIcon(
            name = "BrandShopee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 7.000 L 4.867 19.143 C 4.942 20.191 5.816 21.003 6.867 21.000 L 17.143 21.000 C 18.194 21.003 19.068 20.191 19.143 19.143 L 20.010 7.000 L 4.010 7.000 L 4.000 7.000"),
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
                pathData = parseSvgPathData("M 8.500 7.000 C 8.500 5.347 10.000 3.000 12.000 3.000 C 14.000 3.000 15.500 5.347 15.500 7.000"),
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
                pathData = parseSvgPathData("M 9.500 17.000 C 9.913 17.462 10.500 18.000 12.000 18.000 C 13.500 18.000 14.500 17.103 14.500 16.000 C 14.500 14.897 13.500 14.500 12.000 14.000 C 10.500 13.500 10.000 12.530 10.000 12.000 C 10.000 10.896 11.000 10.000 12.000 10.000 C 13.000 10.000 13.500 10.000 14.500 11.000"),
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
        return _brandShopee!!
    }

private var _brandShopee: ImageVector? = null
