package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CloudArrowDown: ImageVector
    get() {
        if (_cloudArrowDown != null) return _cloudArrowDown!!
        _cloudArrowDown = phosphorDuotoneIcon(
            name = "CloudArrowDown",
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
                pathData = parseSvgPathData("M248 128c.05 19.052-6.131 37.597-17.6 52.81-2.656 3.535-7.675 4.246-11.21 1.59-3.535-2.656-4.246-7.675-1.59-11.21C226.988 158.752 232.046 143.583 232 128 232 88.235 199.764 56 160 56 120.235 56 88 88.235 88 128c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8-.004-8.073 1.103-16.109 3.29-23.88C74.2 104 73.1 104 72 104c-26.51 0-48 21.49-48 48 0 26.51 21.49 48 48 48h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-24C48.018 216.006 26.045 202.603 15.074 181.276 4.103 159.95 5.976 134.28 19.927 114.773 33.877 95.265 57.562 85.193 81.29 88.68 99.539 52.182 140.485 33.017 180.201 42.384 219.918 51.752 247.984 87.194 248 128ZM178.34 170.34 160 188.69v-60.69c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v60.69L125.66 170.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32l32 32c1.501 1.502 3.537 2.346 5.66 2.346 2.123 0 4.159-.844 5.66-2.346l32-32c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0Z"),
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
        return _cloudArrowDown!!
    }

private var _cloudArrowDown: ImageVector? = null
