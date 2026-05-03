package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Flask: ImageVector
    get() {
        if (_flask != null) return _flask!!
        _flask = phosphorBoldIcon(
            name = "Flask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.15f, 197.71f),
                    PathNode.LineTo(164.0f, 95.81f),
                    PathNode.LineTo(164.0f, 44.0f),
                    PathNode.LineTo(168.0f, 44.0f),
                    PathNode.CurveTo(174.62741f, 44.0f, 180.0f, 38.62742f, 180.0f, 32.0f),
                    PathNode.CurveTo(180.0f, 25.372583f, 174.62741f, 20.0f, 168.0f, 20.0f),
                    PathNode.LineTo(88.0f, 20.0f),
                    PathNode.CurveTo(81.37258f, 20.0f, 76.0f, 25.372583f, 76.0f, 32.0f),
                    PathNode.CurveTo(76.0f, 38.62742f, 81.37258f, 44.0f, 88.0f, 44.0f),
                    PathNode.LineTo(92.0f, 44.0f),
                    PathNode.LineTo(92.0f, 95.81f),
                    PathNode.LineTo(30.85f, 197.71f),
                    PathNode.CurveTo(27.142775f, 203.88864f, 27.04568f, 211.5838f, 30.595833f, 217.85402f),
                    PathNode.CurveTo(34.145985f, 224.12422f, 40.79451f, 228.00008f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(215.20549f, 228.00008f, 221.85402f, 224.12422f, 225.40417f, 217.85402f),
                    PathNode.CurveTo(228.95432f, 211.5838f, 228.85722f, 203.88864f, 225.15f, 197.71f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 44.0f),
                    PathNode.LineTo(140.0f, 99.14f),
                    PathNode.CurveTo(140.00069f, 101.313576f, 140.59172f, 103.44616f, 141.71f, 105.31f),
                    PathNode.LineTo(176.84f, 163.85f),
                    PathNode.CurveTo(166.05f, 164.71f, 151.69f, 162.54f, 133.42f, 153.29f),
                    PathNode.CurveTo(119.42f, 146.21f, 105.96f, 141.96f, 93.15f, 140.53f),
                    PathNode.LineTo(114.29f, 105.31f),
                    PathNode.CurveTo(115.40827f, 103.44616f, 115.99931f, 101.313576f, 116.0f, 99.14f),
                    PathNode.LineTo(116.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(55.06f, 204.0f),
                    PathNode.LineTo(79.0f, 164.19f),
                    PathNode.CurveTo(92.0f, 163.08f, 106.62f, 166.61f, 122.62f, 174.71f),
                    PathNode.CurveTo(142.23f, 184.63f, 158.87f, 188.02f, 172.47f, 188.02f),
                    PathNode.CurveTo(178.40901f, 188.04338f, 184.33002f, 187.36534f, 190.11f, 186.0f),
                    PathNode.LineTo(200.94f, 204.0f),
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
        return _flask!!
    }

private var _flask: ImageVector? = null
