package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.EjectSimple: ImageVector
    get() {
        if (_ejectSimple != null) return _ejectSimple!!
        _ejectSimple = phosphorBoldIcon(
            name = "EjectSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 200c0 6.627-5.373 12-12 12h-192c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h192c6.627 0 12 5.373 12 12ZM22 152.57c-3.369-6.994-2.386-15.305 2.52-21.32L106.16 30.43C111.491 23.833 119.518 19.999 128 19.999c8.482 0 16.509 3.834 21.84 10.431l81.65 100.82c4.872 6.016 5.856 14.294 2.531 21.285-3.325 6.99-10.37 11.45-18.111 11.465h-175.82C32.35 164.032 25.294 159.574 22 152.57ZM48.3 140h159.4L131.2 45.53c-.78-.968-1.957-1.531-3.2-1.531-1.243 0-2.42 .563-3.2 1.531Z"),
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
        return _ejectSimple!!
    }

private var _ejectSimple: ImageVector? = null
