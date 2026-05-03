package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) return _thumbsUp!!
        _thumbsUp = phosphorDuotoneIcon(
            name = "ThumbsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 80.000 104.000 L 80.000 208.000 L 32.000 208.000 C 27.582 208.000 24.000 204.418 24.000 200.000 L 24.000 112.000 C 24.000 107.582 27.582 104.000 32.000 104.000 Z"),
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
                pathData = parseSvgPathData("M 234.000 80.120 C 229.443 74.956 222.887 71.999 216.000 72.000 L 160.000 72.000 L 160.000 56.000 C 160.000 33.909 142.091 16.000 120.000 16.000 C 116.969 15.998 114.197 17.709 112.840 20.420 L 75.060 96.000 L 32.000 96.000 C 23.163 96.000 16.000 103.163 16.000 112.000 L 16.000 200.000 C 16.000 208.837 23.163 216.000 32.000 216.000 L 204.000 216.000 C 216.098 216.004 226.308 207.003 227.820 195.000 L 239.820 99.000 C 240.680 92.163 238.560 85.286 234.000 80.120 ZM 32.000 112.000 L 72.000 112.000 L 72.000 200.000 L 32.000 200.000 ZM 223.940 97.000 L 211.940 193.000 C 211.436 197.001 208.033 200.001 204.000 200.000 L 88.000 200.000 L 88.000 105.890 L 124.710 32.460 C 135.929 34.705 144.003 44.558 144.000 56.000 L 144.000 80.000 C 144.000 84.418 147.582 88.000 152.000 88.000 L 216.000 88.000 C 218.296 87.999 220.483 88.985 222.002 90.707 C 223.521 92.430 224.227 94.722 223.940 97.000 Z"),
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
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
