package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pants: ImageVector
    get() {
        if (_pants != null) return _pants!!
        _pants = phosphorFillIcon(
            name = "Pants",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M53.44 43.5 54.12 38C55.128 29.998 61.935 23.997 70 24h116c8.065-.003 14.872 5.998 15.88 14l.68 5.49c.144 1.144-.213 2.295-.979 3.158-.766 .862-1.868 1.351-3.021 1.342h-141.15c-1.146 0-2.237-.492-2.997-1.35-.759-.859-1.114-2.002-.973-3.14ZM169 64c3.668 14.122 16.409 23.986 31 24h3.59c1.153 .009 2.255-.48 3.021-1.342 .766-.862 1.123-2.013 .979-3.158l-2-16c-.253-2.012-1.972-3.516-4-3.5ZM52.41 88h3.59C70.591 87.986 83.332 78.122 87 64h-32.59c-2.028-.016-3.747 1.488-4 3.5l-2 16c-.144 1.144 .213 2.295 .979 3.158 .766 .862 1.868 1.351 3.021 1.342ZM223.88 214 210.56 107.5c-.253-2.012-1.972-3.516-4-3.5h-6.56C176.591 103.967 156.61 87.077 152.68 64h-16.68v39.73c.053 4.281-3.205 7.879-7.47 8.25-2.212 .147-4.386-.631-6.003-2.147-1.617-1.517-2.532-3.636-2.527-5.853v-39.98h-16.68C99.39 87.077 79.409 103.967 56 104h-6.59c-2.028-.016-3.747 1.488-4 3.5L32.12 214c-.733 5.885 1.85 11.692 6.71 15.09 2.811 1.931 6.15 2.948 9.56 2.91h40.3c7.32 .001 13.707-4.965 15.51-12.06l23.8-92 23.79 91.94c1.78 7.122 8.179 12.119 15.52 12.12h40.3c3.408 .045 6.747-.965 9.56-2.89 4.867-3.401 7.45-9.218 6.71-15.11Z"),
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
        return _pants!!
    }

private var _pants: ImageVector? = null
