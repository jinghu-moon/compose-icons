package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Panorama: ImageVector
    get() {
        if (_panorama != null) return _panorama!!
        _panorama = phosphorDuotoneIcon(
            name = "Panorama",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 64v128c.002 2.637-1.296 5.107-3.47 6.6L168.28 130.35c-3.124-3.122-8.186-3.122-11.31 0L131.31 156 81.66 106.34C80.159 104.838 78.123 103.994 76 103.994c-2.123 0-4.159 .844-5.66 2.346L16 160.69v-96.69c-.002-2.485 1.15-4.829 3.119-6.345 1.969-1.516 4.53-2.031 6.931-1.395C43.35 60.89 81.44 72 128 72c46.56 0 84.65-11.11 102-15.73 2.393-.618 4.937-.095 6.893 1.417 1.955 1.512 3.102 3.842 3.107 6.313Z"),
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
                pathData = parseSvgPathData("M241.75 51.32c-3.932-3.042-9.061-4.067-13.86-2.77l-3.48 .94C205.61 54.56 170.61 64 128 64 85.39 64 50.39 54.56 31.59 49.49l-3.48-.94c-4.8-1.276-9.92-.25-13.858 2.775C10.314 54.351 8.004 59.034 8 64v128c0 8.837 7.163 16 16 16 1.411-.001 2.817-.186 4.18-.55l3.18-.86C50.13 201.49 85.17 192 128 192c42.83 0 77.87 9.49 96.69 14.59l3.18 .86c4.802 1.283 9.928 .261 13.872-2.765 3.943-3.027 6.256-7.714 6.258-12.685v-128c.014-4.971-2.299-9.663-6.25-12.68ZM27.42 64.93C46.94 70.2 83.27 80 128 80c44.73 0 81.06-9.8 100.58-15.07L232 64v118.76L173.93 124.69c-3.001-3.001-7.071-4.688-11.315-4.688-4.244 0-8.314 1.686-11.315 4.688l-20 20-44-44c-6.248-6.243-16.372-6.243-22.62 0L24 141.37v-77.37ZM213.84 187.21c-16.126-4.038-32.492-7.044-49-9L142.63 156l20-20ZM27.13 191.14 24 192v-28L76 112l64.25 64.25q-6-.24-12.25-.25C83 176 45.28 186.23 27.13 191.14ZM192 108c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12Z"),
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
        return _panorama!!
    }

private var _panorama: ImageVector? = null
