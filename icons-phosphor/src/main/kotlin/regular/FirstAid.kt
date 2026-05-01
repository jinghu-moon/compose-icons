package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FirstAid: ImageVector
    get() {
        if (_firstAid != null) return _firstAid!!
        _firstAid = phosphorRegularIcon(
            name = "FirstAid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 88.0f),
                    PathNode.LineTo(168.0f, 88.0f),
                    PathNode.LineTo(168.0f, 40.0f),
                    PathNode.CurveTo(168.0f, 31.163445f, 160.83656f, 24.0f, 152.0f, 24.0f),
                    PathNode.LineTo(104.0f, 24.0f),
                    PathNode.CurveTo(95.163445f, 24.0f, 88.0f, 31.163445f, 88.0f, 40.0f),
                    PathNode.LineTo(88.0f, 88.0f),
                    PathNode.LineTo(40.0f, 88.0f),
                    PathNode.CurveTo(31.163445f, 88.0f, 24.0f, 95.163445f, 24.0f, 104.0f),
                    PathNode.LineTo(24.0f, 152.0f),
                    PathNode.CurveTo(24.0f, 160.83656f, 31.163445f, 168.0f, 40.0f, 168.0f),
                    PathNode.LineTo(88.0f, 168.0f),
                    PathNode.LineTo(88.0f, 216.0f),
                    PathNode.CurveTo(88.0f, 224.83656f, 95.163445f, 232.0f, 104.0f, 232.0f),
                    PathNode.LineTo(152.0f, 232.0f),
                    PathNode.CurveTo(160.83656f, 232.0f, 168.0f, 224.83656f, 168.0f, 216.0f),
                    PathNode.LineTo(168.0f, 168.0f),
                    PathNode.LineTo(216.0f, 168.0f),
                    PathNode.CurveTo(224.83656f, 168.0f, 232.0f, 160.83656f, 232.0f, 152.0f),
                    PathNode.LineTo(232.0f, 104.0f),
                    PathNode.CurveTo(232.0f, 95.163445f, 224.83656f, 88.0f, 216.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 152.0f),
                    PathNode.LineTo(160.0f, 152.0f),
                    PathNode.CurveTo(155.58173f, 152.0f, 152.0f, 155.58173f, 152.0f, 160.0f),
                    PathNode.LineTo(152.0f, 216.0f),
                    PathNode.LineTo(104.0f, 216.0f),
                    PathNode.LineTo(104.0f, 160.0f),
                    PathNode.CurveTo(104.0f, 155.58173f, 100.41828f, 152.0f, 96.0f, 152.0f),
                    PathNode.LineTo(40.0f, 152.0f),
                    PathNode.LineTo(40.0f, 104.0f),
                    PathNode.LineTo(96.0f, 104.0f),
                    PathNode.CurveTo(100.41828f, 104.0f, 104.0f, 100.41828f, 104.0f, 96.0f),
                    PathNode.LineTo(104.0f, 40.0f),
                    PathNode.LineTo(152.0f, 40.0f),
                    PathNode.LineTo(152.0f, 96.0f),
                    PathNode.CurveTo(152.0f, 100.41828f, 155.58173f, 104.0f, 160.0f, 104.0f),
                    PathNode.LineTo(216.0f, 104.0f),
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
        return _firstAid!!
    }

private var _firstAid: ImageVector? = null
