package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Metronome: ImageVector
    get() {
        if (_metronome != null) return _metronome!!
        _metronome = tablerOutlineIcon(
            name = "Metronome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.153 8.188 L 13.433 4.952 C 13.179 3.812 12.168 3.000 11.000 3.000 C 9.831 3.000 8.820 3.812 8.566 4.952 L 5.541 18.566 C 5.409 19.158 5.554 19.778 5.933 20.251 C 6.313 20.724 6.886 21.000 7.493 21.000 L 14.507 21.000 C 15.114 21.000 15.687 20.724 16.067 20.251 C 16.446 19.778 16.591 19.158 16.459 18.566 L 15.935 16.209M 11.000 18.000 L 20.000 5.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 19.000 5.000 C 19.000 5.552 19.448 6.000 20.000 6.000 C 20.552 6.000 21.000 5.552 21.000 5.000 C 21.000 4.448 20.552 4.000 20.000 4.000 C 19.448 4.000 19.000 4.448 19.000 5.000"),
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
        return _metronome!!
    }

private var _metronome: ImageVector? = null
