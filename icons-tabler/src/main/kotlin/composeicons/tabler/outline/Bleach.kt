package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bleach: ImageVector
    get() {
        if (_bleach != null) return _bleach!!
        _bleach = tablerOutlineIcon(
            name = "Bleach",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 19h14c.663-.005 1.28-.337 1.648-.888 .368-.551 .44-1.248 .192-1.862L13.74 4C13.388 3.363 12.718 2.968 11.99 2.968c-.728 0-1.398 .395-1.75 1.032L3.14 16.25c-.244 .6-.182 1.28 .166 1.826 .348 .546 .938 .89 1.584 .924"),
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
        return _bleach!!
    }

private var _bleach: ImageVector? = null
