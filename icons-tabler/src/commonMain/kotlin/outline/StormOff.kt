package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.StormOff: ImageVector
    get() {
        if (_stormOff != null) return _stormOff!!
        _stormOff = tablerOutlineIcon(
            name = "StormOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.884f, 9.874f),
                    PathNode.CurveTo(8.711499f, 11.044844f, 8.710156f, 12.9445f, 9.881f, 14.117f),
                    PathNode.CurveTo(11.051844f, 15.2895f, 12.9515f, 15.290844f, 14.124f, 14.12f),
                    PathNode.MoveTo(14.694f, 10.679f),
                    PathNode.CurveTo(14.394067f, 10.070013f, 13.897209f, 9.580203f, 13.284f, 9.289f)
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
                    PathNode.MoveTo(7.037f, 7.063f),
                    PathNode.CurveTo(4.3054f, 9.798742f, 4.308758f, 14.2309f, 7.0445f, 16.9625f),
                    PathNode.CurveTo(9.780243f, 19.6941f, 14.212399f, 19.690742f, 16.944f, 16.955f),
                    PathNode.MoveTo(18.529f, 14.529f),
                    PathNode.CurveTo(19.532871f, 11.942942f, 18.914894f, 9.008058f, 16.95344f, 7.046386f),
                    PathNode.CurveTo(14.991985f, 5.084715f, 12.057169f, 4.466414f, 9.471f, 5.47f)
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
                    PathNode.MoveTo(5.369f, 14.236f),
                    PathNode.CurveTo(3.764f, 10.808f, 3.772f, 7.563f, 4.369f, 4.387f)
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
                    PathNode.MoveTo(18.63f, 9.76f),
                    PathNode.CurveTo(19.55157f, 11.71384f, 20.01924f, 13.850831f, 19.998f, 16.011f),
                    PathNode.MoveTo(19.628f, 19.619f),
                    PathNode.CurveTo(19.541f, 20.079f, 19.441f, 20.539f, 19.333f, 20.996f)
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
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _stormOff!!
    }

private var _stormOff: ImageVector? = null
