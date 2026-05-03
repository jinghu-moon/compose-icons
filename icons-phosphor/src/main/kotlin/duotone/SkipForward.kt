package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SkipForward: ImageVector
    get() {
        if (_skipForward != null) return _skipForward!!
        _skipForward = phosphorDuotoneIcon(
            name = "SkipForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 196.300 134.650 L 68.190 214.770 C 65.747 216.273 62.685 216.353 60.167 214.979 C 57.649 213.605 56.059 210.988 56.000 208.120 L 56.000 47.880 C 56.059 45.012 57.649 42.395 60.167 41.021 C 62.685 39.647 65.747 39.727 68.190 41.230 L 196.300 121.350 C 198.599 122.779 199.996 125.293 199.996 128.000 C 199.996 130.707 198.599 133.221 196.300 134.650 Z"),
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
                pathData = parseSvgPathData("M 200.000 32.000 C 195.582 32.000 192.000 35.582 192.000 40.000 L 192.000 109.230 L 72.430 34.450 C 67.526 31.372 61.340 31.192 56.266 33.982 C 51.192 36.771 48.029 42.090 48.000 47.880 L 48.000 208.120 C 48.061 213.896 51.230 219.190 56.291 221.972 C 61.353 224.755 67.521 224.593 72.430 221.550 L 192.000 146.770 L 192.000 216.000 C 192.000 220.418 195.582 224.000 200.000 224.000 C 204.418 224.000 208.000 220.418 208.000 216.000 L 208.000 40.000 C 208.000 35.582 204.418 32.000 200.000 32.000 ZM 64.000 207.930 L 64.000 48.050 L 191.840 128.050 Z"),
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
        return _skipForward!!
    }

private var _skipForward: ImageVector? = null
