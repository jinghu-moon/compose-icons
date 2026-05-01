package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Dice2: ImageVector
    get() {
        if (_dice2 != null) return _dice2!!
        _dice2 = tablerFilledIcon(
            name = "Dice2",
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
                    PathNode.MoveTo(14.5f, 13.0f),
                    PathNode.CurveTo(13.671573f, 13.0f, 13.0f, 13.671573f, 13.0f, 14.5f),
                    PathNode.CurveTo(13.0f, 15.328427f, 13.671573f, 16.0f, 14.5f, 16.0f),
                    PathNode.CurveTo(15.328427f, 16.0f, 16.0f, 15.328427f, 16.0f, 14.5f),
                    PathNode.CurveTo(16.0f, 13.671573f, 15.328427f, 13.0f, 14.5f, 13.0f),
                    PathNode.MoveTo(9.5f, 8.0f),
                    PathNode.CurveTo(8.671573f, 8.0f, 8.0f, 8.671573f, 8.0f, 9.5f),
                    PathNode.CurveTo(8.0f, 10.328427f, 8.671573f, 11.0f, 9.5f, 11.0f),
                    PathNode.CurveTo(10.328427f, 11.0f, 11.0f, 10.328427f, 11.0f, 9.5f),
                    PathNode.CurveTo(11.0f, 8.671573f, 10.328427f, 8.0f, 9.5f, 8.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _dice2!!
    }

private var _dice2: ImageVector? = null
