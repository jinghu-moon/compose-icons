package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Microphone2: ImageVector
    get() {
        if (_microphone2 != null) return _microphone2!!
        _microphone2 = tablerOutlineIcon(
            name = "Microphone2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 12.900 C 17.162 13.340 19.358 12.311 20.402 10.367 C 21.446 8.423 21.092 6.024 19.532 4.464 C 17.971 2.904 15.572 2.552 13.629 3.597 C 11.685 4.642 10.657 6.838 11.098 9.000"),
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
        pathData = parseSvgPathData("M 15.000 12.900 L 11.098 9.001 L 3.585 17.585 C 2.804 18.366 2.803 19.632 3.583 20.413 C 4.364 21.195 5.631 21.196 6.412 20.415 L 15.000 12.900"),
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
        return _microphone2!!
    }

private var _microphone2: ImageVector? = null
