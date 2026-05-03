package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Keyhole: ImageVector
    get() {
        if (_keyhole != null) return _keyhole!!
        _keyhole = phosphorRegularIcon(
            name = "Keyhole",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.CurveTo(215.94489f, 176.57822f, 176.57822f, 215.94489f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 112.0f),
                    PathNode.CurveTo(168.00397f, 93.49834f, 155.31886f, 77.4083f, 137.32722f, 73.09408f),
                    PathNode.CurveTo(119.335594f, 68.77985f, 100.733025f, 77.367386f, 92.34596f, 93.85886f),
                    PathNode.CurveTo(83.9589f, 110.35033f, 87.976265f, 130.44167f, 102.06f, 142.44f),
                    PathNode.LineTo(88.68f, 172.77f),
                    PathNode.CurveTo(87.58804f, 175.2443f, 87.82015f, 178.1028f, 89.297005f, 180.3685f),
                    PathNode.CurveTo(90.77385f, 182.63423f, 93.29546f, 184.00035f, 96.0f, 184.0f),
                    PathNode.LineTo(160.0f, 184.0f),
                    PathNode.CurveTo(162.70454f, 184.00035f, 165.22615f, 182.63423f, 166.703f, 180.3685f),
                    PathNode.CurveTo(168.17984f, 178.1028f, 168.41196f, 175.2443f, 167.32f, 172.77f),
                    PathNode.LineTo(153.94f, 142.44f),
                    PathNode.CurveTo(162.8431f, 134.83044f, 167.97864f, 123.71196f, 168.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.68f, 143.0f),
                    PathNode.LineTo(147.68f, 168.05f),
                    PathNode.LineTo(108.27f, 168.05f),
                    PathNode.LineTo(119.27f, 143.0f),
                    PathNode.CurveTo(120.9589f, 139.26164f, 119.54648f, 134.85162f, 116.0f, 132.79f),
                    PathNode.CurveTo(106.592766f, 127.358734f, 102.00635f, 116.28614f, 104.81778f, 105.79373f),
                    PathNode.CurveTo(107.62921f, 95.30133f, 117.13747f, 88.005394f, 128.0f, 88.005394f),
                    PathNode.CurveTo(138.86253f, 88.005394f, 148.37079f, 95.30133f, 151.18222f, 105.79373f),
                    PathNode.CurveTo(153.99365f, 116.28614f, 149.40723f, 127.358734f, 140.0f, 132.79f),
                    PathNode.CurveTo(136.43489f, 134.83519f, 134.99962f, 139.24913f, 136.68f, 143.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
