package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Panorama: ImageVector
    get() {
        if (_panorama != null) return _panorama!!
        _panorama = phosphorFillIcon(
            name = "Panorama",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M241.75 51.32c-3.931-3.043-9.061-4.069-13.86-2.77l-3.48 .94C205.61 54.56 170.61 64 128 64 85.39 64 50.39 54.56 31.59 49.49l-3.48-.94c-4.8-1.276-9.92-.25-13.858 2.775C10.314 54.351 8.004 59.034 8 64v128c0 8.837 7.163 16 16 16 1.411-.001 2.817-.186 4.18-.55l3.18-.86C50.13 201.49 85.17 192 128 192c42.83 0 77.87 9.49 96.69 14.59l3.18 .86c4.802 1.283 9.928 .261 13.872-2.765 3.943-3.027 6.256-7.714 6.258-12.685v-128c.014-4.971-2.299-9.663-6.25-12.68ZM204 96c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM128 176C83 176 45.28 186.23 27.13 191.14L24 192v-39.3L70.34 106.35c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346L152.28 177c-7.79-.65-15.91-1-24.28-1ZM228.87 191.14c-16.768-4.72-33.797-8.46-51-11.2L142.61 144.68 157 130.34c3.124-3.122 8.186-3.122 11.31 0l60.89 60.88Z"),
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
