package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapPinHeart: ImageVector
    get() {
        if (_mapPinHeart != null) return _mapPinHeart!!
        _mapPinHeart = tablerOutlineIcon(
            name = "MapPinHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 11.0f),
                    PathNode.CurveTo(14.999403f, 9.470865f, 13.848783f, 8.186878f, 12.328864f, 8.019251f),
                    PathNode.CurveTo(10.808945f, 7.851626f, 9.40617f, 8.854012f, 9.072356f, 10.346265f),
                    PathNode.CurveTo(8.738544f, 11.838518f, 9.580526f, 13.343051f, 11.027f, 13.839f)
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
                    PathNode.MoveTo(11.76f, 21.47f),
                    PathNode.CurveTo(11.316096f, 21.417078f, 10.90292f, 21.2163f, 10.587f, 20.9f),
                    PathNode.LineTo(6.343f, 16.657f),
                    PathNode.CurveTo(3.776933f, 14.090535f, 3.259989f, 10.118235f, 5.083728f, 6.980493f),
                    PathNode.CurveTo(6.907467f, 3.842752f, 10.61492f, 2.325782f, 14.115067f, 3.285163f),
                    PathNode.CurveTo(17.615215f, 4.244543f, 20.031036f, 7.439884f, 20.0f, 11.069f)
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
        return _mapPinHeart!!
    }

private var _mapPinHeart: ImageVector? = null
