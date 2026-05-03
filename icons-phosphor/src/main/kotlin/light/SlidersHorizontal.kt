package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SlidersHorizontal: ImageVector
    get() {
        if (_slidersHorizontal != null) return _slidersHorizontal!!
        _slidersHorizontal = phosphorLightIcon(
            name = "SlidersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 40.000 86.000 L 74.600 86.000 C 77.439 99.982 89.733 110.030 104.000 110.030 C 118.267 110.030 130.561 99.982 133.400 86.000 L 216.000 86.000 C 219.314 86.000 222.000 83.314 222.000 80.000 C 222.000 76.686 219.314 74.000 216.000 74.000 L 133.400 74.000 C 130.561 60.018 118.267 49.970 104.000 49.970 C 89.733 49.970 77.439 60.018 74.600 74.000 L 40.000 74.000 C 36.686 74.000 34.000 76.686 34.000 80.000 C 34.000 83.314 36.686 86.000 40.000 86.000 ZM 104.000 62.000 C 113.941 62.000 122.000 70.059 122.000 80.000 C 122.000 89.941 113.941 98.000 104.000 98.000 C 94.059 98.000 86.000 89.941 86.000 80.000 C 86.000 70.059 94.059 62.000 104.000 62.000 ZM 216.000 170.000 L 197.400 170.000 C 194.561 156.018 182.267 145.970 168.000 145.970 C 153.733 145.970 141.439 156.018 138.600 170.000 L 40.000 170.000 C 36.686 170.000 34.000 172.686 34.000 176.000 C 34.000 179.314 36.686 182.000 40.000 182.000 L 138.600 182.000 C 141.439 195.982 153.733 206.030 168.000 206.030 C 182.267 206.030 194.561 195.982 197.400 182.000 L 216.000 182.000 C 219.314 182.000 222.000 179.314 222.000 176.000 C 222.000 172.686 219.314 170.000 216.000 170.000 ZM 168.000 194.000 C 158.059 194.000 150.000 185.941 150.000 176.000 C 150.000 166.059 158.059 158.000 168.000 158.000 C 177.941 158.000 186.000 166.059 186.000 176.000 C 186.000 185.941 177.941 194.000 168.000 194.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _slidersHorizontal!!
    }

private var _slidersHorizontal: ImageVector? = null
