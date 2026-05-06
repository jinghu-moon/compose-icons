package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FootballHelmet: ImageVector
    get() {
        if (_footballHelmet != null) return _footballHelmet!!
        _footballHelmet = phosphorBoldIcon(
            name = "FootballHelmet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 156h-47.21l-4.73-16h51.94c6.627 0 12-5.373 12-12v-4C228.003 96.159 216.843 69.48 197.018 49.933 177.193 30.386 150.358 19.604 122.52 20 66 20.8 20 67.43 20 124c-.014 34.386 16.969 66.555 45.37 85.94 1.998 1.352 4.358 2.069 6.77 2.06h43.86c6.066-.001 11.804-2.755 15.599-7.487 3.795-4.732 5.237-10.931 3.921-16.853q-.09-.41-.21-.81l-2-6.85h17.58l10 33.67c2.536 8.452 10.286 14.263 19.11 14.33h36c11.046 0 20-8.954 20-20v-32c0-11.046-8.954-20-20-20ZM100.4 123.48c-3.805 4.73-5.248 10.936-3.92 16.86q.09 .41 .21 .81L110.61 188h-34.61C55.856 172.892 44 149.181 44 124 44 80.52 79.39 44.64 122.86 44h1.14c41.089-.006 75.501 31.117 79.61 72h-87.61c-6.067-.01-11.809 2.743-15.6 7.48ZM126.14 156l-4.75-16h17.61l4.73 16ZM212 204h-29l-7.09-24h36.09Z"),
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
        return _footballHelmet!!
    }

private var _footballHelmet: ImageVector? = null
