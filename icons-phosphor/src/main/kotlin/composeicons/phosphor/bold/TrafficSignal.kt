package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrafficSignal: ImageVector
    get() {
        if (_trafficSignal != null) return _trafficSignal!!
        _trafficSignal = phosphorBoldIcon(
            name = "TrafficSignal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 140h-12v-56h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-12v-20C204 28.954 195.046 20 184 20h-112C60.954 20 52 28.954 52 40v20h-12C33.373 60 28 65.373 28 72c0 6.627 5.373 12 12 12h12v56h-12c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h12v52c0 11.046 8.954 20 20 20h112c11.046 0 20-8.954 20-20v-52h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM180 212h-104v-168h104ZM128 120c17.673 0 32-14.327 32-32C160 70.327 145.673 56 128 56 110.327 56 96 70.327 96 88c0 17.673 14.327 32 32 32ZM128 80c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM128 200c17.673 0 32-14.327 32-32 0-17.673-14.327-32-32-32-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32ZM128 160c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8Z"),
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
