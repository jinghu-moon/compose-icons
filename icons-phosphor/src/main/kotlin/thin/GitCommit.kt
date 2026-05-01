package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GitCommit: ImageVector
    get() {
        if (_gitCommit != null) return _gitCommit!!
        _gitCommit = phosphorThinIcon(
            name = "GitCommit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 124.0f),
                    PathNode.LineTo(179.83f, 124.0f),
                    PathNode.CurveTo(177.6413f, 96.99884f, 155.08972f, 76.201324f, 128.0f, 76.201324f),
                    PathNode.CurveTo(100.91028f, 76.201324f, 78.3587f, 96.99884f, 76.17f, 124.0f),
                    PathNode.LineTo(8.0f, 124.0f),
                    PathNode.CurveTo(5.790861f, 124.0f, 4.0f, 125.79086f, 4.0f, 128.0f),
                    PathNode.CurveTo(4.0f, 130.20914f, 5.790861f, 132.0f, 8.0f, 132.0f),
                    PathNode.LineTo(76.17f, 132.0f),
                    PathNode.CurveTo(78.3587f, 159.00114f, 100.91028f, 179.79868f, 128.0f, 179.79868f),
                    PathNode.CurveTo(155.08972f, 179.79868f, 177.6413f, 159.00114f, 179.83f, 132.0f),
                    PathNode.LineTo(248.0f, 132.0f),
                    PathNode.CurveTo(250.20914f, 132.0f, 252.0f, 130.20914f, 252.0f, 128.0f),
                    PathNode.CurveTo(252.0f, 125.79086f, 250.20914f, 124.0f, 248.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 172.0f),
                    PathNode.CurveTo(103.69947f, 172.0f, 84.0f, 152.30052f, 84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 103.69947f, 103.69947f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(152.30052f, 84.0f, 172.0f, 103.69947f, 172.0f, 128.0f),
                    PathNode.CurveTo(171.97244f, 152.28911f, 152.28911f, 171.97244f, 128.0f, 172.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _gitCommit!!
    }

private var _gitCommit: ImageVector? = null
