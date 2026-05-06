package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.StarOfDavid: ImageVector
    get() {
        if (_starOfDavid != null) return _starOfDavid!!
        _starOfDavid = phosphorLightIcon(
            name = "StarOfDavid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198.91 128 229.21 75c1.073-1.859 1.072-4.149-.003-6.006C228.131 67.137 226.146 65.995 224 66h-60.51L133.21 13C132.142 11.13 130.154 9.976 128 9.976c-2.154 0-4.142 1.154-5.21 3.024L92.5 66h-60.5c-2.146-.005-4.131 1.137-5.207 2.994-1.075 1.857-1.076 4.147-.003 6.006l30.28 53L26.79 181c-1.073 1.859-1.072 4.149 .003 6.006 1.075 1.857 3.06 2.999 5.207 2.994h60.5l30.29 53c1.068 1.87 3.056 3.024 5.21 3.024 2.154 0 4.142-1.154 5.21-3.024l30.28-53h60.51c2.146 .005 4.131-1.137 5.207-2.994 1.075-1.857 1.076-4.147 .003-6.006ZM213.66 78 192 115.91 170.34 78ZM185.09 128l-28.56 50h-57.07L70.9 128 99.46 78h57.07ZM128 28.09 149.67 66h-43.35ZM42.34 78h43.3L64 115.91ZM42.34 177.92 64 140.09 85.64 178ZM128 227.91 106.32 190h43.35ZM170.34 178 192 140.09 213.66 178Z"),
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
        return _starOfDavid!!
    }

private var _starOfDavid: ImageVector? = null
