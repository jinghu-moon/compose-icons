package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SkipBack: ImageVector
    get() {
        if (_skipBack != null) return _skipBack!!
        _skipBack = phosphorDuotoneIcon(
            name = "SkipBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 200.000 47.880 L 200.000 208.120 C 199.941 210.988 198.351 213.605 195.833 214.979 C 193.315 216.353 190.253 216.273 187.810 214.770 L 59.700 134.650 C 57.401 133.221 56.004 130.707 56.004 128.000 C 56.004 125.293 57.401 122.779 59.700 121.350 L 187.810 41.230 C 190.253 39.727 193.315 39.647 195.833 41.021 C 198.351 42.395 199.941 45.012 200.000 47.880 Z"),
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
                pathData = parseSvgPathData("M 199.810 34.000 C 194.721 31.180 188.503 31.345 183.570 34.430 L 64.000 109.230 L 64.000 40.000 C 64.000 35.582 60.418 32.000 56.000 32.000 C 51.582 32.000 48.000 35.582 48.000 40.000 L 48.000 216.000 C 48.000 220.418 51.582 224.000 56.000 224.000 C 60.418 224.000 64.000 220.418 64.000 216.000 L 64.000 146.770 L 183.570 221.550 C 188.474 224.628 194.660 224.808 199.734 222.018 C 204.808 219.229 207.971 213.910 208.000 208.120 L 208.000 47.880 C 207.999 42.108 204.862 36.792 199.810 34.000 ZM 192.000 208.000 L 64.160 128.000 L 192.000 48.070 Z"),
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
        return _skipBack!!
    }

private var _skipBack: ImageVector? = null
