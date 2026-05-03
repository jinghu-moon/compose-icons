package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CourtBasketball: ImageVector
    get() {
        if (_courtBasketball != null) return _courtBasketball!!
        _courtBasketball = phosphorFillIcon(
            name = "CourtBasketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.000 92.230 L 240.000 163.770 C 240.006 164.906 239.529 165.991 238.687 166.754 C 237.846 167.517 236.720 167.886 235.590 167.770 C 215.314 165.539 199.965 148.408 199.965 128.010 C 199.965 107.612 215.314 90.481 235.590 88.250 C 236.716 88.134 237.839 88.501 238.680 89.259 C 239.521 90.018 240.000 91.098 240.000 92.230 ZM 20.410 167.760 C 40.686 165.529 56.035 148.398 56.035 128.000 C 56.035 107.602 40.686 90.471 20.410 88.240 C 19.280 88.124 18.154 88.493 17.313 89.256 C 16.471 90.019 15.994 91.104 16.000 92.240 L 16.000 163.780 C 16.000 164.912 16.479 165.992 17.320 166.751 C 18.161 167.509 19.284 167.876 20.410 167.760 ZM 116.000 48.000 L 32.000 48.000 C 23.163 48.000 16.000 55.163 16.000 64.000 L 16.000 68.130 C 15.997 70.263 17.669 72.023 19.800 72.130 C 49.179 74.135 71.986 98.552 71.986 128.000 C 71.986 157.448 49.179 181.865 19.800 183.870 C 17.669 183.977 15.997 185.737 16.000 187.870 L 16.000 192.000 C 16.000 200.837 23.163 208.000 32.000 208.000 L 116.000 208.000 C 118.209 208.000 120.000 206.209 120.000 204.000 L 120.000 52.000 C 120.000 49.791 118.209 48.000 116.000 48.000 ZM 224.000 48.000 L 140.000 48.000 C 137.791 48.000 136.000 49.791 136.000 52.000 L 136.000 204.000 C 136.000 206.209 137.791 208.000 140.000 208.000 L 224.000 208.000 C 232.837 208.000 240.000 200.837 240.000 192.000 L 240.000 187.870 C 240.003 185.737 238.331 183.977 236.200 183.870 C 206.821 181.865 184.014 157.448 184.014 128.000 C 184.014 98.552 206.821 74.135 236.200 72.130 C 238.331 72.023 240.003 70.263 240.000 68.130 L 240.000 64.000 C 240.000 55.163 232.837 48.000 224.000 48.000 Z"),
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
        return _courtBasketball!!
    }

private var _courtBasketball: ImageVector? = null
