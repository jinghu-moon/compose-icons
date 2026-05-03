package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.YinYang: ImageVector
    get() {
        if (_yinYang != null) return _yinYang!!
        _yinYang = tablerOutlineIcon(
            name = "YinYang",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 12.000 C 3.000 16.971 7.029 21.000 12.000 21.000 C 16.971 21.000 21.000 16.971 21.000 12.000 C 21.000 7.029 16.971 3.000 12.000 3.000 C 7.029 3.000 3.000 7.029 3.000 12.000"),
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
                pathData = parseSvgPathData("M 12.000 3.000 C 9.515 3.000 7.500 5.015 7.500 7.500 C 7.500 9.985 9.515 12.000 12.000 12.000 C 14.485 12.000 16.500 14.015 16.500 16.500 C 16.500 18.985 14.485 21.000 12.000 21.000"),
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
                pathData = parseSvgPathData("M 11.500 7.500 C 11.500 7.776 11.724 8.000 12.000 8.000 C 12.276 8.000 12.500 7.776 12.500 7.500 C 12.500 7.224 12.276 7.000 12.000 7.000 C 11.724 7.000 11.500 7.224 11.500 7.500"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 11.500 16.500 C 11.500 16.776 11.724 17.000 12.000 17.000 C 12.276 17.000 12.500 16.776 12.500 16.500 C 12.500 16.224 12.276 16.000 12.000 16.000 C 11.724 16.000 11.500 16.224 11.500 16.500"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
