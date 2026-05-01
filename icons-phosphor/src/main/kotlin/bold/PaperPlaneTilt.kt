package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) return _paperPlaneTilt!!
        _paperPlaneTilt = phosphorBoldIcon(
            name = "PaperPlaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.14f, 25.86f),
                    PathNode.CurveTo(225.02213f, 20.74057f, 217.5374f, 18.786201f, 210.57f, 20.75f),
                    PathNode.LineTo(210.35f, 20.82f),
                    PathNode.LineTo(18.44f, 79.0f),
                    PathNode.CurveTo(10.471684f, 81.311165f, 4.757691f, 88.30205f, 4.078423f, 96.570915f),
                    PathNode.CurveTo(3.399155f, 104.83978f, 7.895676f, 112.66943f, 15.38f, 116.25f),
                    PathNode.LineTo(99.0f, 157.0f),
                    PathNode.LineTo(139.71f, 240.65f),
                    PathNode.CurveTo(142.98753f, 247.62f, 150.0079f, 252.05843f, 157.71f, 252.03f),
                    PathNode.CurveTo(158.28f, 252.03f, 158.86f, 252.03f, 159.44f, 251.96f),
                    PathNode.CurveTo(167.73558f, 251.32149f, 174.74931f, 245.56992f, 177.0f, 237.56f),
                    PathNode.LineTo(235.18f, 45.65f),
                    PathNode.CurveTo(235.20926f, 45.57869f, 235.23268f, 45.50511f, 235.25f, 45.43f),
                    PathNode.CurveTo(237.21379f, 38.4626f, 235.25943f, 30.97787f, 230.14f, 25.86f),
                    PathNode.Close,
                    PathNode.MoveTo(156.91f, 221.07f),
                    PathNode.LineTo(122.54f, 150.43f),
                    PathNode.LineTo(168.54f, 104.48f),
                    PathNode.CurveTo(173.23442f, 99.785576f, 173.23442f, 92.17442f, 168.54f, 87.48f),
                    PathNode.CurveTo(163.84558f, 82.78558f, 156.23442f, 82.78558f, 151.54f, 87.48f),
                    PathNode.LineTo(105.54f, 133.48f),
                    PathNode.LineTo(34.93f, 99.09f),
                    PathNode.LineTo(210.0f, 46.0f),
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
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null
