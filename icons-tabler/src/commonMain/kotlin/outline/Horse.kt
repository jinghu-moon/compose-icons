package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Horse: ImageVector
    get() {
        if (_horse != null) return _horse!!
        _horse = tablerOutlineIcon(
            name = "Horse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 10.0f),
                    PathNode.LineTo(6.15f, 18.507f),
                    PathNode.CurveTo(6.111562f, 18.888601f, 6.2364f, 19.268648f, 6.493633f, 19.55313f),
                    PathNode.CurveTo(6.750865f, 19.83761f, 7.116467f, 19.999952f, 7.5f, 20.0f),
                    PathNode.LineTo(7.646f, 20.0f),
                    PathNode.CurveTo(8.463772f, 20.000055f, 9.199198f, 19.502247f, 9.503f, 18.743f),
                    PathNode.LineTo(10.497f, 16.257f),
                    PathNode.CurveTo(10.800802f, 15.497753f, 11.536228f, 14.999946f, 12.354f, 15.0f),
                    PathNode.LineTo(13.646f, 15.0f),
                    PathNode.CurveTo(14.463772f, 14.999946f, 15.199198f, 15.497753f, 15.503f, 16.257f),
                    PathNode.LineTo(16.497f, 18.743f),
                    PathNode.CurveTo(16.800802f, 19.502247f, 17.536228f, 20.000055f, 18.354f, 20.0f),
                    PathNode.LineTo(18.5f, 20.0f),
                    PathNode.CurveTo(18.884844f, 19.999895f, 19.251898f, 19.837927f, 19.511377f, 19.553717f),
                    PathNode.CurveTo(19.770857f, 19.269506f, 19.898832f, 18.889265f, 19.864f, 18.506f),
                    PathNode.LineTo(19.0f, 9.0f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.CurveTo(11.0f, 6.0f, 8.0f, 4.0f, 5.0f, 4.0f),
                    PathNode.LineTo(2.0f, 10.0f),
                    PathNode.LineTo(4.0f, 12.0f),
                    PathNode.LineTo(7.0f, 10.0f)
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
                    PathNode.MoveTo(22.0f, 14.0f),
                    PathNode.LineTo(22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 10.343145f, 20.656855f, 9.0f, 19.0f, 9.0f)
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
        return _horse!!
    }

private var _horse: ImageVector? = null
