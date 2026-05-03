package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sticker2: ImageVector
    get() {
        if (_sticker2 != null) return _sticker2!!
        _sticker2 = tablerOutlineIcon(
            name = "Sticker2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 4.000 L 18.000 4.000 C 19.105 4.000 20.000 4.895 20.000 6.000 L 20.000 13.000 L 15.000 13.000 C 13.895 13.000 13.000 13.895 13.000 15.000 L 13.000 20.000 L 6.000 20.000 C 4.895 20.000 4.000 19.105 4.000 18.000 L 4.000 6.000 C 4.000 4.895 4.895 4.000 6.000 4.000"),
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
                pathData = parseSvgPathData("M 20.000 13.000 L 20.000 13.172 C 20.000 13.702 19.789 14.211 19.414 14.586 L 14.586 19.414 C 14.211 19.789 13.702 20.000 13.172 20.000 L 13.000 20.000"),
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
        return _sticker2!!
    }

private var _sticker2: ImageVector? = null
