package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAmongUs: ImageVector
    get() {
        if (_brandAmongUs != null) return _brandAmongUs!!
        _brandAmongUs = tablerOutlineIcon(
            name = "BrandAmongUs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.646 12.774 C 8.707 13.170 6.179 13.091 4.412 12.173 C 1.958 10.910 2.875 7.513 5.835 7.191 C 8.089 6.967 9.649 6.837 11.485 7.405 C 12.320 7.661 13.415 7.974 12.840 10.686 C 12.649 11.753 11.770 12.590 10.646 12.774"),
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
                pathData = parseSvgPathData("M 5.840 7.132 C 5.923 6.568 6.054 6.012 6.232 5.471 C 6.688 4.535 7.327 3.403 10.217 3.015 C 11.173 2.981 12.131 3.007 13.084 3.095 C 14.860 3.235 15.727 4.329 16.371 6.463 C 16.710 7.620 16.831 8.805 17.000 10.000 L 17.000 21.000 L 4.296 20.981 C 3.744 18.595 4.034 15.087 4.500 12.500"),
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
                pathData = parseSvgPathData("M 17.000 10.000 C 17.991 10.163 19.105 10.383 20.069 10.670 C 20.324 10.800 20.589 10.945 20.603 11.175 C 20.867 14.609 21.173 18.623 20.881 21.000 L 17.000 21.000"),
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
        return _brandAmongUs!!
    }

private var _brandAmongUs: ImageVector? = null
