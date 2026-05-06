package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Circuitry: ImageVector
    get() {
        if (_circuitry != null) return _circuitry!!
        _circuitry = phosphorDuotoneIcon(
            name = "Circuitry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 40h-160c-4.418 0-8 3.582-8 8v160c0 4.418 3.582 8 8 8h160c4.418 0 8-3.582 8-8v-160c0-4.418-3.582-8-8-8ZM88 184c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM168 120c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM88 160c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8ZM48 48h32v97.38c-11.02 3.896-17.631 15.165-15.654 26.686 1.977 11.521 11.965 19.942 23.654 19.942 11.689 0 21.678-8.421 23.654-19.942C113.631 160.545 107.02 149.276 96 145.38v-30.07l48 48v44.69h-96ZM208 208h-48v-48c.002-2.122-.84-4.158-2.34-5.66L96 92.69v-44.69h32v24c-.002 2.122 .84 4.158 2.34 5.66l16 16c-1.549 3.226-2.349 6.761-2.34 10.34 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24C192 90.745 181.255 80 168 80c-3.58-.006-7.115 .797-10.34 2.35L144 68.69v-20.69h64v160ZM168 96c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8Z"),
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
        return _circuitry!!
    }

private var _circuitry: ImageVector? = null
