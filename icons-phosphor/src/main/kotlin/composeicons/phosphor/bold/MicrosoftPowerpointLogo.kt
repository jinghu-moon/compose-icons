package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MicrosoftPowerpointLogo: ImageVector
    get() {
        if (_microsoftPowerpointLogo != null) return _microsoftPowerpointLogo!!
        _microsoftPowerpointLogo = phosphorBoldIcon(
            name = "MicrosoftPowerpointLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M94 88h-18c-6.627 0-12 5.373-12 12v52c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4h6c16.569 0 30-13.431 30-30C124 101.431 110.569 88 94 88ZM94 124h-6v-12h6c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6ZM136 20C107.182 20.019 79.562 31.537 59.27 52h-19.27C28.954 52 20 60.954 20 72v108c0 11.046 8.954 20 20 20h15.5c33.085 36.99 87.12 46.672 130.99 23.47 43.87-23.202 66.281-73.315 54.329-121.481C228.867 53.822 185.627 20.001 136 20ZM136 44c41.734 .056 77.117 30.701 83.13 72h-55.13v-44C164 60.954 155.046 52 144 52h-43.73C111.446 46.735 123.646 44.003 136 44ZM44 76h96v100h-96ZM136 212c-15.264 .026-30.245-4.123-43.32-12h51.32c11.046 0 20-8.954 20-20v-40h55.13c-6.013 41.299-41.396 71.944-83.13 72Z"),
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
        return _microsoftPowerpointLogo!!
    }

private var _microsoftPowerpointLogo: ImageVector? = null
