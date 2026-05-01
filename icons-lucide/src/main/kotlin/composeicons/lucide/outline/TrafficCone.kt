package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) return _trafficCone!!
        _trafficCone = lucideOutlineIcon(
            name = "TrafficCone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.05f, 10.966f),
                    PathNode.CurveTo(15.109674f, 11.615408f, 13.603477f, 11.999926f, 12.0f, 11.999926f),
                    PathNode.CurveTo(10.396523f, 11.999926f, 8.890326f, 11.615408f, 7.95f, 10.966f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.923f, 14.049f),
                    PathNode.LineTo(21.403f, 16.089f),
                    PathNode.CurveTo(21.76627f, 16.248404f, 22.000965f, 16.60747f, 22.001183f, 17.004173f),
                    PathNode.CurveTo(22.001398f, 17.400875f, 21.767096f, 17.7602f, 21.404f, 17.92f),
                    PathNode.LineTo(12.83f, 21.82f),
                    PathNode.CurveTo(12.302794f, 22.060476f, 11.697206f, 22.060476f, 11.17f, 21.82f),
                    PathNode.LineTo(2.596f, 17.91f),
                    PathNode.CurveTo(2.233428f, 17.75013f, 1.999454f, 17.391254f, 1.999454f, 16.995f),
                    PathNode.CurveTo(1.999454f, 16.598747f, 2.233428f, 16.23987f, 2.596f, 16.08f),
                    PathNode.LineTo(7.08f, 14.04f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.949f, 14.14f),
                    PathNode.CurveTo(17.224926f, 15.108214f, 16.346363f, 16.067972f, 14.700437f, 16.59637f),
                    PathNode.CurveTo(13.05451f, 17.124767f, 10.94349f, 17.124767f, 9.297563f, 16.59637f),
                    PathNode.CurveTo(7.651636f, 16.067972f, 6.773074f, 15.108214f, 7.049f, 14.14f),
                    PathNode.LineTo(10.063f, 3.5f),
                    PathNode.CurveTo(10.290288f, 2.615997f, 11.087245f, 1.998027f, 12.0f, 1.998027f),
                    PathNode.CurveTo(12.912755f, 1.998027f, 13.709712f, 2.615997f, 13.937f, 3.5f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.194f, 6.57f),
                    PathNode.CurveTo(10.887842f, 7.143947f, 13.110158f, 7.143947f, 14.804f, 6.57f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _trafficCone!!
    }

private var _trafficCone: ImageVector? = null
