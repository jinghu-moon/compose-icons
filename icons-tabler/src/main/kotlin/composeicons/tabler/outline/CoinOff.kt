package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CoinOff: ImageVector
    get() {
        if (_coinOff != null) return _coinOff!!
        _coinOff = tablerOutlineIcon(
            name = "CoinOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.8f, 9.0f),
                    PathNode.CurveTo(14.430867f, 8.359678f, 13.738684f, 7.975131f, 13.0f, 8.0f),
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.MoveTo(9.18f, 9.171f),
                    PathNode.CurveTo(8.898036f, 9.790063f, 8.950064f, 10.509998f, 9.318109f, 11.082086f),
                    PathNode.CurveTo(9.686154f, 11.654174f, 10.319749f, 11.999967f, 11.0f, 12.0f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.MoveTo(14.824f, 14.822f),
                    PathNode.CurveTo(14.500633f, 15.539257f, 13.78678f, 16.000286f, 13.0f, 16.0f),
                    PathNode.LineTo(11.0f, 16.0f),
                    PathNode.CurveTo(10.261316f, 16.02487f, 9.569133f, 15.640323f, 9.2f, 15.0f)
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
                    PathNode.MoveTo(20.042f, 16.045f),
                    PathNode.CurveTo(21.789572f, 12.576373f, 21.11484f, 8.377954f, 18.368443f, 5.631557f),
                    PathNode.CurveTo(15.622046f, 2.885161f, 11.423627f, 2.210428f, 7.955f, 3.958f),
                    PathNode.MoveTo(5.637f, 5.635f),
                    PathNode.CurveTo(3.332051f, 7.90183f, 2.419973f, 11.230749f, 3.247604f, 14.355863f),
                    PathNode.CurveTo(4.075236f, 17.480976f, 6.515411f, 19.92211f, 9.6402f, 20.750969f),
                    PathNode.CurveTo(12.764988f, 21.579828f, 16.094265f, 20.669058f, 18.362f, 18.365f)
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
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.LineTo(12.0f, 18.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _coinOff!!
    }

private var _coinOff: ImageVector? = null
