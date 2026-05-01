package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextAUnderline: ImageVector
    get() {
        if (_textAUnderline != null) return _textAUnderline!!
        _textAUnderline = phosphorBoldIcon(
            name = "TextAUnderline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(58.89f, 178.86f),
                    PathNode.CurveTo(61.77335f, 180.22533f, 65.08169f, 180.3863f, 68.08397f, 179.30736f),
                    PathNode.CurveTo(71.08625f, 178.22841f, 73.53533f, 175.99837f, 74.89f, 173.11f),
                    PathNode.LineTo(90.44f, 140.0f),
                    PathNode.LineTo(165.56f, 140.0f),
                    PathNode.LineTo(181.14f, 173.11f),
                    PathNode.CurveTo(183.96217f, 179.10782f, 191.11218f, 181.68217f, 197.11f, 178.86f),
                    PathNode.CurveTo(203.10782f, 176.03783f, 205.68217f, 168.88782f, 202.86f, 162.89f),
                    PathNode.LineTo(138.86f, 26.89f),
                    PathNode.CurveTo(136.88176f, 22.681576f, 132.65019f, 19.994938f, 128.0f, 19.994938f),
                    PathNode.CurveTo(123.34981f, 19.994938f, 119.11825f, 22.681576f, 117.14f, 26.89f),
                    PathNode.LineTo(53.14f, 162.89f),
                    PathNode.CurveTo(51.784153f, 165.77017f, 51.628273f, 169.07104f, 52.706665f, 172.06616f),
                    PathNode.CurveTo(53.785057f, 175.0613f, 56.00935f, 177.50519f, 58.89f, 178.86f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 60.18f),
                    PathNode.LineTo(154.27f, 116.0f),
                    PathNode.LineTo(101.73f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 216.0f),
                    PathNode.CurveTo(228.0f, 222.62741f, 222.62741f, 228.0f, 216.0f, 228.0f),
                    PathNode.LineTo(40.0f, 228.0f),
                    PathNode.CurveTo(33.37258f, 228.0f, 28.0f, 222.62741f, 28.0f, 216.0f),
                    PathNode.CurveTo(28.0f, 209.37259f, 33.37258f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.CurveTo(222.62741f, 204.0f, 228.0f, 209.37259f, 228.0f, 216.0f),
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
        return _textAUnderline!!
    }

private var _textAUnderline: ImageVector? = null
