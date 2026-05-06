package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WhatsappLogo: ImageVector
    get() {
        if (_whatsappLogo != null) return _whatsappLogo!!
        _whatsappLogo = phosphorFillIcon(
            name = "WhatsappLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152.58 145.23l23 11.48C173.332 167.944 163.457 176.022 152 176 112.254 175.956 80.044 143.746 80 104 79.997 92.558 88.071 82.705 99.29 80.46l11.48 23L101 118c-1.483 2.224-1.757 5.042-.73 7.51 5.724 13.604 16.546 24.426 30.15 30.15 2.476 1.073 5.326 .824 7.58-.66ZM232 128c.008 36.523-19.143 70.373-50.453 89.178-31.31 18.805-70.189 19.808-102.427 2.642L45.07 231.17c-5.75 1.918-12.09 .421-16.375-3.865-4.286-4.286-5.782-10.626-3.865-16.375L36.18 176.88C15.859 138.673 21.32 91.875 49.893 59.375 78.466 26.874 124.179 15.463 164.674 30.723 205.169 45.984 231.982 84.725 232 128ZM192 152c.002-3.031-1.709-5.803-4.42-7.16l-32-16c-2.564-1.278-5.615-1.087-8 .5l-14.69 9.8c-6.743-3.707-12.293-9.257-16-16l9.8-14.69c1.587-2.385 1.778-5.436 .5-8l-16-32C109.837 65.718 107.049 63.992 104 64 81.909 64 64 81.909 64 104c.055 48.578 39.422 87.945 88 88 22.091 0 40-17.909 40-40Z"),
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
        return _whatsappLogo!!
    }

private var _whatsappLogo: ImageVector? = null
