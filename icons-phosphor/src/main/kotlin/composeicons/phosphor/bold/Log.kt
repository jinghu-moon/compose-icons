package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Log: ImageVector
    get() {
        if (_log != null) return _log!!
        _log = phosphorBoldIcon(
            name = "Log",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 136c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM252 136c0 42.62-22.84 76-52 76h-144C26.84 212 4 178.62 4 136 4 93.38 26.84 60 56 60h35L127.48 23.51C129.74 21.253 132.806 19.99 136 20h32c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-27L125 60h75c29.16 0 52 33.38 52 76ZM56 188h105.77c-3.9-6.236-6.956-12.961-9.09-20h-72.68c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h68.27c-.18-2.63-.27-5.29-.27-8 0-20.3 5.19-38.5 13.77-52h-105.77c-7.85 0-16.23 7.51-21.76 20h69.76c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-75.65c-.23 2.59-.35 5.25-.35 8 0 30.64 14.76 52 28 52ZM228 136C228 105.36 213.24 84 200 84c-13.24 0-28 21.36-28 52 0 30.64 14.76 52 28 52 13.24 0 28-21.36 28-52Z"),
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
