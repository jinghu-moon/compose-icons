package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Tram: ImageVector
    get() {
        if (_tram != null) return _tram!!
        _tram = phosphorRegularIcon(
            name = "Tram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 48h-48v-24h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-80c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32v24h-48C54.327 48 40 62.327 40 80v104c0 17.673 14.327 32 32 32h8L65.6 235.2c-2.651 3.535-1.935 8.549 1.6 11.2 3.535 2.651 8.549 1.935 11.2-1.6L100 216h56l21.6 28.8c2.651 3.535 7.665 4.251 11.2 1.6 3.535-2.651 4.251-7.665 1.6-11.2L176 216h8c17.673 0 32-14.327 32-32v-104C216 62.327 201.673 48 184 48ZM72 64h112c8.837 0 16 7.163 16 16v40h-144v-40C56 71.163 63.163 64 72 64ZM184 200h-112c-8.837 0-16-7.163-16-16v-48h144v48c0 8.837-7.163 16-16 16ZM96 172c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM184 172c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _tram!!
    }

private var _tram: ImageVector? = null
