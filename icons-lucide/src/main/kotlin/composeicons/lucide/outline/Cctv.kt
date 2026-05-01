package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Cctv: ImageVector
    get() {
        if (_cctv != null) return _cctv!!
        _cctv = lucideOutlineIcon(
            name = "Cctv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.75f, 12.0f),
                    PathNode.LineTo(20.382f, 12.0f),
                    PathNode.CurveTo(20.72844f, 12.000185f, 21.050104f, 12.179667f, 21.232195f, 12.474395f),
                    PathNode.CurveTo(21.414286f, 12.769121f, 21.430859f, 13.137097f, 21.276f, 13.447f),
                    PathNode.LineTo(19.242f, 17.516f),
                    PathNode.CurveTo(19.085127f, 17.829617f, 18.775448f, 18.038149f, 18.42586f, 18.065577f),
                    PathNode.CurveTo(18.076271f, 18.093002f, 17.737862f, 17.935314f, 17.534f, 17.65f),
                    PathNode.LineTo(15.41f, 14.68f)
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
                    PathNode.MoveTo(17.106f, 9.053f),
                    PathNode.CurveTo(17.599527f, 9.300058f, 17.799587f, 9.900237f, 17.553f, 10.394f),
                    PathNode.LineTo(14.447f, 16.605f),
                    PathNode.CurveTo(14.328355f, 16.842274f, 14.120291f, 17.02268f, 13.868602f, 17.106514f),
                    PathNode.CurveTo(13.616913f, 17.190348f, 13.342227f, 17.170736f, 13.105f, 17.052f),
                    PathNode.LineTo(3.61f, 12.3f),
                    PathNode.CurveTo(2.174182f, 11.576775f, 1.593071f, 9.828973f, 2.31f, 8.39f),
                    PathNode.LineTo(3.69f, 5.6f),
                    PathNode.CurveTo(4.037372f, 4.907726f, 4.645555f, 4.381826f, 5.380721f, 4.13802f),
                    PathNode.CurveTo(6.115887f, 3.894215f, 6.9178f, 3.952482f, 7.61f, 4.3f),
                    PathNode.Close
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
                    PathNode.MoveTo(2.0f, 19.0f),
                    PathNode.LineTo(5.76f, 19.0f),
                    PathNode.CurveTo(6.520314f, 19.00529f, 7.217869f, 18.579008f, 7.56f, 17.9f),
                    PathNode.LineTo(9.0f, 15.0f)
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
                    PathNode.MoveTo(2.0f, 21.0f),
                    PathNode.LineTo(2.0f, 17.0f)
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
                    PathNode.MoveTo(7.0f, 9.0f),
                    PathNode.LineTo(7.01f, 9.0f)
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
        return _cctv!!
    }

private var _cctv: ImageVector? = null
