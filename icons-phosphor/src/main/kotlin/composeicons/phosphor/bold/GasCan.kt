package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GasCan: ImageVector
    get() {
        if (_gasCan != null) return _gasCan!!
        _gasCan = phosphorBoldIcon(
            name = "GasCan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 20h-68.69c-5.307-.014-10.399 2.096-14.14 5.86L105.66 37.37 90.14 21.86c-7.81-7.808-20.47-7.808-28.28 0l-24 24c-7.808 7.81-7.808 20.47 0 28.28L53.37 89.66 41.86 101.17c-3.764 3.741-5.874 8.833-5.86 14.14v100.69c0 11.046 8.954 20 20 20h144c11.046 0 20-8.954 20-20v-176C220 28.954 211.046 20 200 20ZM57.66 60 76 41.66 88.69 54.34 70.34 72.69ZM196 212h-136v-95L78.83 98.14h0L133 44h63ZM136 68c0-6.627 5.373-12 12-12h20c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-20c-6.627 0-12-5.373-12-12ZM175.5 133.37 147.21 156l28.29 22.63c5.175 4.142 6.012 11.695 1.87 16.87-4.142 5.175-11.695 6.012-16.87 1.87L128 171.37l-32.5 26c-5.175 4.142-12.728 3.305-16.87-1.87-4.142-5.175-3.305-12.728 1.87-16.87L108.79 156 80.5 133.37c-5.175-4.142-6.012-11.695-1.87-16.87 4.142-5.175 11.695-6.012 16.87-1.87L128 140.63l32.5-26c5.175-4.142 12.728-3.305 16.87 1.87 4.142 5.175 3.305 12.728-1.87 16.87Z"),
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
        return _gasCan!!
    }

private var _gasCan: ImageVector? = null
