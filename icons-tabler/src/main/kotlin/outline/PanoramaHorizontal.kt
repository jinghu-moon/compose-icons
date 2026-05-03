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
                pathData = parseSvgPathData("M 4.338 5.530 C 9.444 7.462 14.549 7.462 19.655 5.530 C 19.961 5.418 20.303 5.461 20.570 5.647 C 20.838 5.833 20.999 6.138 21.000 6.464 L 21.000 17.464 C 21.000 18.156 20.308 18.664 19.660 18.426 C 14.553 16.494 9.446 16.494 4.339 18.426 C 3.691 18.672 3.000 18.184 3.000 17.491 L 3.000 6.464 C 3.002 6.140 3.161 5.836 3.427 5.650 C 3.693 5.465 4.033 5.419 4.338 5.529 L 4.338 5.530"),
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
