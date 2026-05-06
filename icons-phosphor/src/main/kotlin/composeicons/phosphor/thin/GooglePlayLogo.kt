package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GooglePlayLogo: ImageVector
    get() {
        if (_googlePlayLogo != null) return _googlePlayLogo!!
        _googlePlayLogo = phosphorThinIcon(
            name = "GooglePlayLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237.89 117.69 70.05 21.62c-3.746-2.194-8.384-2.194-12.13 0C54.235 23.711 51.97 27.633 52 31.87v192.26c-.016 4.223 2.247 8.126 5.92 10.21 3.746 2.194 8.384 2.194 12.13 0l167.77-96c3.791-2.046 6.16-6.001 6.175-10.309 .015-4.308-2.328-8.279-6.105-10.351ZM185.45 96.89 160 122.34 66.4 28.75ZM60 222.33v-188.66L154.34 128ZM66.4 227.25 160 133.66l25.45 25.45ZM233.91 131.37 192.65 155l-27-27 27-27L234 124.66c1.252 .658 2.03 1.962 2.016 3.376-.015 1.414-.82 2.702-2.086 3.334Z"),
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
        return _googlePlayLogo!!
    }

private var _googlePlayLogo: ImageVector? = null
