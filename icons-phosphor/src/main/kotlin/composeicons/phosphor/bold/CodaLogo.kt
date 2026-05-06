package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CodaLogo: ImageVector
    get() {
        if (_codaLogo != null) return _codaLogo!!
        _codaLogo = phosphorBoldIcon(
            name = "CodaLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 92c6.85-.069 13.577 1.829 19.38 5.47 4.924 3.149 11.172 3.362 16.3 .557C216.807 95.222 219.997 89.844 220 84v-36C220 36.954 211.046 28 200 28h-144C44.954 28 36 36.954 36 48v160c0 11.046 8.954 20 20 20h144c11.046 0 20-8.954 20-20v-36c-.004-5.84-3.19-11.213-8.311-14.019-5.121-2.806-11.364-2.6-16.289 .539-6.58 4.22-11.89 5.76-18.92 5.48h-.48c-19.882 0-36-16.118-36-36 0-19.882 16.118-36 36-36ZM175.76 188c6.878 .34 13.756-.68 20.24-3v19h-136v-152h136v19.3C189.562 69.102 182.803 67.987 176 68c-33.137-.066-60.054 26.743-60.12 59.88-.066 33.137 26.743 60.054 59.88 60.12Z"),
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
        return _codaLogo!!
    }

private var _codaLogo: ImageVector? = null
