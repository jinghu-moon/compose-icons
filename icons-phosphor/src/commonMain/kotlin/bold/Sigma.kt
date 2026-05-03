package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sigma: ImageVector
    get() {
        if (_sigma != null) return _sigma!!
        _sigma = phosphorBoldIcon(
            name = "Sigma",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 72.0f),
                    PathNode.LineTo(180.0f, 60.0f),
                    PathNode.LineTo(89.0f, 60.0f),
                    PathNode.LineTo(137.4f, 120.5f),
                    PathNode.CurveTo(140.91f, 124.883995f, 140.91f, 131.11601f, 137.4f, 135.5f),
                    PathNode.LineTo(89.0f, 196.0f),
                    PathNode.LineTo(180.0f, 196.0f),
                    PathNode.LineTo(180.0f, 184.0f),
                    PathNode.CurveTo(180.0f, 177.37259f, 185.37259f, 172.0f, 192.0f, 172.0f),
                    PathNode.CurveTo(198.62741f, 172.0f, 204.0f, 177.37259f, 204.0f, 184.0f),
                    PathNode.LineTo(204.0f, 208.0f),
                    PathNode.CurveTo(204.0f, 214.62741f, 198.62741f, 220.0f, 192.0f, 220.0f),
                    PathNode.LineTo(64.0f, 220.0f),
                    PathNode.CurveTo(59.38584f, 220.00096f, 55.17981f, 217.35622f, 53.181385f, 213.19728f),
                    PathNode.CurveTo(51.18296f, 209.03835f, 51.74615f, 204.10193f, 54.63f, 200.5f),
                    PathNode.LineTo(112.63f, 128.0f),
                    PathNode.LineTo(54.63f, 55.5f),
                    PathNode.CurveTo(51.74615f, 51.89807f, 51.18296f, 46.96166f, 53.181385f, 42.80272f),
                    PathNode.CurveTo(55.17981f, 38.64378f, 59.38584f, 35.99904f, 64.0f, 36.0f),
                    PathNode.LineTo(192.0f, 36.0f),
                    PathNode.CurveTo(198.62741f, 36.0f, 204.0f, 41.37258f, 204.0f, 48.0f),
                    PathNode.LineTo(204.0f, 72.0f),
                    PathNode.CurveTo(204.0f, 78.62742f, 198.62741f, 84.0f, 192.0f, 84.0f),
                    PathNode.CurveTo(185.37259f, 84.0f, 180.0f, 78.62742f, 180.0f, 72.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _sigma!!
    }

private var _sigma: ImageVector? = null
