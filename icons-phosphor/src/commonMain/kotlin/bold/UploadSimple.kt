package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UploadSimple: ImageVector
    get() {
        if (_uploadSimple != null) return _uploadSimple!!
        _uploadSimple = phosphorBoldIcon(
            name = "UploadSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 144.0f),
                    PathNode.LineTo(228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 214.62741f, 222.62741f, 220.0f, 216.0f, 220.0f),
                    PathNode.LineTo(40.0f, 220.0f),
                    PathNode.CurveTo(33.37258f, 220.0f, 28.0f, 214.62741f, 28.0f, 208.0f),
                    PathNode.LineTo(28.0f, 144.0f),
                    PathNode.CurveTo(28.0f, 137.37259f, 33.37258f, 132.0f, 40.0f, 132.0f),
                    PathNode.CurveTo(46.62742f, 132.0f, 52.0f, 137.37259f, 52.0f, 144.0f),
                    PathNode.LineTo(52.0f, 196.0f),
                    PathNode.LineTo(204.0f, 196.0f),
                    PathNode.LineTo(204.0f, 144.0f),
                    PathNode.CurveTo(204.0f, 137.37259f, 209.37259f, 132.0f, 216.0f, 132.0f),
                    PathNode.CurveTo(222.62741f, 132.0f, 228.0f, 137.37259f, 228.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.49f, 80.49f),
                    PathNode.LineTo(116.0f, 61.0f),
                    PathNode.LineTo(116.0f, 144.0f),
                    PathNode.CurveTo(116.0f, 150.62741f, 121.37258f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(134.62741f, 156.0f, 140.0f, 150.62741f, 140.0f, 144.0f),
                    PathNode.LineTo(140.0f, 61.0f),
                    PathNode.LineTo(159.51f, 80.52f),
                    PathNode.CurveTo(164.20442f, 85.214424f, 171.81558f, 85.214424f, 176.51f, 80.52f),
                    PathNode.CurveTo(181.20442f, 75.82558f, 181.20442f, 68.214424f, 176.51f, 63.52f),
                    PathNode.LineTo(136.51f, 23.52f),
                    PathNode.CurveTo(134.25838f, 21.260546f, 131.19981f, 19.990538f, 128.01f, 19.990538f),
                    PathNode.CurveTo(124.82018f, 19.990538f, 121.76162f, 21.260546f, 119.51f, 23.52f),
                    PathNode.LineTo(79.51f, 63.52f),
                    PathNode.CurveTo(74.81558f, 68.214424f, 74.81558f, 75.82558f, 79.51f, 80.52f),
                    PathNode.CurveTo(84.20442f, 85.214424f, 91.81558f, 85.214424f, 96.51f, 80.52f),
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
        return _uploadSimple!!
    }

private var _uploadSimple: ImageVector? = null
