package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.VirtualReality: ImageVector
    get() {
        if (_virtualReality != null) return _virtualReality!!
        _virtualReality = phosphorLightIcon(
            name = "VirtualReality",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M121.62 98.11l-24 64c-.877 2.345-3.117 3.899-5.62 3.899-2.503 0-4.743-1.554-5.62-3.899l-24-64c-1.165-3.104 .406-6.565 3.51-7.73 3.104-1.165 6.565 .406 7.73 3.51l18.38 49 18.38-49c1.165-3.104 4.626-4.675 7.73-3.51 3.104 1.165 4.675 4.626 3.51 7.73ZM254 128c-.05 43.058-34.942 77.95-78 78h-96C36.922 206 2 171.078 2 128 2 84.922 36.922 50 80 50h96c43.058 .05 77.95 34.942 78 78ZM242 128C241.956 91.567 212.433 62.044 176 62h-96C43.549 62 14 91.549 14 128c0 36.451 29.549 66 66 66h96c36.433-.044 65.956-29.567 66-66ZM178.2 137.76l11 19.26c1.657 2.877 .667 6.553-2.21 8.21-2.877 1.657-6.553 .667-8.21-2.21L166.71 141.9c-.901 .079-1.806 .112-2.71 .1h-14v18c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-64c0-3.314 2.686-6 6-6h20c11.494 .013 21.616 7.573 24.891 18.59 3.276 11.018-1.072 22.879-10.691 29.17ZM164 130c7.732 0 14-6.268 14-14 0-7.732-6.268-14-14-14h-14v28Z"),
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
        return _virtualReality!!
    }

private var _virtualReality: ImageVector? = null
