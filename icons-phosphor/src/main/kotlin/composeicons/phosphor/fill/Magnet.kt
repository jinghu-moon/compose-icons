package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Magnet: ImageVector
    get() {
        if (_magnet != null) return _magnet!!
        _magnet = phosphorFillIcon(
            name = "Magnet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M207 50.25C190.567 33.478 168.08 24.019 144.6 24h-.33C120.899 23.94 98.476 33.234 82 49.81L20.61 112c-6.187 6.257-6.16 16.336 .06 22.56l28.66 28.66c2.996 3.011 7.072 4.7 11.32 4.69h.09c4.279-.023 8.37-1.759 11.36-4.82L133 100.69c6.183-6.121 16.113-6.214 22.41-.21 3.024 2.938 4.73 6.974 4.73 11.19 .041 4.485-1.704 8.803-4.85 12L93 183.88c-3.073 2.984-4.821 7.076-4.853 11.359-.032 4.284 1.655 8.401 4.683 11.431l28.66 28.66c6.216 6.178 16.238 6.232 22.52 .12L205.81 175C240.26 140.5 240.79 84.56 207 50.25ZM60.65 151.89 32 123.24 61.42 93.43l28.48 28.48ZM132.79 224 104.11 195.35l30.13-29.13 28.49 28.48Z"),
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
        return _magnet!!
    }

private var _magnet: ImageVector? = null
