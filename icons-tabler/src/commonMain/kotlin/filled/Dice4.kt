package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Dice4: ImageVector
    get() {
        if (_dice4 != null) return _dice4!!
        _dice4 = tablerFilledIcon(
            name = "Dice4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.333f, 2.0f),
                    PathNode.CurveTo(20.293f, 2.0f, 21.893f, 3.537f, 21.995f, 5.472f),
                    PathNode.LineTo(22.0f, 5.667f),
                    PathNode.LineTo(22.0f, 18.333f),
                    PathNode.CurveTo(22.0f, 20.293f, 20.463f, 21.893f, 18.528f, 21.995f),
                    PathNode.LineTo(18.333f, 22.0f),
                    PathNode.LineTo(5.667f, 22.0f),
                    PathNode.CurveTo(3.717474f, 22.000101f, 2.10867f, 20.474768f, 2.005f, 18.528f),
                    PathNode.LineTo(2.0f, 18.333f),
                    PathNode.LineTo(2.0f, 5.667f),
                    PathNode.CurveTo(2.0f, 3.707f, 3.537f, 2.107f, 5.472f, 2.005f),
                    PathNode.LineTo(5.667f, 2.0f),
                    PathNode.LineTo(18.333f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.5f, 14.0f),
                    PathNode.CurveTo(14.671573f, 14.0f, 14.0f, 14.671573f, 14.0f, 15.5f),
                    PathNode.CurveTo(14.0f, 16.328426f, 14.671573f, 17.0f, 15.5f, 17.0f),
                    PathNode.CurveTo(16.328426f, 17.0f, 17.0f, 16.328426f, 17.0f, 15.5f),
                    PathNode.CurveTo(17.0f, 14.671573f, 16.328426f, 14.0f, 15.5f, 14.0f),
                    PathNode.MoveTo(8.5f, 14.0f),
                    PathNode.CurveTo(7.671573f, 14.0f, 7.0f, 14.671573f, 7.0f, 15.5f),
                    PathNode.CurveTo(7.0f, 16.328426f, 7.671573f, 17.0f, 8.5f, 17.0f),
                    PathNode.CurveTo(9.328427f, 17.0f, 10.0f, 16.328426f, 10.0f, 15.5f),
                    PathNode.CurveTo(10.0f, 14.671573f, 9.328427f, 14.0f, 8.5f, 14.0f),
                    PathNode.MoveTo(8.5f, 7.0f),
                    PathNode.CurveTo(7.671573f, 7.0f, 7.0f, 7.671573f, 7.0f, 8.5f),
                    PathNode.CurveTo(7.0f, 9.328427f, 7.671573f, 10.0f, 8.5f, 10.0f),
                    PathNode.CurveTo(9.328427f, 10.0f, 10.0f, 9.328427f, 10.0f, 8.5f),
                    PathNode.CurveTo(10.0f, 7.671573f, 9.328427f, 7.0f, 8.5f, 7.0f),
                    PathNode.MoveTo(15.5f, 7.0f),
                    PathNode.CurveTo(14.671573f, 7.0f, 14.0f, 7.671573f, 14.0f, 8.5f),
                    PathNode.CurveTo(14.0f, 9.328427f, 14.671573f, 10.0f, 15.5f, 10.0f),
                    PathNode.CurveTo(16.328426f, 10.0f, 17.0f, 9.328427f, 17.0f, 8.5f),
                    PathNode.CurveTo(17.0f, 7.671573f, 16.328426f, 7.0f, 15.5f, 7.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _dice4!!
    }

private var _dice4: ImageVector? = null
