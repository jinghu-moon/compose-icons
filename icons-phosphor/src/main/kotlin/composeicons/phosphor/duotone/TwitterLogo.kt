package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) return _twitterLogo!!
        _twitterLogo = phosphorDuotoneIcon(
            name = "TwitterLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 72l-32 32C203.74 170.84 147.92 224 80 224 48 224 40 212 40 212c0 0 32-12 48-36C88 176 32.85 144 40.78 56c0 0 39.66 40 87.22 48v-16c0-22 18-40.27 40-40 15.852 .184 30.157 9.547 36.67 24Z"),
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
                pathData = parseSvgPathData("M247.39 68.94C246.152 65.95 243.236 64.001 240 64h-30.43C200.917 49.276 185.178 40.166 168.1 40c-12.633-.168-24.8 4.772-33.74 13.7C125.147 62.731 119.969 75.099 120 88v6.09C79.74 83.47 46.81 50.72 46.46 50.37 44.269 48.159 40.994 47.42 38.066 48.476c-2.928 1.055-4.979 3.714-5.256 6.814-4.3 47.79 9.57 79.77 22 98.18 6.064 9.102 13.44 17.257 21.89 24.2C61.43 195.2 37.45 204.41 37.2 204.51c-2.287 .857-4.057 2.711-4.807 5.035-.75 2.324-.397 4.863 .957 6.895 .74 1.12 3.75 5.05 11.08 8.72C53.51 229.7 65.48 232 80 232c70.68 0 129.72-54.42 135.76-124.44L245.66 77.66c2.287-2.289 2.97-5.731 1.73-8.72ZM202.39 98.35c-1.372 1.375-2.196 3.202-2.32 5.14C196 166.58 143.28 216 80 216c-10.56 0-18-1.4-23.22-3.08 11.52-6.25 27.56-17 37.88-32.48 1.222-1.832 1.634-4.087 1.14-6.233-.494-2.146-1.851-3.994-3.75-5.107-.13-.08-12.86-7.74-24.48-25.29C54.54 124.11 48 100.38 48 73.09c16 13 45.25 33.18 78.69 38.8 2.319 .385 4.689-.269 6.482-1.789 1.793-1.52 2.827-3.751 2.828-6.101v-16c-.018-8.621 3.443-16.885 9.6-22.92 5.899-5.918 13.944-9.194 22.3-9.08 12.66 .16 24.49 7.88 29.44 19.21 1.275 2.911 4.152 4.791 7.33 4.79h16Z"),
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
        return _twitterLogo!!
    }

private var _twitterLogo: ImageVector? = null
