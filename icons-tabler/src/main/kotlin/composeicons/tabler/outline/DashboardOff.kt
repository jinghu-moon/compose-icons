package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DashboardOff: ImageVector
    get() {
        if (_dashboardOff != null) return _dashboardOff!!
        _dashboardOff = tablerOutlineIcon(
            name = "DashboardOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.175f, 11.178f),
                    PathNode.CurveTo(10.363585f, 11.545621f, 9.893116f, 12.405577f, 10.021121f, 13.287141f),
                    PathNode.CurveTo(10.149127f, 14.168706f, 10.844745f, 14.859343f, 11.727206f, 14.981009f),
                    PathNode.CurveTo(12.609668f, 15.102674f, 13.46622f, 14.626037f, 13.828f, 13.812f)
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
                    PathNode.MoveTo(14.5f, 10.5f),
                    PathNode.LineTo(15.5f, 9.5f)
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
                    PathNode.MoveTo(8.621f, 4.612f),
                    PathNode.CurveTo(11.971032f, 3.254892f, 15.807939f, 4.033585f, 18.36387f, 6.589298f),
                    PathNode.CurveTo(20.919802f, 9.145012f, 21.698822f, 12.981853f, 20.342f, 16.332f),
                    PathNode.MoveTo(18.826f, 18.82f),
                    PathNode.CurveTo(18.455482f, 19.251137f, 18.044985f, 19.646233f, 17.6f, 20.0f),
                    PathNode.LineTo(6.4f, 20.0f),
                    PathNode.CurveTo(4.299386f, 18.330515f, 3.053236f, 15.810817f, 3.0014f, 13.128079f),
                    PathNode.CurveTo(2.949563f, 10.445342f, 4.097447f, 7.879388f, 6.132f, 6.13f)
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
        return _dashboardOff!!
    }

private var _dashboardOff: ImageVector? = null
