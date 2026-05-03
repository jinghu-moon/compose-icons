package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Plus: ImageVector
    get() {
        if (_plus != null) return _plus!!
        _plus = phosphorBoldIcon(
            name = "Plus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 134.62741f, 222.62741f, 140.0f, 216.0f, 140.0f),
                    PathNode.LineTo(140.0f, 140.0f),
                    PathNode.LineTo(140.0f, 216.0f),
                    PathNode.CurveTo(140.0f, 222.62741f, 134.62741f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(121.37258f, 228.0f, 116.0f, 222.62741f, 116.0f, 216.0f),
                    PathNode.LineTo(116.0f, 140.0f),
                    PathNode.LineTo(40.0f, 140.0f),
                    PathNode.CurveTo(33.37258f, 140.0f, 28.0f, 134.62741f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 121.37258f, 33.37258f, 116.0f, 40.0f, 116.0f),
                    PathNode.LineTo(116.0f, 116.0f),
                    PathNode.LineTo(116.0f, 40.0f),
                    PathNode.CurveTo(116.0f, 33.37258f, 121.37258f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(134.62741f, 28.0f, 140.0f, 33.37258f, 140.0f, 40.0f),
                    PathNode.LineTo(140.0f, 116.0f),
                    PathNode.LineTo(216.0f, 116.0f),
                    PathNode.CurveTo(222.62741f, 116.0f, 228.0f, 121.37258f, 228.0f, 128.0f),
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
        return _plus!!
    }

private var _plus: ImageVector? = null
