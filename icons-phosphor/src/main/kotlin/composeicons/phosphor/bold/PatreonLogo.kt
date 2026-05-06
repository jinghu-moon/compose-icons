package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PatreonLogo: ImageVector
    get() {
        if (_patreonLogo != null) return _patreonLogo!!
        _patreonLogo = phosphorBoldIcon(
            name = "PatreonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188.88 28.29C169.41 20.29 146.29 18 123.77 21.75c-24.28 4-45.33 14.53-60.88 30.34C25.47 90.15 33.05 167.56 50 207.88 56.87 224.36 69 244 87.51 244c25.38 0 36.72-22.14 46.73-41.68 6.73-13.14 13.69-26.74 24.23-33.89h0c5.49-3.72 13.22-6.7 21.41-9.86C203.57 149.44 236 136.93 236 93.17 236 64.19 218.82 40.54 188.88 28.29ZM171.24 136.18c-9.08 3.5-18.48 7.13-26.24 12.39-15.63 10.6-24.39 27.71-32.13 42.81C103.79 209.13 97.7 220 87.51 220c-1.28 0-8-3.81-15.41-21.4C57.48 163.75 51.89 97.51 80 68.91 91.79 56.91 108.73 48.57 127.69 45.42c5.619-.926 11.305-1.391 17-1.39 11.999-.102 23.907 2.094 35.08 6.47 12 4.92 32.21 17 32.21 42.67 .02 25.97-15.47 33.26-40.74 43.01Z"),
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
        return _patreonLogo!!
    }

private var _patreonLogo: ImageVector? = null
