package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNem: ImageVector
    get() {
        if (_brandNem != null) return _brandNem!!
        _brandNem = tablerOutlineIcon(
            name = "BrandNem",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.182 2.000 C 14.122 2.022 16.061 2.382 18.000 3.080 L 18.364 3.215 C 19.626 3.702 20.843 4.300 22.000 5.000 C 22.000 10.618 20.043 15.258 16.130 18.920 C 14.890 20.159 13.630 21.124 12.350 21.818 L 12.000 22.000 C 10.600 21.297 9.223 20.271 7.870 18.921 C 3.958 15.258 2.000 10.618 2.000 5.000 C 4.545 3.473 7.090 2.529 9.636 2.168 L 10.000 2.120 C 10.603 2.047 11.210 2.007 11.818 2.000 L 12.182 2.000"),
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
                pathData = parseSvgPathData("M 2.100 7.070 C 4.173 13.790 7.473 14.767 12.000 10.000 C 12.000 6.000 13.357 3.647 16.070 2.940 L 16.660 2.830"),
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
                pathData = parseSvgPathData("M 16.350 18.510 C 16.350 18.510 19.000 13.000 12.000 10.000"),
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
        return _brandNem!!
    }

private var _brandNem: ImageVector? = null
