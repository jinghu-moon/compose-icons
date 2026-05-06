package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BoxingGlove: ImageVector
    get() {
        if (_boxingGlove != null) return _boxingGlove!!
        _boxingGlove = phosphorRegularIcon(
            name = "BoxingGlove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 16h-48C89.086 16.033 64.033 41.086 64 72h-8C38.327 72 24 86.327 24 104v29.19c.007 3.634 1.244 7.159 3.51 10 .193 .242 .4 .472 .62 .69L64 179.34v36.66c0 8.837 7.163 16 16 16h112c8.837 0 16-7.163 16-16v-38.88l15.38-53.85c.411-1.427 .619-2.905 .62-4.39v-46.88C223.967 41.086 198.914 16.033 168 16ZM208 118.88l-15.69 54.92c-.207 .715-.311 1.456-.31 2.2v40h-112v-40c-.001-2.139-.858-4.188-2.38-5.69L40 133.12v-29.12C40 95.163 47.163 88 56 88h8v16c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32C80 49.909 97.909 32 120 32h48c22.091 0 40 17.909 40 40ZM171.58 167.16 153.89 176l17.69 8.84c3.954 1.977 5.557 6.786 3.58 10.74-1.977 3.954-6.786 5.557-10.74 3.58L136 184.94l-28.42 14.22c-3.954 1.977-8.763 .374-10.74-3.58-1.977-3.954-.374-8.763 3.58-10.74L118.11 176l-17.69-8.84c-3.954-1.977-5.557-6.786-3.58-10.74 1.977-3.954 6.786-5.557 10.74-3.58L136 167.06l28.42-14.22c3.954-1.977 8.763-.374 10.74 3.58 1.977 3.954 .374 8.763-3.58 10.74Z"),
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
        return _boxingGlove!!
    }

private var _boxingGlove: ImageVector? = null
