package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EyeHeart: ImageVector
    get() {
        if (_eyeHeart != null) return _eyeHeart!!
        _eyeHeart = tablerOutlineIcon(
            name = "EyeHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.905f, 11.39f),
                    PathNode.CurveTo(13.630306f, 10.532631f, 12.816616f, 9.964478f, 11.917097f, 10.001962f),
                    PathNode.CurveTo(11.017579f, 10.039446f, 10.253979f, 10.673327f, 10.05157f, 11.550578f),
                    PathNode.CurveTo(9.84916f, 12.427829f, 10.257839f, 13.332192f, 11.05f, 13.76f)
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
                    PathNode.MoveTo(9.992f, 17.779f),
                    PathNode.CurveTo(7.27f, 17.158f, 4.939f, 15.232f, 3.0f, 12.0f),
                    PathNode.CurveTo(5.4f, 8.0f, 8.4f, 6.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(15.332f, 6.0f, 18.15f, 7.714f, 20.454f, 11.14f)
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
                    PathNode.MoveTo(18.0f, 22.0f),
                    PathNode.LineTo(21.35f, 18.716f),
                    PathNode.CurveTo(21.765032f, 18.31326f, 21.999672f, 17.759872f, 22.000614f, 17.181555f),
                    PathNode.CurveTo(22.001554f, 16.603237f, 21.768719f, 16.04909f, 21.355f, 15.645f),
                    PathNode.CurveTo(20.486048f, 14.795191f, 19.098206f, 14.792529f, 18.226f, 15.639f),
                    PathNode.LineTo(18.002f, 15.859f),
                    PathNode.LineTo(17.779f, 15.639f),
                    PathNode.CurveTo(16.910172f, 14.78984f, 15.52308f, 14.787179f, 14.651f, 15.633f),
                    PathNode.CurveTo(14.235836f, 16.035604f, 14.001016f, 16.588917f, 13.999886f, 17.167234f),
                    PathNode.CurveTo(13.998755f, 17.745552f, 14.231412f, 18.299776f, 14.645f, 18.704f),
                    PathNode.LineTo(18.0f, 22.0f)
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
        return _eyeHeart!!
    }

private var _eyeHeart: ImageVector? = null
