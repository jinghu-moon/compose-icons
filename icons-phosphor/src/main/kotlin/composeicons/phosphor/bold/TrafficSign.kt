package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TrafficSign: ImageVector
    get() {
        if (_trafficSign != null) return _trafficSign!!
        _trafficSign = phosphorBoldIcon(
            name = "TrafficSign",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246 113.46 142.54 10C134.508 1.974 121.492 1.974 113.46 10L10 113.46c-8.026 8.032-8.026 21.048 0 29.08L113.46 246h0c8.032 8.026 21.048 8.026 29.08 0L246 142.54c8.026-8.032 8.026-21.048 0-29.08ZM128 226.57 29.43 128 128 29.43 226.57 128ZM135.51 104.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0l24 24c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-24 24c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L139 132h-27c-6.627 0-12 5.373-12 12v4c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-4c0-19.882 16.118-36 36-36h27Z"),
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
        return _trafficSign!!
    }

private var _trafficSign: ImageVector? = null
