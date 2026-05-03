package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DropSimple: ImageVector
    get() {
        if (_dropSimple != null) return _dropSimple!!
        _dropSimple = phosphorBoldIcon(
            name = "DropSimple",
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
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(90.46063f, 211.96141f, 60.038586f, 181.53935f, 60.0f, 144.0f),
                    PathNode.CurveTo(60.0f, 110.69f, 80.0f, 80.63f, 96.7f, 61.29f),
                    PathNode.CurveTo(106.23466f, 50.337807f, 116.707794f, 40.23942f, 128.0f, 31.11f),
                    PathNode.CurveTo(139.2922f, 40.23942f, 149.76535f, 50.337807f, 159.3f, 61.29f),
                    PathNode.CurveTo(176.0f, 80.63f, 196.0f, 110.69f, 196.0f, 144.0f),
                    PathNode.CurveTo(195.96141f, 181.53935f, 165.53935f, 211.96141f, 128.0f, 212.0f),
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
        return _dropSimple!!
    }

private var _dropSimple: ImageVector? = null
