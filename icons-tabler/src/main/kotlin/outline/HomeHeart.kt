package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeHeart: ImageVector
    get() {
        if (_homeHeart != null) return _homeHeart!!
        _homeHeart = tablerOutlineIcon(
            name = "HomeHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 12.000 L 12.000 3.000 L 3.000 12.000 L 5.000 12.000 L 5.000 19.000 C 5.000 20.105 5.895 21.000 7.000 21.000 L 13.000 21.000"),
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
                pathData = parseSvgPathData("M 9.000 21.000 L 9.000 15.000 C 9.000 13.895 9.895 13.000 11.000 13.000 L 13.000 13.000 C 13.390 13.000 13.754 13.112 14.061 13.304"),
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
                pathData = parseSvgPathData("M 19.000 21.500 L 21.518 18.920 C 22.166 18.246 22.166 17.181 21.518 16.507 C 21.211 16.188 20.788 16.007 20.345 16.007 C 19.902 16.007 19.479 16.188 19.172 16.507 L 19.004 16.679 L 18.836 16.507 C 18.529 16.188 18.106 16.007 17.663 16.007 C 17.220 16.007 16.797 16.188 16.490 16.507 C 15.842 17.181 15.842 18.245 16.490 18.919 L 19.000 21.509 L 19.000 21.500"),
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
        return _homeHeart!!
    }

private var _homeHeart: ImageVector? = null
