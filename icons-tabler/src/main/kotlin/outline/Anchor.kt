package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Anchor: ImageVector
    get() {
        if (_anchor != null) return _anchor!!
        _anchor = tablerOutlineIcon(
            name = "Anchor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 9.000 L 12.000 21.000M 4.000 13.000 C 4.000 17.418 7.582 21.000 12.000 21.000 C 16.418 21.000 20.000 17.418 20.000 13.000M 21.000 13.000 L 19.000 13.000M 5.000 13.000 L 3.000 13.000"),
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
                pathData = parseSvgPathData("M 9.000 6.000 C 9.000 7.657 10.343 9.000 12.000 9.000 C 13.657 9.000 15.000 7.657 15.000 6.000 C 15.000 4.343 13.657 3.000 12.000 3.000 C 10.343 3.000 9.000 4.343 9.000 6.000"),
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
        return _anchor!!
    }

private var _anchor: ImageVector? = null
