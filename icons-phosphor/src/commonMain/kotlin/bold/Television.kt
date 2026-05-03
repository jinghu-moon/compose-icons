package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Television: ImageVector
    get() {
        if (_television != null) return _television!!
        _television = phosphorBoldIcon(
            name = "Television",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 60.0f),
                    PathNode.LineTo(157.0f, 60.0f),
                    PathNode.LineTo(184.52f, 32.48f),
                    PathNode.CurveTo(189.21442f, 27.78558f, 189.21442f, 20.174421f, 184.52f, 15.48f),
                    PathNode.CurveTo(179.82558f, 10.78558f, 172.21442f, 10.78558f, 167.52f, 15.48f),
                    PathNode.LineTo(128.0f, 55.0f),
                    PathNode.LineTo(88.49f, 15.51f),
                    PathNode.CurveTo(83.79558f, 10.815579f, 76.18442f, 10.815579f, 71.49f, 15.51f),
                    PathNode.CurveTo(66.79558f, 20.20442f, 66.79558f, 27.81558f, 71.49f, 32.51f),
                    PathNode.LineTo(99.0f, 60.0f),
                    PathNode.LineTo(40.0f, 60.0f),
                    PathNode.CurveTo(28.954306f, 60.0f, 20.0f, 68.95431f, 20.0f, 80.0f),
                    PathNode.LineTo(20.0f, 200.0f),
                    PathNode.CurveTo(20.0f, 211.0457f, 28.954306f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(227.0457f, 220.0f, 236.0f, 211.0457f, 236.0f, 200.0f),
                    PathNode.LineTo(236.0f, 80.0f),
                    PathNode.CurveTo(236.0f, 68.95431f, 227.0457f, 60.0f, 216.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 84.0f),
                    PathNode.LineTo(128.0f, 84.0f),
                    PathNode.LineTo(128.0f, 196.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 196.0f),
                    PathNode.LineTo(152.0f, 196.0f),
                    PathNode.LineTo(152.0f, 84.0f),
                    PathNode.LineTo(212.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 116.0f),
                    PathNode.CurveTo(168.0f, 107.163445f, 175.16344f, 100.0f, 184.0f, 100.0f),
                    PathNode.CurveTo(192.83656f, 100.0f, 200.0f, 107.163445f, 200.0f, 116.0f),
                    PathNode.CurveTo(200.0f, 124.836555f, 192.83656f, 132.0f, 184.0f, 132.0f),
                    PathNode.CurveTo(175.16344f, 132.0f, 168.0f, 124.836555f, 168.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 164.0f),
                    PathNode.CurveTo(200.0f, 172.83656f, 192.83656f, 180.0f, 184.0f, 180.0f),
                    PathNode.CurveTo(175.16344f, 180.0f, 168.0f, 172.83656f, 168.0f, 164.0f),
                    PathNode.CurveTo(168.0f, 155.16344f, 175.16344f, 148.0f, 184.0f, 148.0f),
                    PathNode.CurveTo(192.83656f, 148.0f, 200.0f, 155.16344f, 200.0f, 164.0f),
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
        return _television!!
    }

private var _television: ImageVector? = null
