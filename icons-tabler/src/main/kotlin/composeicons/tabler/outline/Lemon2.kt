package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Lemon2: ImageVector
    get() {
        if (_lemon2 != null) return _lemon2!!
        _lemon2 = tablerOutlineIcon(
            name = "Lemon2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18 4c.864 0 1.631 .555 1.9 1.376 .269 .821-.019 1.722-.715 2.235 1.55 2.94 .873 6.917-1.892 9.682-2.765 2.765-6.743 3.442-9.682 1.892-.466 .634-1.261 .936-2.031 .771C4.81 19.791 4.209 19.19 4.044 18.42c-.165-.77 .137-1.565 .771-2.031C3.265 13.449 3.942 9.472 6.707 6.707 9.472 3.942 13.45 3.265 16.389 4.815 16.766 4.303 17.364 4 18 4"),
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
        return _lemon2!!
    }

private var _lemon2: ImageVector? = null
