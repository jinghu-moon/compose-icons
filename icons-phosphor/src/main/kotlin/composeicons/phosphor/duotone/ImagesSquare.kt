package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ImagesSquare: ImageVector
    get() {
        if (_imagesSquare != null) return _imagesSquare!!
        _imagesSquare = phosphorDuotoneIcon(
            name = "ImagesSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 40h-128c-4.418 0-8 3.582-8 8v128c0 4.418 3.582 8 8 8h16.69l77.65-77.66c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346L216 136.69v-88.69c0-4.418-3.582-8-8-8ZM120 104c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M208 32h-128C71.163 32 64 39.163 64 48v16h-16C39.163 64 32 71.163 32 80v128c0 8.837 7.163 16 16 16h128c8.837 0 16-7.163 16-16v-16h16c8.837 0 16-7.163 16-16v-128c0-8.837-7.163-16-16-16ZM80 48h128v69.38L191.3 100.68c-6.248-6.243-16.372-6.243-22.62 0L93.37 176h-13.37ZM176 208h-128v-128h16v96c0 8.837 7.163 16 16 16h96ZM208 176h-92l64-64 28 28v36ZM120 112c13.255 0 24-10.745 24-24C144 74.745 133.255 64 120 64 106.745 64 96 74.745 96 88c0 13.255 10.745 24 24 24ZM120 80c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8Z"),
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
        return _imagesSquare!!
    }

private var _imagesSquare: ImageVector? = null
