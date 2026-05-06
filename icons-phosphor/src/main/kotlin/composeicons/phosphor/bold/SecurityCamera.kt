package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SecurityCamera: ImageVector
    get() {
        if (_securityCamera != null) return _securityCamera!!
        _securityCamera = phosphorBoldIcon(
            name = "SecurityCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M244 132c-6.627 0-12 5.373-12 12v12h-35L182.65 141.66 230.17 94.14c7.808-7.81 7.808-20.47 0-28.28l-56-56C170.418 6.098 165.323 3.984 160.01 3.984c-5.313 0-10.408 2.114-14.16 5.876L6.42 150.47c-6.276 6.297-8.145 15.754-4.736 23.965C5.093 182.646 13.109 187.999 22 188h33.7l26.14 26.14c3.751 3.752 8.839 5.861 14.145 5.861 5.306 0 10.394-2.108 14.145-5.861l55.51-55.51 15.52 15.51c3.743 3.767 8.84 5.877 14.15 5.86h36.69v12c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-48c0-6.627-5.373-12-12-12ZM160 29.67l15 15L55.71 164h-28.9ZM96 194.34 77.65 176 192 61.66 210.34 80l-53.17 53.17h0Z"),
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
        return _securityCamera!!
    }

private var _securityCamera: ImageVector? = null
