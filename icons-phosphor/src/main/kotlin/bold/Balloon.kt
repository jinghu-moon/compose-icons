package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Balloon: ImageVector
    get() {
        if (_balloon != null) return _balloon!!
        _balloon = phosphorBoldIcon(
            name = "Balloon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 12.0f),
                    PathNode.CurveTo(77.21265f, 12.055114f, 36.055115f, 53.21265f, 36.0f, 104.0f),
                    PathNode.CurveTo(36.0f, 128.53f, 45.55f, 154.13f, 62.19f, 174.22f),
                    PathNode.CurveTo(72.19f, 186.22f, 83.75f, 195.29f, 96.24f, 200.98f),
                    PathNode.LineTo(85.0f, 227.27f),
                    PathNode.CurveTo(83.41179f, 230.97304f, 83.78802f, 235.22597f, 86.00164f, 238.59268f),
                    PathNode.CurveTo(88.215256f, 241.9594f, 91.97076f, 243.99045f, 96.0f, 244.0f),
                    PathNode.LineTo(160.0f, 244.0f),
                    PathNode.CurveTo(164.02924f, 243.99045f, 167.78476f, 241.9594f, 169.99837f, 238.59268f),
                    PathNode.CurveTo(172.21198f, 235.22597f, 172.58821f, 230.97304f, 171.0f, 227.27f),
                    PathNode.LineTo(159.76f, 201.0f),
                    PathNode.CurveTo(172.25f, 195.31f, 183.84f, 186.27f, 193.81f, 174.24f),
                    PathNode.CurveTo(210.45f, 154.13f, 220.0f, 128.53f, 220.0f, 104.0f),
                    PathNode.CurveTo(219.94489f, 53.21265f, 178.78735f, 12.055114f, 128.0f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(141.8f, 220.0f),
                    PathNode.LineTo(114.2f, 220.0f),
                    PathNode.LineTo(119.55f, 207.51f),
                    PathNode.CurveTo(125.16439f, 208.16338f, 130.83562f, 208.16338f, 136.45f, 207.51f),
                    PathNode.Close,
                    PathNode.MoveTo(175.33f, 158.91f),
                    PathNode.CurveTo(161.93f, 175.09f, 145.12f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(110.88f, 184.0f, 94.07f, 175.09f, 80.67f, 158.91f),
                    PathNode.CurveTo(67.73f, 143.29f, 60.0f, 122.76f, 60.0f, 104.0f),
                    PathNode.CurveTo(60.0f, 66.44463f, 90.44463f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(165.55536f, 36.0f, 196.0f, 66.44463f, 196.0f, 104.0f),
                    PathNode.CurveTo(196.0f, 122.76f, 188.27f, 143.29f, 175.33f, 158.91f),
                    PathNode.Close,
                    PathNode.MoveTo(168.99f, 111.91f),
                    PathNode.QuadTo(168.39f, 111.97f, 167.79f, 111.97f),
                    PathNode.CurveTo(161.62758f, 111.964424f, 156.4711f, 107.292046f, 155.86f, 101.16f),
                    PathNode.CurveTo(154.73814f, 90.01245f, 147.07915f, 80.606865f, 136.39f, 77.25f),
                    PathNode.CurveTo(130.0691f, 75.25625f, 126.56125f, 68.5159f, 128.555f, 62.195f),
                    PathNode.CurveTo(130.54875f, 55.8741f, 137.28911f, 52.366253f, 143.61f, 54.36f),
                    PathNode.CurveTo(163.46422f, 60.592175f, 177.68233f, 78.07261f, 179.74f, 98.78f),
                    PathNode.CurveTo(180.06393f, 101.949936f, 179.11382f, 105.11856f, 177.09909f, 107.58724f),
                    PathNode.CurveTo(175.08438f, 110.05591f, 172.17053f, 111.62193f, 169.0f, 111.94f),
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
        return _balloon!!
    }

private var _balloon: ImageVector? = null
