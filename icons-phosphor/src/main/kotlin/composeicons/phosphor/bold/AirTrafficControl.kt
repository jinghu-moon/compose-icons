package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AirTrafficControl: ImageVector
    get() {
        if (_airTrafficControl != null) return _airTrafficControl!!
        _airTrafficControl = phosphorBoldIcon(
            name = "AirTrafficControl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232.38 68.52C228.636 63.179 222.523 59.999 216 60h-76v-24h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-48C97.373 12 92 17.373 92 24c0 6.627 5.373 12 12 12h12v24h-76c-6.524-.001-12.638 3.18-16.382 8.523-3.744 5.343-4.646 12.175-2.418 18.307l26.19 72c2.886 7.892 10.386 13.149 18.79 13.17h25.82v60c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-60h24v60c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-60h25.82c8.404-.021 15.904-5.278 18.79-13.17l26.19-72c2.228-6.133 1.325-12.967-2.42-18.31ZM114 148 102.38 84h51.24L142 148ZM45.71 84h32.29l11.64 64h-20.64ZM187 148h-20.62L178 84h32.27Z"),
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
