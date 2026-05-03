package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MessageCircleHeart: ImageVector
    get() {
        if (_messageCircleHeart != null) return _messageCircleHeart!!
        _messageCircleHeart = lucideOutlineIcon(
            name = "MessageCircleHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.992f, 16.342f),
                    PathNode.CurveTo(3.139039f, 16.712915f, 3.171775f, 17.119331f, 3.086f, 17.509f),
                    PathNode.LineTo(2.021f, 20.799f),
                    PathNode.CurveTo(1.95123f, 21.138227f, 2.061949f, 21.489405f, 2.313667f, 21.727274f),
                    PathNode.CurveTo(2.565384f, 21.965143f, 2.922259f, 22.055834f, 3.257f, 21.967f),
                    PathNode.LineTo(6.67f, 20.969f),
                    PathNode.CurveTo(7.037716f, 20.896063f, 7.418529f, 20.92794f, 7.769f, 21.061f),
                    PathNode.CurveTo(12.177509f, 23.119764f, 17.427994f, 21.7067f, 20.207699f, 17.713367f),
                    PathNode.CurveTo(22.987404f, 13.720035f, 22.489471f, 8.305573f, 19.028067f, 4.886195f),
                    PathNode.CurveTo(15.566662f, 1.466817f, 10.146522f, 1.03506f, 6.187443f, 3.863338f),
                    PathNode.CurveTo(2.228363f, 6.691615f, 0.879539f, 11.958968f, 2.992f, 16.342f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.828f, 13.07f),
                    PathNode.CurveTo(6.713961f, 11.904678f, 6.720108f, 10.067243f, 7.841919f, 8.9094f),
                    PathNode.CurveTo(8.96373f, 7.751558f, 10.800053f, 7.687345f, 12.0f, 8.764f),
                    PathNode.CurveTo(12.879962f, 7.974089f, 14.14185f, 7.774782f, 15.222427f, 8.255039f),
                    PathNode.CurveTo(16.303005f, 8.735295f, 17.00066f, 9.805511f, 17.004f, 10.988f),
                    PathNode.CurveTo(17.00643f, 11.763792f, 16.708231f, 12.510362f, 16.172f, 13.071f),
                    PathNode.LineTo(12.725f, 16.691f),
                    PathNode.CurveTo(12.536069f, 16.8896f, 12.273897f, 17.00194f, 11.999785f, 17.00175f),
                    PathNode.CurveTo(11.725674f, 17.001562f, 11.463656f, 16.88886f, 11.275f, 16.69f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _messageCircleHeart!!
    }

private var _messageCircleHeart: ImageVector? = null
