package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PointerCancel: ImageVector
    get() {
        if (_pointerCancel != null) return _pointerCancel!!
        _pointerCancel = tablerOutlineIcon(
            name = "PointerCancel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.526 12.970 L 14.778 12.222 L 17.891 10.132 C 18.332 9.894 18.579 9.407 18.511 8.911 C 18.442 8.414 18.071 8.013 17.582 7.904 L 4.000 4.000 L 7.904 17.563 C 8.013 18.052 8.414 18.422 8.911 18.491 C 9.408 18.560 9.894 18.312 10.132 17.871 L 12.222 14.778 L 12.936 15.492"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 16.000 19.000 C 16.000 20.657 17.343 22.000 19.000 22.000 C 20.657 22.000 22.000 20.657 22.000 19.000 C 22.000 17.343 20.657 16.000 19.000 16.000 C 17.343 16.000 16.000 17.343 16.000 19.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 17.000 21.000 L 21.000 17.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _pointerCancel!!
    }

private var _pointerCancel: ImageVector? = null
