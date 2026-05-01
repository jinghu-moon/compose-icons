package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoneybagHeart: ImageVector
    get() {
        if (_moneybagHeart != null) return _moneybagHeart!!
        _moneybagHeart = tablerOutlineIcon(
            name = "MoneybagHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.5f, 3.0f),
                    PathNode.LineTo(14.5f, 3.0f),
                    PathNode.CurveTo(15.328427f, 3.0f, 16.0f, 3.671573f, 16.0f, 4.5f),
                    PathNode.CurveTo(16.0f, 6.432997f, 14.432997f, 8.0f, 12.5f, 8.0f),
                    PathNode.LineTo(11.5f, 8.0f),
                    PathNode.CurveTo(9.567003f, 8.0f, 8.0f, 6.432997f, 8.0f, 4.5f),
                    PathNode.CurveTo(8.0f, 3.671573f, 8.671573f, 3.0f, 9.5f, 3.0f)
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
                    PathNode.MoveTo(11.5f, 21.0f),
                    PathNode.LineTo(8.0f, 21.0f),
                    PathNode.CurveTo(5.790861f, 21.0f, 4.0f, 19.209139f, 4.0f, 17.0f),
                    PathNode.LineTo(4.0f, 16.0f),
                    PathNode.CurveTo(3.999499f, 12.563678f, 6.193539f, 9.510899f, 9.450723f, 8.415881f),
                    PathNode.CurveTo(12.707906f, 7.320863f, 16.300533f, 8.428251f, 18.376f, 11.167f)
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
                    PathNode.CurveTo(20.48648f, 14.794133f, 19.097776f, 14.791471f, 18.226f, 15.639f),
                    PathNode.LineTo(18.002f, 15.859f),
                    PathNode.LineTo(17.779f, 15.639f),
                    PathNode.CurveTo(16.910603f, 14.788784f, 15.522652f, 14.786121f, 14.651f, 15.633f),
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
        return _moneybagHeart!!
    }

private var _moneybagHeart: ImageVector? = null
