package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Log: ImageVector
    get() {
        if (_log != null) return _log!!
        _log = phosphorRegularIcon(
            name = "Log",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 136c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM248 136c0 40.37-21.08 72-48 72h-144C29.08 208 8 176.37 8 136 8 95.63 29.08 64 56 64h36.69L130.34 26.34C131.842 24.84 133.878 23.998 136 24h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-28.69l-24 24h84.69c26.92 0 48 31.63 48 72ZM56 192h113.51c-5.677-7.144-9.974-15.283-12.67-24h-76.84c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h73.16c-.773-5.298-1.161-10.646-1.16-16 0-22.86 6.76-42.9 17.51-56h-113.51C43.53 80 32.45 93.26 27.2 112h76.8c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-79.65q-.34 3.93-.35 8c0 30.36 14.65 56 32 56ZM232 136C232 105.64 217.35 80 200 80c-17.35 0-32 25.64-32 56 0 30.36 14.65 56 32 56 17.35 0 32-25.64 32-56Z"),
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
        return _log!!
    }

private var _log: ImageVector? = null
