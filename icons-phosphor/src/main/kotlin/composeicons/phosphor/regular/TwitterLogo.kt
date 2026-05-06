package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) return _twitterLogo!!
        _twitterLogo = phosphorRegularIcon(
            name = "TwitterLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M247.39 68.94C246.152 65.95 243.236 64.001 240 64h-30.43C200.916 49.277 185.177 40.168 168.1 40c-12.636-.166-24.805 4.774-33.75 13.7C125.143 62.735 119.97 75.101 120 88v6.09C79.74 83.47 46.81 50.72 46.46 50.37 44.269 48.159 40.994 47.42 38.066 48.476c-2.928 1.055-4.979 3.714-5.256 6.814-4.31 47.79 9.57 79.77 22 98.18 6.061 9.101 13.434 17.256 21.88 24.2C61.46 195.2 37.48 204.41 37.22 204.51c-2.287 .857-4.057 2.711-4.807 5.035-.75 2.324-.397 4.863 .957 6.895 .75 1.12 3.75 5.05 11.08 8.72C53.51 229.7 65.48 232 80 232c70.67 0 129.72-54.42 135.75-124.44L245.66 77.66c2.287-2.289 2.97-5.731 1.73-8.72ZM202.39 98.35c-1.372 1.375-2.196 3.202-2.32 5.14C196 166.58 143.28 216 80 216c-10.56 0-18-1.4-23.22-3.08 11.51-6.25 27.56-17 37.88-32.48 1.224-1.84 1.633-4.104 1.129-6.256-.504-2.152-1.875-3.999-3.789-5.104-.47-.27-43.91-26.34-44-96 16 13 45.25 33.17 78.67 38.79 2.318 .391 4.691-.258 6.488-1.774 1.797-1.516 2.836-3.745 2.842-6.096v-16c-.018-8.621 3.443-16.885 9.6-22.92 5.902-5.913 13.946-9.188 22.3-9.08 12.66 .16 24.49 7.88 29.44 19.21 1.275 2.911 4.152 4.791 7.33 4.79h16Z"),
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
