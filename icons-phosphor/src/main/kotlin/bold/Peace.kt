package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Peace: ImageVector
    get() {
        if (_peace != null) return _peace!!
        _peace = phosphorBoldIcon(
            name = "Peace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 128.0f),
                    PathNode.CurveTo(212.02316f, 141.14624f, 208.93938f, 154.11191f, 203.0f, 165.84f),
                    PathNode.LineTo(140.0f, 121.75f),
                    PathNode.LineTo(140.0f, 44.87f),
                    PathNode.CurveTo(181.29852f, 50.882988f, 211.94427f, 86.26607f, 212.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 44.87f),
                    PathNode.LineTo(116.0f, 121.75f),
                    PathNode.LineTo(53.0f, 165.84f),
                    PathNode.CurveTo(40.77933f, 141.70535f, 40.940926f, 113.15992f, 53.43406f, 89.16517f),
                    PathNode.CurveTo(65.92719f, 65.170425f, 89.21999f, 48.668514f, 116.0f, 44.84f),
                    PathNode.Close,
                    PathNode.MoveTo(66.83f, 185.48f),
                    PathNode.LineTo(116.0f, 151.05f),
                    PathNode.LineTo(116.0f, 211.13f),
                    PathNode.CurveTo(97.175354f, 208.40376f, 79.83674f, 199.35892f, 66.83f, 185.48f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 211.13f),
                    PathNode.LineTo(140.0f, 151.05f),
                    PathNode.LineTo(189.17f, 185.48f),
                    PathNode.CurveTo(176.16325f, 199.35892f, 158.82465f, 208.40376f, 140.0f, 211.13f),
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
        return _peace!!
    }

private var _peace: ImageVector? = null
