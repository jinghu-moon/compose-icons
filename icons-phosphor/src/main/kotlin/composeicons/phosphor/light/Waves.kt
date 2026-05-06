package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Waves: ImageVector
    get() {
        if (_waves != null) return _waves!!
        _waves = phosphorLightIcon(
            name = "Waves",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220.62 178.58c1.016 1.225 1.504 2.804 1.356 4.389-.148 1.585-.92 3.046-2.146 4.061-16.87 14-32 19-45.75 19-18.19 0-34.13-8.66-48.94-16.7-26-14.12-48.44-26.31-81.31 1-2.576 2.115-6.38 1.741-8.495-.835-2.115-2.576-1.741-6.38 .835-8.495 39.13-32.45 68.65-16.41 94.69-2.26 26.04 14.15 48.44 26.31 81.31-1 1.231-1.01 2.814-1.489 4.399-1.332 1.585 .158 3.042 .939 4.051 2.172ZM212.17 121.77c-32.87 27.27-55.32 15.07-81.31 1C104.87 108.7 75.3 92.54 36.17 125c-2.554 2.115-2.91 5.901-.795 8.455 2.115 2.554 5.901 2.91 8.455 .795 32.87-27.27 55.32-15.08 81.31-1 14.81 8 30.75 16.71 48.94 16.71 13.79 0 28.88-5 45.75-19 2.552-2.115 2.905-5.898 .79-8.45-2.115-2.552-5.898-2.905-8.45-.79ZM43.83 78.21c32.87-27.27 55.32-15.07 81.31-1C140 85.3 155.89 94 174.08 94c13.79 0 28.88-5 45.75-19 2.552-2.115 2.905-5.898 .79-8.45-2.115-2.552-5.898-2.905-8.45-.79-32.87 27.27-55.32 15.07-81.31 1C104.87 52.69 75.3 36.52 36.17 69c-2.552 2.115-2.905 5.898-.79 8.45 2.115 2.552 5.898 2.905 8.45 .79Z"),
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
        return _waves!!
    }

private var _waves: ImageVector? = null
