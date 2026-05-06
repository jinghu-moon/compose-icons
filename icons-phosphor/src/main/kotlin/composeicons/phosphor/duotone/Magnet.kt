package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Magnet: ImageVector
    get() {
        if (_magnet != null) return _magnet!!
        _magnet = phosphorDuotoneIcon(
            name = "Magnet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168.36 200.36l-30 29.35c-3.132 3.075-8.156 3.052-11.26-.05L98.46 201c-1.516-1.514-2.362-3.574-2.347-5.717 .015-2.143 .889-4.19 2.427-5.683l30-29ZM26.36 117.6c-3.102 3.12-3.102 8.16 0 11.28L55 157.54c1.511 1.513 3.564 2.358 5.703 2.347 2.138-.011 4.183-.878 5.677-2.407L95.56 127.56 55.77 87.77Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M207 50.25C190.567 33.478 168.08 24.019 144.6 24h-.33C120.899 23.94 98.476 33.234 82 49.81L50.11 82.11h0L20.61 112c-6.187 6.257-6.16 16.336 .06 22.56l28.66 28.66c2.996 3.011 7.072 4.7 11.32 4.69h.09c4.279-.023 8.37-1.759 11.36-4.82L133 100.69c6.183-6.121 16.113-6.214 22.41-.21 3.024 2.938 4.73 6.974 4.73 11.19 .041 4.485-1.704 8.803-4.85 12L93 183.88c-3.073 2.984-4.821 7.076-4.853 11.359-.032 4.284 1.655 8.401 4.683 11.431l28.66 28.66c6.216 6.178 16.238 6.232 22.52 .12L205.81 175C240.26 140.5 240.79 84.56 207 50.25ZM60.65 151.89 32 123.24 55.8 99.12l28.52 28.52ZM132.79 224 104.11 195.35l24.38-23.57L157 200.32ZM194.55 163.56l-26.11 25.54L140 160.68l26.44-25.57 .1-.09c6.194-6.245 9.639-14.704 9.57-23.5C176.074 103.019 172.596 94.895 166.47 89 153.837 76.982 133.933 77.204 121.57 89.5L95.49 116.18 67 87.74 93.35 61.09C106.824 47.539 125.161 39.944 144.27 40h.27c19.21 .017 37.607 7.757 51.05 21.48 27.66 28.07 27.16 73.9-1.04 102.1Z"),
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
