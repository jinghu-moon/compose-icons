package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChartPolar: ImageVector
    get() {
        if (_chartPolar != null) return _chartPolar!!
        _chartPolar = phosphorBoldIcon(
            name = "ChartPolar",
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
                    PathNode.MoveTo(211.13f, 116.0f),
                    PathNode.LineTo(194.92f, 116.0f),
                    PathNode.CurveTo(189.85422f, 88.033424f, 167.96655f, 66.14578f, 140.0f, 61.08f),
                    PathNode.LineTo(140.0f, 44.87f),
                    PathNode.CurveTo(176.82709f, 50.248943f, 205.75105f, 79.17291f, 211.13f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 116.0f),
                    PathNode.LineTo(85.68f, 116.0f),
                    PathNode.CurveTo(89.8674f, 101.33249f, 101.33249f, 89.8674f, 116.0f, 85.68f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 140.0f),
                    PathNode.LineTo(116.0f, 170.32f),
                    PathNode.CurveTo(101.33249f, 166.1326f, 89.8674f, 154.66751f, 85.68f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 140.0f),
                    PathNode.LineTo(170.32f, 140.0f),
                    PathNode.CurveTo(166.1326f, 154.66751f, 154.66751f, 166.1326f, 140.0f, 170.32f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 116.0f),
                    PathNode.LineTo(140.0f, 85.68f),
                    PathNode.CurveTo(154.66751f, 89.8674f, 166.1326f, 101.33249f, 170.32f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 44.87f),
                    PathNode.LineTo(116.0f, 61.08f),
                    PathNode.CurveTo(88.033424f, 66.14578f, 66.14578f, 88.033424f, 61.08f, 116.0f),
                    PathNode.LineTo(44.87f, 116.0f),
                    PathNode.CurveTo(50.248943f, 79.17291f, 79.17291f, 50.248943f, 116.0f, 44.87f),
                    PathNode.Close,
                    PathNode.MoveTo(44.87f, 140.0f),
                    PathNode.LineTo(61.08f, 140.0f),
                    PathNode.CurveTo(66.14578f, 167.96655f, 88.033424f, 189.85422f, 116.0f, 194.92f),
                    PathNode.LineTo(116.0f, 211.13f),
                    PathNode.CurveTo(79.17291f, 205.75105f, 50.248943f, 176.82709f, 44.87f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 211.13f),
                    PathNode.LineTo(140.0f, 194.92f),
                    PathNode.CurveTo(167.96655f, 189.85422f, 189.85422f, 167.96655f, 194.92f, 140.0f),
                    PathNode.LineTo(211.13f, 140.0f),
                    PathNode.CurveTo(205.75105f, 176.82709f, 176.82709f, 205.75105f, 140.0f, 211.13f),
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
        return _chartPolar!!
    }

private var _chartPolar: ImageVector? = null
