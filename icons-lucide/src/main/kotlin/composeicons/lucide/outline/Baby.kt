package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Baby: ImageVector
    get() {
        if (_baby != null) return _baby!!
        _baby = lucideOutlineIcon(
            name = "Baby",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 16.0f),
                    PathNode.CurveTo(10.5f, 16.3f, 11.2f, 16.5f, 12.0f, 16.5f),
                    PathNode.CurveTo(12.8f, 16.5f, 13.5f, 16.3f, 14.0f, 16.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 12.0f),
                    PathNode.LineTo(15.01f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.38f, 6.813f),
                    PathNode.CurveTo(20.081106f, 7.832396f, 20.564503f, 8.985398f, 20.8f, 10.2f),
                    PathNode.CurveTo(21.48998f, 10.534173f, 21.92822f, 11.233355f, 21.92822f, 12.0f),
                    PathNode.CurveTo(21.92822f, 12.766645f, 21.48998f, 13.465827f, 20.8f, 13.8f),
                    PathNode.CurveTo(19.910389f, 17.949144f, 16.243443f, 20.913204f, 12.0f, 20.913204f),
                    PathNode.CurveTo(7.756557f, 20.913204f, 4.089613f, 17.949144f, 3.2f, 13.8f),
                    PathNode.CurveTo(2.510019f, 13.465827f, 2.07178f, 12.766645f, 2.07178f, 12.0f),
                    PathNode.CurveTo(2.07178f, 11.233355f, 2.510019f, 10.534173f, 3.2f, 10.2f),
                    PathNode.CurveTo(4.053974f, 6.016357f, 7.730098f, 3.008619f, 12.0f, 3.0f),
                    PathNode.CurveTo(14.0f, 3.0f, 15.5f, 4.1f, 15.5f, 5.5f),
                    PathNode.CurveTo(15.5f, 6.9f, 14.6f, 8.0f, 13.5f, 8.0f),
                    PathNode.CurveTo(12.7f, 8.0f, 12.0f, 7.6f, 12.0f, 7.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 12.0f),
                    PathNode.LineTo(9.01f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _baby!!
    }

private var _baby: ImageVector? = null
