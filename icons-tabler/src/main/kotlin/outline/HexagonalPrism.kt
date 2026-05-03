package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HexagonalPrism: ImageVector
    get() {
        if (_hexagonalPrism != null) return _hexagonalPrism!!
        _hexagonalPrism = tablerOutlineIcon(
            name = "HexagonalPrism",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.792 6.996 L 17.017 9.639 C 16.681 9.874 16.280 10.000 15.870 10.000 L 8.130 10.000 C 7.720 10.000 7.320 9.874 6.984 9.638 L 3.210 6.997"),
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
                pathData = parseSvgPathData("M 8.000 10.000 L 8.000 21.000"),
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
                pathData = parseSvgPathData("M 16.000 10.000 L 16.000 21.000"),
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
                pathData = parseSvgPathData("M 3.853 18.274 L 7.220 20.637 C 7.556 20.873 7.956 21.000 8.367 21.000 L 15.632 21.000 C 16.042 21.000 16.443 20.874 16.779 20.637 L 20.146 18.274 C 20.682 17.899 21.000 17.284 21.000 16.631 L 21.000 7.369 C 21.000 6.714 20.682 6.101 20.147 5.726 L 16.780 3.363 C 16.444 3.127 16.044 3.000 15.633 3.000 L 8.367 3.000 C 7.957 3.000 7.556 3.126 7.220 3.363 L 3.853 5.726 C 3.318 6.102 2.999 6.716 3.000 7.370 L 3.000 16.631 C 3.000 17.286 3.318 17.900 3.853 18.275"),
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
        return _hexagonalPrism!!
    }

private var _hexagonalPrism: ImageVector? = null
