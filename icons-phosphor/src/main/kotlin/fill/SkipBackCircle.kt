package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SkipBackCircle: ImageVector
    get() {
        if (_skipBackCircle != null) return _skipBackCircle!!
        _skipBackCircle = phosphorFillIcon(
            name = "SkipBackCircle",
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
                    PathNode.CurveTo(168.00008f, 170.99675f, 166.3253f, 173.74225f, 163.66069f, 175.11353f),
                    PathNode.CurveTo(160.99608f, 176.4848f, 157.78853f, 176.25186f, 155.35f, 174.51f),
                    PathNode.LineTo(104.0f, 137.83f),
                    PathNode.LineTo(104.0f, 168.0f),
                    PathNode.CurveTo(104.0f, 172.41827f, 100.41828f, 176.0f, 96.0f, 176.0f),
                    PathNode.CurveTo(91.58172f, 176.0f, 88.0f, 172.41827f, 88.0f, 168.0f),
                    PathNode.LineTo(88.0f, 88.0f),
                    PathNode.CurveTo(88.0f, 83.58172f, 91.58172f, 80.0f, 96.0f, 80.0f),
                    PathNode.CurveTo(100.41828f, 80.0f, 104.0f, 83.58172f, 104.0f, 88.0f),
                    PathNode.LineTo(104.0f, 118.17f),
                    PathNode.LineTo(155.35f, 81.49f),
                    PathNode.CurveTo(157.78853f, 79.74814f, 160.99608f, 79.515205f, 163.66069f, 80.886475f),
                    PathNode.CurveTo(166.3253f, 82.25775f, 168.00008f, 85.00324f, 168.0f, 88.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _skipBackCircle!!
    }

private var _skipBackCircle: ImageVector? = null
