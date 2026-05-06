package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) return _airplaneLanding!!
        _airplaneLanding = phosphorFillIcon(
            name = "AirplaneLanding",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M256 216c0 4.418-3.582 8-8 8h-144c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h144c4.418 0 8 3.582 8 8ZM232 192c4.418 0 8-3.582 8-8v-35.68c-.043-17.949-11.999-33.687-29.28-38.54l-60.84-17L127.38 39.15c-.892-2.13-2.66-3.77-4.85-4.5l-5.47-1.82c-4.878-1.626-10.24-.809-14.412 2.196C98.476 38.031 96.003 42.858 96 48v29.39L66.13 68.88 55.52 39.51c-.833-2.303-2.676-4.098-5-4.87L45.05 32.82C40.172 31.197 34.811 32.018 30.641 35.025 26.472 38.032 24.001 42.859 24 48v55.72c.039 17.923 11.962 33.646 29.21 38.52l176.63 49.46c.703 .198 1.43 .299 2.16 .3Z"),
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
