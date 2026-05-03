package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CirclesThree: ImageVector
    get() {
        if (_circlesThree != null) return _circlesThree!!
        _circlesThree = phosphorRegularIcon(
            name = "CirclesThree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 76.0f),
                    PathNode.CurveTo(172.0f, 51.69947f, 152.30052f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(103.69947f, 32.0f, 84.0f, 51.69947f, 84.0f, 76.0f),
                    PathNode.CurveTo(84.0f, 100.30053f, 103.69947f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(152.28911f, 119.97244f, 171.97244f, 100.28911f, 172.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 104.0f),
                    PathNode.CurveTo(112.536026f, 104.0f, 100.0f, 91.463974f, 100.0f, 76.0f),
                    PathNode.CurveTo(100.0f, 60.53603f, 112.536026f, 48.0f, 128.0f, 48.0f),
                    PathNode.CurveTo(143.46397f, 48.0f, 156.0f, 60.53603f, 156.0f, 76.0f),
                    PathNode.CurveTo(156.0f, 91.463974f, 143.46397f, 104.0f, 128.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 128.0f),
                    PathNode.CurveTo(163.69948f, 128.0f, 144.0f, 147.69948f, 144.0f, 172.0f),
                    PathNode.CurveTo(144.0f, 196.30052f, 163.69948f, 216.0f, 188.0f, 216.0f),
                    PathNode.CurveTo(212.30052f, 216.0f, 232.0f, 196.30052f, 232.0f, 172.0f),
                    PathNode.CurveTo(231.97244f, 147.71089f, 212.28911f, 128.02756f, 188.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 200.0f),
                    PathNode.CurveTo(172.53603f, 200.0f, 160.0f, 187.46397f, 160.0f, 172.0f),
                    PathNode.CurveTo(160.0f, 156.53603f, 172.53603f, 144.0f, 188.0f, 144.0f),
                    PathNode.CurveTo(203.46397f, 144.0f, 216.0f, 156.53603f, 216.0f, 172.0f),
                    PathNode.CurveTo(216.0f, 187.46397f, 203.46397f, 200.0f, 188.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 128.0f),
                    PathNode.CurveTo(43.69947f, 128.0f, 24.0f, 147.69948f, 24.0f, 172.0f),
                    PathNode.CurveTo(24.0f, 196.30052f, 43.69947f, 216.0f, 68.0f, 216.0f),
                    PathNode.CurveTo(92.30053f, 216.0f, 112.0f, 196.30052f, 112.0f, 172.0f),
                    PathNode.CurveTo(111.97244f, 147.71089f, 92.28911f, 128.02756f, 68.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 200.0f),
                    PathNode.CurveTo(52.53603f, 200.0f, 40.0f, 187.46397f, 40.0f, 172.0f),
                    PathNode.CurveTo(40.0f, 156.53603f, 52.53603f, 144.0f, 68.0f, 144.0f),
                    PathNode.CurveTo(83.463974f, 144.0f, 96.0f, 156.53603f, 96.0f, 172.0f),
                    PathNode.CurveTo(96.0f, 187.46397f, 83.463974f, 200.0f, 68.0f, 200.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _circlesThree!!
    }

private var _circlesThree: ImageVector? = null
