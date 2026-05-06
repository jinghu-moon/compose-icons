package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PersonSimpleSki: ImageVector
    get() {
        if (_personSimpleSki != null) return _personSimpleSki!!
        _personSimpleSki = phosphorDuotoneIcon(
            name = "PersonSimpleSki",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 60c0 11.046-8.954 20-20 20C160.954 80 152 71.046 152 60c0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20Z"),
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
                pathData = parseSvgPathData("M172 88c15.464 0 28-12.536 28-28C200 44.536 187.464 32 172 32c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28ZM172 48c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM32.32 77.76c1.237-4.242 5.678-6.677 9.92-5.44L112 92.67 122.32 82.34c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346L163.31 112h36.69c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-40c-2.122 .002-4.158-.84-5.66-2.34L148.73 120 37.73 87.64C33.521 86.389 31.106 81.98 32.32 77.76ZM236.44 204.24c-17.173 11.475-38.548 14.752-58.37 8.95L21.76 167.67c-4.242-1.237-6.677-5.678-5.44-9.92 1.237-4.242 5.678-6.677 9.92-5.44l76 22.13L128.73 148 85.8 135.69c-4.25-1.215-6.71-5.645-5.495-9.895 1.215-4.25 5.645-6.71 9.895-5.495l56 16c2.726 .778 4.837 2.941 5.548 5.686 .711 2.744-.083 5.66-2.088 7.664l-29.9 29.9 62.79 18.28c15.282 4.475 31.761 1.949 45-6.9 3.675-2.452 8.643-1.46 11.095 2.215 2.452 3.675 1.46 8.643-2.215 11.095Z"),
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
        return _personSimpleSki!!
    }

private var _personSimpleSki: ImageVector? = null
