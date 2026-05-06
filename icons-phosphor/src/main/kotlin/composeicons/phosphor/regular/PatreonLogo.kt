package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PatreonLogo: ImageVector
    get() {
        if (_patreonLogo != null) return _patreonLogo!!
        _patreonLogo = phosphorRegularIcon(
            name = "PatreonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M187.37 32C168.58 24.32 146.23 22.08 124.44 25.7 101 29.6 80.71 39.7 65.76 54.9 54.64 66.22 41.14 88.25 40.06 128.9c-.7 26.49 4.39 55.44 13.61 77.45C62.89 228.36 74.61 240 87.52 240c22.94 0 33.23-20.08 43.17-39.5 7-13.6 14.16-27.66 25.55-35.38h0c5.86-4 13.8-7 22.21-10.28C202.31 145.64 232 134.18 232 93.17 232 65.9 215.73 43.6 187.37 32ZM172.69 139.91c-9.28 3.58-18.05 7-25.43 12-14.78 10-23.3 26.66-30.81 41.33C106.67 212.3 100.05 224 87.52 224 83 224 75.34 216.63 68.43 200.15c-8.39-20-13-46.49-12.37-70.83 .73-27.66 8.23-50.11 21.11-63.21C95.23 47.74 120.79 40 144.57 40c12.566-.111 25.037 2.183 36.74 6.76 13 5.3 34.69 18.38 34.69 46.37 0 30.08-20.07 37.87-43.31 46.78Z"),
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
