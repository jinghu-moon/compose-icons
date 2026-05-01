package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Folder: ImageVector
    get() {
        if (_folder != null) return _folder!!
        _folder = phosphorThinIcon(
            name = "Folder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 76.0f),
                    PathNode.LineTo(129.66f, 76.0f),
                    PathNode.LineTo(101.17f, 47.52f),
                    PathNode.CurveTo(98.92802f, 45.259533f, 95.87373f, 43.99172f, 92.69f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(33.37258f, 44.0f, 28.0f, 49.37258f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 200.62f),
                    PathNode.CurveTo(28.01101f, 206.90044f, 33.099564f, 211.989f, 39.38f, 212.0f),
                    PathNode.LineTo(216.89f, 212.0f),
                    PathNode.CurveTo(223.0236f, 211.99449f, 227.99449f, 207.0236f, 228.0f, 200.89f),
                    PathNode.LineTo(228.0f, 88.0f),
                    PathNode.CurveTo(228.0f, 81.37258f, 222.62741f, 76.0f, 216.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 56.0f),
                    PathNode.CurveTo(36.0f, 53.79086f, 37.79086f, 52.0f, 40.0f, 52.0f),
                    PathNode.LineTo(92.69f, 52.0f),
                    PathNode.CurveTo(93.74772f, 52.001812f, 94.761665f, 52.422493f, 95.51f, 53.17f),
                    PathNode.LineTo(118.34f, 76.0f),
                    PathNode.LineTo(36.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 200.89f),
                    PathNode.CurveTo(219.9945f, 202.60533f, 218.60533f, 203.9945f, 216.89f, 204.0f),
                    PathNode.LineTo(39.38f, 204.0f),
                    PathNode.CurveTo(37.515556f, 203.9945f, 36.005493f, 202.48444f, 36.0f, 200.62f),
                    PathNode.LineTo(36.0f, 84.0f),
                    PathNode.LineTo(216.0f, 84.0f),
                    PathNode.CurveTo(218.20914f, 84.0f, 220.0f, 85.79086f, 220.0f, 88.0f),
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
        return _folder!!
    }

private var _folder: ImageVector? = null
