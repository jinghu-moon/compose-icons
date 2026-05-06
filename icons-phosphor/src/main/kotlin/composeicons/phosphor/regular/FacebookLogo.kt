package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FacebookLogo: ImageVector
    get() {
        if (_facebookLogo != null) return _facebookLogo!!
        _facebookLogo = phosphorRegularIcon(
            name = "FacebookLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM136 215.63v-63.63h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-24v-24c0-8.837 7.163-16 16-16h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16c-17.673 0-32 14.327-32 32v24h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24v63.63C73.151 211.353 37.951 170.986 40.091 123.99 42.232 76.995 80.956 39.994 128 39.994c47.044 0 85.768 37.001 87.909 83.996 2.141 46.995-33.06 87.363-79.909 91.64Z"),
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
        return _facebookLogo!!
    }

private var _facebookLogo: ImageVector? = null
