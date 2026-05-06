package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AndroidLogo: ImageVector
    get() {
        if (_androidLogo != null) return _androidLogo!!
        _androidLogo = phosphorThinIcon(
            name = "AndroidLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 148c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM92 140c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM236 160v24c0 6.627-5.373 12-12 12h-192c-6.627 0-12-5.373-12-12v-22.87C19.971 129.627 33.519 99.64 57.18 78.84l-28-28c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L63.41 73.75C81.877 59.708 104.42 52.072 127.62 52h.38c23.368-.065 46.116 7.509 64.78 21.57L221.17 45.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66L199 78.64c1.78 1.56 3.52 3.17 5.21 4.86C224.625 103.713 236.077 131.271 236 160ZM228 160C228 104.772 183.228 60 128 60h-.35C72.7 60.19 28 105.56 28 161.13v22.87c0 2.209 1.791 4 4 4h192c2.209 0 4-1.791 4-4Z"),
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
        return _androidLogo!!
    }

private var _androidLogo: ImageVector? = null
