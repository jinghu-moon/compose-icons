package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Knife: ImageVector
    get() {
        if (_knife != null) return _knife!!
        _knife = phosphorFillIcon(
            name = "Knife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 49C235.974 38.913 229.888 29.829 220.568 25.969c-9.319-3.861-20.046-1.742-27.198 5.371L143.16 81.54 18.34 206.4c-2.055 2.057-2.833 5.067-2.031 7.862 .802 2.795 3.058 4.934 5.891 5.588 11.87 2.752 24.015 4.144 36.2 4.15 32.95 0 65.91-10.2 96.94-30.23 31.76-20.5 50.19-43.82 51-44.8 2.495-3.184 2.22-7.729-.64-10.59L181.31 114 228.69 66.61C233.372 61.946 236.003 55.609 236 49ZM146.23 180.6C111.8 202.7 76.29 211.52 40.47 206.9L146 101.34l43.09 43.1c-12.686 13.831-27.09 25.983-42.86 36.16Z"),
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
        return _knife!!
    }

private var _knife: ImageVector? = null
