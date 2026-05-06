package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SmileySticker: ImageVector
    get() {
        if (_smileySticker != null) return _smileySticker!!
        _smileySticker = phosphorThinIcon(
            name = "SmileySticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C88.718 28.034 53.094 51.063 36.936 86.869c-16.157 35.806-9.854 77.755 16.111 107.231 25.966 29.477 66.784 41.021 104.342 29.51 .628-.19 1.199-.534 1.66-1L222.62 159c.463-.46 .806-1.027 1-1.65 9.28-30.329 3.633-63.261-15.221-88.766C189.545 43.079 159.717 28.022 128 28ZM216.25 154.1l-62.15 62.15C113.804 228.129 70.583 211.164 49.127 175.046 27.671 138.927 33.445 92.857 63.151 63.151 92.857 33.445 138.927 27.671 175.046 49.127c36.118 21.456 53.083 64.677 41.204 104.973ZM84 108c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM172 108c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM171.46 154c-9.55 16.52-25.39 26-43.46 26-18.07 0-33.91-9.48-43.46-26-.994-1.899-.313-4.244 1.543-5.317 1.856-1.073 4.227-.492 5.377 1.317 8.21 14.19 21.19 22 36.54 22 15.35 0 28.33-7.81 36.54-22 .681-1.302 2.021-2.126 3.49-2.146 1.469-.02 2.831 .767 3.547 2.05 .716 1.283 .671 2.855-.117 4.095Z"),
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
        return _smileySticker!!
    }

private var _smileySticker: ImageVector? = null
