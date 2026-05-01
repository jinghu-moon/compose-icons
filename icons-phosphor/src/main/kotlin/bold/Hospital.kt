package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hospital: ImageVector
    get() {
        if (_hospital != null) return _hospital!!
        _hospital = phosphorBoldIcon(
            name = "Hospital",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 204.0f),
                    PathNode.LineTo(240.0f, 204.0f),
                    PathNode.LineTo(240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 116.95431f, 231.0457f, 108.0f, 220.0f, 108.0f),
                    PathNode.LineTo(172.0f, 108.0f),
                    PathNode.LineTo(172.0f, 48.0f),
                    PathNode.CurveTo(172.0f, 36.954304f, 163.0457f, 28.0f, 152.0f, 28.0f),
                    PathNode.LineTo(56.0f, 28.0f),
                    PathNode.CurveTo(44.954304f, 28.0f, 36.0f, 36.954304f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 204.0f),
                    PathNode.LineTo(32.0f, 204.0f),
                    PathNode.CurveTo(25.372583f, 204.0f, 20.0f, 209.37259f, 20.0f, 216.0f),
                    PathNode.CurveTo(20.0f, 222.62741f, 25.372583f, 228.0f, 32.0f, 228.0f),
                    PathNode.LineTo(244.0f, 228.0f),
                    PathNode.CurveTo(250.62741f, 228.0f, 256.0f, 222.62741f, 256.0f, 216.0f),
                    PathNode.CurveTo(256.0f, 209.37259f, 250.62741f, 204.0f, 244.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 132.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.LineTo(172.0f, 204.0f),
                    PathNode.LineTo(172.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 52.0f),
                    PathNode.LineTo(148.0f, 52.0f),
                    PathNode.LineTo(148.0f, 204.0f),
                    PathNode.LineTo(136.0f, 204.0f),
                    PathNode.LineTo(136.0f, 160.0f),
                    PathNode.CurveTo(136.0f, 153.37259f, 130.62741f, 148.0f, 124.0f, 148.0f),
                    PathNode.LineTo(84.0f, 148.0f),
                    PathNode.CurveTo(77.37258f, 148.0f, 72.0f, 153.37259f, 72.0f, 160.0f),
                    PathNode.LineTo(72.0f, 204.0f),
                    PathNode.LineTo(60.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 204.0f),
                    PathNode.LineTo(96.0f, 204.0f),
                    PathNode.LineTo(96.0f, 172.0f),
                    PathNode.LineTo(112.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 96.0f),
                    PathNode.CurveTo(72.0f, 89.37258f, 77.37258f, 84.0f, 84.0f, 84.0f),
                    PathNode.LineTo(92.0f, 84.0f),
                    PathNode.LineTo(92.0f, 76.0f),
                    PathNode.CurveTo(92.0f, 69.37258f, 97.37258f, 64.0f, 104.0f, 64.0f),
                    PathNode.CurveTo(110.62742f, 64.0f, 116.0f, 69.37258f, 116.0f, 76.0f),
                    PathNode.LineTo(116.0f, 84.0f),
                    PathNode.LineTo(124.0f, 84.0f),
                    PathNode.CurveTo(130.62741f, 84.0f, 136.0f, 89.37258f, 136.0f, 96.0f),
                    PathNode.CurveTo(136.0f, 102.62742f, 130.62741f, 108.0f, 124.0f, 108.0f),
                    PathNode.LineTo(116.0f, 108.0f),
                    PathNode.LineTo(116.0f, 116.0f),
                    PathNode.CurveTo(116.0f, 122.62742f, 110.62742f, 128.0f, 104.0f, 128.0f),
                    PathNode.CurveTo(97.37258f, 128.0f, 92.0f, 122.62742f, 92.0f, 116.0f),
                    PathNode.LineTo(92.0f, 108.0f),
                    PathNode.LineTo(84.0f, 108.0f),
                    PathNode.CurveTo(77.37258f, 108.0f, 72.0f, 102.62742f, 72.0f, 96.0f),
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
        return _hospital!!
    }

private var _hospital: ImageVector? = null
