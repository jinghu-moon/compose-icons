package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrafficSignal: ImageVector
    get() {
        if (_trafficSignal != null) return _trafficSignal!!
        _trafficSignal = phosphorThinIcon(
            name = "TrafficSignal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 60c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28C156 72.536 143.464 60 128 60ZM128 108c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM128 140c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28 0-15.464-12.536-28-28-28ZM128 188c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM216 148h-20v-72h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-20v-28c0-6.627-5.373-12-12-12h-112C65.373 28 60 33.373 60 40v28h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v72h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v60c0 6.627 5.373 12 12 12h112c6.627 0 12-5.373 12-12v-60h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM188 216c0 2.209-1.791 4-4 4h-112c-2.209 0-4-1.791-4-4v-176c0-2.209 1.791-4 4-4h112c2.209 0 4 1.791 4 4Z"),
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
