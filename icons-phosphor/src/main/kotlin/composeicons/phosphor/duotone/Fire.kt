package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Fire: ImageVector
    get() {
        if (_fire != null) return _fire!!
        _fire = phosphorDuotoneIcon(
            name = "Fire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 144c0 44.183-35.817 80-80 80C83.817 224 48 188.183 48 144 48 113.43 62.42 85.74 79 64l33 32L138.27 24C159.86 41.92 208 88.15 208 144Z"),
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
                pathData = parseSvgPathData("M183.89 153.34c-4.249 23.732-22.827 42.306-46.56 46.55-.44 .07-.885 .107-1.33 .11-4.161-.001-7.626-3.191-7.97-7.338-.344-4.146 2.547-7.865 6.65-8.552 16.57-2.79 30.63-16.85 33.44-33.45 .74-4.358 4.872-7.29 9.23-6.55 4.358 .74 7.29 4.872 6.55 9.23ZM216 144c0 48.601-39.399 88-88 88C79.399 232 40 192.601 40 144 40 116.08 51 87.53 72.66 59.15c1.387-1.818 3.485-2.955 5.765-3.125 2.28-.17 4.524 .643 6.165 2.235l24.12 23.41L130.71 21.26c.892-2.445 2.918-4.303 5.43-4.982 2.513-.678 5.198-.092 7.2 1.572C165.21 36 216 84.55 216 144ZM200 144C200 97.91 164.21 58.08 141.79 37.67L119.52 98.74c-.929 2.549-3.085 4.453-5.729 5.059-2.644 .606-5.415-.169-7.361-2.059L80.06 76.16C64.09 99.21 56 122 56 144c0 39.764 32.235 72 72 72 39.764 0 72-32.236 72-72Z"),
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
        return _fire!!
    }

private var _fire: ImageVector? = null
