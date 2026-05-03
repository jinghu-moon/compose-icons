package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandGrabbing: ImageVector
    get() {
        if (_handGrabbing != null) return _handGrabbing!!
        _handGrabbing = phosphorThinIcon(
            name = "HandGrabbing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 84.0f),
                    PathNode.CurveTo(182.05838f, 83.9946f, 176.32834f, 86.20532f, 171.93f, 90.2f),
                    PathNode.CurveTo(171.1535f, 79.97896f, 163.97124f, 71.379295f, 154.05214f, 68.79396f),
                    PathNode.CurveTo(144.13303f, 66.208626f, 133.66684f, 70.20837f, 128.0f, 78.75f),
                    PathNode.CurveTo(122.149895f, 69.930626f, 111.213425f, 65.98422f, 101.07969f, 69.03586f),
                    PathNode.CurveTo(90.94595f, 72.087494f, 84.00727f, 81.416756f, 84.0f, 92.0f),
                    PathNode.LineTo(84.0f, 116.0f),
                    PathNode.LineTo(68.0f, 116.0f),
                    PathNode.CurveTo(54.745167f, 116.0f, 44.0f, 126.74516f, 44.0f, 140.0f),
                    PathNode.LineTo(44.0f, 152.0f),
                    PathNode.CurveTo(44.0f, 198.39192f, 81.60808f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(174.39192f, 236.0f, 212.0f, 198.39192f, 212.0f, 152.0f),
                    PathNode.LineTo(212.0f, 108.0f),
                    PathNode.CurveTo(212.0f, 94.74516f, 201.25484f, 84.0f, 188.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 152.0f),
                    PathNode.CurveTo(204.0f, 193.97365f, 169.97365f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(86.02636f, 228.0f, 52.0f, 193.97365f, 52.0f, 152.0f),
                    PathNode.LineTo(52.0f, 140.0f),
                    PathNode.CurveTo(52.0f, 131.16344f, 59.163445f, 124.0f, 68.0f, 124.0f),
                    PathNode.LineTo(84.0f, 124.0f),
                    PathNode.LineTo(84.0f, 152.0f),
                    PathNode.CurveTo(84.0f, 154.20914f, 85.79086f, 156.0f, 88.0f, 156.0f),
                    PathNode.CurveTo(90.20914f, 156.0f, 92.0f, 154.20914f, 92.0f, 152.0f),
                    PathNode.LineTo(92.0f, 92.0f),
                    PathNode.CurveTo(92.0f, 83.163445f, 99.163445f, 76.0f, 108.0f, 76.0f),
                    PathNode.CurveTo(116.836555f, 76.0f, 124.0f, 83.163445f, 124.0f, 92.0f),
                    PathNode.LineTo(124.0f, 120.0f),
                    PathNode.CurveTo(124.0f, 122.20914f, 125.79086f, 124.0f, 128.0f, 124.0f),
                    PathNode.CurveTo(130.20914f, 124.0f, 132.0f, 122.20914f, 132.0f, 120.0f),
                    PathNode.LineTo(132.0f, 92.0f),
                    PathNode.CurveTo(132.0f, 83.163445f, 139.16344f, 76.0f, 148.0f, 76.0f),
                    PathNode.CurveTo(156.83656f, 76.0f, 164.0f, 83.163445f, 164.0f, 92.0f),
                    PathNode.LineTo(164.0f, 120.0f),
                    PathNode.CurveTo(164.0f, 122.20914f, 165.79086f, 124.0f, 168.0f, 124.0f),
                    PathNode.CurveTo(170.20914f, 124.0f, 172.0f, 122.20914f, 172.0f, 120.0f),
                    PathNode.LineTo(172.0f, 108.0f),
                    PathNode.CurveTo(172.0f, 99.163445f, 179.16344f, 92.0f, 188.0f, 92.0f),
                    PathNode.CurveTo(196.83656f, 92.0f, 204.0f, 99.163445f, 204.0f, 108.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _handGrabbing!!
    }

private var _handGrabbing: ImageVector? = null
