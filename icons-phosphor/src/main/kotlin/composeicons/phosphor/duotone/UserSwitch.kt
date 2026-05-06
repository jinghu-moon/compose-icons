package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UserSwitch: ImageVector
    get() {
        if (_userSwitch != null) return _userSwitch!!
        _userSwitch = phosphorDuotoneIcon(
            name = "UserSwitch",
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
                pathData = parseSvgPathData("M253.66 133.66l-24 24c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346l-24-24c-3.126-3.126-3.126-8.194 0-11.32 3.126-3.126 8.194-3.126 11.32 0L216 132.69v-4.69C216.019 89.768 191.35 55.899 154.957 44.187 118.563 32.476 78.771 45.602 56.49 76.67c-2.579 3.59-7.58 4.409-11.17 1.83C41.73 75.921 40.911 70.92 43.49 67.33 69.824 30.614 116.851 15.102 159.862 28.945 202.872 42.787 232.024 82.817 232 128v4.69l10.34-10.35c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32ZM212.48 188.66c-26.341 36.687-73.349 52.18-116.342 38.343C53.146 213.167 23.998 173.164 24 128v-4.69L13.66 133.66c-3.126 3.126-8.194 3.126-11.32 0C-.786 130.534-.786 125.466 2.34 122.34l24-24C27.841 96.838 29.877 95.994 32 95.994c2.123 0 4.159 .844 5.66 2.346l24 24c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L40 123.31v4.69c-.019 21.542 7.898 42.336 22.24 58.41 8.922-12.929 21.468-22.932 36.06-28.75C82.233 145.005 75.949 123.56 82.646 104.235 89.342 84.911 107.548 71.952 128 71.952c20.452 0 38.658 12.959 45.354 32.284 6.696 19.325 .413 40.77-15.654 53.425 14.605 5.819 27.16 15.834 36.08 28.78 2.023-2.272 3.928-4.645 5.71-7.11 2.579-3.59 7.58-4.409 11.17-1.83 3.59 2.579 4.409 7.58 1.83 11.17ZM128 152c17.673 0 32-14.327 32-32C160 102.327 145.673 88 128 88c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32ZM128 216c19.524-.025 38.489-6.529 53.92-18.49C170.159 179.116 149.833 167.987 128 167.987c-21.833 0-42.159 11.13-53.92 29.523C89.488 209.514 108.468 216.023 128 216Z"),
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
        return _userSwitch!!
    }

private var _userSwitch: ImageVector? = null
