package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Campfire: ImageVector
    get() {
        if (_campfire != null) return _campfire!!
        _campfire = phosphorDuotoneIcon(
            name = "Campfire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 108c0 28.719-23.281 52-52 52 13.255 0 24-10.745 24-24C152 112 128 96 128 96c0 0-24 16-24 40 0 13.255 10.745 24 24 24C99.281 160 76 136.719 76 108 76 64 128 32 128 32c0 0 52 32 52 76Z"),
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
                pathData = parseSvgPathData("M128 168c33.121-.039 59.961-26.879 60-60C188 60.08 134.47 26.59 132.19 25.19c-2.57-1.58-5.81-1.58-8.38 0C113.776 31.711 104.525 39.364 96.24 48 77.77 67.13 68 87.9 68 108c.039 33.121 26.879 59.961 60 60ZM112 136c0-13.57 10-24.46 16-29.79 6 5.33 16 16.22 16 29.79 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM128 41.66C139.74 50 172 76 172 108c.003 11.259-4.326 22.087-12.09 30.24 .05-.74 .09-1.49 .09-2.24C160 108 133.56 90.09 132.44 89.34c-2.688-1.794-6.192-1.794-8.88 0C122.44 90.09 96 108 96 136c0 .75 0 1.5 .09 2.24C88.326 130.087 83.997 119.259 84 108 84 76 116.27 50 128 41.66ZM223.62 226.42c-.643 2.022-2.063 3.707-3.948 4.682-1.885 .975-4.08 1.162-6.102 .518L128 204.39 42.43 231.62c-4.211 1.339-8.711-.989-10.05-5.2-1.339-4.211 .989-8.711 5.2-10.05l64-20.37-64-20.38c-2.802-.802-4.945-3.064-5.596-5.904-.651-2.84 .294-5.81 2.467-7.752 2.173-1.942 5.23-2.549 7.979-1.584L128 187.6l85.57-27.22c2.75-.965 5.807-.358 7.979 1.584 2.173 1.942 3.118 4.911 2.467 7.752-.651 2.84-2.795 5.102-5.596 5.904l-64 20.38 64 20.37c2.022 .643 3.707 2.063 4.682 3.948 .975 1.885 1.162 4.08 .518 6.102Z"),
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
