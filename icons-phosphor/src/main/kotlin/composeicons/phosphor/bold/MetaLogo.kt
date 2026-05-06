package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MetaLogo: ImageVector
    get() {
        if (_metaLogo != null) return _metaLogo!!
        _metaLogo = phosphorBoldIcon(
            name = "MetaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 149.31c0 16.84-3.37 31.33-9.75 41.91C226.06 204.81 213.33 212 197.44 212c-30.33 0-50.72-38.05-72.3-78.33C109.46 104.41 90 68 74 68 66.29 68 56.84 77.37 49.34 92.45 40.761 110.19 36.206 129.606 36 149.31c0 12.3 2.24 22.78 6.3 29.52 3.77 6.26 8.94 9.17 16.26 9.17 13.75 0 30.63-29 36.18-38.49 3.339-5.727 10.688-7.664 16.415-4.325 5.727 3.339 7.664 10.688 4.325 16.415-8.91 15.28-16.53 26-24 33.78C80.75 206.56 70 212 58.56 212 42.67 212 29.94 204.81 21.75 191.22 15.37 180.64 12 166.15 12 149.31 12 105.34 35.58 44 74 44c30.33 0 50.72 38.05 72.3 78.33C162 151.59 181.47 188 197.44 188c7.32 0 12.49-2.91 16.26-9.17 4.06-6.74 6.3-17.22 6.3-29.52-.203-19.704-4.755-39.119-13.33-56.86C199.17 77.37 189.72 68 182 68c-5.72 0-12.61 5-20.49 14.83-4.142 5.175-11.695 6.012-16.87 1.87-5.175-4.142-6.012-11.695-1.87-16.87C155.62 51.8 168.45 44 182 44c17.65 0 34 13.41 46.15 37.76 10.192 21.075 15.604 44.141 15.85 67.55Z"),
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
