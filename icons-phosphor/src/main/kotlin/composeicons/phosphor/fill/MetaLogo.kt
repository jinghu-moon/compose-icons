package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MetaLogo: ImageVector
    get() {
        if (_metaLogo != null) return _metaLogo!!
        _metaLogo = phosphorFillIcon(
            name = "MetaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-176C31.163 40 24 47.163 24 56v144c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-144c0-8.837-7.163-16-16-16ZM201.23 170.26c-5.63 9-14.33 13.74-25.16 13.74-20.73 0-34.81-25.31-49.72-52.11C115.47 112.33 101.93 88 90.61 88 78.18 88 64 116.88 64 142.21c0 8.26 1.5 15 4.34 19.56C71 166 74.68 168 79.93 168c6.08 0 13.52-7 22.74-21.51 2.432-3.576 7.265-4.573 10.913-2.25 3.648 2.323 4.789 7.124 2.577 10.84C99.84 180.71 88.22 184 79.93 184 69.1 184 60.4 179.25 54.77 170.26 50.34 163.18 48 153.48 48 142.26c.176-15.708 3.939-31.168 11-45.2C67.34 80.9 78.57 72 90.61 72c20.73 0 34.81 25.31 49.72 52.11C151.21 143.66 164.75 168 176.07 168c5.25 0 8.93-2 11.59-6.23 2.84-4.53 4.34-11.3 4.34-19.56C192 116.88 177.82 88 165.39 88c-3.4 0-7.35 2.31-11.74 6.88-3.062 3.187-8.128 3.287-11.315 .225-3.187-3.062-3.287-8.128-.225-11.315C149.74 75.86 157.35 72 165.39 72c12 0 23.27 8.9 31.62 25.06 7.054 14.017 10.816 29.459 11 45.15-.01 11.27-2.35 20.97-6.78 28.05Z"),
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
        return _metaLogo!!
    }

private var _metaLogo: ImageVector? = null
