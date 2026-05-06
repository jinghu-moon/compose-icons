package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FishSimple: ImageVector
    get() {
        if (_fishSimple != null) return _fishSimple!!
        _fishSimple = phosphorThinIcon(
            name = "FishSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 76c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM206.77 152.73c-14.5 20-36.17 33.57-64.38 40.2-20.91 4.91-45.61 6-73.8 3.42q2.46 20.18 7.41 42.79c.48 2.144-.86 4.274-3 4.77-.283 .06-.571 .09-.86 .09-1.875-.003-3.497-1.309-3.9-3.14C64.907 225.879 62.33 210.74 60.52 195.5Q39.12 193.01 15.19 187.78c-1.519-.165-2.812-1.181-3.331-2.618-.519-1.437-.174-3.045 .889-4.142 1.063-1.098 2.659-1.493 4.112-1.02q22.59 4.95 42.76 7.41C57 159.25 58.14 134.57 63.05 113.68 69.68 85.47 83.19 63.8 103.23 49.29 127.32 31.8 156.61 28 177.53 28h1.71c22 .21 40.12 4.54 41.81 5.53 .589 .36 1.075 .867 1.41 1.47 1 1.68 5.31 19.8 5.53 41.79 .21 20.96-3.3 51.21-21.22 75.94ZM194.54 155.16C145.564 149.009 106.991 110.436 100.84 61.46 72.92 86.54 61.84 129.08 67.7 188.27c59.2 5.87 101.75-5.2 126.84-33.11ZM215.74 40.26C204.9 37.73 148.5 26.69 108.3 55.46c3.666 49.341 42.89 88.568 92.23 92.24C229.29 107.52 218.27 51.11 215.74 40.26Z"),
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
        return _fishSimple!!
    }

private var _fishSimple: ImageVector? = null
