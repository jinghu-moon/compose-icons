package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LetterCircleP: ImageVector
    get() {
        if (_letterCircleP != null) return _letterCircleP!!
        _letterCircleP = phosphorRegularIcon(
            name = "LetterCircleP",
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
                    PathNode.MoveTo(136.0f, 80.0f),
                    PathNode.LineTo(104.0f, 80.0f),
                    PathNode.CurveTo(99.58172f, 80.0f, 96.0f, 83.58172f, 96.0f, 88.0f),
                    PathNode.LineTo(96.0f, 168.0f),
                    PathNode.CurveTo(96.0f, 172.41827f, 99.58172f, 176.0f, 104.0f, 176.0f),
                    PathNode.CurveTo(108.41828f, 176.0f, 112.0f, 172.41827f, 112.0f, 168.0f),
                    PathNode.LineTo(112.0f, 152.0f),
                    PathNode.LineTo(136.0f, 152.0f),
                    PathNode.CurveTo(155.88223f, 152.0f, 172.0f, 135.88223f, 172.0f, 116.0f),
                    PathNode.CurveTo(172.0f, 96.11775f, 155.88223f, 80.0f, 136.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 136.0f),
                    PathNode.LineTo(112.0f, 136.0f),
                    PathNode.LineTo(112.0f, 96.0f),
                    PathNode.LineTo(136.0f, 96.0f),
                    PathNode.CurveTo(147.0457f, 96.0f, 156.0f, 104.95431f, 156.0f, 116.0f),
                    PathNode.CurveTo(156.0f, 127.04569f, 147.0457f, 136.0f, 136.0f, 136.0f),
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
        return _letterCircleP!!
    }

private var _letterCircleP: ImageVector? = null
