package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Campfire: ImageVector
    get() {
        if (_campfire != null) return _campfire!!
        _campfire = phosphorFillIcon(
            name = "Campfire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M132.19 25.19c-2.57-1.58-5.81-1.58-8.38 0C113.776 31.711 104.525 39.364 96.24 48 77.77 67.13 68 87.9 68 108c0 33.137 26.863 60 60 60 33.137 0 60-26.863 60-60C188 60.08 134.47 26.59 132.19 25.19ZM128 152c-13.255 0-24-10.745-24-24 0-24 24-40 24-40 0 0 24 16 24 40 0 13.255-10.745 24-24 24ZM223.62 226.42c-.643 2.022-2.063 3.707-3.948 4.682-1.885 .975-4.08 1.162-6.102 .518L128 204.39 42.43 231.62c-4.211 1.339-8.711-.989-10.05-5.2-1.339-4.211 .989-8.711 5.2-10.05l64-20.37-64-20.38c-2.802-.802-4.945-3.064-5.596-5.904-.651-2.84 .294-5.81 2.467-7.752 2.173-1.942 5.23-2.549 7.979-1.584L128 187.6l85.57-27.22c2.75-.965 5.807-.358 7.979 1.584 2.173 1.942 3.118 4.911 2.467 7.752-.651 2.84-2.795 5.102-5.596 5.904l-64 20.38 64 20.37c2.022 .643 3.707 2.063 4.682 3.948 .975 1.885 1.162 4.08 .518 6.102Z"),
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
