package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Folder: ImageVector
    get() {
        if (_folder != null) return _folder!!
        _folder = phosphorDuotoneIcon(
            name = "Folder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 128.000 80.000 L 32.000 80.000 L 32.000 56.000 C 32.000 51.582 35.582 48.000 40.000 48.000 L 92.690 48.000 C 94.809 48.001 96.841 48.843 98.340 50.340 Z"),
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
                pathData = parseSvgPathData("M 216.000 72.000 L 131.310 72.000 L 104.000 44.690 C 101.010 41.676 96.936 39.986 92.690 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 200.620 C 24.011 209.110 30.890 215.989 39.380 216.000 L 216.890 216.000 C 225.230 215.989 231.989 209.230 232.000 200.890 L 232.000 88.000 C 232.000 79.163 224.837 72.000 216.000 72.000 ZM 92.690 56.000 L 108.690 72.000 L 40.000 72.000 L 40.000 56.000 ZM 216.000 200.000 L 40.000 200.000 L 40.000 88.000 L 216.000 88.000 Z"),
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
        return _folder!!
    }

private var _folder: ImageVector? = null
