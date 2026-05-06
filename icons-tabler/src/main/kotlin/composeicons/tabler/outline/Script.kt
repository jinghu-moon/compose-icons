package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Script: ImageVector
    get() {
        if (_script != null) return _script!!
        _script = tablerOutlineIcon(
            name = "Script",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 20h-11C4.343 20 3 18.657 3 17 3 15.343 4.343 14 6 14h11c-1.657 0-3 1.343-3 3 0 1.657 1.343 3 3 3h1c1.657 0 3-1.343 3-3v-11C21 4.895 20.105 4 19 4h-10C7.895 4 7 4.895 7 6v8"),
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
        return _script!!
    }

private var _script: ImageVector? = null
