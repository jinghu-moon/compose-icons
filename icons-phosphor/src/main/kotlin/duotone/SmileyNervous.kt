package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SmileyNervous: ImageVector
    get() {
        if (_smileyNervous != null) return _smileyNervous!!
        _smileyNervous = phosphorDuotoneIcon(
            name = "SmileyNervous",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 181.01933f, 181.01933f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(74.98067f, 224.0f, 32.0f, 181.01933f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 74.98067f, 74.98067f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(181.01933f, 32.0f, 224.0f, 74.98067f, 224.0f, 128.0f),
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
                    PathNode.MoveTo(80.0f, 108.0f),
                    PathNode.CurveTo(80.0f, 101.37258f, 85.37258f, 96.0f, 92.0f, 96.0f),
                    PathNode.CurveTo(98.62742f, 96.0f, 104.0f, 101.37258f, 104.0f, 108.0f),
                    PathNode.CurveTo(104.0f, 114.62742f, 98.62742f, 120.0f, 92.0f, 120.0f),
                    PathNode.CurveTo(85.37258f, 120.0f, 80.0f, 114.62742f, 80.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 108.0f),
                    PathNode.CurveTo(152.0f, 101.37258f, 157.37259f, 96.0f, 164.0f, 96.0f),
                    PathNode.CurveTo(170.62741f, 96.0f, 176.0f, 101.37258f, 176.0f, 108.0f),
                    PathNode.CurveTo(176.0f, 114.62742f, 170.62741f, 120.0f, 164.0f, 120.0f),
                    PathNode.CurveTo(157.37259f, 120.0f, 152.0f, 114.62742f, 152.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 168.0f),
                    PathNode.CurveTo(184.0f, 172.41827f, 180.41827f, 176.0f, 176.0f, 176.0f),
                    PathNode.CurveTo(166.0f, 176.0f, 160.95f, 169.26f, 157.6f, 164.8f),
                    PathNode.CurveTo(154.6f, 160.8f, 153.68f, 160.0f, 152.0f, 160.0f),
                    PathNode.CurveTo(150.32f, 160.0f, 149.43f, 160.76f, 146.4f, 164.8f),
                    PathNode.CurveTo(143.05f, 169.26f, 138.0f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(118.0f, 176.0f, 113.0f, 169.26f, 109.6f, 164.8f),
                    PathNode.CurveTo(106.6f, 160.8f, 105.68f, 160.0f, 104.0f, 160.0f),
                    PathNode.CurveTo(102.32f, 160.0f, 101.43f, 160.76f, 98.4f, 164.8f),
                    PathNode.CurveTo(95.05f, 169.26f, 90.0f, 176.0f, 80.0f, 176.0f),
                    PathNode.CurveTo(75.58172f, 176.0f, 72.0f, 172.41827f, 72.0f, 168.0f),
                    PathNode.CurveTo(72.0f, 163.58173f, 75.58172f, 160.0f, 80.0f, 160.0f),
                    PathNode.CurveTo(81.68f, 160.0f, 82.57f, 159.24f, 85.6f, 155.2f),
                    PathNode.CurveTo(89.0f, 150.74f, 94.0f, 144.0f, 104.0f, 144.0f),
                    PathNode.CurveTo(114.0f, 144.0f, 119.0f, 150.74f, 122.4f, 155.2f),
                    PathNode.CurveTo(125.4f, 159.2f, 126.32f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(129.68f, 160.0f, 130.57f, 159.24f, 133.6f, 155.2f),
                    PathNode.CurveTo(137.0f, 150.74f, 142.0f, 144.0f, 152.0f, 144.0f),
                    PathNode.CurveTo(162.0f, 144.0f, 167.05f, 150.74f, 170.4f, 155.2f),
                    PathNode.CurveTo(173.4f, 159.2f, 174.32f, 160.0f, 176.0f, 160.0f),
                    PathNode.CurveTo(180.41827f, 160.0f, 184.0f, 163.58173f, 184.0f, 168.0f),
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
        return _smileyNervous!!
    }

private var _smileyNervous: ImageVector? = null
