package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GitCommit: ImageVector
    get() {
        if (_gitCommit != null) return _gitCommit!!
        _gitCommit = phosphorDuotoneIcon(
            name = "GitCommit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 128.0f),
                    PathNode.CurveTo(176.0f, 154.50967f, 154.50967f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(101.49033f, 176.0f, 80.0f, 154.50967f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 101.49033f, 101.49033f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(154.50967f, 80.0f, 176.0f, 101.49033f, 176.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 120.0f),
                    PathNode.LineTo(183.42f, 120.0f),
                    PathNode.CurveTo(179.42601f, 92.46549f, 155.82266f, 72.03888f, 128.0f, 72.03888f),
                    PathNode.CurveTo(100.17734f, 72.03888f, 76.57398f, 92.46549f, 72.58f, 120.0f),
                    PathNode.LineTo(8.0f, 120.0f),
                    PathNode.CurveTo(3.581722f, 120.0f, 0f, 123.58172f, 0f, 128.0f),
                    PathNode.CurveTo(0f, 132.41827f, 3.581722f, 136.0f, 8.0f, 136.0f),
                    PathNode.LineTo(72.58f, 136.0f),
                    PathNode.CurveTo(76.57398f, 163.5345f, 100.17734f, 183.96112f, 128.0f, 183.96112f),
                    PathNode.CurveTo(155.82266f, 183.96112f, 179.42601f, 163.5345f, 183.42f, 136.0f),
                    PathNode.LineTo(248.0f, 136.0f),
                    PathNode.CurveTo(252.41827f, 136.0f, 256.0f, 132.41827f, 256.0f, 128.0f),
                    PathNode.CurveTo(256.0f, 123.58172f, 252.41827f, 120.0f, 248.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 168.0f),
                    PathNode.CurveTo(105.90861f, 168.0f, 88.0f, 150.09138f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 105.90861f, 105.90861f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(150.09138f, 88.0f, 168.0f, 105.90861f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 150.09138f, 150.09138f, 168.0f, 128.0f, 168.0f),
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
        return _gitCommit!!
    }

private var _gitCommit: ImageVector? = null
