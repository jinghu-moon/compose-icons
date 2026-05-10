package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Boot: ImageVector
    get() {
        if (_boot != null) return _boot!!
        _boot = phosphorFillIcon(
            name = "Boot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 112h-79.73c-4.283 .058-7.883-3.202-8.25-7.47-.147-2.208 .628-4.379 2.14-5.995C107.672 96.918 109.787 96.001 112 96h44c2.209 0 4-1.791 4-4v-8c0-2.209-1.791-4-4-4h-43.73c-4.291 .068-7.903-3.195-8.27-7.47-.147-2.212 .631-4.386 2.147-6.003C107.664 64.91 109.783 63.995 112 64h44c2.209 0 4-1.791 4-4v-4c0-8.837-7.163-16-16-16h-111.78c-1.829-.033-3.616 .544-5.08 1.64-2.818 2.155-3.88 5.908-2.61 9.22 11.06 28.84 8.76 83.71-.22 114.93-.206 .719-.31 1.462-.31 2.21v32c0 8.837 7.163 16 16 16h26.11c2.486 0 4.937-.578 7.16-1.69L85.89 208h16.22l12.62 6.31c2.223 1.112 4.674 1.69 7.16 1.69h28.22c2.486 0 4.937-.578 7.16-1.69L169.89 208h16.22l12.62 6.31c2.223 1.112 4.674 1.69 7.16 1.69h26.11c8.837 0 16-7.163 16-16v-32c0-30.928-25.072-56-56-56ZM232 200h-26.11l-12.62-6.31c-2.223-1.112-4.674-1.69-7.16-1.69h-16.22c-2.486-0-4.937 .578-7.16 1.69L150.11 200h-28.22l-12.62-6.31c-2.223-1.112-4.674-1.69-7.16-1.69h-16.22c-2.486-0-4.937 .578-7.16 1.69L66.11 200h-26.11v-24h192Z"),
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
        return _boot!!
    }

private var _boot: ImageVector? = null
