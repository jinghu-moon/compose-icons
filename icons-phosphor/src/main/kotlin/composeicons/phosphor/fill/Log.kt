package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Log: ImageVector
    get() {
        if (_log != null) return _log!!
        _log = phosphorFillIcon(
            name = "Log",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 136c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM248 136c0 40.37-21.08 72-48 72h-144C29.08 208 8 176.37 8 136 8 95.63 29.08 64 56 64h36.69L130.34 26.34C131.842 24.84 133.878 23.998 136 24h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-28.69l-24 24h84.69c26.92 0 48 31.63 48 72ZM104 128c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-70.74c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM154.91 160c0-4.418-3.582-8-8-8h-66.91c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h66.91c4.418 0 8-3.582 8-8ZM232 136C232 105.64 217.35 80 200 80c-17.35 0-32 25.64-32 56 0 30.36 14.65 56 32 56 17.35 0 32-25.64 32-56Z"),
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
