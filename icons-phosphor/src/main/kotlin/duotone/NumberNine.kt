package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberNine: ImageVector
    get() {
        if (_numberNine != null) return _numberNine!!
        _numberNine = phosphorDuotoneIcon(
            name = "NumberNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 40.000 L 216.000 216.000 C 216.000 224.837 208.837 232.000 200.000 232.000 L 56.000 232.000 C 47.163 232.000 40.000 224.837 40.000 216.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 200.000 24.000 C 208.837 24.000 216.000 31.163 216.000 40.000 Z"),
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
                pathData = parseSvgPathData("M 128.000 40.000 C 106.089 39.990 86.185 52.759 77.061 72.680 C 67.937 92.600 71.268 116.012 85.587 132.597 C 99.906 149.181 122.582 155.892 143.620 149.770 L 113.000 204.070 C 110.832 207.936 112.209 212.827 116.075 214.995 C 119.941 217.163 124.832 215.786 127.000 211.920 L 176.550 123.920 C 186.517 106.590 186.490 85.262 176.479 67.957 C 166.468 50.653 147.992 39.998 128.000 40.000 ZM 128.000 136.000 C 105.909 136.000 88.000 118.091 88.000 96.000 C 88.000 73.909 105.909 56.000 128.000 56.000 C 150.091 56.000 168.000 73.909 168.000 96.000 C 168.000 118.091 150.091 136.000 128.000 136.000 Z"),
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
        return _numberNine!!
    }

private var _numberNine: ImageVector? = null
