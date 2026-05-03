package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Spool: ImageVector
    get() {
        if (_spool != null) return _spool!!
        _spool = lucideOutlineIcon(
            name = "Spool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 13.44f),
                    PathNode.LineTo(4.442f, 17.082f),
                    PathNode.CurveTo(3.493376f, 17.362026f, 2.891914f, 18.293411f, 3.026959f, 19.273243f),
                    PathNode.CurveTo(3.162005f, 20.25307f, 3.992993f, 20.987028f, 4.982f, 21.0f),
                    PathNode.LineTo(19.0f, 21.0f),
                    PathNode.CurveTo(19.996256f, 21.00072f, 20.84113f, 20.2681f, 20.981491f, 19.281782f),
                    PathNode.CurveTo(21.121855f, 18.295465f, 20.514904f, 17.356237f, 19.558f, 17.079f),
                    PathNode.LineTo(18.443f, 16.759f),
                    PathNode.CurveTo(17.587767f, 16.511005f, 16.999498f, 15.727464f, 17.0f, 14.837f),
                    PathNode.LineTo(17.0f, 7.66f)
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
                    PathNode.MoveTo(7.0f, 10.56f),
                    PathNode.LineTo(19.558f, 6.918f),
                    PathNode.CurveTo(20.506624f, 6.637974f, 21.108086f, 5.706588f, 20.973042f, 4.726759f),
                    PathNode.CurveTo(20.837996f, 3.746929f, 20.007008f, 3.012972f, 19.018f, 3.0f),
                    PathNode.LineTo(5.0f, 3.0f),
                    PathNode.CurveTo(4.003745f, 2.999282f, 3.158872f, 3.7319f, 3.018508f, 4.718218f),
                    PathNode.CurveTo(2.878145f, 5.704535f, 3.485097f, 6.643763f, 4.442f, 6.921f),
                    PathNode.LineTo(5.557f, 7.241f),
                    PathNode.CurveTo(6.412234f, 7.488994f, 7.000502f, 8.272537f, 7.0f, 9.163f),
                    PathNode.LineTo(7.0f, 16.341f)
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
        return _spool!!
    }

private var _spool: ImageVector? = null
