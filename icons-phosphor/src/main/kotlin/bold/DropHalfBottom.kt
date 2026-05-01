package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DropHalfBottom: ImageVector
    get() {
        if (_dropHalfBottom != null) return _dropHalfBottom!!
        _dropHalfBottom = phosphorBoldIcon(
            name = "DropHalfBottom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(134.88f, 6.17f),
                    PathNode.CurveTo(130.74884f, 3.279156f, 125.25116f, 3.279156f, 121.12f, 6.17f),
                    PathNode.CurveTo(105.65732f, 17.565681f, 91.51032f, 30.646122f, 78.94f, 45.17f),
                    PathNode.CurveTo(50.85f, 77.43f, 36.0f, 111.63f, 36.0f, 144.0f),
                    PathNode.CurveTo(36.0f, 194.8102f, 77.18981f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(178.8102f, 236.0f, 220.0f, 194.8102f, 220.0f, 144.0f),
                    PathNode.CurveTo(220.0f, 66.64f, 138.36f, 8.6f, 134.88f, 6.17f),
                    PathNode.Close,
                    PathNode.MoveTo(191.61f, 168.0f),
                    PathNode.LineTo(64.39f, 168.0f),
                    PathNode.CurveTo(62.437965f, 162.84703f, 61.1281f, 157.47324f, 60.49f, 152.0f),
                    PathNode.LineTo(195.49f, 152.0f),
                    PathNode.CurveTo(194.85835f, 157.47238f, 193.5552f, 162.84616f, 191.61f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.7f, 61.29f),
                    PathNode.CurveTo(106.23466f, 50.337807f, 116.707794f, 40.23942f, 128.0f, 31.11f),
                    PathNode.CurveTo(139.2922f, 40.23942f, 149.76535f, 50.337807f, 159.3f, 61.29f),
                    PathNode.CurveTo(173.3f, 77.48f, 189.57f, 101.18f, 194.5f, 128.0f),
                    PathNode.LineTo(61.5f, 128.0f),
                    PathNode.CurveTo(66.43f, 101.18f, 82.69f, 77.48f, 96.7f, 61.29f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(109.93573f, 212.01201f, 92.614006f, 204.81262f, 79.88f, 192.0f),
                    PathNode.LineTo(176.12f, 192.0f),
                    PathNode.CurveTo(163.386f, 204.81262f, 146.06427f, 212.01201f, 128.0f, 212.0f),
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
        return _dropHalfBottom!!
    }

private var _dropHalfBottom: ImageVector? = null
