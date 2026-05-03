package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Perspective: ImageVector
    get() {
        if (_perspective != null) return _perspective!!
        _perspective = phosphorBoldIcon(
            name = "Perspective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 116.0f),
                    PathNode.LineTo(228.0f, 116.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(227.99792f, 42.070347f, 225.36476f, 36.447315f, 220.81137f, 32.648964f),
                    PathNode.CurveTo(216.258f, 28.850613f, 210.25389f, 27.26859f, 204.42f, 28.33f),
                    PathNode.LineTo(44.42f, 57.42f),
                    PathNode.CurveTo(34.91384f, 59.149536f, 28.003372f, 67.42779f, 28.0f, 77.09f),
                    PathNode.LineTo(28.0f, 116.0f),
                    PathNode.LineTo(16.0f, 116.0f),
                    PathNode.CurveTo(9.372583f, 116.0f, 4.0f, 121.37258f, 4.0f, 128.0f),
                    PathNode.CurveTo(4.0f, 134.62741f, 9.372583f, 140.0f, 16.0f, 140.0f),
                    PathNode.LineTo(28.0f, 140.0f),
                    PathNode.LineTo(28.0f, 178.91f),
                    PathNode.CurveTo(28.003372f, 188.5722f, 34.91384f, 196.85046f, 44.42f, 198.58f),
                    PathNode.LineTo(204.42f, 227.67f),
                    PathNode.CurveTo(210.25389f, 228.73141f, 216.258f, 227.14938f, 220.81137f, 223.35103f),
                    PathNode.CurveTo(225.36476f, 219.55269f, 227.99792f, 213.92966f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 140.0f),
                    PathNode.LineTo(240.0f, 140.0f),
                    PathNode.CurveTo(246.62741f, 140.0f, 252.0f, 134.62741f, 252.0f, 128.0f),
                    PathNode.CurveTo(252.0f, 121.37258f, 246.62741f, 116.0f, 240.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 80.43f),
                    PathNode.LineTo(204.0f, 52.8f),
                    PathNode.LineTo(204.0f, 116.0f),
                    PathNode.LineTo(52.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 203.2f),
                    PathNode.LineTo(52.0f, 175.57f),
                    PathNode.LineTo(52.0f, 140.0f),
                    PathNode.LineTo(204.0f, 140.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _perspective!!
    }

private var _perspective: ImageVector? = null
