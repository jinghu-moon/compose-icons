package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ThreeD: ImageVector
    get() {
        if (_threeD != null) return _threeD!!
        _threeD = phosphorRegularIcon(
            name = "ThreeD",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(96.0f, 148.0f),
                    PathNode.CurveTo(96.0f, 136.9543f, 87.04569f, 128.0f, 76.0f, 128.0f),
                    PathNode.CurveTo(73.01689f, 127.99916f, 70.28204f, 126.33863f, 68.90525f, 123.692245f),
                    PathNode.CurveTo(67.52846f, 121.04585f, 67.73844f, 117.85326f, 69.45f, 115.41f),
                    PathNode.LineTo(88.63f, 88.0f),
                    PathNode.LineTo(56.0f, 88.0f),
                    PathNode.CurveTo(51.581722f, 88.0f, 48.0f, 84.41828f, 48.0f, 80.0f),
                    PathNode.CurveTo(48.0f, 75.58172f, 51.581722f, 72.0f, 56.0f, 72.0f),
                    PathNode.LineTo(104.0f, 72.0f),
                    PathNode.CurveTo(106.98311f, 72.00084f, 109.71796f, 73.66137f, 111.09475f, 76.307755f),
                    PathNode.CurveTo(112.47154f, 78.95415f, 112.26156f, 82.14674f, 110.55f, 84.59f),
                    PathNode.LineTo(89.55f, 114.59f),
                    PathNode.CurveTo(105.58377f, 121.024185f, 114.786026f, 137.94138f, 111.47583f, 154.89789f),
                    PathNode.CurveTo(108.165634f, 171.8544f, 93.27646f, 184.06853f, 76.0f, 184.0f),
                    PathNode.CurveTo(66.31899f, 184.03065f, 57.040394f, 180.12938f, 50.29f, 173.19f),
                    PathNode.CurveTo(48.161205f, 171.17609f, 47.30389f, 168.15942f, 48.05538f, 165.32697f),
                    PathNode.CurveTo(48.806873f, 162.4945f, 51.046886f, 160.2996f, 53.894054f, 159.60588f),
                    PathNode.CurveTo(56.74122f, 158.91217f, 59.739815f, 159.83067f, 61.71f, 162.0f),
                    PathNode.CurveTo(67.39723f, 167.80806f, 76.034065f, 169.59612f, 83.55983f, 166.52347f),
                    PathNode.CurveTo(91.085594f, 163.45084f, 96.00296f, 156.12885f, 96.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 72.0f),
                    PathNode.CurveTo(190.92795f, 72.0f, 216.0f, 97.07206f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 158.92795f, 190.92795f, 184.0f, 160.0f, 184.0f),
                    PathNode.LineTo(136.0f, 184.0f),
                    PathNode.CurveTo(131.58173f, 184.0f, 128.0f, 180.41827f, 128.0f, 176.0f),
                    PathNode.LineTo(128.0f, 80.0f),
                    PathNode.CurveTo(128.0f, 75.58172f, 131.58173f, 72.0f, 136.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 88.0f),
                    PathNode.LineTo(144.0f, 88.0f),
                    PathNode.LineTo(144.0f, 168.0f),
                    PathNode.LineTo(160.0f, 168.0f),
                    PathNode.CurveTo(182.09138f, 168.0f, 200.0f, 150.09138f, 200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 105.90861f, 182.09138f, 88.0f, 160.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 56.0f),
                    PathNode.LineTo(224.0f, 56.0f),
                    PathNode.CurveTo(228.41827f, 56.0f, 232.0f, 52.418278f, 232.0f, 48.0f),
                    PathNode.CurveTo(232.0f, 43.581722f, 228.41827f, 40.0f, 224.0f, 40.0f),
                    PathNode.LineTo(32.0f, 40.0f),
                    PathNode.CurveTo(27.581722f, 40.0f, 24.0f, 43.581722f, 24.0f, 48.0f),
                    PathNode.CurveTo(24.0f, 52.418278f, 27.581722f, 56.0f, 32.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(27.581722f, 200.0f, 24.0f, 203.58173f, 24.0f, 208.0f),
                    PathNode.CurveTo(24.0f, 212.41827f, 27.581722f, 216.0f, 32.0f, 216.0f),
                    PathNode.LineTo(224.0f, 216.0f),
                    PathNode.CurveTo(228.41827f, 216.0f, 232.0f, 212.41827f, 232.0f, 208.0f),
                    PathNode.CurveTo(232.0f, 203.58173f, 228.41827f, 200.0f, 224.0f, 200.0f),
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
        return _threeD!!
    }

private var _threeD: ImageVector? = null
