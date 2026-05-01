package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandVk: ImageVector
    get() {
        if (_brandVk != null) return _brandVk!!
        _brandVk = tablerOutlineIcon(
            name = "BrandVk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 19.0f),
                    PathNode.LineTo(10.0f, 19.0f),
                    PathNode.CurveTo(5.581722f, 19.0f, 2.0f, 15.418278f, 2.0f, 11.0f),
                    PathNode.LineTo(2.0f, 6.0f),
                    PathNode.LineTo(6.0f, 6.0f),
                    PathNode.LineTo(6.0f, 11.0f),
                    PathNode.CurveTo(6.0f, 13.209139f, 7.790861f, 15.0f, 10.0f, 15.0f),
                    PathNode.LineTo(10.0f, 6.0f),
                    PathNode.LineTo(14.0f, 6.0f),
                    PathNode.LineTo(14.0f, 10.5f),
                    PathNode.LineTo(14.03f, 10.5f),
                    PathNode.CurveTo(16.297836f, 10.217033f, 17.999931f, 8.289421f, 18.0f, 6.004f),
                    PathNode.LineTo(22.0f, 6.004f),
                    PathNode.LineTo(21.658f, 7.715f),
                    PathNode.CurveTo(21.242916f, 9.790243f, 19.892948f, 11.557599f, 18.0f, 12.504f),
                    PathNode.CurveTo(19.850147f, 13.120397f, 21.217157f, 14.696329f, 21.566f, 16.615f),
                    PathNode.LineTo(22.0f, 19.004f),
                    PathNode.LineTo(18.0f, 19.004f),
                    PathNode.CurveTo(17.999931f, 16.718578f, 16.297836f, 14.790967f, 14.03f, 14.508f),
                    PathNode.LineTo(14.03f, 19.008f),
                    PathNode.LineTo(14.0f, 19.0f)
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
        return _brandVk!!
    }

private var _brandVk: ImageVector? = null
