package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GoogleDriveLogo: ImageVector
    get() {
        if (_googleDriveLogo != null) return _googleDriveLogo!!
        _googleDriveLogo = phosphorBoldIcon(
            name = "GoogleDriveLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(241.0f, 141.65f),
                    PathNode.LineTo(172.59f, 29.51f),
                    PathNode.LineTo(172.52f, 29.4f),
                    PathNode.CurveTo(168.87837f, 23.51852f, 162.43747f, 19.957083f, 155.52f, 20.0f),
                    PathNode.LineTo(100.44f, 20.0f),
                    PathNode.CurveTo(93.52253f, 19.957083f, 87.08163f, 23.51852f, 83.44f, 29.4f),
                    PathNode.LineTo(83.37f, 29.51f),
                    PathNode.LineTo(15.0f, 141.65f),
                    PathNode.CurveTo(11.135963f, 147.88762f, 10.997793f, 155.74031f, 14.64f, 162.11f),
                    PathNode.LineTo(42.0f, 209.92f),
                    PathNode.CurveTo(45.553955f, 216.14177f, 52.164753f, 219.98694f, 59.33f, 220.0f),
                    PathNode.LineTo(196.67f, 220.0f),
                    PathNode.CurveTo(203.83525f, 219.98694f, 210.44604f, 216.14177f, 214.0f, 209.92f),
                    PathNode.LineTo(241.32f, 162.11f),
                    PathNode.CurveTo(244.9744f, 155.7476f, 244.85158f, 147.89499f, 241.0f, 141.65f),
                    PathNode.Close,
                    PathNode.MoveTo(211.88f, 140.0f),
                    PathNode.LineTo(174.79f, 140.0f),
                    PathNode.LineTo(142.0f, 85.33f),
                    PathNode.LineTo(160.12f, 55.14f),
                    PathNode.Close,
                    PathNode.MoveTo(54.8f, 184.0f),
                    PathNode.LineTo(43.36f, 164.0f),
                    PathNode.LineTo(66.81f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.8f, 164.0f),
                    PathNode.LineTo(161.2f, 164.0f),
                    PathNode.LineTo(180.4f, 196.0f),
                    PathNode.LineTo(75.6f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(109.2f, 140.0f),
                    PathNode.LineTo(128.0f, 108.66f),
                    PathNode.LineTo(146.8f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(189.2f, 164.0f),
                    PathNode.LineTo(212.65f, 164.0f),
                    PathNode.LineTo(201.2f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 62.0f),
                    PathNode.LineTo(117.19f, 44.0f),
                    PathNode.LineTo(138.81f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(95.89f, 55.14f),
                    PathNode.LineTo(114.0f, 85.33f),
                    PathNode.LineTo(81.21f, 140.0f),
                    PathNode.LineTo(44.12f, 140.0f),
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
        return _googleDriveLogo!!
    }

private var _googleDriveLogo: ImageVector? = null
