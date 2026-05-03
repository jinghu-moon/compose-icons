package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HexagonNumber7: ImageVector
    get() {
        if (_hexagonNumber7 != null) return _hexagonNumber7!!
        _hexagonNumber7 = tablerOutlineIcon(
            name = "HexagonNumber7",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.020 6.858 C 19.645 7.219 20.027 7.888 20.020 8.610 L 20.020 15.165 C 20.020 15.893 19.625 16.565 18.988 16.918 L 12.971 20.762 C 12.366 21.100 11.628 21.100 11.023 20.762 L 5.007 16.918 C 4.370 16.565 3.974 15.894 3.975 15.166 L 3.975 8.610 C 3.975 7.882 4.370 7.210 5.007 6.857 L 11.024 3.275 C 11.646 2.930 12.402 2.930 13.024 3.275 L 19.041 6.858 L 19.012 6.858 L 19.020 6.858"),
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
                pathData = parseSvgPathData("M 10.000 8.000 L 14.000 8.000 L 12.000 16.000"),
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
        return _hexagonNumber7!!
    }

private var _hexagonNumber7: ImageVector? = null
