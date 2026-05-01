package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SmileySticker: ImageVector
    get() {
        if (_smileySticker != null) return _smileySticker!!
        _smileySticker = phosphorFillIcon(
            name = "SmileySticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(87.14338f, 24.031242f, 50.089954f, 47.9819f, 33.284645f, 85.22228f),
                    PathNode.CurveTo(16.479332f, 122.46267f, 23.03578f, 166.09297f, 50.044132f, 196.74934f),
                    PathNode.CurveTo(77.05248f, 227.40573f, 119.50869f, 239.40825f, 158.57f, 227.43f),
                    PathNode.CurveTo(159.8184f, 227.04636f, 160.95222f, 226.35918f, 161.87f, 225.43f),
                    PathNode.LineTo(225.44f, 161.86f),
                    PathNode.CurveTo(226.36732f, 160.93683f, 227.05406f, 159.8003f, 227.44f, 158.55f),
                    PathNode.CurveTo(237.09337f, 127.00587f, 231.2228f, 92.75307f, 211.61618f, 66.223816f),
                    PathNode.CurveTo(192.00958f, 39.69456f, 160.98817f, 24.029627f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 96.0f),
                    PathNode.CurveTo(98.62742f, 96.0f, 104.0f, 101.37258f, 104.0f, 108.0f),
                    PathNode.CurveTo(104.0f, 114.62742f, 98.62742f, 120.0f, 92.0f, 120.0f),
                    PathNode.CurveTo(85.37258f, 120.0f, 80.0f, 114.62742f, 80.0f, 108.0f),
                    PathNode.CurveTo(80.0f, 101.37258f, 85.37258f, 96.0f, 92.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(174.92f, 156.0f),
                    PathNode.CurveTo(164.63f, 173.79f, 147.53f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(108.47f, 184.0f, 91.37f, 173.8f, 81.08f, 156.0f),
                    PathNode.CurveTo(79.503525f, 153.52008f, 79.413536f, 150.3755f, 80.84562f, 147.8095f),
                    PathNode.CurveTo(82.277695f, 145.24348f, 85.00129f, 143.66916f, 87.9396f, 143.70892f),
                    PathNode.CurveTo(90.87791f, 143.7487f, 93.5579f, 145.39618f, 94.92f, 148.0f),
                    PathNode.CurveTo(102.39f, 160.91f, 114.13f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(141.87f, 168.0f, 153.61f, 160.9f, 161.08f, 148.0f),
                    PathNode.CurveTo(162.44211f, 145.39618f, 165.12209f, 143.7487f, 168.0604f, 143.70892f),
                    PathNode.CurveTo(170.9987f, 143.66916f, 173.7223f, 145.24348f, 175.15439f, 147.8095f),
                    PathNode.CurveTo(176.58647f, 150.3755f, 176.49648f, 153.52008f, 174.92f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 120.0f),
                    PathNode.CurveTo(157.37259f, 120.0f, 152.0f, 114.62742f, 152.0f, 108.0f),
                    PathNode.CurveTo(152.0f, 101.37258f, 157.37259f, 96.0f, 164.0f, 96.0f),
                    PathNode.CurveTo(170.62741f, 96.0f, 176.0f, 101.37258f, 176.0f, 108.0f),
                    PathNode.CurveTo(176.0f, 114.62742f, 170.62741f, 120.0f, 164.0f, 120.0f),
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
        return _smileySticker!!
    }

private var _smileySticker: ImageVector? = null
