package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Certificate: ImageVector
    get() {
        if (_certificate != null) return _certificate!!
        _certificate = phosphorFillIcon(
            name = "Certificate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 86.53v-30.53c0-8.837-7.163-16-16-16h-176C31.163 40 24 47.163 24 56v128c0 8.837 7.163 16 16 16h120v24c-.026 2.871 1.489 5.536 3.969 6.982 2.48 1.447 5.545 1.453 8.031 .018l24-13.74L220 231c2.486 1.436 5.551 1.429 8.031-.018 2.48-1.447 3.995-4.111 3.969-6.982v-62.53c10.219-9.786 15.998-23.321 15.998-37.47 0-14.149-5.779-27.684-15.998-37.47ZM128 144h-56c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h56c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM128 112h-56c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h56c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM216 210.21l-16-9.16c-2.46-1.406-5.48-1.406-7.94 0l-16 9.16v-38.21c12.797 5.347 27.203 5.347 40 0ZM196 160c-19.882 0-36-16.118-36-36 0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36Z"),
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
        return _certificate!!
    }

private var _certificate: ImageVector? = null
