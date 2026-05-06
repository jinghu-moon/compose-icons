package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CircleHalfTilt: ImageVector
    get() {
        if (_circleHalfTilt != null) return _circleHalfTilt!!
        _circleHalfTilt = phosphorRegularIcon(
            name = "CircleHalfTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M201.54 54.46C160.925 13.845 95.075 13.845 54.46 54.46c-40.615 40.615-40.615 106.465 0 147.08 40.615 40.615 106.465 40.615 147.08 0 40.615-40.615 40.615-106.465 0-147.08ZM184 195.87c-4.932 4.077-10.297 7.598-16 10.5v-107.06l16-16ZM104 163.31l16-16v68.28c-5.414-.506-10.77-1.51-16-3ZM88 206.37C82.18 203.407 76.712 199.797 71.7 195.61L88 179.31ZM136 131.31l16-16v97.32c-5.23 1.49-10.586 2.494-16 3ZM40 128C40.009 93.867 59.755 62.818 90.664 48.337c30.908-14.482 67.403-9.784 93.636 12.053L60.38 184.31C47.163 168.528 39.945 148.585 40 128ZM200 178.59v-101.18c21.327 30.355 21.327 70.825 0 101.18Z"),
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
