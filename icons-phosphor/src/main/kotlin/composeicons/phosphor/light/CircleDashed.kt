package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CircleDashed: ImageVector
    get() {
        if (_circleDashed != null) return _circleDashed!!
        _circleDashed = phosphorLightIcon(
            name = "CircleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M98.19 36.54c-.829-3.206 1.095-6.477 4.3-7.31 16.726-4.313 34.274-4.313 51 0 3.209 .828 5.138 4.101 4.31 7.31-.828 3.209-4.101 5.138-7.31 4.31-14.758-3.81-30.242-3.81-45 0-3.206 .822-6.472-1.106-7.3-4.31ZM55.19 56.54C43.094 68.867 34.324 84.061 29.7 100.7c-.423 1.534-.22 3.174 .566 4.558 .786 1.384 2.089 2.399 3.624 2.822 .521 .147 1.059 .221 1.6 .22 2.696-.001 5.061-1.801 5.78-4.4C45.363 89.238 53.108 75.854 63.78 65c2.322-2.364 2.289-6.163-.075-8.485-2.364-2.322-6.163-2.289-8.485 .075ZM41.28 152.09c-.521-2.123-2.155-3.795-4.265-4.364-2.111-.569-4.364 .055-5.881 1.628-1.517 1.574-2.059 3.848-1.414 5.936 4.618 16.648 13.389 31.85 25.49 44.18 2.345 2.226 6.033 2.193 8.338-.074 2.305-2.268 2.399-5.954 .212-8.336C53.092 180.18 45.358 166.772 41.28 152.09ZM150.49 215.15c-14.758 3.811-30.242 3.811-45 0-3.209-.828-6.482 1.101-7.31 4.31-.828 3.209 1.101 6.482 4.31 7.31 16.727 4.312 34.273 4.312 51 0 3.209-.828 5.138-4.101 4.31-7.31-.828-3.209-4.101-5.138-7.31-4.31ZM222.11 147.92c-3.192-.882-6.495 .989-7.38 4.18-4.077 14.697-11.823 28.117-22.51 39-2.322 2.364-2.289 6.163 .075 8.485 2.364 2.322 6.163 2.289 8.485-.075 12.112-12.339 20.893-27.551 25.52-44.21 .423-1.534 .22-3.174-.566-4.558-.786-1.384-2.089-2.399-3.624-2.822ZM214.72 103.92c.719 2.599 3.084 4.399 5.78 4.4 .541 .001 1.079-.073 1.6-.22 3.191-.885 5.062-4.188 4.18-7.38C221.662 84.072 212.891 68.87 200.79 56.54c-2.345-2.226-6.033-2.193-8.338 .074-2.305 2.268-2.399 5.954-.212 8.336 10.668 10.876 18.403 24.281 22.48 38.96Z"),
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
        return _circleDashed!!
    }

private var _circleDashed: ImageVector? = null
