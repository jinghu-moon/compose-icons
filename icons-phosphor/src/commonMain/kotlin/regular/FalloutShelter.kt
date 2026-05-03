package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FalloutShelter: ImageVector
    get() {
        if (_falloutShelter != null) return _falloutShelter!!
        _falloutShelter = phosphorRegularIcon(
            name = "FalloutShelter",
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
                    PathNode.MoveTo(199.05f, 124.23f),
                    PathNode.CurveTo(197.65973f, 121.62793f, 194.9502f, 120.00221f, 192.0f, 120.0f),
                    PathNode.LineTo(143.0f, 120.0f),
                    PathNode.LineTo(166.71f, 84.44f),
                    PathNode.CurveTo(168.35335f, 81.977066f, 168.50198f, 78.807884f, 167.09636f, 76.20195f),
                    PathNode.CurveTo(165.69075f, 73.596016f, 162.96078f, 71.97952f, 160.0f, 72.0f),
                    PathNode.LineTo(96.0f, 72.0f),
                    PathNode.CurveTo(93.04819f, 71.998085f, 90.33517f, 73.62178f, 88.94194f, 76.22411f),
                    PathNode.CurveTo(87.54874f, 78.826454f, 87.701744f, 81.984535f, 89.34f, 84.44f),
                    PathNode.LineTo(113.05f, 120.0f),
                    PathNode.LineTo(64.0f, 120.0f),
                    PathNode.CurveTo(61.048187f, 119.998085f, 58.335163f, 121.62178f, 56.94195f, 124.22411f),
                    PathNode.CurveTo(55.548737f, 126.826454f, 55.701744f, 129.98453f, 57.34f, 132.44f),
                    PathNode.LineTo(89.34f, 180.44f),
                    PathNode.CurveTo(90.8232f, 182.6687f, 93.32287f, 184.0078f, 96.0f, 184.0078f),
                    PathNode.CurveTo(98.67713f, 184.0078f, 101.1768f, 182.6687f, 102.66f, 180.44f),
                    PathNode.LineTo(128.0f, 142.44f),
                    PathNode.LineTo(153.34f, 180.44f),
                    PathNode.CurveTo(154.8232f, 182.6687f, 157.32288f, 184.0078f, 160.0f, 184.0078f),
                    PathNode.CurveTo(162.67712f, 184.0078f, 165.1768f, 182.6687f, 166.66f, 180.44f),
                    PathNode.LineTo(198.66f, 132.44f),
                    PathNode.CurveTo(200.29337f, 129.98442f, 200.44324f, 126.829346f, 199.05f, 124.23f),
                    PathNode.Close,
                    PathNode.MoveTo(145.05f, 88.0f),
                    PathNode.LineTo(128.0f, 113.58f),
                    PathNode.LineTo(111.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 161.58f),
                    PathNode.LineTo(79.0f, 136.0f),
                    PathNode.LineTo(113.1f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 161.58f),
                    PathNode.LineTo(143.0f, 136.0f),
                    PathNode.LineTo(177.1f, 136.0f),
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
        return _falloutShelter!!
    }

private var _falloutShelter: ImageVector? = null
