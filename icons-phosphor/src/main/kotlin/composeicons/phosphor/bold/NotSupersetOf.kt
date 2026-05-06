package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NotSupersetOf: ImageVector
    get() {
        if (_notSupersetOf != null) return _notSupersetOf!!
        _notSupersetOf = phosphorBoldIcon(
            name = "NotSupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 188h-118.33l14.55-16h47.78c26.183-.021 50.029-15.073 61.311-38.701 11.282-23.628 7.995-51.635-8.451-72.009l12-13.22c4.361-4.916 3.957-12.425-.906-16.844-4.863-4.42-12.376-4.106-16.854 .704L186.7 45.56C176.209 39.297 164.218 35.993 152 36h-96C49.373 36 44 41.373 44 48c0 6.627 5.373 12 12 12h96c6.228-.004 12.386 1.322 18.06 3.89L93.6 148h-37.6c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h15.78L39.12 207.93c-2.945 3.163-3.961 7.665-2.661 11.786 1.3 4.121 4.716 7.225 8.942 8.126 4.226 .901 8.611-.54 11.479-3.773L67.88 212h140.12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM188.44 79.36c9.114 13.484 10.041 30.897 2.409 45.272C183.218 139.007 168.275 147.995 152 148h-26Z"),
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
        return _notSupersetOf!!
    }

private var _notSupersetOf: ImageVector? = null
