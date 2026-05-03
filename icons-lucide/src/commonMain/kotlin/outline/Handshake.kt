package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Handshake: ImageVector
    get() {
        if (_handshake != null) return _handshake!!
        _handshake = lucideOutlineIcon(
            name = "Handshake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.0f, 17.0f),
                    PathNode.LineTo(13.0f, 19.0f),
                    PathNode.CurveTo(13.828427f, 19.828426f, 15.171573f, 19.828426f, 16.0f, 19.0f),
                    PathNode.CurveTo(16.828426f, 18.171574f, 16.828426f, 16.828426f, 16.0f, 16.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 14.0f),
                    PathNode.LineTo(16.5f, 16.5f),
                    PathNode.CurveTo(17.328426f, 17.328426f, 18.671574f, 17.328426f, 19.5f, 16.5f),
                    PathNode.CurveTo(20.328426f, 15.671573f, 20.328426f, 14.328427f, 19.5f, 13.5f),
                    PathNode.LineTo(15.62f, 9.62f),
                    PathNode.CurveTo(14.44873f, 8.450187f, 12.55127f, 8.450187f, 11.38f, 9.62f),
                    PathNode.LineTo(10.5f, 10.5f),
                    PathNode.CurveTo(9.671573f, 11.328427f, 8.328428f, 11.328427f, 7.5f, 10.5f),
                    PathNode.CurveTo(6.671573f, 9.671573f, 6.671573f, 8.328428f, 7.5f, 7.5f),
                    PathNode.LineTo(10.31f, 4.69f),
                    PathNode.CurveTo(12.186756f, 2.818151f, 15.094957f, 2.459776f, 17.37f, 3.82f),
                    PathNode.LineTo(17.84f, 4.1f),
                    PathNode.CurveTo(18.265787f, 4.356987f, 18.772049f, 4.446117f, 19.26f, 4.35f),
                    PathNode.LineTo(21.0f, 4.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 3.0f),
                    PathNode.LineTo(22.0f, 14.0f),
                    PathNode.LineTo(20.0f, 14.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(2.0f, 14.0f),
                    PathNode.LineTo(8.5f, 20.5f),
                    PathNode.CurveTo(9.328427f, 21.328426f, 10.671573f, 21.328426f, 11.5f, 20.5f),
                    PathNode.CurveTo(12.328427f, 19.671574f, 12.328427f, 18.328426f, 11.5f, 17.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 4.0f),
                    PathNode.LineTo(11.0f, 4.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _handshake!!
    }

private var _handshake: ImageVector? = null
