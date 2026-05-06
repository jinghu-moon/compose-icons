package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Coin: ImageVector
    get() {
        if (_coin != null) return _coin!!
        _coin = phosphorBoldIcon(
            name = "Coin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M209.37 60.27C188.08 49.62 160 44 128 44 96 44 67.92 49.62 46.63 60.27 24.62 71.27 12 87.21 12 104v48c0 16.79 12.62 32.73 34.63 43.73C67.92 206.38 96.05 212 128 212c31.95 0 60.08-5.62 81.37-16.27C231.37 184.73 244 168.79 244 152v-48C244 87.21 231.38 71.27 209.37 60.27ZM57.37 81.73C75.08 72.88 100.16 68 128 68c27.84 0 52.92 4.88 70.63 13.73C211.81 88.32 220 96.86 220 104c0 7.14-8.19 15.68-21.37 22.27C180.92 135.12 155.84 140 128 140c-27.84 0-52.92-4.88-70.63-13.73C44.19 119.68 36 111.14 36 104 36 96.86 44.19 88.32 57.37 81.73ZM180 181.38c-13.055 3.595-26.472 5.708-40 6.3v-24c13.479-.55 26.874-2.395 40-5.51ZM76 158.22c13.126 3.115 26.521 4.96 40 5.51v24c-13.528-.592-26.945-2.705-40-6.3ZM36 152v-10.46c3.405 2.292 6.956 4.36 10.63 6.19 1.74 .87 3.54 1.7 5.37 2.5v21.07C42 165.24 36 158.11 36 152ZM204 171.3v-21.07c1.83-.8 3.63-1.63 5.37-2.5 3.674-1.83 7.225-3.898 10.63-6.19v10.46c0 6.11-6 13.24-16 19.3Z"),
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
        return _coin!!
    }

private var _coin: ImageVector? = null
