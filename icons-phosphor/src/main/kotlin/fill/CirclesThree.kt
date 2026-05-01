package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CirclesThree: ImageVector
    get() {
        if (_circlesThree != null) return _circlesThree!!
        _circlesThree = phosphorFillIcon(
            name = "CirclesThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 120.0f),
                    PathNode.CurveTo(103.69947f, 120.0f, 84.0f, 100.30053f, 84.0f, 76.0f),
                    PathNode.CurveTo(84.0f, 51.69947f, 103.69947f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(152.30052f, 32.0f, 172.0f, 51.69947f, 172.0f, 76.0f),
                    PathNode.CurveTo(171.97244f, 100.28911f, 152.28911f, 119.97244f, 128.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 128.0f),
                    PathNode.CurveTo(163.69948f, 128.0f, 144.0f, 147.69948f, 144.0f, 172.0f),
                    PathNode.CurveTo(144.0f, 196.30052f, 163.69948f, 216.0f, 188.0f, 216.0f),
                    PathNode.CurveTo(212.30052f, 216.0f, 232.0f, 196.30052f, 232.0f, 172.0f),
                    PathNode.CurveTo(231.97244f, 147.71089f, 212.28911f, 128.02756f, 188.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 128.0f),
                    PathNode.CurveTo(43.69947f, 128.0f, 24.0f, 147.69948f, 24.0f, 172.0f),
                    PathNode.CurveTo(24.0f, 196.30052f, 43.69947f, 216.0f, 68.0f, 216.0f),
                    PathNode.CurveTo(92.30053f, 216.0f, 112.0f, 196.30052f, 112.0f, 172.0f),
                    PathNode.CurveTo(111.97244f, 147.71089f, 92.28911f, 128.02756f, 68.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _circlesThree!!
    }

private var _circlesThree: ImageVector? = null
