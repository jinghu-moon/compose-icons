package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChessKnight: ImageVector
    get() {
        if (_chessKnight != null) return _chessKnight!!
        _chessKnight = tablerOutlineIcon(
            name = "ChessKnight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 16.000 L 6.553 16.724 C 6.214 16.893 6.000 17.239 6.000 17.618 L 6.000 20.000 L 18.000 20.000 L 18.000 17.618 C 18.000 17.239 17.786 16.893 17.447 16.724 L 16.000 16.000 L 8.000 16.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 9.000 3.000 L 10.000 6.000 L 6.509 8.148 C 6.128 8.382 5.948 8.842 6.070 9.272 C 6.192 9.703 6.585 10.000 7.033 10.000 L 10.000 10.000 L 7.927 16.000 L 15.888 16.000 L 16.000 11.000 C 16.000 8.000 14.910 5.017 12.000 4.000 C 10.060 3.322 9.060 2.989 9.000 3.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _chessKnight!!
    }

private var _chessKnight: ImageVector? = null
