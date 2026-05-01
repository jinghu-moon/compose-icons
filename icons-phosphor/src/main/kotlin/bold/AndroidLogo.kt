package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AndroidLogo: ImageVector
    get() {
        if (_androidLogo != null) return _androidLogo!!
        _androidLogo = phosphorBoldIcon(
            name = "AndroidLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 148.0f),
                    PathNode.CurveTo(180.0f, 156.83656f, 172.83656f, 164.0f, 164.0f, 164.0f),
                    PathNode.CurveTo(155.16344f, 164.0f, 148.0f, 156.83656f, 148.0f, 148.0f),
                    PathNode.CurveTo(148.0f, 139.16344f, 155.16344f, 132.0f, 164.0f, 132.0f),
                    PathNode.CurveTo(172.83656f, 132.0f, 180.0f, 139.16344f, 180.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 132.0f),
                    PathNode.CurveTo(83.163445f, 132.0f, 76.0f, 139.16344f, 76.0f, 148.0f),
                    PathNode.CurveTo(76.0f, 156.83656f, 83.163445f, 164.0f, 92.0f, 164.0f),
                    PathNode.CurveTo(100.836555f, 164.0f, 108.0f, 156.83656f, 108.0f, 148.0f),
                    PathNode.CurveTo(108.0f, 139.16344f, 100.836555f, 132.0f, 92.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 160.0f),
                    PathNode.LineTo(244.0f, 184.0f),
                    PathNode.CurveTo(244.0f, 195.0457f, 235.0457f, 204.0f, 224.0f, 204.0f),
                    PathNode.LineTo(32.0f, 204.0f),
                    PathNode.CurveTo(20.954306f, 204.0f, 12.0f, 195.0457f, 12.0f, 184.0f),
                    PathNode.LineTo(12.0f, 161.13f),
                    PathNode.CurveTo(11.969215f, 130.28645f, 24.082752f, 100.67079f, 45.72f, 78.69f),
                    PathNode.LineTo(23.51f, 56.49f),
                    PathNode.CurveTo(18.81558f, 51.79558f, 18.81558f, 44.18442f, 23.51f, 39.49f),
                    PathNode.CurveTo(28.20442f, 34.79558f, 35.81558f, 34.79558f, 40.51f, 39.49f),
                    PathNode.LineTo(64.3f, 63.33f),
                    PathNode.CurveTo(83.03038f, 50.789593f, 105.04926f, 44.064594f, 127.59f, 44.0f),
                    PathNode.LineTo(128.0f, 44.0f),
                    PathNode.CurveTo(150.71848f, 43.937702f, 172.94775f, 50.59709f, 191.89f, 63.14f),
                    PathNode.LineTo(215.51f, 39.51f),
                    PathNode.CurveTo(220.20442f, 34.81558f, 227.81558f, 34.81558f, 232.51f, 39.51f),
                    PathNode.CurveTo(237.20442f, 44.20442f, 237.20442f, 51.81558f, 232.51f, 56.51f),
                    PathNode.LineTo(210.51f, 78.51f),
                    PathNode.CurveTo(232.0316f, 100.16171f, 244.0772f, 129.47182f, 244.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 160.0f),
                    PathNode.CurveTo(220.00015f, 135.5428f, 210.26204f, 112.09209f, 192.93724f, 94.82922f),
                    PathNode.CurveTo(175.61247f, 77.56636f, 152.12704f, 67.91227f, 127.67f, 68.0f),
                    PathNode.CurveTo(77.12f, 68.18f, 36.0f, 110.0f, 36.0f, 161.13f),
                    PathNode.LineTo(36.0f, 180.0f),
                    PathNode.LineTo(220.0f, 180.0f),
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
        return _androidLogo!!
    }

private var _androidLogo: ImageVector? = null
