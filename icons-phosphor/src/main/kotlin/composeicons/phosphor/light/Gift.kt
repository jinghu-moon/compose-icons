package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Gift: ImageVector
    get() {
        if (_gift != null) return _gift!!
        _gift = phosphorLightIcon(
            name = "Gift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 74h-41.26c2.117-1.329 4.124-2.827 6-4.48 5.719-5.096 9.06-12.342 9.22-20 .248-8.423-2.985-16.576-8.937-22.54C175.07 21.016 166.923 17.768 158.5 18c-7.658 .16-14.904 3.501-20 9.22C133.868 32.686 130.306 38.976 128 45.76 125.699 38.981 122.144 32.695 117.52 27.23 112.421 21.502 105.167 18.157 97.5 18c-8.428-.243-16.584 2.999-22.545 8.962C68.994 32.925 65.754 41.082 66 49.51c.16 7.658 3.501 14.904 9.22 20 1.874 1.655 3.881 3.153 6 4.48h-41.22c-3.715 0-7.277 1.476-9.903 4.104C27.471 80.722 25.997 84.285 26 88v32c0 7.732 6.268 14 14 14h2v66c0 7.732 6.268 14 14 14h144c7.732 0 14-6.268 14-14v-66h2c7.732 0 14-6.268 14-14v-32c0-7.732-6.268-14-14-14ZM135.77 63c2.25-12.12 6.29-21.75 11.69-27.85 2.921-3.224 7.05-5.089 11.4-5.15h.55c5.026 .001 9.838 2.035 13.34 5.641 3.502 3.606 5.396 8.475 5.25 13.499-.069 4.354-1.945 8.484-5.18 11.4C162.1 70 143.92 72.83 134.34 73.65c.25-2.89 .66-6.57 1.43-10.65ZM83.45 35.45C86.94 31.972 91.663 30.014 96.59 30h.55c4.354 .069 8.484 1.945 11.4 5.18 9.46 10.72 12.29 28.9 13.11 38.48-2.89-.25-6.57-.68-10.61-1.43C98.92 70 89.29 65.94 83.19 60.53 79.95 57.621 78.069 53.494 78 49.14c-.139-5.118 1.831-10.068 5.45-13.69ZM38 120v-32c0-1.105 .895-2 2-2h82v36h-82c-1.105 0-2-.895-2-2ZM54 200v-66h68v68h-66c-1.105 0-2-.895-2-2ZM202 200c0 1.105-.895 2-2 2h-66v-68h68ZM218 120c0 1.105-.895 2-2 2h-82v-36h82c1.105 0 2 .895 2 2Z"),
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
        return _gift!!
    }

private var _gift: ImageVector? = null
