package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.InstagramLogo: ImageVector
    get() {
        if (_instagramLogo != null) return _instagramLogo!!
        _instagramLogo = phosphorThinIcon(
            name = "InstagramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 84c-24.301 0-44 19.699-44 44 0 24.301 19.699 44 44 44 24.301 0 44-19.699 44-44C171.972 103.711 152.289 84.028 128 84ZM128 164C108.118 164 92 147.882 92 128c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36ZM176 28h-96C51.295 28.033 28.033 51.295 28 80v96c.033 28.705 23.295 51.967 52 52h96c28.705-.033 51.967-23.295 52-52v-96C227.967 51.295 204.705 28.033 176 28ZM220 176c-.028 24.289-19.711 43.972-44 44h-96C55.711 219.972 36.028 200.289 36 176v-96C36.028 55.711 55.711 36.028 80 36h96c24.289 .028 43.972 19.711 44 44ZM188 76c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _instagramLogo!!
    }

private var _instagramLogo: ImageVector? = null
