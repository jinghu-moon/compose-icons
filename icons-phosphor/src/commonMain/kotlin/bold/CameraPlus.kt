package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CameraPlus: ImageVector
    get() {
        if (_cameraPlus != null) return _cameraPlus!!
        _cameraPlus = phosphorBoldIcon(
            name = "CameraPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 136.0f),
                    PathNode.CurveTo(172.0f, 142.62741f, 166.62741f, 148.0f, 160.0f, 148.0f),
                    PathNode.LineTo(140.0f, 148.0f),
                    PathNode.LineTo(140.0f, 168.0f),
                    PathNode.CurveTo(140.0f, 174.62741f, 134.62741f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(121.37258f, 180.0f, 116.0f, 174.62741f, 116.0f, 168.0f),
                    PathNode.LineTo(116.0f, 148.0f),
                    PathNode.LineTo(96.0f, 148.0f),
                    PathNode.CurveTo(89.37258f, 148.0f, 84.0f, 142.62741f, 84.0f, 136.0f),
                    PathNode.CurveTo(84.0f, 129.37259f, 89.37258f, 124.0f, 96.0f, 124.0f),
                    PathNode.LineTo(116.0f, 124.0f),
                    PathNode.LineTo(116.0f, 104.0f),
                    PathNode.CurveTo(116.0f, 97.37258f, 121.37258f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(134.62741f, 92.0f, 140.0f, 97.37258f, 140.0f, 104.0f),
                    PathNode.LineTo(140.0f, 124.0f),
                    PathNode.LineTo(160.0f, 124.0f),
                    PathNode.CurveTo(166.62741f, 124.0f, 172.0f, 129.37259f, 172.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 80.0f),
                    PathNode.LineTo(236.0f, 192.0f),
                    PathNode.CurveTo(236.0f, 207.46397f, 223.46397f, 220.0f, 208.0f, 220.0f),
                    PathNode.LineTo(48.0f, 220.0f),
                    PathNode.CurveTo(32.536026f, 220.0f, 20.0f, 207.46397f, 20.0f, 192.0f),
                    PathNode.LineTo(20.0f, 80.0f),
                    PathNode.CurveTo(20.0f, 64.536026f, 32.536026f, 52.0f, 48.0f, 52.0f),
                    PathNode.LineTo(73.58f, 52.0f),
                    PathNode.LineTo(83.64f, 36.91f),
                    PathNode.CurveTo(87.3482f, 31.3448f, 93.59254f, 28.001228f, 100.28f, 28.0f),
                    PathNode.LineTo(155.72f, 28.0f),
                    PathNode.CurveTo(162.40747f, 28.001228f, 168.6518f, 31.3448f, 172.36f, 36.91f),
                    PathNode.LineTo(182.42f, 52.0f),
                    PathNode.LineTo(208.0f, 52.0f),
                    PathNode.CurveTo(223.46397f, 52.0f, 236.0f, 64.536026f, 236.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 80.0f),
                    PathNode.CurveTo(212.0f, 77.79086f, 210.20914f, 76.0f, 208.0f, 76.0f),
                    PathNode.LineTo(176.0f, 76.0f),
                    PathNode.CurveTo(171.98299f, 76.00595f, 168.22943f, 74.00156f, 166.0f, 70.66f),
                    PathNode.LineTo(153.58f, 52.0f),
                    PathNode.LineTo(102.42f, 52.0f),
                    PathNode.LineTo(90.0f, 70.66f),
                    PathNode.CurveTo(87.77056f, 74.00156f, 84.017006f, 76.00595f, 80.0f, 76.0f),
                    PathNode.LineTo(48.0f, 76.0f),
                    PathNode.CurveTo(45.79086f, 76.0f, 44.0f, 77.79086f, 44.0f, 80.0f),
                    PathNode.LineTo(44.0f, 192.0f),
                    PathNode.CurveTo(44.0f, 194.20914f, 45.79086f, 196.0f, 48.0f, 196.0f),
                    PathNode.LineTo(208.0f, 196.0f),
                    PathNode.CurveTo(210.20914f, 196.0f, 212.0f, 194.20914f, 212.0f, 192.0f),
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
        return _cameraPlus!!
    }

private var _cameraPlus: ImageVector? = null
