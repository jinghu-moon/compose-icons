package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PatreonLogo: ImageVector
    get() {
        if (_patreonLogo != null) return _patreonLogo!!
        _patreonLogo = phosphorFillIcon(
            name = "PatreonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 93.17c0 41-29.69 52.47-53.55 61.67-8.41 3.24-16.35 6.3-22.21 10.28-11.39 7.72-18.59 21.78-25.55 35.38C120.75 219.92 110.46 240 87.52 240 74.61 240 62.91 228.36 53.67 206.34c-9.24-22.02-14.31-51-13.61-77.45 1.08-40.65 14.58-62.68 25.7-74C80.71 39.69 101 29.59 124.44 25.69c21.79-3.62 44.14-1.38 62.93 6.3C215.73 43.6 232 65.9 232 93.17Z"),
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
