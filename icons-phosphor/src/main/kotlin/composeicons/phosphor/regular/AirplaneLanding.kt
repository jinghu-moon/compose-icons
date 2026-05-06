package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) return _airplaneLanding!!
        _airplaneLanding = phosphorRegularIcon(
            name = "AirplaneLanding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M256 216c0 4.418-3.582 8-8 8h-144c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h144c4.418 0 8 3.582 8 8ZM229.84 191.7 53.21 142.24C35.962 137.366 24.039 121.643 24 103.72v-55.72c-0-5.143 2.472-9.973 6.644-12.981 4.172-3.007 9.536-3.826 14.416-2.199l5.47 1.82c2.324 .772 4.167 2.567 5 4.87L66.13 68.88 96 77.39v-29.39c-0-5.143 2.472-9.973 6.644-12.981 4.172-3.007 9.536-3.826 14.416-2.199l5.47 1.82c2.19 .73 3.958 2.37 4.85 4.5l22.5 53.63 60.84 17c17.284 4.854 29.242 20.597 29.28 38.55v35.68c-.001 2.503-1.173 4.861-3.168 6.373-1.995 1.512-4.582 2.003-6.992 1.327ZM224 148.32c-.029-10.774-7.207-20.219-17.58-23.13l-64.57-18c-2.356-.656-4.283-2.355-5.23-4.61L114 48.67 112 48v40c.002 2.51-1.175 4.875-3.177 6.388-2.002 1.513-4.599 1.999-7.013 1.312L57.81 83.16c-2.479-.71-4.463-2.572-5.33-5L41.79 48.59 40 48v55.72c.027 10.756 7.18 20.191 17.53 23.12L224 173.45Z"),
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
        return _airplaneLanding!!
    }

private var _airplaneLanding: ImageVector? = null
