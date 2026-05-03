package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CodesandboxLogo: ImageVector
    get() {
        if (_codesandboxLogo != null) return _codesandboxLogo!!
        _codesandboxLogo = phosphorBoldIcon(
            name = "CodesandboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.6f, 62.65f),
                    PathNode.LineTo(137.6f, 14.47f),
                    PathNode.CurveTo(131.62274f, 11.180279f, 124.37726f, 11.180279f, 118.4f, 14.47f),
                    PathNode.LineTo(30.4f, 62.64f),
                    PathNode.CurveTo(23.986143f, 66.14936f, 19.998308f, 72.87883f, 20.0f, 80.19f),
                    PathNode.LineTo(20.0f, 175.81f),
                    PathNode.CurveTo(19.998308f, 183.12117f, 23.986143f, 189.85065f, 30.4f, 193.36f),
                    PathNode.LineTo(118.4f, 241.53f),
                    PathNode.CurveTo(124.37628f, 244.8235f, 131.62372f, 244.8235f, 137.6f, 241.53f),
                    PathNode.LineTo(225.6f, 193.35f),
                    PathNode.CurveTo(232.0107f, 189.84236f, 235.99803f, 183.11758f, 236.0f, 175.81f),
                    PathNode.LineTo(236.0f, 80.19f),
                    PathNode.CurveTo(235.99803f, 72.882416f, 232.0107f, 66.15764f, 225.6f, 62.65f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 152.0f),
                    PathNode.LineTo(164.0f, 199.72f),
                    PathNode.LineTo(140.0f, 212.86f),
                    PathNode.LineTo(140.0f, 135.11f),
                    PathNode.LineTo(212.0f, 95.69f),
                    PathNode.LineTo(212.0f, 118.61f),
                    PathNode.LineTo(170.24f, 141.47f),
                    PathNode.CurveTo(166.3917f, 143.57562f, 163.99898f, 147.6133f, 164.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(85.76f, 141.47f),
                    PathNode.LineTo(44.0f, 118.61f),
                    PathNode.LineTo(44.0f, 95.69f),
                    PathNode.LineTo(116.0f, 135.11f),
                    PathNode.LineTo(116.0f, 212.86f),
                    PathNode.LineTo(92.0f, 199.72f),
                    PathNode.LineTo(92.0f, 152.0f),
                    PathNode.CurveTo(92.001015f, 147.6133f, 89.608315f, 143.57562f, 85.76f, 141.47f),
                    PathNode.Close,
                    PathNode.MoveTo(83.14f, 61.13f),
                    PathNode.LineTo(122.24f, 82.53f),
                    PathNode.CurveTo(125.826546f, 84.50308f, 130.17345f, 84.50308f, 133.76f, 82.53f),
                    PathNode.LineTo(172.86f, 61.13f),
                    PathNode.LineTo(199.0f, 75.45f),
                    PathNode.LineTo(128.0f, 114.32f),
                    PathNode.LineTo(57.0f, 75.45f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 36.57f),
                    PathNode.LineTo(147.87f, 47.45f),
                    PathNode.LineTo(128.0f, 58.33f),
                    PathNode.LineTo(108.13f, 47.45f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 146.0f),
                    PathNode.LineTo(68.0f, 159.14f),
                    PathNode.LineTo(68.0f, 186.61f),
                    PathNode.LineTo(44.0f, 173.44f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 186.61f),
                    PathNode.LineTo(188.0f, 159.11f),
                    PathNode.LineTo(212.0f, 146.0f),
                    PathNode.LineTo(212.0f, 173.47f),
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
        return _codesandboxLogo!!
    }

private var _codesandboxLogo: ImageVector? = null
