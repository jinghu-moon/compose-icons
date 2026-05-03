package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HexagonLetterO: ImageVector
    get() {
        if (_hexagonLetterO != null) return _hexagonLetterO!!
        _hexagonLetterO = tablerOutlineIcon(
            name = "HexagonLetterO",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.875 6.270 C 20.575 6.668 21.005 7.413 21.000 8.218 L 21.000 15.502 C 21.000 16.311 20.557 17.057 19.842 17.450 L 13.092 21.720 C 12.412 22.093 11.588 22.093 10.908 21.720 L 4.158 17.450 C 3.445 17.061 3.002 16.314 3.000 15.502 L 3.000 8.217 C 3.000 7.408 3.443 6.663 4.158 6.270 L 10.908 2.290 C 11.608 1.904 12.458 1.904 13.158 2.290 L 19.908 6.270 L 19.875 6.270"),
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
        pathData = parseSvgPathData("M 12.000 8.000 C 13.105 8.000 14.000 8.895 14.000 10.000 L 14.000 14.000 C 14.000 15.105 13.105 16.000 12.000 16.000 C 10.895 16.000 10.000 15.105 10.000 14.000 L 10.000 10.000 C 10.000 8.895 10.895 8.000 12.000 8.000"),
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
        return _hexagonLetterO!!
    }

private var _hexagonLetterO: ImageVector? = null
