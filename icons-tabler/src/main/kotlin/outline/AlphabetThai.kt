package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlphabetThai: ImageVector
    get() {
        if (_alphabetThai != null) return _alphabetThai!!
        _alphabetThai = tablerOutlineIcon(
            name = "AlphabetThai",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.000 18.000 L 8.000 14.556 C 8.000 14.066 8.165 13.632 8.494 13.193 C 8.820 12.744 9.503 12.433 10.000 12.259 C 10.032 12.248 10.035 12.180 10.004 12.164 C 9.570 11.944 8.710 11.644 8.378 11.132 L 8.364 11.111 L 8.281 10.986 C 8.000 10.566 8.000 9.740 8.000 9.740 C 8.000 8.284 8.849 7.120 9.837 6.541 Q 10.737 6.001 11.974 6.000 Q 13.051 6.000 13.969 6.470 C 15.297 7.117 16.000 8.672 16.000 10.446 L 16.000 18.000"),
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
        return _alphabetThai!!
    }

private var _alphabetThai: ImageVector? = null
