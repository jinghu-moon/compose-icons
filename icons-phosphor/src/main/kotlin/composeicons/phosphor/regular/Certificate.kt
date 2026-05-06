package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Certificate: ImageVector
    get() {
        if (_certificate != null) return _certificate!!
        _certificate = phosphorRegularIcon(
            name = "Certificate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 136c0 4.418-3.582 8-8 8h-48c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h48c4.418 0 8 3.582 8 8ZM120 96h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM232 161.47v62.53c.026 2.871-1.489 5.536-3.969 6.982-2.48 1.447-5.545 1.453-8.031 .018L196 217.26 172 231c-2.486 1.436-5.551 1.429-8.031-.018C161.489 229.536 159.974 226.871 160 224v-24h-120c-8.837 0-16-7.163-16-16v-128C24 47.163 31.163 40 40 40h176c8.837 0 16 7.163 16 16v30.53c10.219 9.786 15.998 23.321 15.998 37.47 0 14.149-5.779 27.684-15.998 37.47ZM160 184v-22.53C142.015 144.125 138.909 116.442 152.602 95.542 166.295 74.643 192.917 66.437 216 76v-20h-176v128ZM216 172c-12.797 5.347-27.203 5.347-40 0v38.22l16-9.16c2.46-1.406 5.48-1.406 7.94 0l16 9.16ZM232 124C232 104.118 215.882 88 196 88c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36Z"),
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
