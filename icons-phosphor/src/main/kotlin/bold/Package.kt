package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Package: ImageVector
    get() {
        if (_package != null) return _package!!
        _package = phosphorBoldIcon(
            name = "Package",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.6f, 62.64f),
                    PathNode.LineTo(137.6f, 14.47f),
                    PathNode.CurveTo(131.62274f, 11.180279f, 124.37726f, 11.180279f, 118.4f, 14.47f),
                    PathNode.LineTo(30.4f, 62.64f),
                    PathNode.CurveTo(23.986143f, 66.14936f, 19.998308f, 72.87883f, 20.0f, 80.19f),
                    PathNode.LineTo(20.0f, 175.81f),
                    PathNode.CurveTo(19.998308f, 183.12117f, 23.986143f, 189.85065f, 30.4f, 193.36f),
                    PathNode.LineTo(118.4f, 241.53f),
                    PathNode.CurveTo(124.37628f, 244.8235f, 131.62372f, 244.8235f, 137.6f, 241.53f),
                    PathNode.LineTo(225.6f, 193.36f),
                    PathNode.CurveTo(232.01385f, 189.85065f, 236.0017f, 183.12117f, 236.0f, 175.81f),
                    PathNode.LineTo(236.0f, 80.19f),
                    PathNode.CurveTo(236.0017f, 72.87883f, 232.01385f, 66.14936f, 225.6f, 62.64f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 36.57f),
                    PathNode.LineTo(200.0f, 76.0f),
                    PathNode.LineTo(178.57f, 87.73f),
                    PathNode.LineTo(106.57f, 48.31f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 115.4f),
                    PathNode.LineTo(56.0f, 76.0f),
                    PathNode.LineTo(81.56f, 62.0f),
                    PathNode.LineTo(153.56f, 101.41f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 96.79f),
                    PathNode.LineTo(116.0f, 136.19f),
                    PathNode.LineTo(116.0f, 212.86f),
                    PathNode.LineTo(44.0f, 173.44f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 212.86f),
                    PathNode.LineTo(140.0f, 136.19f),
                    PathNode.LineTo(164.0f, 123.06f),
                    PathNode.LineTo(164.0f, 152.0f),
                    PathNode.CurveTo(164.0f, 158.62741f, 169.37259f, 164.0f, 176.0f, 164.0f),
                    PathNode.CurveTo(182.62741f, 164.0f, 188.0f, 158.62741f, 188.0f, 152.0f),
                    PathNode.LineTo(188.0f, 109.92f),
                    PathNode.LineTo(212.0f, 96.79f),
                    PathNode.LineTo(212.0f, 173.44f),
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
        return _package!!
    }

private var _package: ImageVector? = null
