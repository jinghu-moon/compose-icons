package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CurlyLoop: ImageVector
    get() {
        if (_curlyLoop != null) return _curlyLoop!!
        _curlyLoop = tablerOutlineIcon(
            name = "CurlyLoop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 8c-4 0-7 2-7 5 0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C20 10 17.5 8 12 8 6.5 8 4 10 4 13c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C10 10 7 8 3 8"),
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
        return _curlyLoop!!
    }

private var _curlyLoop: ImageVector? = null
