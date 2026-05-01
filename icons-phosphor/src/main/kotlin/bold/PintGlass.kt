package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PintGlass: ImageVector
    get() {
        if (_pintGlass != null) return _pintGlass!!
        _pintGlass = phosphorBoldIcon(
            name = "PintGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(209.0f, 24.0f),
                    PathNode.CurveTo(206.71057f, 21.44027f, 203.43416f, 19.984085f, 200.0f, 20.0f),
                    PathNode.LineTo(56.0f, 20.0f),
                    PathNode.CurveTo(52.569073f, 20.001284f, 49.30278f, 21.471071f, 47.026363f, 24.038012f),
                    PathNode.CurveTo(44.749947f, 26.604954f, 43.68115f, 30.023521f, 44.09f, 33.43f),
                    PathNode.LineTo(67.24f, 226.43f),
                    PathNode.CurveTo(68.46825f, 236.46416f, 76.99095f, 244.00414f, 87.1f, 244.0f),
                    PathNode.LineTo(168.9f, 244.0f),
                    PathNode.CurveTo(179.02594f, 244.00107f, 187.55501f, 236.43399f, 188.76f, 226.38f),
                    PathNode.LineTo(211.91f, 33.43f),
                    PathNode.CurveTo(212.33723f, 30.014803f, 211.27747f, 26.580559f, 209.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(186.47f, 44.0f),
                    PathNode.LineTo(184.55f, 60.0f),
                    PathNode.LineTo(71.45f, 60.0f),
                    PathNode.LineTo(69.53f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(165.35f, 220.0f),
                    PathNode.LineTo(90.65f, 220.0f),
                    PathNode.LineTo(74.33f, 84.0f),
                    PathNode.LineTo(181.67f, 84.0f),
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
        return _pintGlass!!
    }

private var _pintGlass: ImageVector? = null
