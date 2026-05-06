package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Goggles: ImageVector
    get() {
        if (_goggles != null) return _goggles!!
        _goggles = phosphorDuotoneIcon(
            name = "Goggles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 152c0 17.67-30.33 32-48 32-17.673 0-32-14.327-32-32 0-17.673 14.327-32 32-32 17.67 0 48 14.33 48 32ZM72 120c-17.67 0-48 14.33-48 32 0 17.67 30.33 32 48 32 17.673 0 32-14.327 32-32C104 134.327 89.673 120 72 120Z"),
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
                pathData = parseSvgPathData("M256 136C255.956 96.254 223.746 64.044 184 64h-112C32.254 64.044 .044 96.254 0 136c0 10.568 6.897 19.899 17 23 6.06 20.37 37.63 33 55 33 19.001-.023 35.373-13.388 39.2-32h33.6c3.827 18.612 20.199 31.977 39.2 32 17.33 0 48.9-12.66 55-33 10.103-3.101 17-12.432 17-23ZM45.45 167.74C37 162.76 32 156.88 32 152c0-4.88 4.91-10.61 13.13-15.55l37.21 37.2C79.115 175.203 75.58 176.006 72 176c-7.53 0-18.2-3.32-26.55-8.26ZM93.65 162.34 61 129.7c3.577-1.044 7.275-1.615 11-1.7 13.255 0 24 10.745 24 24 .006 3.58-.797 7.115-2.35 10.34ZM160 152c-.005-5.554 1.925-10.936 5.46-15.22L201 172.32c-6 2.3-12.15 3.68-17 3.68-13.255 0-24-10.745-24-24ZM215.63 164.31 179.71 128.39c1.416-.257 2.851-.388 4.29-.39 7.53 0 18.2 3.32 26.55 8.26C218.9 141.2 224 147.12 224 152c0 3.79-3 8.2-8.37 12.31ZM237.68 141.62C229.34 123.25 200.34 112 184 112c-19.001 .023-35.373 13.388-39.2 32h-33.6C107.373 125.388 91.001 112.023 72 112c-16.34 0-45.34 11.25-53.68 29.62C16.837 140.125 16.004 138.106 16 136 16.033 105.086 41.086 80.033 72 80h112c30.914 .033 55.967 25.086 56 56-.004 2.106-.837 4.125-2.32 5.62Z"),
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
        return _goggles!!
    }

private var _goggles: ImageVector? = null
