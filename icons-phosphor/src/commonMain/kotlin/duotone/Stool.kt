package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Stool: ImageVector
    get() {
        if (_stool != null) return _stool!!
        _stool = phosphorDuotoneIcon(
            name = "Stool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 40.0f),
                    PathNode.LineTo(192.0f, 64.0f),
                    PathNode.CurveTo(192.0f, 68.41828f, 188.41827f, 72.0f, 184.0f, 72.0f),
                    PathNode.LineTo(72.0f, 72.0f),
                    PathNode.CurveTo(67.58172f, 72.0f, 64.0f, 68.41828f, 64.0f, 64.0f),
                    PathNode.LineTo(64.0f, 40.0f),
                    PathNode.CurveTo(64.0f, 35.581722f, 67.58172f, 32.0f, 72.0f, 32.0f),
                    PathNode.LineTo(184.0f, 32.0f),
                    PathNode.CurveTo(188.41827f, 32.0f, 192.0f, 35.581722f, 192.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 64.0f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.CurveTo(200.0f, 31.163445f, 192.83656f, 24.0f, 184.0f, 24.0f),
                    PathNode.LineTo(72.0f, 24.0f),
                    PathNode.CurveTo(63.163445f, 24.0f, 56.0f, 31.163445f, 56.0f, 40.0f),
                    PathNode.LineTo(56.0f, 64.0f),
                    PathNode.CurveTo(56.0f, 72.836555f, 63.163445f, 80.0f, 72.0f, 80.0f),
                    PathNode.LineTo(78.64f, 80.0f),
                    PathNode.LineTo(56.1f, 222.75f),
                    PathNode.CurveTo(55.410645f, 227.11282f, 58.387486f, 231.20877f, 62.75f, 231.9f),
                    PathNode.CurveTo(63.16332f, 231.96674f, 63.58133f, 232.00018f, 64.0f, 232.0f),
                    PathNode.CurveTo(67.93126f, 231.99425f, 71.27574f, 229.13298f, 71.89f, 225.25f),
                    PathNode.LineTo(79.68f, 176.0f),
                    PathNode.LineTo(176.32f, 176.0f),
                    PathNode.LineTo(184.1f, 225.25f),
                    PathNode.CurveTo(184.71484f, 229.13672f, 188.06496f, 231.99915f, 192.0f, 232.0f),
                    PathNode.CurveTo(192.42201f, 232.00072f, 192.84337f, 231.96727f, 193.26f, 231.9f),
                    PathNode.CurveTo(197.62251f, 231.20877f, 200.59935f, 227.11282f, 199.91f, 222.75f),
                    PathNode.LineTo(177.36f, 80.0f),
                    PathNode.LineTo(184.0f, 80.0f),
                    PathNode.CurveTo(192.83656f, 80.0f, 200.0f, 72.836555f, 200.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 40.0f),
                    PathNode.LineTo(184.0f, 40.0f),
                    PathNode.LineTo(184.0f, 64.0f),
                    PathNode.LineTo(72.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(173.79f, 160.0f),
                    PathNode.LineTo(82.21f, 160.0f),
                    PathNode.LineTo(94.84f, 80.0f),
                    PathNode.LineTo(161.16f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _stool!!
    }

private var _stool: ImageVector? = null
