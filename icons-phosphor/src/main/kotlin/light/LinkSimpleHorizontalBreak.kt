package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LinkSimpleHorizontalBreak: ImageVector
    get() {
        if (_linkSimpleHorizontalBreak != null) return _linkSimpleHorizontalBreak!!
        _linkSimpleHorizontalBreak = phosphorLightIcon(
            name = "LinkSimpleHorizontalBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 128.0f),
                    PathNode.CurveTo(22.0f, 151.19595f, 40.80404f, 170.0f, 64.0f, 170.0f),
                    PathNode.LineTo(104.0f, 170.0f),
                    PathNode.CurveTo(107.313705f, 170.0f, 110.0f, 172.6863f, 110.0f, 176.0f),
                    PathNode.CurveTo(110.0f, 179.3137f, 107.313705f, 182.0f, 104.0f, 182.0f),
                    PathNode.LineTo(64.0f, 182.0f),
                    PathNode.CurveTo(34.176624f, 182.0f, 10.0f, 157.82338f, 10.0f, 128.0f),
                    PathNode.CurveTo(10.0f, 98.17662f, 34.176624f, 74.0f, 64.0f, 74.0f),
                    PathNode.LineTo(104.0f, 74.0f),
                    PathNode.CurveTo(107.313705f, 74.0f, 110.0f, 76.686295f, 110.0f, 80.0f),
                    PathNode.CurveTo(110.0f, 83.313705f, 107.313705f, 86.0f, 104.0f, 86.0f),
                    PathNode.LineTo(64.0f, 86.0f),
                    PathNode.CurveTo(40.80404f, 86.0f, 22.0f, 104.80404f, 22.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 74.0f),
                    PathNode.LineTo(152.0f, 74.0f),
                    PathNode.CurveTo(148.6863f, 74.0f, 146.0f, 76.686295f, 146.0f, 80.0f),
                    PathNode.CurveTo(146.0f, 83.313705f, 148.6863f, 86.0f, 152.0f, 86.0f),
                    PathNode.LineTo(192.0f, 86.0f),
                    PathNode.CurveTo(215.19595f, 86.0f, 234.0f, 104.80404f, 234.0f, 128.0f),
                    PathNode.CurveTo(234.0f, 151.19595f, 215.19595f, 170.0f, 192.0f, 170.0f),
                    PathNode.LineTo(152.0f, 170.0f),
                    PathNode.CurveTo(148.6863f, 170.0f, 146.0f, 172.6863f, 146.0f, 176.0f),
                    PathNode.CurveTo(146.0f, 179.3137f, 148.6863f, 182.0f, 152.0f, 182.0f),
                    PathNode.LineTo(192.0f, 182.0f),
                    PathNode.CurveTo(221.82338f, 182.0f, 246.0f, 157.82338f, 246.0f, 128.0f),
                    PathNode.CurveTo(246.0f, 98.17662f, 221.82338f, 74.0f, 192.0f, 74.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _linkSimpleHorizontalBreak!!
    }

private var _linkSimpleHorizontalBreak: ImageVector? = null
