package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FilmSlate: ImageVector
    get() {
        if (_filmSlate != null) return _filmSlate!!
        _filmSlate = phosphorFillIcon(
            name = "FilmSlate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 104h-113.91L210 75.51c2.063-.544 3.824-1.889 4.89-3.737 1.067-1.848 1.351-4.045 .79-6.103l-8.16-30C205.183 27.271 196.528 22.311 188.1 24.54L35.81 64.74c-4.096 1.063-7.592 3.73-9.7 7.4-2.12 3.625-2.679 7.955-1.55 12L32 111.56c0 .14 0 .29 0 .44v88c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-88c0-4.418-3.582-8-8-8ZM192.16 40l6 22.07L164.57 71 136.44 54.72ZM77.55 70.27l28.12 16.24L46.07 102.24l-6-22.08Z"),
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
        return _filmSlate!!
    }

private var _filmSlate: ImageVector? = null
