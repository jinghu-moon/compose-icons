package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TruckDelivery: ImageVector
    get() {
        if (_truckDelivery != null) return _truckDelivery!!
        _truckDelivery = tablerOutlineIcon(
            name = "TruckDelivery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 17.0f),
                    PathNode.CurveTo(5.0f, 18.10457f, 5.895431f, 19.0f, 7.0f, 19.0f),
                    PathNode.CurveTo(8.10457f, 19.0f, 9.0f, 18.10457f, 9.0f, 17.0f),
                    PathNode.CurveTo(9.0f, 15.895431f, 8.10457f, 15.0f, 7.0f, 15.0f),
                    PathNode.CurveTo(5.895431f, 15.0f, 5.0f, 15.895431f, 5.0f, 17.0f)
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
                    PathNode.MoveTo(15.0f, 17.0f),
                    PathNode.CurveTo(15.0f, 18.10457f, 15.895431f, 19.0f, 17.0f, 19.0f),
                    PathNode.CurveTo(18.10457f, 19.0f, 19.0f, 18.10457f, 19.0f, 17.0f),
                    PathNode.CurveTo(19.0f, 15.895431f, 18.10457f, 15.0f, 17.0f, 15.0f),
                    PathNode.CurveTo(15.895431f, 15.0f, 15.0f, 15.895431f, 15.0f, 17.0f)
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
                    PathNode.MoveTo(5.0f, 17.0f),
                    PathNode.LineTo(3.0f, 17.0f),
                    PathNode.LineTo(3.0f, 13.0f),
                    PathNode.MoveTo(2.0f, 5.0f),
                    PathNode.LineTo(13.0f, 5.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.MoveTo(9.0f, 17.0f),
                    PathNode.LineTo(15.0f, 17.0f),
                    PathNode.MoveTo(19.0f, 17.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.LineTo(21.0f, 11.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.MoveTo(13.0f, 6.0f),
                    PathNode.LineTo(18.0f, 6.0f),
                    PathNode.LineTo(21.0f, 11.0f)
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
                    PathNode.MoveTo(3.0f, 9.0f),
                    PathNode.LineTo(7.0f, 9.0f)
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
        return _truckDelivery!!
    }

private var _truckDelivery: ImageVector? = null
