package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BeerOff: ImageVector
    get() {
        if (_beerOff != null) return _beerOff!!
        _beerOff = tablerOutlineIcon(
            name = "BeerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 7.0f),
                    PathNode.LineTo(7.0f, 8.111f),
                    PathNode.CurveTo(7.0f, 9.353f, 7.29f, 10.578f, 7.845f, 11.689f),
                    PathNode.LineTo(8.155f, 12.311f),
                    PathNode.CurveTo(8.71061f, 13.421896f, 8.999915f, 14.646908f, 9.0f, 15.889f),
                    PathNode.LineTo(9.0f, 20.0f),
                    PathNode.LineTo(15.0f, 20.0f),
                    PathNode.LineTo(15.0f, 15.889f),
                    PathNode.CurveTo(14.999906f, 15.605069f, 15.014927f, 15.321334f, 15.045f, 15.039f),
                    PathNode.MoveTo(15.998f, 12.004f),
                    PathNode.LineTo(16.155f, 11.689f),
                    PathNode.CurveTo(16.71061f, 10.578104f, 16.999916f, 9.353092f, 17.0f, 8.111f),
                    PathNode.LineTo(17.0f, 4.0f),
                    PathNode.LineTo(8.0f, 4.0f)
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
                    PathNode.MoveTo(7.0f, 8.0f),
                    PathNode.LineTo(8.0f, 8.0f),
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(17.0f, 8.0f)
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
        return _beerOff!!
    }

private var _beerOff: ImageVector? = null
