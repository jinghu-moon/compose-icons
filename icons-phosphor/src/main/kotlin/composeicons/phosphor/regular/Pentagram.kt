package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Pentagram: ImageVector
    get() {
        if (_pentagram != null) return _pentagram!!
        _pentagram = phosphorRegularIcon(
            name = "Pentagram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M239.18 91.05C237.109 84.424 230.942 79.935 224 80h-61L143.23 19.26C141.184 12.573 135.016 8.003 128.023 7.992c-6.993-.011-13.175 4.539-15.243 11.218L93.06 80h-61.06C25.043 79.981 18.871 84.461 16.732 91.081c-2.139 6.62 .245 13.864 5.898 17.919l49.46 35.58L53.15 203c-2.215 6.598 .164 13.867 5.85 17.88 5.572 4.139 13.198 4.139 18.77 0L128 184.75l50.23 36.13c5.607 4.07 13.195 4.069 18.801-.002 5.606-4.071 7.954-11.287 5.819-17.878l-19-58.46 49.49-35.61c5.685-4.014 8.06-11.284 5.84-17.88ZM128 24.15 146.12 80h-36.24ZM32 96h55.87L77.3 128.56ZM68.34 208h0L85.73 154.41l28.54 20.54ZM90.91 138.43 104.69 96h46.62l13.75 42.38L128 165ZM187.6 208h0L141.7 175l28.54-20.54ZM178.67 128.62 168.13 96h55.87Z"),
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
