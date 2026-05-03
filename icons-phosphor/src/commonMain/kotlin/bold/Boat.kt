package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Boat: ImageVector
    get() {
        if (_boat != null) return _boat!!
        _boat = phosphorBoldIcon(
            name = "Boat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.33f, 106.79f),
                    PathNode.LineTo(212.0f, 103.35f),
                    PathNode.LineTo(212.0f, 56.0f),
                    PathNode.CurveTo(212.0f, 44.954304f, 203.0457f, 36.0f, 192.0f, 36.0f),
                    PathNode.LineTo(140.0f, 36.0f),
                    PathNode.LineTo(140.0f, 24.0f),
                    PathNode.CurveTo(140.0f, 17.372583f, 134.62741f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(121.37258f, 12.0f, 116.0f, 17.372583f, 116.0f, 24.0f),
                    PathNode.LineTo(116.0f, 36.0f),
                    PathNode.LineTo(64.0f, 36.0f),
                    PathNode.CurveTo(52.954304f, 36.0f, 44.0f, 44.954304f, 44.0f, 56.0f),
                    PathNode.LineTo(44.0f, 103.35f),
                    PathNode.LineTo(33.67f, 106.79f),
                    PathNode.CurveTo(25.496105f, 109.51723f, 19.987873f, 117.17315f, 20.0f, 125.79f),
                    PathNode.LineTo(20.0f, 152.0f),
                    PathNode.CurveTo(20.0f, 216.63f, 120.8f, 242.57f, 125.09f, 243.64f),
                    PathNode.CurveTo(127.000305f, 244.12007f, 128.9997f, 244.12007f, 130.91f, 243.64f),
                    PathNode.CurveTo(135.2f, 242.57f, 236.0f, 216.63f, 236.0f, 152.0f),
                    PathNode.LineTo(236.0f, 125.77f),
                    PathNode.CurveTo(236.00351f, 117.16051f, 230.4969f, 109.5149f, 222.33f, 106.79f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 60.0f),
                    PathNode.LineTo(188.0f, 60.0f),
                    PathNode.LineTo(188.0f, 95.35f),
                    PathNode.LineTo(131.79f, 76.62f),
                    PathNode.CurveTo(129.33148f, 75.79011f, 126.66852f, 75.79011f, 124.21f, 76.62f),
                    PathNode.LineTo(68.0f, 95.35f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 152.0f),
                    PathNode.CurveTo(212.0f, 188.69f, 153.92f, 212.43f, 128.0f, 219.59f),
                    PathNode.CurveTo(102.06f, 212.42f, 44.0f, 188.69f, 44.0f, 152.0f),
                    PathNode.LineTo(44.0f, 128.65f),
                    PathNode.LineTo(116.0f, 104.65f),
                    PathNode.LineTo(116.0f, 168.0f),
                    PathNode.CurveTo(116.0f, 174.62741f, 121.37258f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(134.62741f, 180.0f, 140.0f, 174.62741f, 140.0f, 168.0f),
                    PathNode.LineTo(140.0f, 104.65f),
                    PathNode.LineTo(212.0f, 128.65f),
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
        return _boat!!
    }

private var _boat: ImageVector? = null
