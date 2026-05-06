package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TipJar: ImageVector
    get() {
        if (_tipJar != null) return _tipJar!!
        _tipJar = phosphorLightIcon(
            name = "TipJar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M182 50.48v-18.48c0-7.732-6.268-14-14-14h-80C80.268 18 74 24.268 74 32v18.48C55.576 53.447 42.023 69.338 42 88v112c0 20.987 17.013 38 38 38h96c20.987 0 38-17.013 38-38v-112C213.977 69.338 200.424 53.447 182 50.48ZM170 32v18h-20v-20h18c1.105 0 2 .895 2 2ZM118 50v-20h20v20ZM88 30h18v20h-20v-18c0-1.105 .895-2 2-2ZM202 200c0 14.359-11.641 26-26 26h-96C65.641 226 54 214.359 54 200v-112C54 73.641 65.641 62 80 62h96c14.359 0 26 11.641 26 26ZM158 160c0 12.15-9.85 22-22 22h-2v10c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-10h-10c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h24c5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10h-16c-12.15 0-22-9.85-22-22 0-12.15 9.85-22 22-22h2v-10c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6v10h10c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-24c-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10h16c12.15 0 22 9.85 22 22Z"),
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
        return _tipJar!!
    }

private var _tipJar: ImageVector? = null
