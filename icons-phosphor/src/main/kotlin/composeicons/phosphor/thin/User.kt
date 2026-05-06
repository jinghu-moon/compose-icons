package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.User: ImageVector
    get() {
        if (_user != null) return _user!!
        _user = phosphorThinIcon(
            name = "User",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.46 214c-16.52-28.56-43-48.06-73.68-55.09 30.065-12.318 47.216-44.183 40.939-76.061C188.442 50.971 160.49 27.986 128 27.986c-32.49 0-60.442 22.984-66.719 54.862-6.277 31.878 10.874 63.744 40.939 76.061-30.64 7-57.16 26.53-73.68 55.09-.994 1.899-.313 4.244 1.543 5.317 1.856 1.073 4.227 .492 5.377-1.317C55 184.19 89.62 164 128 164c38.38 0 73 20.19 92.54 54 .714 1.236 2.032 1.999 3.46 2 .703 .002 1.394-.184 2-.54 1.909-1.106 2.562-3.549 1.46-5.46ZM68 96C68 62.863 94.863 36 128 36c33.137 0 60 26.863 60 60 0 33.137-26.863 60-60 60C94.879 155.961 68.039 129.121 68 96Z"),
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
        return _user!!
    }

private var _user: ImageVector? = null
