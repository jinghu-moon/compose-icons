package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GasCan: ImageVector
    get() {
        if (_gasCan != null) return _gasCan!!
        _gasCan = phosphorDuotoneIcon(
            name = "GasCan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 40.000 L 208.000 216.000 C 208.000 220.418 204.418 224.000 200.000 224.000 L 56.000 224.000 C 51.582 224.000 48.000 220.418 48.000 216.000 L 48.000 107.310 C 48.001 105.191 48.843 103.159 50.340 101.660 L 117.660 34.340 C 119.159 32.843 121.191 32.001 123.310 32.000 L 200.000 32.000 C 204.418 32.000 208.000 35.582 208.000 40.000 Z"),
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
                pathData = parseSvgPathData("M 200.000 24.000 L 123.310 24.000 C 119.064 23.986 114.990 25.676 112.000 28.690 L 101.660 39.000 L 91.310 28.690 C 85.062 22.447 74.938 22.447 68.690 28.690 L 44.690 52.690 C 38.447 58.938 38.447 69.062 44.690 75.310 L 55.000 85.660 L 44.690 96.000 C 41.676 98.990 39.986 103.064 40.000 107.310 L 40.000 216.000 C 40.000 224.837 47.163 232.000 56.000 232.000 L 200.000 232.000 C 208.837 232.000 216.000 224.837 216.000 216.000 L 216.000 40.000 C 216.000 31.163 208.837 24.000 200.000 24.000 ZM 56.000 64.000 L 80.000 40.000 L 90.340 50.340 L 66.340 74.340 ZM 200.000 216.000 L 56.000 216.000 L 56.000 107.310 L 72.000 91.310 L 72.000 91.310 L 123.310 40.000 L 200.000 40.000 ZM 128.000 64.000 C 128.000 59.582 131.582 56.000 136.000 56.000 L 176.000 56.000 C 180.418 56.000 184.000 59.582 184.000 64.000 C 184.000 68.418 180.418 72.000 176.000 72.000 L 136.000 72.000 C 131.582 72.000 128.000 68.418 128.000 64.000 ZM 180.800 126.400 L 141.330 156.000 L 180.800 185.600 C 184.335 188.251 185.051 193.265 182.400 196.800 C 179.749 200.335 174.735 201.051 171.200 198.400 L 128.000 166.000 L 84.800 198.400 C 81.265 201.051 76.251 200.335 73.600 196.800 C 70.949 193.265 71.665 188.251 75.200 185.600 L 114.670 156.000 L 75.200 126.400 C 71.665 123.749 70.949 118.735 73.600 115.200 C 76.251 111.665 81.265 110.949 84.800 113.600 L 128.000 146.000 L 171.200 113.600 C 174.735 110.949 179.749 111.665 182.400 115.200 C 185.051 118.735 184.335 123.749 180.800 126.400 Z"),
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
        return _gasCan!!
    }

private var _gasCan: ImageVector? = null
