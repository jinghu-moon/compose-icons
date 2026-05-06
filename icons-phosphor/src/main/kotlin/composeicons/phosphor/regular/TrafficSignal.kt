package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.TrafficSignal: ImageVector
    get() {
        if (_trafficSignal != null) return _trafficSignal!!
        _trafficSignal = phosphorRegularIcon(
            name = "TrafficSignal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 56C110.327 56 96 70.327 96 88c0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32C160 70.327 145.673 56 128 56ZM128 104c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM128 136c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32 17.673 0 32-14.327 32-32 0-17.673-14.327-32-32-32ZM128 184c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM216 144h-16v-64h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-24c0-8.837-7.163-16-16-16h-112C63.163 24 56 31.163 56 40v24h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v64h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v56c0 8.837 7.163 16 16 16h112c8.837 0 16-7.163 16-16v-56h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM184 216h-112v-176h112v176Z"),
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
        return _trafficSignal!!
    }

private var _trafficSignal: ImageVector? = null
