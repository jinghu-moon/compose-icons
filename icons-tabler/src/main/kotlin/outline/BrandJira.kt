package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandJira: ImageVector
    get() {
        if (_brandJira != null) return _brandJira!!
        _brandJira = tablerOutlineIcon(
            name = "BrandJira",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 4.000 L 11.000 4.000 L 11.000 5.500 C 11.000 6.881 12.119 8.000 13.500 8.000 L 15.000 8.000 C 15.552 8.000 16.000 8.448 16.000 9.000 L 16.000 10.500 C 16.000 11.881 17.119 13.000 18.500 13.000 L 20.000 13.000 L 20.000 4.000"),
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
                pathData = parseSvgPathData("M 15.000 8.000 L 7.000 8.000 L 7.000 9.500 C 7.000 10.881 8.119 12.000 9.500 12.000 L 11.000 12.000 C 11.552 12.000 12.000 12.448 12.000 13.000 L 12.000 14.500 C 12.000 15.881 13.119 17.000 14.500 17.000 L 16.000 17.000 L 16.000 9.000 C 16.000 8.448 15.552 8.000 15.000 8.000"),
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
                pathData = parseSvgPathData("M 11.000 12.000 L 3.000 12.000 L 3.000 13.500 C 3.000 14.881 4.119 16.000 5.500 16.000 L 7.000 16.000 C 7.552 16.000 8.000 16.448 8.000 17.000 L 8.000 18.500 C 8.000 19.881 9.119 21.000 10.500 21.000 L 12.000 21.000 L 12.000 13.000 C 12.000 12.448 11.552 12.000 11.000 12.000"),
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
        return _brandJira!!
    }

private var _brandJira: ImageVector? = null
