package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandRedux: ImageVector
    get() {
        if (_brandRedux != null) return _brandRedux!!
        _brandRedux = tablerOutlineIcon(
            name = "BrandRedux",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.540 7.000 C 15.735 4.635 14.004 3.000 12.000 3.000 C 9.226 3.000 6.977 5.632 6.977 9.496 C 6.977 11.452 8.559 14.223 9.489 15.496"),
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
                pathData = parseSvgPathData("M 4.711 11.979 C 3.055 13.856 2.497 16.164 3.500 17.890 C 4.887 20.280 8.638 20.721 12.001 18.790 C 13.704 17.811 14.876 15.428 15.517 13.992"),
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
                pathData = parseSvgPathData("M 15.014 19.990 C 17.525 19.990 19.537 19.552 20.501 17.890 C 21.888 15.500 20.286 11.997 16.922 10.066 C 15.220 9.087 12.565 8.831 10.995 8.996"),
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
                pathData = parseSvgPathData("M 10.493 9.862 C 10.973 10.138 11.588 9.974 11.865 9.496 C 12.140 9.018 11.976 8.407 11.498 8.131 C 11.018 7.854 10.404 8.018 10.125 8.497 C 9.850 8.976 10.015 9.587 10.493 9.862"),
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
                pathData = parseSvgPathData("M 8.500 15.500 C 8.500 16.052 8.948 16.500 9.500 16.500 C 10.052 16.500 10.500 16.052 10.500 15.500 C 10.500 14.948 10.052 14.500 9.500 14.500 C 8.948 14.500 8.500 14.948 8.500 15.500"),
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
                pathData = parseSvgPathData("M 14.500 14.000 C 14.500 14.552 14.948 15.000 15.500 15.000 C 16.052 15.000 16.500 14.552 16.500 14.000 C 16.500 13.448 16.052 13.000 15.500 13.000 C 14.948 13.000 14.500 13.448 14.500 14.000"),
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
        return _brandRedux!!
    }

private var _brandRedux: ImageVector? = null
