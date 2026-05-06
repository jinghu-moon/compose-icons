package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AirTrafficControl: ImageVector
    get() {
        if (_airTrafficControl != null) return _airTrafficControl!!
        _airTrafficControl = phosphorLightIcon(
            name = "AirTrafficControl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.47 72C224.856 68.246 220.574 66.006 216 66h-82v-36h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-48c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h18v36h-82c-4.566-0-8.846 2.226-11.467 5.966-2.621 3.74-3.253 8.522-1.693 12.814l26.19 72c2.01 5.532 7.264 9.216 13.15 9.22h31.82v66c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-66h36v66c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-66h31.82c5.897 .009 11.167-3.678 13.18-9.22l26.19-72c1.539-4.286 .898-9.053-1.72-12.78ZM109 154 95.19 78h65.62L147 154ZM64.3 152.68 38.12 80.68c-.223-.613-.134-1.296 .24-1.83 .368-.542 .985-.862 1.64-.85h43l13.82 76h-30.64c-.842-0-1.594-.528-1.88-1.32ZM217.88 80.68l-26.18 72c-.286 .792-1.038 1.32-1.88 1.32h-30.63L173 78h43c.655-.012 1.272 .308 1.64 .85 .374 .534 .463 1.217 .24 1.83Z"),
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
        return _airTrafficControl!!
    }

private var _airTrafficControl: ImageVector? = null
