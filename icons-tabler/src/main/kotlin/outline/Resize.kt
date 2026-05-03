package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Resize: ImageVector
    get() {
        if (_resize != null) return _resize!!
        _resize = tablerOutlineIcon(
            name = "Resize",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 11.000 L 4.000 19.000 C 4.000 19.552 4.448 20.000 5.000 20.000 L 13.000 20.000M 4.000 6.000 L 4.000 5.000 C 4.000 4.448 4.448 4.000 5.000 4.000 L 6.000 4.000M 11.000 4.000 L 13.000 4.000M 18.000 4.000 L 19.000 4.000 C 19.552 4.000 20.000 4.448 20.000 5.000 L 20.000 6.000M 20.000 11.000 L 20.000 13.000M 20.000 18.000 L 20.000 19.000 C 20.000 19.552 19.552 20.000 19.000 20.000 L 18.000 20.000"),
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
                pathData = parseSvgPathData("M 4.000 12.000 L 11.000 12.000 C 11.552 12.000 12.000 12.448 12.000 13.000 L 12.000 20.000"),
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
        return _resize!!
    }

private var _resize: ImageVector? = null
