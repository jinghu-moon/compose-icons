package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GenderTransgender: ImageVector
    get() {
        if (_genderTransgender != null) return _genderTransgender!!
        _genderTransgender = phosphorBoldIcon(
            name = "GenderTransgender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 28h-44c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h15L168 71 152.49 55.52c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L151 88 140.58 98.46C108.473 75.219 63.897 80.555 38.182 110.716c-25.715 30.162-23.932 75.021 4.094 103.047 28.026 28.026 72.886 29.809 103.047 4.094 30.162-25.715 35.497-70.291 12.256-102.398L168 105l15.51 15.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17L185 88 204 69v15c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-44c0-6.627-5.373-12-12-12ZM132.77 196.8c-17.54 17.54-45.026 20.25-65.653 6.472C46.49 189.494 38.467 163.066 47.952 140.146c9.486-22.92 33.839-35.949 58.17-31.12 24.331 4.828 41.863 26.169 41.878 50.974 .003 13.801-5.475 27.037-15.23 36.8Z"),
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
        return _genderTransgender!!
    }

private var _genderTransgender: ImageVector? = null
