package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GooglePhotosLogo: ImageVector
    get() {
        if (_googlePhotosLogo != null) return _googlePhotosLogo!!
        _googlePhotosLogo = phosphorLightIcon(
            name = "GooglePhotosLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 122.000 L 189.180 122.000 C 201.227 100.320 200.902 73.884 188.326 52.507 C 175.751 31.130 152.802 18.003 128.000 18.000 C 124.686 18.000 122.000 20.686 122.000 24.000 L 122.000 66.820 C 100.320 54.773 73.884 55.098 52.507 67.674 C 31.130 80.249 18.003 103.198 18.000 128.000 C 18.000 131.314 20.686 134.000 24.000 134.000 L 66.820 134.000 C 54.773 155.680 55.098 182.116 67.674 203.493 C 80.249 224.870 103.198 237.997 128.000 238.000 C 131.314 238.000 134.000 235.314 134.000 232.000 L 134.000 189.180 C 155.680 201.227 182.116 200.902 203.493 188.326 C 224.870 175.751 237.997 152.802 238.000 128.000 C 238.000 124.686 235.314 122.000 232.000 122.000 ZM 186.000 88.000 C 186.051 100.216 182.197 112.129 175.000 122.000 L 134.000 122.000 L 134.000 30.310 C 163.533 33.419 185.964 58.304 186.000 88.000 ZM 88.000 70.000 C 100.216 69.949 112.129 73.803 122.000 81.000 L 122.000 122.000 L 30.310 122.000 C 33.419 92.467 58.304 70.036 88.000 70.000 ZM 70.000 168.000 C 69.949 155.784 73.803 143.871 81.000 134.000 L 122.000 134.000 L 122.000 225.690 C 92.467 222.581 70.036 197.696 70.000 168.000 ZM 168.000 186.000 C 155.784 186.051 143.871 182.197 134.000 175.000 L 134.000 134.000 L 225.690 134.000 C 222.581 163.533 197.696 185.964 168.000 186.000 Z"),
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
        return _googlePhotosLogo!!
    }

private var _googlePhotosLogo: ImageVector? = null
