package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Eye: ImageVector
    get() {
        if (_eye != null) return _eye!!
        _eye = phosphorBoldIcon(
            name = "Eye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(251.0f, 123.13f),
                    PathNode.CurveTo(250.63f, 122.32f, 241.87f, 102.87f, 222.52f, 83.52f),
                    PathNode.CurveTo(196.63f, 57.67f, 164.0f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(92.0f, 44.0f, 59.37f, 57.67f, 33.51f, 83.52f),
                    PathNode.CurveTo(14.16f, 102.87f, 5.4f, 122.32f, 5.0f, 123.13f),
                    PathNode.CurveTo(3.630182f, 126.235664f, 3.630182f, 129.77434f, 5.0f, 132.88f),
                    PathNode.CurveTo(5.37f, 133.7f, 14.13f, 153.14f, 33.49f, 172.49f),
                    PathNode.CurveTo(59.37f, 198.34f, 92.0f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(164.0f, 212.0f, 196.63f, 198.34f, 222.48f, 172.49f),
                    PathNode.CurveTo(241.84f, 153.14f, 250.6f, 133.7f, 250.97f, 132.88f),
                    PathNode.CurveTo(252.34938f, 129.77855f, 252.36028f, 126.239876f, 251.0f, 123.13f),
                    PathNode.Close,
                    PathNode.MoveTo(204.94f, 156.13f),
                    PathNode.CurveTo(183.47f, 177.27f, 157.59f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(98.41f, 188.0f, 72.53f, 177.27f, 51.09f, 156.12f),
                    PathNode.CurveTo(42.653454f, 147.77228f, 35.396404f, 138.31154f, 29.52f, 128.0f),
                    PathNode.CurveTo(35.3981f, 117.69261f, 42.655025f, 108.23539f, 51.09f, 99.89f),
                    PathNode.CurveTo(72.54f, 78.73f, 98.41f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(157.59f, 68.0f, 183.46f, 78.73f, 204.91f, 99.89f),
                    PathNode.CurveTo(213.34583f, 108.23465f, 220.60284f, 117.691986f, 226.48f, 128.0f),
                    PathNode.CurveTo(220.60266f, 138.31091f, 213.3457f, 147.77153f, 204.91f, 156.12f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 84.0f),
                    PathNode.CurveTo(103.69947f, 84.0f, 84.0f, 103.69947f, 84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 152.30052f, 103.69947f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(152.30052f, 172.0f, 172.0f, 152.30052f, 172.0f, 128.0f),
                    PathNode.CurveTo(171.97244f, 103.71089f, 152.28911f, 84.02756f, 128.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 148.0f),
                    PathNode.CurveTo(116.95431f, 148.0f, 108.0f, 139.0457f, 108.0f, 128.0f),
                    PathNode.CurveTo(108.0f, 116.95431f, 116.95431f, 108.0f, 128.0f, 108.0f),
                    PathNode.CurveTo(139.0457f, 108.0f, 148.0f, 116.95431f, 148.0f, 128.0f),
                    PathNode.CurveTo(148.0f, 139.0457f, 139.0457f, 148.0f, 128.0f, 148.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _eye!!
    }

private var _eye: ImageVector? = null
