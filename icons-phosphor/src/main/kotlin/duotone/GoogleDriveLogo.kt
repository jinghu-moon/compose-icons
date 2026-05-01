package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GoogleDriveLogo: ImageVector
    get() {
        if (_googleDriveLogo != null) return _googleDriveLogo!!
        _googleDriveLogo = phosphorDuotoneIcon(
            name = "GoogleDriveLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(24.0f, 152.0f),
                    PathNode.LineTo(88.0f, 152.0f),
                    PathNode.LineTo(55.12f, 206.8f),
                    PathNode.CurveTo(53.986332f, 206.11119f, 53.0441f, 205.14832f, 52.38f, 204.0f),
                    PathNode.LineTo(25.05f, 156.15f),
                    PathNode.CurveTo(24.32952f, 154.88773f, 23.966522f, 153.45303f, 24.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 152.0f),
                    PathNode.LineTo(200.88f, 206.8f),
                    PathNode.CurveTo(202.01736f, 206.10281f, 202.95993f, 205.12927f, 203.62f, 203.97f),
                    PathNode.LineTo(230.94f, 156.15f),
                    PathNode.CurveTo(231.66397f, 154.88873f, 232.03044f, 153.45396f, 232.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.43f, 32.0f),
                    PathNode.CurveTo(99.08666f, 32.008118f, 97.76666f, 32.351868f, 96.59f, 33.0f),
                    PathNode.LineTo(128.0f, 85.33f),
                    PathNode.LineTo(159.41f, 33.0f),
                    PathNode.CurveTo(158.23021f, 32.35065f, 156.90666f, 32.006878f, 155.56f, 32.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
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
                    PathNode.MoveTo(102.13f, 144.0f),
                    PathNode.LineTo(128.0f, 100.88f),
                    PathNode.LineTo(153.87f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(163.47f, 160.0f),
                    PathNode.LineTo(187.47f, 200.0f),
                    PathNode.LineTo(68.53f, 200.0f),
                    PathNode.LineTo(92.53f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 69.78f),
                    PathNode.LineTo(110.12f, 40.0f),
                    PathNode.LineTo(145.9f, 39.95f),
                    PathNode.Close,
                    PathNode.MoveTo(95.91f, 47.41f),
                    PathNode.LineTo(118.67f, 85.33f),
                    PathNode.LineTo(83.47f, 144.0f),
                    PathNode.LineTo(37.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.54f, 160.0f),
                    PathNode.LineTo(73.87f, 160.0f),
                    PathNode.LineTo(54.72f, 191.92f),
                    PathNode.Close,
                    PathNode.MoveTo(201.28f, 191.93f),
                    PathNode.LineTo(182.12f, 160.0f),
                    PathNode.LineTo(219.53f, 160.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _googleDriveLogo!!
    }

private var _googleDriveLogo: ImageVector? = null
