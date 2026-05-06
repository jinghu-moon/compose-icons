package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Campfire: ImageVector
    get() {
        if (_campfire != null) return _campfire!!
        _campfire = phosphorRegularIcon(
            name = "Campfire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.62 226.42c-.643 2.022-2.063 3.707-3.948 4.682-1.885 .975-4.08 1.162-6.102 .518L128 204.39 42.43 231.62c-4.211 1.339-8.711-.989-10.05-5.2-1.339-4.211 .989-8.711 5.2-10.05l64-20.37-64-20.38c-2.802-.802-4.945-3.064-5.596-5.904-.651-2.84 .294-5.81 2.467-7.752 2.173-1.942 5.23-2.549 7.979-1.584L128 187.6l85.57-27.22c2.75-.965 5.807-.358 7.979 1.584 2.173 1.942 3.118 4.911 2.467 7.752-.651 2.84-2.795 5.102-5.596 5.904l-64 20.38 64 20.37c2.022 .643 3.707 2.063 4.682 3.948 .975 1.885 1.162 4.08 .518 6.102ZM68 108C68 87.9 77.77 67.13 96.24 48c8.287-8.618 17.538-16.255 27.57-22.76 2.57-1.58 5.81-1.58 8.38 0C134.47 26.59 188 60.08 188 108c0 33.137-26.863 60-60 60C94.863 168 68 141.137 68 108ZM128 152c8.837 0 16-7.163 16-16 0-13.57-10-24.46-16-29.79-6 5.33-16 16.22-16 29.79 0 8.837 7.163 16 16 16ZM84 108c-.003 11.259 4.326 22.087 12.09 30.24 0-.74-.09-1.49-.09-2.24 0-28 26.44-45.91 27.56-46.66 2.688-1.794 6.192-1.794 8.88 0C133.56 90.09 160 108 160 136c0 .75 0 1.5-.09 2.24C167.674 130.087 172.003 119.259 172 108 172 76 139.74 50 128 41.66 116.27 50 84 76 84 108Z"),
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
        return _campfire!!
    }

private var _campfire: ImageVector? = null
