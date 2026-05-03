package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrainSimple: ImageVector
    get() {
        if (_trainSimple != null) return _trainSimple!!
        _trainSimple = phosphorThinIcon(
            name = "TrainSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 28.0f),
                    PathNode.LineTo(72.0f, 28.0f),
                    PathNode.CurveTo(56.53603f, 28.0f, 44.0f, 40.53603f, 44.0f, 56.0f),
                    PathNode.LineTo(44.0f, 184.0f),
                    PathNode.CurveTo(44.0f, 199.46397f, 56.53603f, 212.0f, 72.0f, 212.0f),
                    PathNode.LineTo(88.0f, 212.0f),
                    PathNode.LineTo(68.8f, 237.6f),
                    PathNode.CurveTo(67.47452f, 239.36731f, 67.83269f, 241.87451f, 69.6f, 243.2f),
                    PathNode.CurveTo(71.36731f, 244.52548f, 73.87452f, 244.16731f, 75.2f, 242.4f),
                    PathNode.LineTo(98.0f, 212.0f),
                    PathNode.LineTo(158.0f, 212.0f),
                    PathNode.LineTo(180.8f, 242.4f),
                    PathNode.CurveTo(182.12549f, 244.16731f, 184.63269f, 244.52548f, 186.4f, 243.2f),
                    PathNode.CurveTo(188.16731f, 241.87451f, 188.52548f, 239.36731f, 187.2f, 237.6f),
                    PathNode.LineTo(168.0f, 212.0f),
                    PathNode.LineTo(184.0f, 212.0f),
                    PathNode.CurveTo(199.46397f, 212.0f, 212.0f, 199.46397f, 212.0f, 184.0f),
                    PathNode.LineTo(212.0f, 56.0f),
                    PathNode.CurveTo(212.0f, 40.53603f, 199.46397f, 28.0f, 184.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 36.0f),
                    PathNode.LineTo(184.0f, 36.0f),
                    PathNode.CurveTo(195.0457f, 36.0f, 204.0f, 44.954304f, 204.0f, 56.0f),
                    PathNode.LineTo(204.0f, 124.0f),
                    PathNode.LineTo(52.0f, 124.0f),
                    PathNode.LineTo(52.0f, 56.0f),
                    PathNode.CurveTo(52.0f, 44.954304f, 60.954304f, 36.0f, 72.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 204.0f),
                    PathNode.LineTo(72.0f, 204.0f),
                    PathNode.CurveTo(60.954304f, 204.0f, 52.0f, 195.0457f, 52.0f, 184.0f),
                    PathNode.LineTo(52.0f, 132.0f),
                    PathNode.LineTo(204.0f, 132.0f),
                    PathNode.LineTo(204.0f, 184.0f),
                    PathNode.CurveTo(204.0f, 195.0457f, 195.0457f, 204.0f, 184.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 172.0f),
                    PathNode.CurveTo(92.0f, 176.41827f, 88.41828f, 180.0f, 84.0f, 180.0f),
                    PathNode.CurveTo(79.58172f, 180.0f, 76.0f, 176.41827f, 76.0f, 172.0f),
                    PathNode.CurveTo(76.0f, 167.58173f, 79.58172f, 164.0f, 84.0f, 164.0f),
                    PathNode.CurveTo(88.41828f, 164.0f, 92.0f, 167.58173f, 92.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 172.0f),
                    PathNode.CurveTo(180.0f, 176.41827f, 176.41827f, 180.0f, 172.0f, 180.0f),
                    PathNode.CurveTo(167.58173f, 180.0f, 164.0f, 176.41827f, 164.0f, 172.0f),
                    PathNode.CurveTo(164.0f, 167.58173f, 167.58173f, 164.0f, 172.0f, 164.0f),
                    PathNode.CurveTo(176.41827f, 164.0f, 180.0f, 167.58173f, 180.0f, 172.0f),
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
        return _trainSimple!!
    }

private var _trainSimple: ImageVector? = null
