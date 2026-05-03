package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SealWarning: ImageVector
    get() {
        if (_sealWarning != null) return _sealWarning!!
        _sealWarning = phosphorFillIcon(
            name = "SealWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.86f, 102.82f),
                    PathNode.CurveTo(222.09f, 98.88f, 218.19f, 94.82f, 216.72f, 91.25f),
                    PathNode.CurveTo(215.36f, 87.98f, 215.28f, 82.56f, 215.2f, 77.31f),
                    PathNode.CurveTo(215.05f, 67.55f, 214.89f, 56.49f, 207.2f, 48.8f),
                    PathNode.CurveTo(199.51f, 41.11f, 188.45f, 40.95f, 178.69f, 40.8f),
                    PathNode.CurveTo(173.44f, 40.72f, 168.02f, 40.64f, 164.75f, 39.28f),
                    PathNode.CurveTo(161.19f, 37.81f, 157.12f, 33.91f, 153.18f, 30.14f),
                    PathNode.CurveTo(146.28f, 23.51f, 138.44f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(117.56f, 16.0f, 109.73f, 23.51f, 102.82f, 30.14f),
                    PathNode.CurveTo(98.88f, 33.91f, 94.82f, 37.81f, 91.25f, 39.28f),
                    PathNode.CurveTo(88.0f, 40.64f, 82.56f, 40.72f, 77.31f, 40.8f),
                    PathNode.CurveTo(67.55f, 40.95f, 56.49f, 41.11f, 48.8f, 48.8f),
                    PathNode.CurveTo(41.11f, 56.49f, 41.0f, 67.55f, 40.8f, 77.31f),
                    PathNode.CurveTo(40.72f, 82.56f, 40.64f, 87.98f, 39.28f, 91.25f),
                    PathNode.CurveTo(37.81f, 94.81f, 33.91f, 98.88f, 30.14f, 102.82f),
                    PathNode.CurveTo(23.51f, 109.72f, 16.0f, 117.56f, 16.0f, 128.0f),
                    PathNode.CurveTo(16.0f, 138.44f, 23.51f, 146.27f, 30.14f, 153.18f),
                    PathNode.CurveTo(33.91f, 157.12f, 37.81f, 161.18f, 39.28f, 164.75f),
                    PathNode.CurveTo(40.64f, 168.02f, 40.72f, 173.44f, 40.8f, 178.69f),
                    PathNode.CurveTo(40.95f, 188.45f, 41.11f, 199.51f, 48.8f, 207.2f),
                    PathNode.CurveTo(56.49f, 214.89f, 67.55f, 215.05f, 77.31f, 215.2f),
                    PathNode.CurveTo(82.56f, 215.28f, 87.98f, 215.36f, 91.25f, 216.72f),
                    PathNode.CurveTo(94.81f, 218.19f, 98.88f, 222.09f, 102.82f, 225.86f),
                    PathNode.CurveTo(109.72f, 232.49f, 117.56f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(138.44f, 240.0f, 146.27f, 232.49f, 153.18f, 225.86f),
                    PathNode.CurveTo(157.12f, 222.09f, 161.18f, 218.19f, 164.75f, 216.72f),
                    PathNode.CurveTo(168.02f, 215.36f, 173.44f, 215.28f, 178.69f, 215.2f),
                    PathNode.CurveTo(188.45f, 215.05f, 199.51f, 214.89f, 207.2f, 207.2f),
                    PathNode.CurveTo(214.89f, 199.51f, 215.05f, 188.45f, 215.2f, 178.69f),
                    PathNode.CurveTo(215.28f, 173.44f, 215.36f, 168.02f, 216.72f, 164.75f),
                    PathNode.CurveTo(218.19f, 161.19f, 222.09f, 157.12f, 225.86f, 153.18f),
                    PathNode.CurveTo(232.49f, 146.28f, 240.0f, 138.44f, 240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 117.56f, 232.49f, 109.73f, 225.86f, 102.82f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 80.0f),
                    PathNode.CurveTo(120.0f, 75.58172f, 123.58172f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(132.41827f, 72.0f, 136.0f, 75.58172f, 136.0f, 80.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.CurveTo(136.0f, 140.41827f, 132.41827f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(123.58172f, 144.0f, 120.0f, 140.41827f, 120.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 184.0f),
                    PathNode.CurveTo(121.37258f, 184.0f, 116.0f, 178.62741f, 116.0f, 172.0f),
                    PathNode.CurveTo(116.0f, 165.37259f, 121.37258f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(134.62741f, 160.0f, 140.0f, 165.37259f, 140.0f, 172.0f),
                    PathNode.CurveTo(140.0f, 178.62741f, 134.62741f, 184.0f, 128.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _sealWarning!!
    }

private var _sealWarning: ImageVector? = null
