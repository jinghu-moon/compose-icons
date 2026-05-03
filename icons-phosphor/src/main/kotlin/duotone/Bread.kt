package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Bread: ImageVector
    get() {
        if (_bread != null) return _bread!!
        _bread = phosphorDuotoneIcon(
            name = "Bread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 111.000 L 208.000 200.000 C 208.000 204.418 204.418 208.000 200.000 208.000 L 144.000 208.000 C 148.418 208.000 152.000 204.418 152.000 200.000 L 152.000 111.000 C 167.634 106.997 177.841 91.979 175.808 75.969 C 173.775 59.959 160.139 47.968 144.000 48.000 L 200.000 48.000 C 216.139 47.968 229.775 59.959 231.808 75.969 C 233.841 91.979 223.634 106.997 208.000 111.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 240.000 80.000 C 240.000 57.909 222.091 40.000 200.000 40.000 L 48.000 40.000 C 29.068 40.011 12.737 53.294 8.868 71.827 C 5.000 90.359 14.654 109.066 32.000 116.650 L 32.000 200.000 C 32.000 208.837 39.163 216.000 48.000 216.000 L 200.000 216.000 C 208.837 216.000 216.000 208.837 216.000 200.000 L 216.000 116.650 C 230.563 110.277 239.980 95.896 240.000 80.000 ZM 48.000 120.000 C 52.418 120.000 56.000 116.418 56.000 112.000 C 56.000 107.582 52.418 104.000 48.000 104.000 C 34.745 104.000 24.000 93.255 24.000 80.000 C 24.000 66.745 34.745 56.000 48.000 56.000 L 144.000 56.000 C 157.255 56.000 168.000 66.745 168.000 80.000 C 168.000 93.255 157.255 104.000 144.000 104.000 C 139.582 104.000 136.000 107.582 136.000 112.000 C 136.000 116.418 139.582 120.000 144.000 120.000 L 144.000 200.000 L 48.000 200.000 ZM 200.000 104.000 C 195.582 104.000 192.000 107.582 192.000 112.000 C 192.000 116.418 195.582 120.000 200.000 120.000 L 200.000 200.000 L 160.000 200.000 L 160.000 116.650 C 171.202 111.759 179.553 102.014 182.671 90.195 C 185.789 78.376 183.332 65.780 176.000 56.000 L 200.000 56.000 C 213.255 56.000 224.000 66.745 224.000 80.000 C 224.000 93.255 213.255 104.000 200.000 104.000 Z"),
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
        return _bread!!
    }

private var _bread: ImageVector? = null
