package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AirplaneTaxiing: ImageVector
    get() {
        if (_airplaneTaxiing != null) return _airplaneTaxiing!!
        _airplaneTaxiing = phosphorBoldIcon(
            name = "AirplaneTaxiing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 88h-59L104.49 43.51C102.238 41.26 99.184 39.997 96 40h-8c-6.435-.009-12.481 3.079-16.246 8.297C67.988 53.515 66.963 60.226 69 66.33L76.27 88h-15.27L40.49 67.51C38.238 65.26 35.184 63.997 32 64h-8c-6.32 .005-12.266 2.997-16.036 8.069C4.194 77.141 3.043 83.697 4.86 89.75l14.07 46.89c5.502 18.667 22.679 31.451 42.14 31.36h178.93c6.627 0 12-5.373 12-12v-24C251.972 107.711 232.289 88.028 208 88ZM228 144h-166.93c-8.845 .038-16.652-5.768-19.16-14.25L30.4 91.36l17.12 17.13c2.25 2.247 5.3 3.51 8.48 3.51h36.9c3.859 .005 7.485-1.847 9.744-4.976 2.259-3.129 2.875-7.153 1.656-10.814L94.83 67.79l40.69 40.7c2.25 2.247 5.3 3.51 8.48 3.51h64c11.046 0 20 8.954 20 20ZM228 204c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20ZM132 204c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20Z"),
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
        return _airplaneTaxiing!!
    }

private var _airplaneTaxiing: ImageVector? = null
