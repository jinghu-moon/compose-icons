package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cigarette: ImageVector
    get() {
        if (_cigarette != null) return _cigarette!!
        _cigarette = phosphorBoldIcon(
            name = "Cigarette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 124h-192c-11.046 0-20 8.954-20 20v32c0 11.046 8.954 20 20 20h192c11.046 0 20-8.954 20-20v-32c0-11.046-8.954-20-20-20ZM36 148h40v24h-40ZM220 172h-120v-24h120ZM201.67 55.89c7.53-12.71 7.12-19.63 5.07-21.1-5.558-2.998-7.841-9.791-5.222-15.537 2.619-5.746 9.243-8.48 15.152-6.253 6.62 3.082 11.632 8.817 13.8 15.79 3.6 10.92 .86 24.17-8.14 39.38-7.53 12.7-7.12 19.63-5.07 21.1 5.846 2.848 8.359 9.835 5.668 15.754-2.691 5.92-9.608 8.618-15.598 6.086-6.613-3.093-11.621-8.823-13.8-15.79-3.6-10.98-.86-24.23 8.14-39.43ZM153.67 55.89c7.53-12.71 7.12-19.63 5.07-21.1-5.558-2.998-7.841-9.791-5.222-15.537 2.619-5.746 9.243-8.48 15.152-6.253 6.62 3.082 11.632 8.817 13.8 15.79 3.6 10.92 .86 24.17-8.14 39.38-7.53 12.7-7.12 19.63-5.07 21.1 5.846 2.848 8.359 9.835 5.668 15.754-2.691 5.92-9.608 8.618-15.598 6.086-6.613-3.093-11.621-8.823-13.8-15.79-3.6-10.98-.86-24.23 8.14-39.43Z"),
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
        return _cigarette!!
    }

private var _cigarette: ImageVector? = null
