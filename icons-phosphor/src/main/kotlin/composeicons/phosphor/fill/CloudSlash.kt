package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) return _cloudSlash!!
        _cloudSlash = phosphorFillIcon(
            name = "CloudSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 128.72c-.172 22.99-9.361 44.995-25.59 61.28-.776 .765-1.83 1.18-2.919 1.15-1.089-.03-2.119-.503-2.851-1.31L103.78 65.67c-.734-.806-1.107-1.876-1.033-2.963 .074-1.087 .588-2.097 1.423-2.797C120.141 46.812 140.217 39.762 160.87 40c48.28 .47 87.51 40.43 87.13 88.72ZM53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L81.33 88.56l-.06 .11C62.699 85.949 43.871 91.517 29.767 103.9 15.662 116.283 7.705 134.234 8 153c.53 35.12 29.84 63 65 63h87c10.871 .005 21.647-2.013 31.78-5.95l10.3 11.33c1.431 1.576 3.431 2.517 5.557 2.615 2.126 .098 4.204-.656 5.773-2.095 3.171-3.141 3.299-8.224 .29-11.52Z"),
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
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null
