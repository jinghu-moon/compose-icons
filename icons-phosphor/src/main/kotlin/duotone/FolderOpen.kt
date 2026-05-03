package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) return _folderOpen!!
        _folderOpen = phosphorDuotoneIcon(
            name = "FolderOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 208.000 88.000 L 208.000 112.000 L 69.770 112.000 C 66.326 112.000 63.269 114.203 62.180 117.470 L 32.000 208.000 L 32.000 64.000 C 32.000 59.582 35.582 56.000 40.000 56.000 L 93.330 56.000 C 95.061 56.000 96.745 56.561 98.130 57.600 L 128.000 80.000 L 200.000 80.000 C 204.418 80.000 208.000 83.582 208.000 88.000 Z"),
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
                pathData = parseSvgPathData("M 245.000 110.640 C 241.988 106.464 237.149 103.992 232.000 104.000 L 216.000 104.000 L 216.000 88.000 C 216.000 79.163 208.837 72.000 200.000 72.000 L 130.670 72.000 L 102.940 51.200 C 100.166 49.132 96.800 48.010 93.340 48.000 L 40.000 48.000 C 31.163 48.000 24.000 55.163 24.000 64.000 L 24.000 208.000 C 24.000 212.418 27.582 216.000 32.000 216.000 L 211.100 216.000 C 214.544 216.000 217.601 213.797 218.690 210.530 L 247.180 125.060 C 248.805 120.182 247.995 114.820 245.000 110.640 ZM 93.340 64.000 L 123.200 86.400 C 124.585 87.439 126.269 88.000 128.000 88.000 L 200.000 88.000 L 200.000 104.000 L 69.770 104.000 C 62.883 103.999 56.768 108.406 54.590 114.940 L 40.000 158.700 L 40.000 64.000 ZM 205.340 200.000 L 43.100 200.000 L 69.770 120.000 L 232.000 120.000 Z"),
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
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
