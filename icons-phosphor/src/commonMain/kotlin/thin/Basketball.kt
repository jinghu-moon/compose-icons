package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Basketball: ImageVector
    get() {
        if (_basketball != null) return _basketball!!
        _basketball = phosphorThinIcon(
            name = "Basketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 66.07f),
                    PathNode.CurveTo(74.55763f, 81.951775f, 83.02423f, 102.47354f, 83.9f, 124.0f),
                    PathNode.LineTo(36.09f, 124.0f),
                    PathNode.CurveTo(37.00941f, 102.481255f, 45.474064f, 81.97279f, 60.0f, 66.07f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 124.0f),
                    PathNode.LineTo(132.0f, 36.09f),
                    PathNode.CurveTo(153.70607f, 37.01985f, 174.3756f, 45.63215f, 190.32f, 60.39f),
                    PathNode.CurveTo(174.27081f, 77.7869f, 164.96794f, 100.34714f, 164.09f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 124.0f),
                    PathNode.LineTo(91.91f, 124.0f),
                    PathNode.CurveTo(91.03206f, 100.34714f, 81.729195f, 77.7869f, 65.68f, 60.39f),
                    PathNode.CurveTo(81.62441f, 45.63215f, 102.29392f, 37.01985f, 124.0f, 36.09f),
                    PathNode.Close,
                    PathNode.MoveTo(83.9f, 132.0f),
                    PathNode.CurveTo(83.02423f, 153.52646f, 74.55763f, 174.04822f, 60.0f, 189.93f),
                    PathNode.CurveTo(45.474064f, 174.0272f, 37.00941f, 153.51875f, 36.09f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(91.9f, 132.0f),
                    PathNode.LineTo(124.0f, 132.0f),
                    PathNode.LineTo(124.0f, 219.91f),
                    PathNode.CurveTo(102.29392f, 218.98015f, 81.62441f, 210.36784f, 65.68f, 195.61f),
                    PathNode.CurveTo(81.729195f, 178.2131f, 91.03206f, 155.65286f, 91.91f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 132.0f),
                    PathNode.LineTo(164.09f, 132.0f),
                    PathNode.CurveTo(164.96794f, 155.65286f, 174.27081f, 178.2131f, 190.32f, 195.61f),
                    PathNode.CurveTo(174.3756f, 210.36784f, 153.70607f, 218.98015f, 132.0f, 219.91f),
                    PathNode.Close,
                    PathNode.MoveTo(172.1f, 132.0f),
                    PathNode.LineTo(219.91f, 132.0f),
                    PathNode.CurveTo(218.99059f, 153.51875f, 210.52594f, 174.0272f, 196.0f, 189.93f),
                    PathNode.CurveTo(181.44237f, 174.04822f, 172.97577f, 153.52646f, 172.1f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.1f, 124.0f),
                    PathNode.CurveTo(172.97577f, 102.47354f, 181.44237f, 81.951775f, 196.0f, 66.07f),
                    PathNode.CurveTo(210.52594f, 81.97279f, 218.99059f, 102.481255f, 219.91f, 124.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _basketball!!
    }

private var _basketball: ImageVector? = null
