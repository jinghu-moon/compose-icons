package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.RewindCircle: ImageVector
    get() {
        if (_rewindCircle != null) return _rewindCircle!!
        _rewindCircle = phosphorFillIcon(
            name = "RewindCircle",
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
                    PathNode.MoveTo(184.0f, 164.0f),
                    PathNode.CurveTo(184.0f, 167.03018f, 182.28798f, 169.80028f, 179.57771f, 171.15541f),
                    PathNode.CurveTo(176.86742f, 172.51056f, 173.62415f, 172.21811f, 171.2f, 170.4f),
                    PathNode.LineTo(123.2f, 134.4f),
                    PathNode.CurveTo(121.185555f, 132.88916f, 120.0f, 130.51805f, 120.0f, 128.0f),
                    PathNode.LineTo(120.0f, 164.0f),
                    PathNode.CurveTo(120.0f, 167.03018f, 118.28798f, 169.80028f, 115.577705f, 171.15541f),
                    PathNode.CurveTo(112.86744f, 172.51056f, 109.62414f, 172.21811f, 107.2f, 170.4f),
                    PathNode.LineTo(59.2f, 134.4f),
                    PathNode.CurveTo(57.185555f, 132.88916f, 56.0f, 130.51805f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 125.48194f, 57.185555f, 123.11083f, 59.2f, 121.6f),
                    PathNode.LineTo(107.2f, 85.6f),
                    PathNode.CurveTo(109.62414f, 83.78189f, 112.86744f, 83.48945f, 115.577705f, 84.84458f),
                    PathNode.CurveTo(118.28798f, 86.19972f, 120.0f, 88.969826f, 120.0f, 92.0f),
                    PathNode.LineTo(120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 125.48194f, 121.185555f, 123.11083f, 123.2f, 121.6f),
                    PathNode.LineTo(171.2f, 85.6f),
                    PathNode.CurveTo(173.62415f, 83.78189f, 176.86742f, 83.48945f, 179.57771f, 84.84458f),
                    PathNode.CurveTo(182.28798f, 86.19972f, 184.0f, 88.969826f, 184.0f, 92.0f),
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
        return _rewindCircle!!
    }

private var _rewindCircle: ImageVector? = null
