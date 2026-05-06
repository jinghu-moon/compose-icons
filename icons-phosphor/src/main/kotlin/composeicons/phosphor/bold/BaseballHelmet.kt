package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BaseballHelmet: ImageVector
    get() {
        if (_baseballHelmet != null) return _baseballHelmet!!
        _baseballHelmet = phosphorBoldIcon(
            name = "BaseballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 156c0-17.673-14.327-32-32-32-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32ZM80 156c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM244 116h-16.66C221.01 59.008 171.245 16.898 113.991 20.089 56.737 23.279 11.958 70.657 12 128v24c.044 41.955 34.045 75.956 76 76h40c41.955-.044 75.956-34.045 76-76v-12h40c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM36 152v-24C35.958 83.911 70.009 47.292 113.985 44.135c43.976-3.157 82.909 28.222 89.165 71.865h-51.15c-6.627 0-12 5.373-12 12v24c0 28.719-23.281 52-52 52C59.281 204 36 180.719 36 152ZM180 152c-.025 21.637-13.429 41.004-33.67 48.65C157.759 187.016 164.015 169.79 164 152v-12h16Z"),
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
        return _baseballHelmet!!
    }

private var _baseballHelmet: ImageVector? = null
