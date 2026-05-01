package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Package: ImageVector
    get() {
        if (_package != null) return _package!!
        _package = phosphorFillIcon(
            name = "Package",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.68f, 66.15f),
                    PathNode.LineTo(135.68f, 18.0f),
                    PathNode.CurveTo(130.90053f, 15.359137f, 125.099464f, 15.359137f, 120.32f, 18.0f),
                    PathNode.LineTo(32.32f, 66.17f),
                    PathNode.CurveTo(27.201473f, 68.9706f, 24.013245f, 74.3354f, 24.0f, 80.17f),
                    PathNode.LineTo(24.0f, 175.81f),
                    PathNode.CurveTo(24.013245f, 181.64459f, 27.201473f, 187.0094f, 32.32f, 189.81f),
                    PathNode.LineTo(120.32f, 237.98f),
                    PathNode.CurveTo(125.099464f, 240.62086f, 130.90053f, 240.62086f, 135.68f, 237.98f),
                    PathNode.LineTo(223.68f, 189.81f),
                    PathNode.CurveTo(228.79852f, 187.0094f, 231.98676f, 181.64459f, 232.0f, 175.81f),
                    PathNode.LineTo(232.0f, 80.18f),
                    PathNode.CurveTo(231.9977f, 74.33465f, 228.80794f, 68.955765f, 223.68f, 66.15f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.LineTo(208.35f, 76.0f),
                    PathNode.LineTo(178.57f, 92.29f),
                    PathNode.LineTo(98.22f, 48.29f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 120.0f),
                    PathNode.LineTo(47.65f, 76.0f),
                    PathNode.LineTo(81.56f, 57.43f),
                    PathNode.LineTo(161.91f, 101.43f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 175.85f),
                    PathNode.LineTo(216.0f, 175.85f),
                    PathNode.LineTo(136.0f, 219.64f),
                    PathNode.LineTo(136.0f, 133.83f),
                    PathNode.LineTo(168.0f, 116.32f),
                    PathNode.LineTo(168.0f, 152.0f),
                    PathNode.CurveTo(168.0f, 156.41827f, 171.58173f, 160.0f, 176.0f, 160.0f),
                    PathNode.CurveTo(180.41827f, 160.0f, 184.0f, 156.41827f, 184.0f, 152.0f),
                    PathNode.LineTo(184.0f, 107.56f),
                    PathNode.LineTo(216.0f, 90.05f),
                    PathNode.LineTo(216.0f, 175.81f),
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
        return _package!!
    }

private var _package: ImageVector? = null
