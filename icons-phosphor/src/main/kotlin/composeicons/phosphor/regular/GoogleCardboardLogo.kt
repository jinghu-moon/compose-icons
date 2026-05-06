package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GoogleCardboardLogo: ImageVector
    get() {
        if (_googleCardboardLogo != null) return _googleCardboardLogo!!
        _googleCardboardLogo = phosphorRegularIcon(
            name = "GoogleCardboardLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 48h-192C23.163 48 16 55.163 16 64v128c0 8.837 7.163 16 16 16h64c2.122 .002 4.158-.84 5.66-2.34L128 179.31l26.34 26.35c1.502 1.5 3.538 2.342 5.66 2.34h64c8.837 0 16-7.163 16-16v-128c0-8.837-7.163-16-16-16ZM224 192h-60.69l-24-24c-6.248-6.243-16.372-6.243-22.62 0l-24 24h-60.69v-128h192ZM80 160c17.673 0 32-14.327 32-32C112 110.327 97.673 96 80 96 62.327 96 48 110.327 48 128c0 17.673 14.327 32 32 32ZM80 112c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM176 160c17.673 0 32-14.327 32-32C208 110.327 193.673 96 176 96c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32ZM176 112c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16Z"),
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
        return _googleCardboardLogo!!
    }

private var _googleCardboardLogo: ImageVector? = null
