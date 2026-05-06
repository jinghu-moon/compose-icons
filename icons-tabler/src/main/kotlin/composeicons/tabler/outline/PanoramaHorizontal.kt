package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PanoramaHorizontal: ImageVector
    get() {
        if (_panoramaHorizontal != null) return _panoramaHorizontal!!
        _panoramaHorizontal = tablerOutlineIcon(
            name = "PanoramaHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.338 5.53c5.106 1.932 10.211 1.932 15.317 0 .306-.112 .648-.069 .915 .117 .268 .186 .428 .491 .43 .817v11c0 .692-.692 1.2-1.34 .962C14.553 16.494 9.446 16.494 4.339 18.426 3.691 18.672 3 18.184 3 17.491v-11.027c.002-.324 .161-.628 .427-.814 .266-.186 .605-.231 .911-.121v.001"),
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
        return _panoramaHorizontal!!
    }

private var _panoramaHorizontal: ImageVector? = null
