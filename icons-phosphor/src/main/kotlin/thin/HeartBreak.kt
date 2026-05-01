package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) return _heartBreak!!
        _heartBreak = phosphorThinIcon(
            name = "HeartBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(178.0f, 44.0f),
                    PathNode.CurveTo(162.6109f, 43.96107f, 147.84637f, 50.08295f, 137.0f, 61.0f),
                    PathNode.LineTo(128.0f, 70.0f),
                    PathNode.LineTo(119.0f, 61.0f),
                    PathNode.CurveTo(102.412544f, 44.422398f, 77.47433f, 39.46493f, 55.807655f, 48.438f),
                    PathNode.CurveTo(34.140984f, 57.411064f, 20.009857f, 78.54877f, 20.0f, 102.0f),
                    PathNode.CurveTo(20.0f, 130.59f, 38.0f, 160.47f, 73.4f, 190.79f),
                    PathNode.CurveTo(89.745056f, 204.69902f, 107.39342f, 216.9993f, 126.1f, 227.52f),
                    PathNode.CurveTo(127.285805f, 228.16008f, 128.71419f, 228.16008f, 129.9f, 227.52f),
                    PathNode.CurveTo(148.60658f, 216.9993f, 166.25494f, 204.69902f, 182.6f, 190.79f),
                    PathNode.CurveTo(218.0f, 160.47f, 236.0f, 130.59f, 236.0f, 102.0f),
                    PathNode.CurveTo(235.96143f, 69.983475f, 210.01653f, 44.03857f, 178.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 219.42f),
                    PathNode.CurveTo(114.0f, 211.42f, 28.0f, 160.07f, 28.0f, 102.0f),
                    PathNode.CurveTo(27.99623f, 81.773994f, 40.178383f, 63.53789f, 58.864567f, 55.797222f),
                    PathNode.CurveTo(77.55075f, 48.056553f, 99.05994f, 52.336166f, 113.36f, 66.64f),
                    PathNode.LineTo(122.36f, 75.64f),
                    PathNode.LineTo(109.17f, 88.8f),
                    PathNode.CurveTo(108.418884f, 89.55027f, 107.99686f, 90.56836f, 107.99686f, 91.63f),
                    PathNode.CurveTo(107.99686f, 92.691635f, 108.418884f, 93.709724f, 109.17f, 94.46f),
                    PathNode.LineTo(136.53f, 121.82f),
                    PathNode.LineTo(117.17f, 141.17f),
                    PathNode.CurveTo(115.60703f, 142.73297f, 115.60703f, 145.26703f, 117.17f, 146.83f),
                    PathNode.CurveTo(118.73296f, 148.39296f, 121.26704f, 148.39296f, 122.83f, 146.83f),
                    PathNode.LineTo(145.0f, 124.64f),
                    PathNode.CurveTo(146.55753f, 123.07869f, 146.55753f, 120.55131f, 145.0f, 118.99f),
                    PathNode.LineTo(117.66f, 91.63f),
                    PathNode.LineTo(130.82f, 78.47f),
                    PathNode.LineTo(130.82f, 78.47f),
                    PathNode.LineTo(142.62f, 66.66f),
                    PathNode.CurveTo(156.9156f, 52.34443f, 178.42923f, 48.05444f, 197.12238f, 55.791798f),
                    PathNode.CurveTo(215.8155f, 63.529152f, 228.0038f, 81.76884f, 228.0f, 102.0f),
                    PathNode.CurveTo(228.0f, 160.0f, 142.0f, 211.46f, 128.0f, 219.42f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
