package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DribbbleLogo: ImageVector
    get() {
        if (_dribbbleLogo != null) return _dribbbleLogo!!
        _dribbbleLogo = phosphorRegularIcon(
            name = "DribbbleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM215.65 120.18Q211.83 120 208 120c-14.84 .004-29.614 1.968-43.94 5.84C160.567 115.476 156.062 105.481 150.61 96c14.22-8.575 27.093-19.207 38.2-31.55 15.412 14.705 24.952 34.512 26.84 55.73ZM176.28 54.46C166.287 65.44 154.738 74.894 142 82.52 131.332 67.504 118.283 54.331 103.37 43.52c24.761-7.228 51.446-3.229 73 10.94ZM85.65 50.88c16.346 10.294 30.597 23.588 42 39.18C107.692 99.258 85.976 104.015 64 104c-6.782-.003-13.557-.454-20.28-1.35C50.41 80.585 65.456 62.007 85.65 50.88ZM40 128c-0-3.221 .177-6.439 .53-9.64 7.776 1.092 15.618 1.64 23.47 1.64 25.095 .024 49.877-5.58 72.52-16.4 4.989 8.615 9.112 17.703 12.31 27.13-8.498 3.192-16.722 7.072-24.59 11.6-21.949 12.68-40.769 30.13-55.07 51.06C50.597 176.728 39.99 152.951 40 128ZM82 203c12.984-19.203 30.163-35.203 50.24-46.79 6.712-3.874 13.717-7.217 20.95-10 2.475 10.985 3.726 22.21 3.73 33.47 .005 10.947-1.165 21.863-3.49 32.56C129.393 219.502 103.398 216.139 82 203ZM171.06 204.73c1.234-8.276 1.856-16.632 1.86-25-.002-12.952-1.495-25.86-4.45-38.47C181.359 137.782 194.65 136.013 208 136q3.8 0 7.61 .19c-2.718 28.765-19.364 54.371-44.55 68.53Z"),
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
        return _dribbbleLogo!!
    }

private var _dribbbleLogo: ImageVector? = null
