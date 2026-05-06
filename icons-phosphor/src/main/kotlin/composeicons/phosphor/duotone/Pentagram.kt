package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Pentagram: ImageVector
    get() {
        if (_pentagram != null) return _pentagram!!
        _pentagram = phosphorDuotoneIcon(
            name = "Pentagram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.69 102.47l-54.21 39 20.77 64c1.074 3.297-.097 6.91-2.902 8.95-2.805 2.039-6.603 2.039-9.408 0L128 174.91 73.06 214.44c-2.805 2.039-6.604 2.039-9.408-0-2.805-2.039-3.976-5.653-2.902-8.95l20.77-64L27.31 102.49c-2.818-2.031-4.003-5.649-2.934-8.954C25.446 90.232 28.526 87.995 32 88h66.87L120.39 21.68c1.002-3.367 4.097-5.675 7.61-5.675 3.513 0 6.608 2.308 7.61 5.675L157.13 88h66.87c3.462 .007 6.527 2.24 7.595 5.533 1.068 3.294-.105 6.9-2.905 8.937Z"),
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
                pathData = parseSvgPathData("M239.2 91.06C237.127 84.424 230.951 79.931 224 80h-61L143.3 19.26C141.248 12.577 135.08 8.011 128.088 7.999c-6.991-.011-13.174 4.534-15.248 11.211L93.06 80h-61.06C25.041 79.977 18.865 84.455 16.724 91.076c-2.142 6.621 .242 13.867 5.896 17.924l49.47 35.59L53.14 203c-2.221 6.609 .162 13.892 5.86 17.91 5.578 4.134 13.202 4.134 18.78 0L128 184.77l50.24 36.14c5.611 4.081 13.213 4.081 18.824-0 5.611-4.082 7.952-11.315 5.796-17.91l-19-58.46 49.5-35.62c5.671-4.015 8.043-11.27 5.84-17.86ZM128 24.15 146.12 80h-36.24ZM32 96h55.87L77.3 128.58ZM68.36 208h0L85.75 154.41l28.55 20.54ZM90.93 138.43 104.69 96h46.62l13.76 42.39L128 165.06ZM187.64 208h0L141.73 175l28.55-20.54ZM178.7 128.62 168.13 96h55.87Z"),
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
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
