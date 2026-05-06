package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pentagram: ImageVector
    get() {
        if (_pentagram != null) return _pentagram!!
        _pentagram = phosphorBoldIcon(
            name = "Pentagram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243 89.83C240.345 81.581 232.666 75.992 224 76h-58.15L147.05 18.05C144.463 9.723 136.763 4.044 128.043 4.032 119.324 4.021 111.609 9.68 109 18L90.15 76h-58.15c-8.677 0-16.364 5.596-19.031 13.852-2.667 8.257 .294 17.291 7.331 22.368l47.1 33.89L49.33 201.81c-2.677 8.233 .247 17.253 7.245 22.35 6.998 5.097 16.48 5.113 23.495 .04L128 189.71l47.89 34.45c7.008 5.091 16.497 5.093 23.507 .003 7.009-5.09 9.946-14.113 7.273-22.353L188.6 146.11l47.15-33.92c7.004-5.097 9.93-14.123 7.25-22.36ZM128 37.11 140.62 76h-25.24ZM44.42 100h37.94l-7.18 22.13ZM75.93 197.6 87.86 160.82l19.59 14.1ZM95.64 136.85l12-36.85h40.82l12 36.85L128 160.14ZM148.55 174.92l19.59-14.1 11.93 36.78ZM180.82 122.13 173.64 100h37.94Z"),
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
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
