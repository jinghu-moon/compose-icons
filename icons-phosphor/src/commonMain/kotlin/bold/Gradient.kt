package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Gradient: ImageVector
    get() {
        if (_gradient != null) return _gradient!!
        _gradient = phosphorBoldIcon(
            name = "Gradient",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 108.0f),
                    PathNode.CurveTo(20.0f, 101.37258f, 25.372583f, 96.0f, 32.0f, 96.0f),
                    PathNode.LineTo(108.0f, 96.0f),
                    PathNode.CurveTo(114.62742f, 96.0f, 120.0f, 101.37258f, 120.0f, 108.0f),
                    PathNode.CurveTo(120.0f, 114.62742f, 114.62742f, 120.0f, 108.0f, 120.0f),
                    PathNode.LineTo(32.0f, 120.0f),
                    PathNode.CurveTo(25.372583f, 120.0f, 20.0f, 114.62742f, 20.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 96.0f),
                    PathNode.LineTo(148.0f, 96.0f),
                    PathNode.CurveTo(141.37259f, 96.0f, 136.0f, 101.37258f, 136.0f, 108.0f),
                    PathNode.CurveTo(136.0f, 114.62742f, 141.37259f, 120.0f, 148.0f, 120.0f),
                    PathNode.LineTo(224.0f, 120.0f),
                    PathNode.CurveTo(230.62741f, 120.0f, 236.0f, 114.62742f, 236.0f, 108.0f),
                    PathNode.CurveTo(236.0f, 101.37258f, 230.62741f, 96.0f, 224.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 136.0f),
                    PathNode.LineTo(32.0f, 136.0f),
                    PathNode.CurveTo(25.372583f, 136.0f, 20.0f, 141.37259f, 20.0f, 148.0f),
                    PathNode.CurveTo(20.0f, 154.62741f, 25.372583f, 160.0f, 32.0f, 160.0f),
                    PathNode.LineTo(68.0f, 160.0f),
                    PathNode.CurveTo(74.62742f, 160.0f, 80.0f, 154.62741f, 80.0f, 148.0f),
                    PathNode.CurveTo(80.0f, 141.37259f, 74.62742f, 136.0f, 68.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 136.0f),
                    PathNode.LineTo(188.0f, 136.0f),
                    PathNode.CurveTo(181.37259f, 136.0f, 176.0f, 141.37259f, 176.0f, 148.0f),
                    PathNode.CurveTo(176.0f, 154.62741f, 181.37259f, 160.0f, 188.0f, 160.0f),
                    PathNode.LineTo(224.0f, 160.0f),
                    PathNode.CurveTo(230.62741f, 160.0f, 236.0f, 154.62741f, 236.0f, 148.0f),
                    PathNode.CurveTo(236.0f, 141.37259f, 230.62741f, 136.0f, 224.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 148.0f),
                    PathNode.CurveTo(96.0f, 154.62741f, 101.37258f, 160.0f, 108.0f, 160.0f),
                    PathNode.LineTo(148.0f, 160.0f),
                    PathNode.CurveTo(154.62741f, 160.0f, 160.0f, 154.62741f, 160.0f, 148.0f),
                    PathNode.CurveTo(160.0f, 141.37259f, 154.62741f, 136.0f, 148.0f, 136.0f),
                    PathNode.LineTo(108.0f, 136.0f),
                    PathNode.CurveTo(101.37258f, 136.0f, 96.0f, 141.37259f, 96.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 176.0f),
                    PathNode.LineTo(32.0f, 176.0f),
                    PathNode.CurveTo(25.372583f, 176.0f, 20.0f, 181.37259f, 20.0f, 188.0f),
                    PathNode.CurveTo(20.0f, 194.62741f, 25.372583f, 200.0f, 32.0f, 200.0f),
                    PathNode.LineTo(52.0f, 200.0f),
                    PathNode.CurveTo(58.62742f, 200.0f, 64.0f, 194.62741f, 64.0f, 188.0f),
                    PathNode.CurveTo(64.0f, 181.37259f, 58.62742f, 176.0f, 52.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 176.0f),
                    PathNode.LineTo(92.0f, 176.0f),
                    PathNode.CurveTo(85.37258f, 176.0f, 80.0f, 181.37259f, 80.0f, 188.0f),
                    PathNode.CurveTo(80.0f, 194.62741f, 85.37258f, 200.0f, 92.0f, 200.0f),
                    PathNode.LineTo(108.0f, 200.0f),
                    PathNode.CurveTo(114.62742f, 200.0f, 120.0f, 194.62741f, 120.0f, 188.0f),
                    PathNode.CurveTo(120.0f, 181.37259f, 114.62742f, 176.0f, 108.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 176.0f),
                    PathNode.LineTo(148.0f, 176.0f),
                    PathNode.CurveTo(141.37259f, 176.0f, 136.0f, 181.37259f, 136.0f, 188.0f),
                    PathNode.CurveTo(136.0f, 194.62741f, 141.37259f, 200.0f, 148.0f, 200.0f),
                    PathNode.LineTo(164.0f, 200.0f),
                    PathNode.CurveTo(170.62741f, 200.0f, 176.0f, 194.62741f, 176.0f, 188.0f),
                    PathNode.CurveTo(176.0f, 181.37259f, 170.62741f, 176.0f, 164.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 176.0f),
                    PathNode.LineTo(204.0f, 176.0f),
                    PathNode.CurveTo(197.37259f, 176.0f, 192.0f, 181.37259f, 192.0f, 188.0f),
                    PathNode.CurveTo(192.0f, 194.62741f, 197.37259f, 200.0f, 204.0f, 200.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.CurveTo(230.62741f, 200.0f, 236.0f, 194.62741f, 236.0f, 188.0f),
                    PathNode.CurveTo(236.0f, 181.37259f, 230.62741f, 176.0f, 224.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 80.0f),
                    PathNode.LineTo(224.0f, 80.0f),
                    PathNode.CurveTo(230.62741f, 80.0f, 236.0f, 74.62742f, 236.0f, 68.0f),
                    PathNode.CurveTo(236.0f, 61.37258f, 230.62741f, 56.0f, 224.0f, 56.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(25.372583f, 56.0f, 20.0f, 61.37258f, 20.0f, 68.0f),
                    PathNode.CurveTo(20.0f, 74.62742f, 25.372583f, 80.0f, 32.0f, 80.0f),
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
        return _gradient!!
    }

private var _gradient: ImageVector? = null
