package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Scales: ImageVector
    get() {
        if (_scales != null) return _scales!!
        _scales = phosphorRegularIcon(
            name = "Scales",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M239.43 133l-32-80h0c-1.455-3.639-5.333-5.689-9.16-4.84L136 62v-22c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v25.58L54.26 80.19c-2.573 .568-4.701 2.367-5.69 4.81h0v.06L16.57 165c-.383 .954-.576 1.972-.57 3 0 23.31 24.54 32 40 32 15.46 0 40-8.69 40-32 .006-1.028-.187-2.046-.57-3L66.92 93.77 120 82v126h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-129.58L187 67.1 160.57 133c-.383 .954-.576 1.972-.57 3 0 23.31 24.54 32 40 32 15.46 0 40-8.69 40-32 .006-1.028-.187-2.046-.57-3ZM56 184c-7.53 0-22.76-3.61-23.93-14.64L56 109.54l23.93 59.82C78.76 180.39 63.53 184 56 184ZM200 152c-7.53 0-22.76-3.61-23.93-14.64L200 77.54l23.93 59.82C222.76 148.39 207.53 152 200 152Z"),
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
        return _scales!!
    }

private var _scales: ImageVector? = null
