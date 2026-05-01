package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BugDroid: ImageVector
    get() {
        if (_bugDroid != null) return _bugDroid!!
        _bugDroid = phosphorBoldIcon(
            name = "BugDroid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(197.35f, 51.62f),
                    PathNode.LineTo(208.49f, 40.49f),
                    PathNode.CurveTo(213.18442f, 35.79558f, 213.18442f, 28.18442f, 208.49f, 23.49f),
                    PathNode.CurveTo(203.79558f, 18.79558f, 196.18442f, 18.79558f, 191.49f, 23.49f),
                    PathNode.LineTo(179.34f, 35.69f),
                    PathNode.CurveTo(148.31012f, 14.769715f, 107.6899f, 14.769715f, 76.66f, 35.69f),
                    PathNode.LineTo(64.49f, 23.51f),
                    PathNode.CurveTo(59.79558f, 18.81558f, 52.18442f, 18.81558f, 47.49f, 23.51f),
                    PathNode.CurveTo(42.79558f, 28.20442f, 42.79558f, 35.81558f, 47.49f, 40.51f),
                    PathNode.LineTo(58.65f, 51.62f),
                    PathNode.CurveTo(44.02897f, 68.33478f, 35.97953f, 89.79285f, 36.0f, 112.0f),
                    PathNode.LineTo(36.0f, 152.0f),
                    PathNode.CurveTo(36.0f, 202.8102f, 77.18981f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(178.8102f, 244.0f, 220.0f, 202.8102f, 220.0f, 152.0f),
                    PathNode.LineTo(220.0f, 112.0f),
                    PathNode.CurveTo(220.02048f, 89.79285f, 211.97102f, 68.33478f, 197.35f, 51.62f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 112.0f),
                    PathNode.LineTo(196.0f, 116.0f),
                    PathNode.LineTo(60.0f, 116.0f),
                    PathNode.LineTo(60.0f, 112.0f),
                    PathNode.CurveTo(60.0f, 74.44463f, 90.44463f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(165.55536f, 44.0f, 196.0f, 74.44463f, 196.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(90.46063f, 219.96141f, 60.038586f, 189.53935f, 60.0f, 152.0f),
                    PathNode.LineTo(60.0f, 140.0f),
                    PathNode.LineTo(196.0f, 140.0f),
                    PathNode.LineTo(196.0f, 152.0f),
                    PathNode.CurveTo(195.96141f, 189.53935f, 165.53935f, 219.96141f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 88.0f),
                    PathNode.CurveTo(140.0f, 79.163445f, 147.16344f, 72.0f, 156.0f, 72.0f),
                    PathNode.CurveTo(164.83656f, 72.0f, 172.0f, 79.163445f, 172.0f, 88.0f),
                    PathNode.CurveTo(172.0f, 96.836555f, 164.83656f, 104.0f, 156.0f, 104.0f),
                    PathNode.CurveTo(147.16344f, 104.0f, 140.0f, 96.836555f, 140.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 88.0f),
                    PathNode.CurveTo(84.0f, 79.163445f, 91.163445f, 72.0f, 100.0f, 72.0f),
                    PathNode.CurveTo(108.836555f, 72.0f, 116.0f, 79.163445f, 116.0f, 88.0f),
                    PathNode.CurveTo(116.0f, 96.836555f, 108.836555f, 104.0f, 100.0f, 104.0f),
                    PathNode.CurveTo(91.163445f, 104.0f, 84.0f, 96.836555f, 84.0f, 88.0f),
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
        return _bugDroid!!
    }

private var _bugDroid: ImageVector? = null
