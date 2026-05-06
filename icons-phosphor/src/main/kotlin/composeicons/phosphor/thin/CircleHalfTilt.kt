package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CircleHalfTilt: ImageVector
    get() {
        if (_circleHalfTilt != null) return _circleHalfTilt!!
        _circleHalfTilt = phosphorThinIcon(
            name = "CircleHalfTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198.71 57.29C173.485 31.843 136.573 21.837 101.949 31.06 67.326 40.283 40.283 67.326 31.06 101.949c-9.223 34.623 .783 71.535 26.23 96.761 25.225 25.447 62.137 35.453 96.761 26.23 34.623-9.223 61.666-36.266 70.889-70.889 9.223-34.623-.783-71.535-26.23-96.761ZM188 197.72c-7.172 6.216-15.269 11.277-24 15v-115l24-24ZM100 161.66l24-24v82.24c-8.153-.342-16.224-1.768-24-4.24ZM92 212.66C82.384 208.562 73.54 202.849 65.85 195.77L92 169.66ZM132 129.66l24-24v110c-7.776 2.474-15.847 3.9-24 4.24ZM36 128C36.006 91.52 57.565 58.489 90.957 43.801c33.392-14.688 72.309-8.259 99.203 16.389L60.16 190.19C44.553 173.248 35.923 151.035 36 128ZM196 190v-124c32.039 35.125 32.039 88.875 0 124Z"),
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
        return _circleHalfTilt!!
    }

private var _circleHalfTilt: ImageVector? = null
