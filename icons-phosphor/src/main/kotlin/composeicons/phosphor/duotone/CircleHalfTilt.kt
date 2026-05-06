package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CircleHalfTilt: ImageVector
    get() {
        if (_circleHalfTilt != null) return _circleHalfTilt!!
        _circleHalfTilt = phosphorDuotoneIcon(
            name = "CircleHalfTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M195.88 195.88c-37.49 37.487-98.27 37.487-135.76 0L195.88 60.12c37.487 37.49 37.487 98.27 0 135.76Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M201.54 54.46C160.925 13.845 95.075 13.845 54.46 54.46c-40.615 40.615-40.615 106.465 0 147.08 40.615 40.615 106.465 40.615 147.08 0 40.615-40.615 40.615-106.465 0-147.08ZM65.78 65.77C97.973 33.648 149.329 31.317 184.3 60.39L60.38 184.31C31.262 149.343 33.603 97.945 65.78 65.77ZM190.22 190.23c-32.198 32.112-83.546 34.443-118.52 5.38L195.62 71.69c29.118 34.967 26.777 86.365-5.4 118.54Z"),
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
        return _circleHalfTilt!!
    }

private var _circleHalfTilt: ImageVector? = null
