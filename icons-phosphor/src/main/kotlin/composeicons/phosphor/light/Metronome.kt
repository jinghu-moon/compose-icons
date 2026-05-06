package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Metronome: ImageVector
    get() {
        if (_metronome != null) return _metronome!!
        _metronome = phosphorLightIcon(
            name = "Metronome",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.33 203.75 184.88 114.34 212.43 84c1.865-2.484 1.526-5.981-.782-8.06-2.308-2.079-5.821-2.053-8.098 .06l-22.87 25.17L162.42 43.75C160.586 37.931 155.181 33.98 149.08 34h-42.16c-6.101-.02-11.506 3.931-13.34 9.75l-50.91 160c-1.356 4.255-.6 8.901 2.034 12.508 2.634 3.606 6.83 5.739 11.296 5.742h144c4.467 0 8.667-2.132 11.303-5.738 2.636-3.607 3.393-8.255 2.037-12.512ZM187.45 162h-45.89l34-37.39ZM105 47.39c.267-.834 1.045-1.397 1.92-1.39h42.16c.875-.007 1.653 .556 1.92 1.39l20.36 64-46 50.61h-56.81ZM201.6 209.18c-.367 .519-.965 .825-1.6 .82h-144c-.638-.001-1.237-.307-1.612-.823-.375-.516-.482-1.18-.288-1.787L64.73 174h126.54l10.62 33.39c.205 .608 .097 1.278-.29 1.79Z"),
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
        return _metronome!!
    }

private var _metronome: ImageVector? = null
