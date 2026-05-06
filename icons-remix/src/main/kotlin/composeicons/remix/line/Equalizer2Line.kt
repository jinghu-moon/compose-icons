package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Equalizer2Line: ImageVector
    get() {
        if (_equalizer2Line != null) return _equalizer2Line!!
        _equalizer2Line = remixIcon(
            name = "Equalizer2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5 7C5 6.172 5.672 5.5 6.5 5.5 7.328 5.5 8 6.172 8 7 8 7.828 7.328 8.5 6.5 8.5 5.672 8.5 5 7.828 5 7ZM6.5 3.5C4.567 3.5 3 5.067 3 7c0 1.933 1.567 3.5 3.5 3.5C8.433 10.5 10 8.933 10 7 10 5.067 8.433 3.5 6.5 3.5ZM12 8h8v-2h-8v2ZM16 17c0-.828 .672-1.5 1.5-1.5 .828 0 1.5 .672 1.5 1.5 0 .828-.672 1.5-1.5 1.5C16.672 18.5 16 17.828 16 17ZM17.5 13.5C15.567 13.5 14 15.067 14 17c0 1.933 1.567 3.5 3.5 3.5C19.433 20.5 21 18.933 21 17c0-1.933-1.567-3.5-3.5-3.5ZM4 16v2h8v-2h-8Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _equalizer2Line!!
    }

private var _equalizer2Line: ImageVector? = null
