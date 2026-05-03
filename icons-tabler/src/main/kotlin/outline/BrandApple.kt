package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandApple: ImageVector
    get() {
        if (_brandApple != null) return _brandApple!!
        _brandApple = tablerOutlineIcon(
            name = "BrandApple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.286 7.008 C 5.070 7.008 4.000 10.238 4.000 12.928 C 4.000 16.157 6.143 21.000 8.286 21.000 C 9.451 20.950 10.085 20.462 11.500 20.462 C 12.906 20.462 13.107 21.000 14.714 21.000 C 16.321 21.000 19.000 17.771 19.000 15.619 C 18.970 15.608 16.351 15.185 16.321 12.389 C 16.301 10.054 18.910 9.210 19.000 9.161 C 17.904 7.555 15.838 7.048 15.250 7.008 C 13.715 6.888 12.218 8.085 11.500 8.085 C 10.771 8.085 9.464 7.008 8.286 7.008"),
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
        pathData = parseSvgPathData("M 12.000 4.000 C 13.105 4.000 14.000 3.105 14.000 2.000 C 12.895 2.000 12.000 2.895 12.000 4.000"),
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
        return _brandApple!!
    }

private var _brandApple: ImageVector? = null
