package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Buildings: ImageVector
    get() {
        if (_buildings != null) return _buildings!!
        _buildings = phosphorDuotoneIcon(
            name = "Buildings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 136.000 32.000 L 136.000 216.000 L 40.000 216.000 L 40.000 85.350 C 39.998 82.674 41.334 80.175 43.560 78.690 L 123.560 25.360 C 126.012 23.724 129.166 23.569 131.767 24.957 C 134.368 26.345 135.995 29.052 136.000 32.000 Z"),
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
                pathData = parseSvgPathData("M 240.000 208.000 L 224.000 208.000 L 224.000 96.000 C 224.000 87.163 216.837 80.000 208.000 80.000 L 144.000 80.000 L 144.000 32.000 C 144.004 26.096 140.756 20.670 135.552 17.884 C 130.347 15.097 124.031 15.403 119.120 18.680 L 39.120 72.000 C 34.663 74.974 31.990 79.982 32.000 85.340 L 32.000 208.000 L 16.000 208.000 C 11.582 208.000 8.000 211.582 8.000 216.000 C 8.000 220.418 11.582 224.000 16.000 224.000 L 240.000 224.000 C 244.418 224.000 248.000 220.418 248.000 216.000 C 248.000 211.582 244.418 208.000 240.000 208.000 ZM 208.000 96.000 L 208.000 208.000 L 144.000 208.000 L 144.000 96.000 ZM 48.000 85.340 L 128.000 32.000 L 128.000 208.000 L 48.000 208.000 ZM 112.000 112.000 L 112.000 128.000 C 112.000 132.418 108.418 136.000 104.000 136.000 C 99.582 136.000 96.000 132.418 96.000 128.000 L 96.000 112.000 C 96.000 107.582 99.582 104.000 104.000 104.000 C 108.418 104.000 112.000 107.582 112.000 112.000 ZM 80.000 112.000 L 80.000 128.000 C 80.000 132.418 76.418 136.000 72.000 136.000 C 67.582 136.000 64.000 132.418 64.000 128.000 L 64.000 112.000 C 64.000 107.582 67.582 104.000 72.000 104.000 C 76.418 104.000 80.000 107.582 80.000 112.000 ZM 80.000 168.000 L 80.000 184.000 C 80.000 188.418 76.418 192.000 72.000 192.000 C 67.582 192.000 64.000 188.418 64.000 184.000 L 64.000 168.000 C 64.000 163.582 67.582 160.000 72.000 160.000 C 76.418 160.000 80.000 163.582 80.000 168.000 ZM 112.000 168.000 L 112.000 184.000 C 112.000 188.418 108.418 192.000 104.000 192.000 C 99.582 192.000 96.000 188.418 96.000 184.000 L 96.000 168.000 C 96.000 163.582 99.582 160.000 104.000 160.000 C 108.418 160.000 112.000 163.582 112.000 168.000 Z"),
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
        return _buildings!!
    }

private var _buildings: ImageVector? = null
