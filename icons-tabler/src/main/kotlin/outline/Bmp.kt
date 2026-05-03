package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bmp: ImageVector
    get() {
        if (_bmp != null) return _bmp!!
        _bmp = tablerOutlineIcon(
            name = "Bmp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 16.000 L 18.000 8.000 L 20.000 8.000 C 21.105 8.000 22.000 8.895 22.000 10.000 C 22.000 11.105 21.105 12.000 20.000 12.000 L 18.000 12.000"),
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
                pathData = parseSvgPathData("M 6.000 14.000 C 6.000 15.105 5.105 16.000 4.000 16.000 L 2.000 16.000 L 2.000 8.000 L 4.000 8.000 C 5.105 8.000 6.000 8.895 6.000 10.000 C 6.000 11.105 5.105 12.000 4.000 12.000 L 2.000 12.000 L 4.000 12.000 C 5.105 12.000 6.000 12.895 6.000 14.000"),
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
                pathData = parseSvgPathData("M 9.000 16.000 L 9.000 8.000 L 12.000 14.000 L 15.000 8.000 L 15.000 16.000"),
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
        return _bmp!!
    }

private var _bmp: ImageVector? = null
