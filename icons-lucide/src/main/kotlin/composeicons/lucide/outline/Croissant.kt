package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Croissant: ImageVector
    get() {
        if (_croissant != null) return _croissant!!
        _croissant = lucideOutlineIcon(
            name = "Croissant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.2f, 18.0f),
                    PathNode.LineTo(4.774f, 18.0f),
                    PathNode.CurveTo(4.168863f, 17.97918f, 3.635584f, 17.596575f, 3.422f, 17.03f),
                    PathNode.CurveTo(2.812768f, 14.903579f, 2.85877f, 12.642878f, 3.554f, 10.543f)
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
                    PathNode.MoveTo(18.0f, 10.2f),
                    PathNode.LineTo(18.0f, 4.774f),
                    PathNode.CurveTo(17.97918f, 4.168863f, 17.596575f, 3.635584f, 17.03f, 3.422f),
                    PathNode.CurveTo(14.903891f, 2.812974f, 12.64357f, 2.858975f, 10.544f, 3.554f)
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
                    PathNode.MoveTo(18.0f, 5.0f),
                    PathNode.CurveTo(20.209139f, 5.0f, 22.0f, 6.343146f, 22.0f, 8.0f),
                    PathNode.CurveTo(22.0f, 9.104569f, 21.10457f, 10.0f, 20.0f, 10.0f),
                    PathNode.CurveTo(18.19006f, 9.999547f, 16.413929f, 10.490324f, 14.861f, 11.42f)
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
                    PathNode.MoveTo(5.0f, 18.0f),
                    PathNode.CurveTo(5.0f, 20.209139f, 6.343146f, 22.0f, 8.0f, 22.0f),
                    PathNode.CurveTo(9.104569f, 22.0f, 10.0f, 21.10457f, 10.0f, 20.0f),
                    PathNode.CurveTo(9.999366f, 18.18972f, 10.49015f, 16.41322f, 11.42f, 14.86f)
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
                    PathNode.MoveTo(8.709f, 2.554f),
                    PathNode.CurveTo(5.825178f, 3.558278f, 3.558278f, 5.825178f, 2.554f, 8.709f),
                    PathNode.CurveTo(2.404013f, 9.340156f, 2.676762f, 9.996206f, 3.23f, 10.335f),
                    PathNode.LineTo(13.037f, 15.755f),
                    PathNode.CurveTo(13.817145f, 16.186321f, 14.788567f, 16.049252f, 15.418909f, 15.418909f),
                    PathNode.CurveTo(16.049252f, 14.788567f, 16.186321f, 13.817145f, 15.755f, 13.037f),
                    PathNode.LineTo(10.335f, 3.23f),
                    PathNode.CurveTo(9.996206f, 2.676762f, 9.340156f, 2.404013f, 8.709f, 2.554f)
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
        return _croissant!!
    }

private var _croissant: ImageVector? = null
