package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Shredder: ImageVector
    get() {
        if (_shredder != null) return _shredder!!
        _shredder = tablerOutlineIcon(
            name = "Shredder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 11.000 C 4.000 10.448 4.448 10.000 5.000 10.000 L 19.000 10.000 C 19.552 10.000 20.000 10.448 20.000 11.000 L 20.000 14.000 C 20.000 14.552 19.552 15.000 19.000 15.000 L 5.000 15.000 C 4.448 15.000 4.000 14.552 4.000 14.000 L 4.000 11.000"),
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
                pathData = parseSvgPathData("M 17.000 10.000 L 17.000 6.000 C 17.000 4.895 16.105 4.000 15.000 4.000 L 9.000 4.000 C 7.895 4.000 7.000 4.895 7.000 6.000 L 7.000 10.000M 12.000 15.000 L 12.000 20.000M 16.000 15.000 L 16.000 17.000M 8.000 15.000 L 8.000 18.000"),
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
        return _shredder!!
    }

private var _shredder: ImageVector? = null
