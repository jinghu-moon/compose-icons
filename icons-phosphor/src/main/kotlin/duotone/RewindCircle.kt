package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.RewindCircle: ImageVector
    get() {
        if (_rewindCircle != null) return _rewindCircle!!
        _rewindCircle = phosphorDuotoneIcon(
            name = "RewindCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 32.0f),
                    PathNode.CurveTo(74.98067f, 32.0f, 32.0f, 74.98067f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 181.01933f, 74.98067f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(181.01933f, 224.0f, 224.0f, 181.01933f, 224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 74.98067f, 181.01933f, 32.0f, 128.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 164.0f),
                    PathNode.LineTo(64.0f, 128.0f),
                    PathNode.LineTo(112.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 164.0f),
                    PathNode.LineTo(128.0f, 128.0f),
                    PathNode.LineTo(176.0f, 92.0f),
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
                    PathNode.MoveTo(115.58f, 84.84f),
                    PathNode.CurveTo(112.86827f, 83.48522f, 109.62375f, 83.77947f, 107.2f, 85.6f),
                    PathNode.LineTo(59.2f, 121.6f),
                    PathNode.CurveTo(57.185555f, 123.11083f, 56.0f, 125.48194f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 130.51805f, 57.185555f, 132.88916f, 59.2f, 134.4f),
                    PathNode.LineTo(107.2f, 170.4f),
                    PathNode.CurveTo(108.58477f, 171.43858f, 110.269035f, 172.0f, 112.0f, 172.0f),
                    PathNode.CurveTo(116.41828f, 172.0f, 120.0f, 168.41827f, 120.0f, 164.0f),
                    PathNode.LineTo(120.0f, 92.0f),
                    PathNode.CurveTo(120.00217f, 88.96868f, 118.290855f, 86.19651f, 115.58f, 84.84f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 148.0f),
                    PathNode.LineTo(77.33f, 128.0f),
                    PathNode.LineTo(104.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(179.58f, 84.84f),
                    PathNode.CurveTo(176.86827f, 83.48522f, 173.62375f, 83.77947f, 171.2f, 85.6f),
                    PathNode.LineTo(123.2f, 121.6f),
                    PathNode.CurveTo(121.185555f, 123.11083f, 120.0f, 125.48194f, 120.0f, 128.0f),
                    PathNode.CurveTo(120.0f, 130.51805f, 121.185555f, 132.88916f, 123.2f, 134.4f),
                    PathNode.LineTo(171.2f, 170.4f),
                    PathNode.CurveTo(172.58476f, 171.43858f, 174.26904f, 172.0f, 176.0f, 172.0f),
                    PathNode.CurveTo(180.41827f, 172.0f, 184.0f, 168.41827f, 184.0f, 164.0f),
                    PathNode.LineTo(184.0f, 92.0f),
                    PathNode.CurveTo(184.00217f, 88.96868f, 182.29086f, 86.19651f, 179.58f, 84.84f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 148.0f),
                    PathNode.LineTo(141.33f, 128.0f),
                    PathNode.LineTo(168.0f, 108.0f),
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
        return _rewindCircle!!
    }

private var _rewindCircle: ImageVector? = null
