package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CloudArrowUp: ImageVector
    get() {
        if (_cloudArrowUp != null) return _cloudArrowUp!!
        _cloudArrowUp = phosphorDuotoneIcon(
            name = "CloudArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 128c0 44.183-35.817 80-80 80h-88C50.325 207.973 30.612 195.441 21.39 175.826c-9.222-19.615-6.296-42.791 7.512-59.499C42.709 99.619 64.919 92.379 85.92 97.74v.1C100.357 62.428 137.838 42.186 175.368 49.532 212.898 56.878 239.98 89.758 240 128Z"),
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
                pathData = parseSvgPathData("M178.34 165.66 160 147.31v60.69c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-60.69l-18.34 18.35c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32l32-32c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346l32 32c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0ZM160 40C126.665 40.025 96.201 58.866 81.29 88.68 57.562 85.193 33.877 95.265 19.927 114.773 5.976 134.28 4.103 159.95 15.074 181.276 26.045 202.603 48.018 216.006 72 216h40c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-40C45.49 200 24 178.51 24 152c0-26.51 21.49-48 48-48 1.1 0 2.2 0 3.29 .12C73.103 111.891 71.996 119.927 72 128c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 .005-35.959 26.54-66.4 62.162-71.314 35.621-4.913 69.407 17.208 79.147 51.822 9.74 34.614-7.552 71.108-40.508 85.492-3.482 1.51-5.425 5.258-4.65 8.974 .775 3.715 4.054 6.375 7.85 6.366 1.102-.001 2.192-.233 3.2-.68 38.201-16.664 59.474-57.84 50.959-98.639C237.644 69.223 201.677 39.993 160 40Z"),
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
        return _cloudArrowUp!!
    }

private var _cloudArrowUp: ImageVector? = null
