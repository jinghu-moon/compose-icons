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
                pathData = parseSvgPathData("M 17.000 20.000 L 6.000 20.000 C 4.343 20.000 3.000 18.657 3.000 17.000 C 3.000 15.343 4.343 14.000 6.000 14.000 L 17.000 14.000 C 15.343 14.000 14.000 15.343 14.000 17.000 C 14.000 18.657 15.343 20.000 17.000 20.000 L 18.000 20.000 C 19.657 20.000 21.000 18.657 21.000 17.000 L 21.000 6.000 C 21.000 4.895 20.105 4.000 19.000 4.000 L 9.000 4.000 C 7.895 4.000 7.000 4.895 7.000 6.000 L 7.000 14.000"),
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
