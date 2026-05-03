package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowElbowLeftUp: ImageVector
    get() {
        if (_arrowElbowLeftUp != null) return _arrowElbowLeftUp!!
        _arrowElbowLeftUp = phosphorDuotoneIcon(
            name = "ArrowElbowLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 136.000 96.000 L 40.000 96.000 L 88.000 48.000 Z"),
            pathFillType = PathFillType.NonZero,
            fill = SolidColor(Color(0xFF000000)),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 0.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
        )
    }
    addPath(
        pathData = parseSvgPathData("M 232.000 184.000 L 96.000 184.000 L 96.000 104.000 L 136.000 104.000 C 139.238 104.003 142.158 102.053 143.397 99.062 C 144.636 96.071 143.951 92.628 141.660 90.340 L 93.660 42.340 C 92.159 40.838 90.123 39.994 88.000 39.994 C 85.877 39.994 83.841 40.838 82.340 42.340 L 34.340 90.340 C 32.049 92.628 31.364 96.071 32.603 99.062 C 33.842 102.053 36.762 104.003 40.000 104.000 L 80.000 104.000 L 80.000 192.000 C 80.000 196.418 83.582 200.000 88.000 200.000 L 232.000 200.000 C 236.418 200.000 240.000 196.418 240.000 192.000 C 240.000 187.582 236.418 184.000 232.000 184.000 ZM 88.000 59.310 L 116.690 88.000 L 59.310 88.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _arrowElbowLeftUp!!
    }

private var _arrowElbowLeftUp: ImageVector? = null
