package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Rotate: ImageVector
    get() {
        if (_rotate != null) return _rotate!!
        _rotate = tablerOutlineIcon(
            name = "Rotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.95 11C19.427 7.009 16.019 4.028 11.994 4.04 7.968 4.052 4.579 7.053 4.08 11.047c-.499 3.994 2.047 7.738 5.946 8.74 3.899 1.003 7.935-1.048 9.425-4.788M19.95 20v-5h-5"),
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
        return _rotate!!
    }

private var _rotate: ImageVector? = null
