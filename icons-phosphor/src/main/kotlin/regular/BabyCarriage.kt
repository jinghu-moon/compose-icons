package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) return _babyCarriage!!
        _babyCarriage = phosphorRegularIcon(
            name = "BabyCarriage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 32.0f),
                    PathNode.LineTo(152.0f, 32.0f),
                    PathNode.CurveTo(143.16344f, 32.0f, 136.0f, 39.163445f, 136.0f, 48.0f),
                    PathNode.LineTo(136.0f, 104.0f),
                    PathNode.LineTo(55.2f, 104.0f),
                    PathNode.CurveTo(51.37324f, 85.388245f, 35.001083f, 72.02322f, 16.0f, 72.0f),
                    PathNode.CurveTo(11.581722f, 72.0f, 8.0f, 75.58172f, 8.0f, 80.0f),
                    PathNode.CurveTo(8.0f, 84.41828f, 11.581722f, 88.0f, 16.0f, 88.0f),
                    PathNode.CurveTo(29.254833f, 88.0f, 40.0f, 98.74516f, 40.0f, 112.0f),
                    PathNode.CurveTo(40.0496f, 156.16223f, 75.83778f, 191.9504f, 120.0f, 192.0f),
                    PathNode.LineTo(160.0f, 192.0f),
                    PathNode.CurveTo(204.18279f, 192.0f, 240.0f, 156.18279f, 240.0f, 112.0f),
                    PathNode.CurveTo(240.0f, 67.81722f, 204.18279f, 32.0f, 160.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(223.48f, 104.0f),
                    PathNode.LineTo(166.81f, 104.0f),
                    PathNode.LineTo(208.67f, 70.51f),
                    PathNode.CurveTo(216.77658f, 79.98414f, 221.92586f, 91.62823f, 223.48f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 48.0f),
                    PathNode.CurveTo(173.13557f, 47.987644f, 185.95267f, 52.04342f, 196.69f, 59.61f),
                    PathNode.LineTo(152.0f, 95.35f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 176.0f),
                    PathNode.LineTo(120.0f, 176.0f),
                    PathNode.CurveTo(87.761375f, 175.96109f, 60.56942f, 151.98077f, 56.5f, 120.0f),
                    PathNode.LineTo(223.5f, 120.0f),
                    PathNode.CurveTo(219.43057f, 151.98077f, 192.23862f, 175.96109f, 160.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 224.0f),
                    PathNode.CurveTo(104.0f, 232.83656f, 96.836555f, 240.0f, 88.0f, 240.0f),
                    PathNode.CurveTo(79.163445f, 240.0f, 72.0f, 232.83656f, 72.0f, 224.0f),
                    PathNode.CurveTo(72.0f, 215.16344f, 79.163445f, 208.0f, 88.0f, 208.0f),
                    PathNode.CurveTo(96.836555f, 208.0f, 104.0f, 215.16344f, 104.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 224.0f),
                    PathNode.CurveTo(208.0f, 232.83656f, 200.83656f, 240.0f, 192.0f, 240.0f),
                    PathNode.CurveTo(183.16344f, 240.0f, 176.0f, 232.83656f, 176.0f, 224.0f),
                    PathNode.CurveTo(176.0f, 215.16344f, 183.16344f, 208.0f, 192.0f, 208.0f),
                    PathNode.CurveTo(200.83656f, 208.0f, 208.0f, 215.16344f, 208.0f, 224.0f),
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
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
