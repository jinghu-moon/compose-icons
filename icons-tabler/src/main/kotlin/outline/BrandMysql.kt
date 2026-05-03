package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMysql: ImageVector
    get() {
        if (_brandMysql != null) return _brandMysql!!
        _brandMysql = tablerOutlineIcon(
            name = "BrandMysql",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.000 21.000 C 11.573 19.974 9.410 17.146 9.000 15.000 C 8.514 15.770 7.499 17.000 7.000 17.000 C 5.501 16.112 6.426 13.027 7.000 11.000 C 5.404 9.567 4.532 8.542 4.500 7.000 C 1.150 3.560 4.056 1.730 7.000 4.000 L 8.000 4.000 C 16.482 4.500 14.421 12.070 17.000 15.500 C 19.295 16.022 20.665 17.754 22.000 19.000 C 19.914 18.800 19.216 18.656 18.500 19.000 C 18.978 20.640 20.623 21.200 22.000 22.000"),
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
                pathData = parseSvgPathData("M 9.000 7.000 L 9.010 7.000"),
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
        return _brandMysql!!
    }

private var _brandMysql: ImageVector? = null
