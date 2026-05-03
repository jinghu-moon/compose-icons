package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BowlingBall: ImageVector
    get() {
        if (_bowlingBall != null) return _bowlingBall!!
        _bowlingBall = phosphorLightIcon(
            name = "BowlingBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 142.000 116.000 C 142.000 121.523 137.523 126.000 132.000 126.000 C 126.477 126.000 122.000 121.523 122.000 116.000 C 122.000 110.477 126.477 106.000 132.000 106.000 C 137.523 106.000 142.000 110.477 142.000 116.000 ZM 164.000 102.000 C 158.477 102.000 154.000 97.523 154.000 92.000 C 154.000 86.477 158.477 82.000 164.000 82.000 C 169.523 82.000 174.000 86.477 174.000 92.000 C 174.000 97.523 169.523 102.000 164.000 102.000 ZM 182.000 132.000 C 182.000 137.523 177.523 142.000 172.000 142.000 C 166.477 142.000 162.000 137.523 162.000 132.000 C 162.000 126.477 166.477 122.000 172.000 122.000 C 177.523 122.000 182.000 126.477 182.000 132.000 Z"),
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
        return _bowlingBall!!
    }

private var _bowlingBall: ImageVector? = null
