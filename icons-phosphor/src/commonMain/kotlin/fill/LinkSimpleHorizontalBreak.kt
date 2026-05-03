package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LinkSimpleHorizontalBreak: ImageVector
    get() {
        if (_linkSimpleHorizontalBreak != null) return _linkSimpleHorizontalBreak!!
        _linkSimpleHorizontalBreak = phosphorFillIcon(
            name = "LinkSimpleHorizontalBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(23.163445f, 48.0f, 16.0f, 55.163445f, 16.0f, 64.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 200.83656f, 23.163445f, 208.0f, 32.0f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(232.83656f, 208.0f, 240.0f, 200.83656f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 64.0f),
                    PathNode.CurveTo(240.0f, 55.163445f, 232.83656f, 48.0f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 168.0f),
                    PathNode.LineTo(80.0f, 168.0f),
                    PathNode.CurveTo(57.90861f, 168.0f, 40.0f, 150.09138f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 105.90861f, 57.90861f, 88.0f, 80.0f, 88.0f),
                    PathNode.LineTo(112.0f, 88.0f),
                    PathNode.CurveTo(116.41828f, 88.0f, 120.0f, 91.58172f, 120.0f, 96.0f),
                    PathNode.CurveTo(120.0f, 100.41828f, 116.41828f, 104.0f, 112.0f, 104.0f),
                    PathNode.LineTo(80.0f, 104.0f),
                    PathNode.CurveTo(66.74516f, 104.0f, 56.0f, 114.74516f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.0f, 141.25484f, 66.74516f, 152.0f, 80.0f, 152.0f),
                    PathNode.LineTo(112.0f, 152.0f),
                    PathNode.CurveTo(116.41828f, 152.0f, 120.0f, 155.58173f, 120.0f, 160.0f),
                    PathNode.CurveTo(120.0f, 164.41827f, 116.41828f, 168.0f, 112.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 168.0f),
                    PathNode.LineTo(144.0f, 168.0f),
                    PathNode.CurveTo(139.58173f, 168.0f, 136.0f, 164.41827f, 136.0f, 160.0f),
                    PathNode.CurveTo(136.0f, 155.58173f, 139.58173f, 152.0f, 144.0f, 152.0f),
                    PathNode.LineTo(176.0f, 152.0f),
                    PathNode.CurveTo(189.25484f, 152.0f, 200.0f, 141.25484f, 200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 114.74516f, 189.25484f, 104.0f, 176.0f, 104.0f),
                    PathNode.LineTo(144.0f, 104.0f),
                    PathNode.CurveTo(139.58173f, 104.0f, 136.0f, 100.41828f, 136.0f, 96.0f),
                    PathNode.CurveTo(136.0f, 91.58172f, 139.58173f, 88.0f, 144.0f, 88.0f),
                    PathNode.LineTo(176.0f, 88.0f),
                    PathNode.CurveTo(198.09138f, 88.0f, 216.0f, 105.90861f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 150.09138f, 198.09138f, 168.0f, 176.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _linkSimpleHorizontalBreak!!
    }

private var _linkSimpleHorizontalBreak: ImageVector? = null
