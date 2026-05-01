package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GoogleDriveLogo: ImageVector
    get() {
        if (_googleDriveLogo != null) return _googleDriveLogo!!
        _googleDriveLogo = phosphorFillIcon(
            name = "GoogleDriveLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.6f, 143.78f),
                    PathNode.LineTo(169.13f, 31.52f),
                    PathNode.CurveTo(166.21812f, 26.82832f, 161.08182f, 23.981966f, 155.56f, 24.0f),
                    PathNode.LineTo(100.43f, 24.0f),
                    PathNode.CurveTo(94.910736f, 23.98156f, 89.77724f, 26.828453f, 86.87f, 31.52f),
                    PathNode.LineTo(86.82f, 31.59f),
                    PathNode.LineTo(18.44f, 143.7f),
                    PathNode.CurveTo(15.315042f, 148.69507f, 15.188261f, 155.00342f, 18.11f, 160.12f),
                    PathNode.LineTo(45.43f, 207.94f),
                    PathNode.CurveTo(48.278805f, 212.92393f, 53.579334f, 215.99968f, 59.32f, 216.0f),
                    PathNode.LineTo(196.67f, 216.0f),
                    PathNode.CurveTo(202.41066f, 215.99968f, 207.7112f, 212.92393f, 210.56f, 207.94f),
                    PathNode.LineTo(237.88f, 160.12f),
                    PathNode.CurveTo(240.80487f, 155.03789f, 240.69728f, 148.75891f, 237.6f, 143.78f),
                    PathNode.Close,
                    PathNode.MoveTo(219.0f, 144.0f),
                    PathNode.LineTo(172.52f, 144.0f),
                    PathNode.LineTo(137.33f, 85.33f),
                    PathNode.LineTo(160.08f, 47.41f),
                    PathNode.Close,
                    PathNode.MoveTo(92.53f, 160.0f),
                    PathNode.LineTo(163.47f, 160.0f),
                    PathNode.LineTo(187.47f, 200.0f),
                    PathNode.LineTo(68.53f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(102.13f, 144.0f),
                    PathNode.LineTo(128.0f, 100.88f),
                    PathNode.LineTo(153.87f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(95.91f, 47.41f),
                    PathNode.LineTo(118.67f, 85.33f),
                    PathNode.LineTo(83.47f, 144.0f),
                    PathNode.LineTo(37.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _googleDriveLogo!!
    }

private var _googleDriveLogo: ImageVector? = null
