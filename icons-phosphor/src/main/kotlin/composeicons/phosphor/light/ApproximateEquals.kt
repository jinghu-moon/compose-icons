package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ApproximateEquals: ImageVector
    get() {
        if (_approximateEquals != null) return _approximateEquals!!
        _approximateEquals = phosphorLightIcon(
            name = "ApproximateEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.62 154.57c1.016 1.225 1.504 2.804 1.356 4.389-.148 1.585-.92 3.046-2.146 4.061-16.87 14-32 19-45.75 19-18.19 0-34.13-8.66-48.94-16.71-26-14.12-48.44-26.31-81.31 1-2.571 2.115-6.37 1.746-8.485-.825-2.115-2.571-1.746-6.37 .825-8.485 39.13-32.46 68.65-16.42 94.69-2.27 26.04 14.15 48.44 26.31 81.31-1 1.231-1.01 2.814-1.489 4.399-1.332 1.585 .158 3.042 .939 4.051 2.172ZM43.83 102.22c32.87-27.27 55.32-15.08 81.31-1 14.81 8 30.75 16.71 48.94 16.71 13.79 0 28.88-5 45.75-19 2.552-2.115 2.905-5.898 .79-8.45-2.115-2.552-5.898-2.905-8.45-.79-32.87 27.27-55.32 15.08-81.31 1C104.87 76.61 75.3 60.52 36.17 93c-2.552 2.115-2.905 5.898-.79 8.45 2.115 2.552 5.898 2.905 8.45 .79Z"),
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
        return _approximateEquals!!
    }

private var _approximateEquals: ImageVector? = null
