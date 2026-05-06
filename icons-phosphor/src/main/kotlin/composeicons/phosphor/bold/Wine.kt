package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Wine: ImageVector
    get() {
        if (_wine != null) return _wine!!
        _wine = phosphorBoldIcon(
            name = "Wine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M209.17 102.54 187.39 28.61C185.888 23.509 181.208 20.005 175.89 20h-95.78c-5.318 .005-9.998 3.509-11.5 8.61L46.83 102.54c-7.395 24.567-.213 51.202 18.53 68.72 13.955 13.088 31.669 21.462 50.64 23.94v32.8h-28c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h80c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-28v-32.8c18.975-2.476 36.692-10.85 50.65-23.94 18.74-17.521 25.918-44.155 18.52-68.72ZM89.08 44h77.84l18.38 62.41c-10.88 2.8-28.05 3-51.88-9.12C110.68 85.78 91.92 83 77.24 84.22ZM128 172c-17.183 .02-33.728-6.514-46.26-18.27C69.808 142.519 65.172 125.563 69.74 109.84c18.44-5.33 38.64 1.66 52.87 8.87 11.55 5.85 30.18 13.28 50.26 13.28 4.796 .013 9.582-.439 14.29-1.35-1.772 8.852-6.273 16.927-12.87 23.09C161.75 165.493 145.194 172.028 128 172Z"),
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
        return _wine!!
    }

private var _wine: ImageVector? = null
