package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowElbowUpLeft: ImageVector
    get() {
        if (_arrowElbowUpLeft != null) return _arrowElbowUpLeft!!
        _arrowElbowUpLeft = phosphorDuotoneIcon(
            name = "ArrowElbowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 96.000 32.000 L 96.000 128.000 L 48.000 80.000 Z"),
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
                pathData = parseSvgPathData("M 192.000 72.000 L 104.000 72.000 L 104.000 32.000 C 104.003 28.762 102.053 25.842 99.062 24.603 C 96.071 23.364 92.628 24.049 90.340 26.340 L 42.340 74.340 C 40.838 75.841 39.994 77.877 39.994 80.000 C 39.994 82.123 40.838 84.159 42.340 85.660 L 90.340 133.660 C 92.628 135.951 96.071 136.636 99.062 135.397 C 102.053 134.158 104.003 131.238 104.000 128.000 L 104.000 88.000 L 184.000 88.000 L 184.000 224.000 C 184.000 228.418 187.582 232.000 192.000 232.000 C 196.418 232.000 200.000 228.418 200.000 224.000 L 200.000 80.000 C 200.000 75.582 196.418 72.000 192.000 72.000 ZM 88.000 108.690 L 59.310 80.000 L 88.000 51.310 Z"),
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
        return _arrowElbowUpLeft!!
    }

private var _arrowElbowUpLeft: ImageVector? = null
