package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DiaboloOff: ImageVector
    get() {
        if (_diaboloOff != null) return _diaboloOff!!
        _diaboloOff = tablerOutlineIcon(
            name = "DiaboloOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.727f, 4.749f),
                    PathNode.CurveTo(4.26f, 5.129f, 4.0f, 5.553f, 4.0f, 6.0f),
                    PathNode.CurveTo(4.0f, 7.217f, 5.933f, 8.265001f, 8.71f, 8.735f),
                    PathNode.MoveTo(12.967f, 8.978f),
                    PathNode.CurveTo(16.929f, 8.8f, 20.0f, 7.534f, 20.0f, 6.0f),
                    PathNode.CurveTo(20.0f, 4.343f, 16.418f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(10.34f, 3.0f, 8.798f, 3.19f, 7.52f, 3.514f)
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
                    PathNode.MoveTo(4.0f, 6.0f),
                    PathNode.LineTo(4.0f, 6.143f),
                    PathNode.CurveTo(3.999906f, 6.247209f, 4.016102f, 6.350793f, 4.048f, 6.45f),
                    PathNode.LineTo(6.0f, 12.0f),
                    PathNode.LineTo(4.036f, 17.67f),
                    PathNode.CurveTo(4.01219f, 17.756323f, 4.000081f, 17.845453f, 4.0f, 17.935f),
                    PathNode.LineTo(4.0f, 18.0f),
                    PathNode.CurveTo(4.0f, 19.657f, 7.582f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(15.218f, 21.0f, 17.992f, 20.288f, 19.262f, 19.26f),
                    PathNode.MoveTo(19.051f, 15.033f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.LineTo(19.952f, 6.45f),
                    PathNode.CurveTo(19.983898f, 6.350793f, 20.000093f, 6.247209f, 20.0f, 6.143f),
                    PathNode.LineTo(20.0f, 6.0f)
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
                    PathNode.MoveTo(6.0f, 12.0f),
                    PathNode.CurveTo(6.0f, 13.105f, 8.686f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(12.656f, 14.0f, 13.288f, 13.965f, 13.879f, 13.9f),
                    PathNode.MoveTo(17.077f, 13.066f),
                    PathNode.CurveTo(17.662f, 12.758f, 18.0f, 12.392f, 18.0f, 12.0f)
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
        return _diaboloOff!!
    }

private var _diaboloOff: ImageVector? = null
