package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pointer: ImageVector
    get() {
        if (_pointer != null) return _pointer!!
        _pointer = tablerOutlineIcon(
            name = "Pointer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.904 17.563 C 8.013 18.052 8.414 18.422 8.911 18.491 C 9.408 18.560 9.894 18.312 10.132 17.871 L 12.222 14.778 L 17.129 19.685 C 17.329 19.885 17.601 19.998 17.883 19.998 C 18.166 19.998 18.438 19.885 18.638 19.685 L 19.685 18.638 C 19.885 18.438 19.998 18.166 19.998 17.883 C 19.998 17.601 19.885 17.329 19.685 17.129 L 14.778 12.222 L 17.891 10.132 C 18.332 9.894 18.579 9.407 18.511 8.911 C 18.442 8.414 18.071 8.013 17.582 7.904 L 4.000 4.000 L 7.904 17.563"),
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
        return _pointer!!
    }

private var _pointer: ImageVector? = null
