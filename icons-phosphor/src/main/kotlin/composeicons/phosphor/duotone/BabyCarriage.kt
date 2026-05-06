package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) return _babyCarriage!!
        _babyCarriage = phosphorDuotoneIcon(
            name = "BabyCarriage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 112h-88v-64c0-4.418 3.582-8 8-8h8c39.764 0 72 32.235 72 72Z"),
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
                pathData = parseSvgPathData("M160 32h-8c-8.837 0-16 7.163-16 16v56h-80.8C51.373 85.388 35.001 72.023 16 72c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 13.255 0 24 10.745 24 24 .05 44.162 35.838 79.95 80 80h40c44.183 0 80-35.817 80-80C240 67.817 204.183 32 160 32ZM223.48 104h-56.67L208.67 70.51c8.107 9.474 13.256 21.118 14.81 33.49ZM160 48c13.136-.012 25.953 4.043 36.69 11.61L152 95.35v-47.35ZM160 176h-40C87.761 175.961 60.569 151.981 56.5 120h167c-4.069 31.981-31.261 55.961-63.5 56ZM104 224c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM208 224c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
