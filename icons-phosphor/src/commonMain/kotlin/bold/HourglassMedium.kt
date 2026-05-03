package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HourglassMedium: ImageVector
    get() {
        if (_hourglassMedium != null) return _hourglassMedium!!
        _hourglassMedium = phosphorBoldIcon(
            name = "HourglassMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(204.0f, 75.64f),
                    PathNode.LineTo(204.0f, 40.0f),
                    PathNode.CurveTo(204.0f, 28.954306f, 195.0457f, 20.0f, 184.0f, 20.0f),
                    PathNode.LineTo(72.0f, 20.0f),
                    PathNode.CurveTo(60.954304f, 20.0f, 52.0f, 28.954306f, 52.0f, 40.0f),
                    PathNode.LineTo(52.0f, 76.0f),
                    PathNode.CurveTo(52.01564f, 82.29144f, 54.97623f, 88.21262f, 60.0f, 92.0f),
                    PathNode.LineTo(108.0f, 128.0f),
                    PathNode.LineTo(60.0f, 164.0f),
                    PathNode.CurveTo(54.97623f, 167.7874f, 52.01564f, 173.70856f, 52.0f, 180.0f),
                    PathNode.LineTo(52.0f, 216.0f),
                    PathNode.CurveTo(52.0f, 227.0457f, 60.954304f, 236.0f, 72.0f, 236.0f),
                    PathNode.LineTo(184.0f, 236.0f),
                    PathNode.CurveTo(195.0457f, 236.0f, 204.0f, 227.0457f, 204.0f, 216.0f),
                    PathNode.LineTo(204.0f, 180.36f),
                    PathNode.CurveTo(203.99394f, 174.08012f, 201.05751f, 168.16286f, 196.06f, 164.36f),
                    PathNode.LineTo(147.9f, 128.0f),
                    PathNode.LineTo(196.06f, 91.6f),
                    PathNode.CurveTo(201.04634f, 87.80567f, 203.98149f, 81.9058f, 204.0f, 75.64f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 44.0f),
                    PathNode.LineTo(180.0f, 72.0f),
                    PathNode.LineTo(76.0f, 72.0f),
                    PathNode.LineTo(76.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 113.0f),
                    PathNode.LineTo(105.33f, 96.0f),
                    PathNode.LineTo(150.43f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 212.0f),
                    PathNode.LineTo(76.0f, 212.0f),
                    PathNode.LineTo(76.0f, 182.0f),
                    PathNode.LineTo(116.0f, 152.0f),
                    PathNode.LineTo(116.0f, 168.0f),
                    PathNode.CurveTo(116.0f, 174.62741f, 121.37258f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(134.62741f, 180.0f, 140.0f, 174.62741f, 140.0f, 168.0f),
                    PathNode.LineTo(140.0f, 152.11f),
                    PathNode.LineTo(180.0f, 182.35f),
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
        return _hourglassMedium!!
    }

private var _hourglassMedium: ImageVector? = null
