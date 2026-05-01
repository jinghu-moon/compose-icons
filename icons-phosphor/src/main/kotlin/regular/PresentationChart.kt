package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PresentationChart: ImageVector
    get() {
        if (_presentationChart != null) return _presentationChart!!
        _presentationChart = phosphorRegularIcon(
            name = "PresentationChart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(136.0f, 40.0f),
                    PathNode.LineTo(136.0f, 24.0f),
                    PathNode.CurveTo(136.0f, 19.581722f, 132.41827f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(123.58172f, 16.0f, 120.0f, 19.581722f, 120.0f, 24.0f),
                    PathNode.LineTo(120.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 176.0f),
                    PathNode.CurveTo(24.0f, 184.83656f, 31.163445f, 192.0f, 40.0f, 192.0f),
                    PathNode.LineTo(79.36f, 192.0f),
                    PathNode.LineTo(57.75f, 219.0f),
                    PathNode.CurveTo(54.988575f, 222.45178f, 55.54822f, 227.48857f, 59.0f, 230.25f),
                    PathNode.CurveTo(62.45178f, 233.01143f, 67.48858f, 232.45178f, 70.25f, 229.0f),
                    PathNode.LineTo(99.84f, 192.0f),
                    PathNode.LineTo(156.16f, 192.0f),
                    PathNode.LineTo(185.75f, 229.0f),
                    PathNode.CurveTo(188.51143f, 232.45178f, 193.54822f, 233.01143f, 197.0f, 230.25f),
                    PathNode.CurveTo(200.45178f, 227.48857f, 201.01143f, 222.45178f, 198.25f, 219.0f),
                    PathNode.LineTo(176.64f, 192.0f),
                    PathNode.LineTo(216.0f, 192.0f),
                    PathNode.CurveTo(224.83656f, 192.0f, 232.0f, 184.83656f, 232.0f, 176.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 176.0f),
                    PathNode.LineTo(40.0f, 176.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.LineTo(216.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 120.0f),
                    PathNode.LineTo(104.0f, 144.0f),
                    PathNode.CurveTo(104.0f, 148.41827f, 100.41828f, 152.0f, 96.0f, 152.0f),
                    PathNode.CurveTo(91.58172f, 152.0f, 88.0f, 148.41827f, 88.0f, 144.0f),
                    PathNode.LineTo(88.0f, 120.0f),
                    PathNode.CurveTo(88.0f, 115.58172f, 91.58172f, 112.0f, 96.0f, 112.0f),
                    PathNode.CurveTo(100.41828f, 112.0f, 104.0f, 115.58172f, 104.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 104.0f),
                    PathNode.LineTo(136.0f, 144.0f),
                    PathNode.CurveTo(136.0f, 148.41827f, 132.41827f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(123.58172f, 152.0f, 120.0f, 148.41827f, 120.0f, 144.0f),
                    PathNode.LineTo(120.0f, 104.0f),
                    PathNode.CurveTo(120.0f, 99.58172f, 123.58172f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(132.41827f, 96.0f, 136.0f, 99.58172f, 136.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 88.0f),
                    PathNode.LineTo(168.0f, 144.0f),
                    PathNode.CurveTo(168.0f, 148.41827f, 164.41827f, 152.0f, 160.0f, 152.0f),
                    PathNode.CurveTo(155.58173f, 152.0f, 152.0f, 148.41827f, 152.0f, 144.0f),
                    PathNode.LineTo(152.0f, 88.0f),
                    PathNode.CurveTo(152.0f, 83.58172f, 155.58173f, 80.0f, 160.0f, 80.0f),
                    PathNode.CurveTo(164.41827f, 80.0f, 168.0f, 83.58172f, 168.0f, 88.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _presentationChart!!
    }

private var _presentationChart: ImageVector? = null
