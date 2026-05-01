package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Mailbox: ImageVector
    get() {
        if (_mailbox != null) return _mailbox!!
        _mailbox = phosphorBoldIcon(
            name = "Mailbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 148.0f),
                    PathNode.CurveTo(100.0f, 154.62741f, 94.62742f, 160.0f, 88.0f, 160.0f),
                    PathNode.LineTo(64.0f, 160.0f),
                    PathNode.CurveTo(57.37258f, 160.0f, 52.0f, 154.62741f, 52.0f, 148.0f),
                    PathNode.CurveTo(52.0f, 141.37259f, 57.37258f, 136.0f, 64.0f, 136.0f),
                    PathNode.LineTo(88.0f, 136.0f),
                    PathNode.CurveTo(94.62742f, 136.0f, 100.0f, 141.37259f, 100.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 116.0f),
                    PathNode.LineTo(244.0f, 176.0f),
                    PathNode.CurveTo(244.0f, 187.0457f, 235.0457f, 196.0f, 224.0f, 196.0f),
                    PathNode.LineTo(140.0f, 196.0f),
                    PathNode.LineTo(140.0f, 224.0f),
                    PathNode.CurveTo(140.0f, 230.62741f, 134.62741f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(121.37258f, 236.0f, 116.0f, 230.62741f, 116.0f, 224.0f),
                    PathNode.LineTo(116.0f, 196.0f),
                    PathNode.LineTo(32.0f, 196.0f),
                    PathNode.CurveTo(20.954306f, 196.0f, 12.0f, 187.0457f, 12.0f, 176.0f),
                    PathNode.LineTo(12.0f, 116.0f),
                    PathNode.CurveTo(12.038579f, 80.66977f, 40.66977f, 52.03858f, 76.0f, 52.0f),
                    PathNode.LineTo(156.0f, 52.0f),
                    PathNode.LineTo(156.0f, 24.0f),
                    PathNode.CurveTo(156.0f, 17.372583f, 161.37259f, 12.0f, 168.0f, 12.0f),
                    PathNode.LineTo(200.0f, 12.0f),
                    PathNode.CurveTo(206.62741f, 12.0f, 212.0f, 17.372583f, 212.0f, 24.0f),
                    PathNode.CurveTo(212.0f, 30.627417f, 206.62741f, 36.0f, 200.0f, 36.0f),
                    PathNode.LineTo(180.0f, 36.0f),
                    PathNode.LineTo(180.0f, 52.0f),
                    PathNode.CurveTo(215.33023f, 52.03858f, 243.96143f, 80.66977f, 244.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 172.0f),
                    PathNode.LineTo(116.0f, 116.0f),
                    PathNode.CurveTo(116.0f, 93.90861f, 98.09139f, 76.0f, 76.0f, 76.0f),
                    PathNode.CurveTo(53.90861f, 76.0f, 36.0f, 93.90861f, 36.0f, 116.0f),
                    PathNode.LineTo(36.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 116.0f),
                    PathNode.CurveTo(220.0f, 93.90861f, 202.09138f, 76.0f, 180.0f, 76.0f),
                    PathNode.LineTo(180.0f, 144.0f),
                    PathNode.CurveTo(180.0f, 150.62741f, 174.62741f, 156.0f, 168.0f, 156.0f),
                    PathNode.CurveTo(161.37259f, 156.0f, 156.0f, 150.62741f, 156.0f, 144.0f),
                    PathNode.LineTo(156.0f, 76.0f),
                    PathNode.LineTo(125.93f, 76.0f),
                    PathNode.CurveTo(135.05032f, 87.33533f, 140.01555f, 101.45113f, 140.0f, 116.0f),
                    PathNode.LineTo(140.0f, 172.0f),
                    PathNode.LineTo(220.0f, 172.0f),
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
        return _mailbox!!
    }

private var _mailbox: ImageVector? = null
