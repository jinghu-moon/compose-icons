package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sausage: ImageVector
    get() {
        if (_sausage != null) return _sausage!!
        _sausage = tablerOutlineIcon(
            name = "Sausage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.5f, 5.5f),
                    PathNode.CurveTo(4.119288f, 5.5f, 3.0f, 6.619288f, 3.0f, 8.0f),
                    PathNode.CurveTo(3.0f, 15.18f, 8.82f, 21.0f, 16.0f, 21.0f),
                    PathNode.CurveTo(17.380713f, 21.0f, 18.5f, 19.880713f, 18.5f, 18.5f),
                    PathNode.CurveTo(18.5f, 17.119287f, 17.380713f, 16.0f, 16.0f, 16.0f),
                    PathNode.CurveTo(11.581722f, 16.0f, 8.0f, 12.418278f, 8.0f, 8.0f),
                    PathNode.CurveTo(8.0f, 6.619288f, 6.880712f, 5.5f, 5.5f, 5.5f)
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
                    PathNode.MoveTo(5.195f, 5.519f),
                    PathNode.LineTo(3.952f, 3.53f),
                    PathNode.CurveTo(3.759331f, 3.221731f, 3.749129f, 2.833186f, 3.925356f, 2.515231f),
                    PathNode.CurveTo(4.101582f, 2.197276f, 4.436475f, 1.999999f, 4.8f, 2.0f),
                    PathNode.LineTo(6.192f, 2.0f),
                    PathNode.CurveTo(6.555526f, 1.999999f, 6.890419f, 2.197276f, 7.066645f, 2.515231f),
                    PathNode.CurveTo(7.242871f, 2.833186f, 7.232669f, 3.221731f, 7.04f, 3.53f),
                    PathNode.LineTo(5.795f, 5.52f)
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
                    PathNode.MoveTo(18.482f, 18.225f),
                    PathNode.LineTo(20.471f, 16.982f),
                    PathNode.CurveTo(20.779268f, 16.789331f, 21.167814f, 16.77913f, 21.48577f, 16.955355f),
                    PathNode.CurveTo(21.803724f, 17.131582f, 22.001001f, 17.466475f, 22.001f, 17.83f),
                    PathNode.LineTo(22.001f, 19.222f),
                    PathNode.CurveTo(22.001001f, 19.585526f, 21.803724f, 19.920418f, 21.48577f, 20.096645f),
                    PathNode.CurveTo(21.167814f, 20.272873f, 20.779268f, 20.262669f, 20.471f, 20.07f),
                    PathNode.LineTo(18.48f, 18.825f)
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
        return _sausage!!
    }

private var _sausage: ImageVector? = null
