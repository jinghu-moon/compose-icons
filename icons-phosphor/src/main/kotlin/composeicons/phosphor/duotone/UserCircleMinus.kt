package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UserCircleMinus: ImageVector
    get() {
        if (_userCircleMinus != null) return _userCircleMinus!!
        _userCircleMinus = phosphorDuotoneIcon(
            name = "UserCircleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c.029 27.229-11.535 53.183-31.8 71.37C179.916 175.209 155.105 159.993 128 160c22.091 0 40-17.909 40-40C168 97.909 150.091 80 128 80 105.909 80 88 97.909 88 120c0 22.091 17.909 40 40 40-27.105-.007-51.916 15.209-64.2 39.37h0C31.027 169.891 22.54 121.881 43.222 82.953 63.904 44.026 108.439 24.185 151.212 34.844 193.984 45.502 224.002 83.919 224 128Z"),
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
                pathData = parseSvgPathData("M168 56c0-4.418 3.582-8 8-8h48c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-48c-4.418 0-8-3.582-8-8ZM226.08 93.33c15.604 44.196-.305 93.368-38.841 120.048C148.704 240.058 97.079 237.644 61.202 207.485 25.324 177.325 14.073 126.883 33.734 84.335 53.394 41.788 99.1 17.664 145.32 25.44c4.322 .764 7.221 4.869 6.497 9.198-.724 4.329-4.801 7.266-9.137 6.582C117.139 36.924 91.002 44.087 71.221 60.805 51.44 77.523 40.021 102.101 40 128c-.019 21.542 7.898 42.336 22.24 58.41 8.922-12.929 21.468-22.932 36.06-28.75C82.233 145.005 75.949 123.56 82.646 104.235 89.342 84.911 107.548 71.952 128 71.952c20.452 0 38.658 12.959 45.354 32.284 6.696 19.325 .413 40.77-15.654 53.425 14.592 5.818 27.138 15.821 36.06 28.75C215.044 162.479 221.647 128.875 211 98.67c-1.475-4.167 .708-8.74 4.875-10.215 4.167-1.475 8.74 .708 10.215 4.875ZM128 152c17.673 0 32-14.327 32-32C160 102.327 145.673 88 128 88c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32ZM128 216c19.534 .02 38.513-6.492 53.92-18.5C170.159 179.106 149.833 167.977 128 167.977c-21.833 0-42.159 11.13-53.92 29.523C89.487 209.508 108.466 216.02 128 216Z"),
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
        return _userCircleMinus!!
    }

private var _userCircleMinus: ImageVector? = null
