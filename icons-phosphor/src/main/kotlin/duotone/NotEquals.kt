package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NotEquals: ImageVector
    get() {
        if (_notEquals != null) return _notEquals!!
        _notEquals = phosphorDuotoneIcon(
            name = "NotEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 56.000 L 216.000 200.000 C 216.000 208.837 208.837 216.000 200.000 216.000 L 56.000 216.000 C 47.163 216.000 40.000 208.837 40.000 200.000 L 40.000 56.000 C 40.000 47.163 47.163 40.000 56.000 40.000 L 200.000 40.000 C 208.837 40.000 216.000 47.163 216.000 56.000 Z"),
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
                pathData = parseSvgPathData("M 224.000 160.000 C 224.000 164.418 220.418 168.000 216.000 168.000 L 102.450 168.000 L 53.920 221.380 C 50.935 224.587 45.926 224.796 42.684 221.849 C 39.442 218.903 39.173 213.897 42.080 210.620 L 80.820 168.000 L 40.000 168.000 C 35.582 168.000 32.000 164.418 32.000 160.000 C 32.000 155.582 35.582 152.000 40.000 152.000 L 95.370 152.000 L 139.000 104.000 L 40.000 104.000 C 35.582 104.000 32.000 100.418 32.000 96.000 C 32.000 91.582 35.582 88.000 40.000 88.000 L 153.550 88.000 L 202.080 34.620 C 205.065 31.413 210.074 31.204 213.316 34.151 C 216.558 37.097 216.827 42.103 213.920 45.380 L 175.180 88.000 L 216.000 88.000 C 220.418 88.000 224.000 91.582 224.000 96.000 C 224.000 100.418 220.418 104.000 216.000 104.000 L 160.630 104.000 L 117.000 152.000 L 216.000 152.000 C 220.418 152.000 224.000 155.582 224.000 160.000 Z"),
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
        return _notEquals!!
    }

private var _notEquals: ImageVector? = null
