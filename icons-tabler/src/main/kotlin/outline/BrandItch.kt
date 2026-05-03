package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandItch: ImageVector
    get() {
        if (_brandItch != null) return _brandItch!!
        _brandItch = tablerOutlineIcon(
            name = "BrandItch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 7.000 L 2.000 8.000 C 2.000 9.087 3.078 10.000 4.000 10.000 C 5.107 10.000 6.000 9.090 6.000 8.000 C 6.000 9.090 6.893 10.000 8.000 10.000 C 9.107 10.000 10.000 9.090 10.000 8.000 C 10.000 9.090 10.893 10.000 12.000 10.000 C 13.107 10.000 14.000 9.090 14.000 8.000 C 14.000 9.090 14.893 10.000 16.000 10.000 C 17.107 10.000 18.000 9.090 18.000 8.000 C 18.000 9.090 18.893 10.000 20.000 10.000 C 20.922 10.000 22.000 9.087 22.000 8.000 L 22.000 7.000 C 21.991 6.725 21.462 6.036 20.412 4.932 C 19.846 4.337 19.060 4.000 18.238 4.000 L 5.762 4.000 C 4.940 4.000 4.154 4.337 3.588 4.932 C 2.538 6.036 2.008 6.725 2.000 7.000"),
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
                pathData = parseSvgPathData("M 4.000 10.000 C 3.883 16.280 4.154 19.765 4.814 20.456 C 6.348 20.823 9.169 20.991 12.000 20.992 C 14.830 20.991 17.652 20.823 19.186 20.456 C 20.176 19.419 20.084 10.897 20.000 10.000"),
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
                pathData = parseSvgPathData("M 10.000 16.000 L 12.000 14.000 L 14.000 16.000"),
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
                pathData = parseSvgPathData("M 12.000 14.000 L 12.000 18.000"),
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
        return _brandItch!!
    }

private var _brandItch: ImageVector? = null
