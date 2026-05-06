package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BellSimpleRinging: ImageVector
    get() {
        if (_bellSimpleRinging != null) return _bellSimpleRinging!!
        _bellSimpleRinging = phosphorLightIcon(
            name = "BellSimpleRinging",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M165.92 224c0 3.314-2.686 6-6 6h-64c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h64c3.314 0 6 2.686 6 6ZM225.61 61.23C216.787 43.972 203.53 29.372 187.2 18.93c-2.79-1.612-6.355-.732-8.075 1.993-1.72 2.725-.98 6.322 1.675 8.147 14.583 9.258 26.398 22.279 34.2 37.69 1.527 2.941 5.149 4.087 8.09 2.56 2.941-1.527 4.087-5.149 2.56-8.09ZM41 66.76C48.802 51.349 60.617 38.328 75.2 29.07c2.656-1.825 3.395-5.422 1.675-8.147C75.155 18.198 71.59 17.318 68.8 18.93 52.47 29.372 39.213 43.972 30.39 61.23c-1.192 1.913-1.211 4.332-.05 6.264 1.161 1.932 3.306 3.05 5.555 2.895 2.248-.155 4.22-1.556 5.106-3.629ZM220 176.93c2.526 4.317 2.557 9.653 .082 13.999-2.475 4.346-7.081 7.041-12.082 7.071h-160c-4.99-.023-9.591-2.7-12.076-7.028-2.485-4.327-2.479-9.651 .016-13.972C45.13 161.08 50 138.62 50 112 50 68.922 84.922 34 128 34c43.078 0 78 34.922 78 78 0 27 4.74 48.84 14.08 64.93ZM209.63 182.93C199.29 165 194 141.14 194 112 194 75.549 164.451 46 128 46 91.549 46 62 75.549 62 112c0 29.16-5.29 53-15.71 71-.357 .619-.357 1.381 0 2 .336 .624 .991 1.01 1.7 1h160.01c.709 .01 1.364-.376 1.7-1 .36-.617 .364-1.379 .01-2Z"),
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
        return _bellSimpleRinging!!
    }

private var _bellSimpleRinging: ImageVector? = null
