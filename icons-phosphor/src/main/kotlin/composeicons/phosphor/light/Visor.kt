package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Visor: ImageVector
    get() {
        if (_visor != null) return _visor!!
        _visor = phosphorLightIcon(
            name = "Visor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M183.05 58h-111.05C52.863 58.001 34.56 65.836 21.351 79.684 8.141 93.532 1.178 112.184 2.08 131.3 3.72 167 33 196.24 68.62 197.92c15.31 .71 31-5.77 48-19.84 6.616-5.47 16.184-5.47 22.8 0C149.75 186.66 165.6 198 184 198c18.727 .002 36.675-7.501 49.829-20.83C246.984 163.84 254.249 145.796 254 127.07 253.5 89 221.67 58 183.05 58ZM225.28 168.74C214.41 179.824 199.524 186.048 184 186c-14.53 0-28-9.77-36.93-17.13-11.054-9.133-27.036-9.133-38.09 0h0C94.4 180.96 81.38 186.54 69.2 185.97 39.429 184.357 15.661 160.563 14.08 130.79 13.317 114.944 19.078 99.477 30.021 87.991 40.965 76.505 56.136 70.004 72 70h111.05c32.09 0 58.54 25.67 58.95 57.23 .247 15.524-5.782 30.491-16.72 41.51ZM182 96c0 3.314-2.686 6-6 6h-96c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h96c3.314 0 6 2.686 6 6Z"),
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
        return _visor!!
    }

private var _visor: ImageVector? = null
