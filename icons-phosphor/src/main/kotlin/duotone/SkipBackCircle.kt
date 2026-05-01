package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SkipBackCircle: ImageVector
    get() {
        if (_skipBackCircle != null) return _skipBackCircle!!
        _skipBackCircle = phosphorDuotoneIcon(
            name = "SkipBackCircle",
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
                    PathNode.MoveTo(160.0f, 168.0f),
                    PathNode.LineTo(96.0f, 128.0f),
                    PathNode.LineTo(160.0f, 88.0f),
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
                    PathNode.MoveTo(163.88f, 81.0f),
                    PathNode.CurveTo(161.33466f, 79.59154f, 158.22536f, 79.67578f, 155.76f, 81.22f),
                    PathNode.LineTo(104.0f, 113.57f),
                    PathNode.LineTo(104.0f, 88.0f),
                    PathNode.CurveTo(104.0f, 83.58172f, 100.41828f, 80.0f, 96.0f, 80.0f),
                    PathNode.CurveTo(91.58172f, 80.0f, 88.0f, 83.58172f, 88.0f, 88.0f),
                    PathNode.LineTo(88.0f, 168.0f),
                    PathNode.CurveTo(88.0f, 172.41827f, 91.58172f, 176.0f, 96.0f, 176.0f),
                    PathNode.CurveTo(100.41828f, 176.0f, 104.0f, 172.41827f, 104.0f, 168.0f),
                    PathNode.LineTo(104.0f, 142.43f),
                    PathNode.LineTo(155.76f, 174.78f),
                    PathNode.CurveTo(158.22554f, 176.32097f, 161.33304f, 176.40295f, 163.8764f, 174.99413f),
                    PathNode.CurveTo(166.41977f, 173.5853f, 167.99855f, 170.90749f, 168.0f, 168.0f),
                    PathNode.LineTo(168.0f, 88.0f),
                    PathNode.CurveTo(168.00142f, 85.09116f, 166.42381f, 82.41078f, 163.88f, 81.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 153.57f),
                    PathNode.LineTo(111.09f, 128.0f),
                    PathNode.LineTo(152.0f, 102.43f),
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
        return _skipBackCircle!!
    }

private var _skipBackCircle: ImageVector? = null
