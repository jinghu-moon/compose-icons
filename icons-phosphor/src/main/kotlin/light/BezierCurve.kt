package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BezierCurve: ImageVector
    get() {
        if (_bezierCurve != null) return _bezierCurve!!
        _bezierCurve = phosphorLightIcon(
            name = "BezierCurve",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 219.440 146.200 C 213.268 120.691 196.783 98.889 173.920 86.000 L 240.000 86.000 C 243.314 86.000 246.000 83.314 246.000 80.000 C 246.000 76.686 243.314 74.000 240.000 74.000 L 157.400 74.000 C 154.561 60.018 142.267 49.970 128.000 49.970 C 113.733 49.970 101.439 60.018 98.600 74.000 L 16.000 74.000 C 12.686 74.000 10.000 76.686 10.000 80.000 C 10.000 83.314 12.686 86.000 16.000 86.000 L 82.080 86.000 C 59.217 98.889 42.732 120.691 36.560 146.200 C 21.274 147.960 9.797 161.000 9.993 176.386 C 10.190 191.772 21.995 204.515 37.322 205.884 C 52.648 207.253 66.525 196.805 69.446 181.697 C 72.366 166.589 63.383 151.721 48.650 147.280 C 55.544 121.216 74.735 100.163 100.050 90.890 C 104.541 102.407 115.638 109.991 128.000 109.991 C 140.362 109.991 151.459 102.407 155.950 90.890 C 181.265 100.163 200.456 121.216 207.350 147.280 C 192.617 151.721 183.634 166.589 186.554 181.697 C 189.475 196.805 203.352 207.253 218.678 205.884 C 234.005 204.515 245.810 191.772 246.007 176.386 C 246.203 161.000 234.726 147.960 219.440 146.200 ZM 58.000 176.000 C 58.000 185.941 49.941 194.000 40.000 194.000 C 30.059 194.000 22.000 185.941 22.000 176.000 C 22.000 166.059 30.059 158.000 40.000 158.000 C 49.941 158.000 58.000 166.059 58.000 176.000 ZM 128.000 98.000 C 118.059 98.000 110.000 89.941 110.000 80.000 C 110.000 70.059 118.059 62.000 128.000 62.000 C 137.941 62.000 146.000 70.059 146.000 80.000 C 146.000 89.941 137.941 98.000 128.000 98.000 ZM 216.000 194.000 C 206.059 194.000 198.000 185.941 198.000 176.000 C 198.000 166.059 206.059 158.000 216.000 158.000 C 225.941 158.000 234.000 166.059 234.000 176.000 C 234.000 185.941 225.941 194.000 216.000 194.000 Z"),
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
        return _bezierCurve!!
    }

private var _bezierCurve: ImageVector? = null
