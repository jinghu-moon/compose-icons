package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SkipForwardCircle: ImageVector
    get() {
        if (_skipForwardCircle != null) return _skipForwardCircle!!
        _skipForwardCircle = phosphorFillIcon(
            name = "SkipForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 168.0f),
                    PathNode.CurveTo(168.0f, 172.41827f, 164.41827f, 176.0f, 160.0f, 176.0f),
                    PathNode.CurveTo(155.58173f, 176.0f, 152.0f, 172.41827f, 152.0f, 168.0f),
                    PathNode.LineTo(152.0f, 137.83f),
                    PathNode.LineTo(100.65f, 174.51f),
                    PathNode.CurveTo(98.211464f, 176.25186f, 95.00392f, 176.4848f, 92.33931f, 175.11353f),
                    PathNode.CurveTo(89.6747f, 173.74225f, 87.99992f, 170.99675f, 88.0f, 168.0f),
                    PathNode.LineTo(88.0f, 88.0f),
                    PathNode.CurveTo(87.99992f, 85.00324f, 89.6747f, 82.25775f, 92.33931f, 80.886475f),
                    PathNode.CurveTo(95.00392f, 79.515205f, 98.211464f, 79.74814f, 100.65f, 81.49f),
                    PathNode.LineTo(152.0f, 118.17f),
                    PathNode.LineTo(152.0f, 88.0f),
                    PathNode.CurveTo(152.0f, 83.58172f, 155.58173f, 80.0f, 160.0f, 80.0f),
                    PathNode.CurveTo(164.41827f, 80.0f, 168.0f, 83.58172f, 168.0f, 88.0f),
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
        return _skipForwardCircle!!
    }

private var _skipForwardCircle: ImageVector? = null
