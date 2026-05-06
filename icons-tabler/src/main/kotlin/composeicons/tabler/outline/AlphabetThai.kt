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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8 18v-3.444c0-.49 .165-.924 .494-1.363 .326-.449 1.009-.76 1.506-.934 .032-.011 .035-.079 .004-.095C9.57 11.944 8.71 11.644 8.378 11.132l-.014-.021-.083-.125C8 10.566 8 9.74 8 9.74 8 8.284 8.849 7.12 9.837 6.541Q10.737 6.001 11.974 6q1.077 0 1.995 .47C15.297 7.117 16 8.672 16 10.446v7.554"),
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
        return _alphabetThai!!
    }

private var _alphabetThai: ImageVector? = null
