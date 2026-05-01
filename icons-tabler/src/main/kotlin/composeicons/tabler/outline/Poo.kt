package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Poo: ImageVector
    get() {
        if (_poo != null) return _poo!!
        _poo = tablerOutlineIcon(
            name = "Poo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 12.0f),
                    PathNode.LineTo(10.01f, 12.0f)
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
                    PathNode.MoveTo(14.0f, 12.0f),
                    PathNode.LineTo(14.01f, 12.0f)
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
                    PathNode.MoveTo(10.0f, 16.0f),
                    PathNode.CurveTo(11.20199f, 16.836958f, 12.79801f, 16.836958f, 14.0f, 16.0f)
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
                    PathNode.MoveTo(11.0f, 4.0f),
                    PathNode.CurveTo(13.0f, 4.0f, 14.5f, 5.5f, 14.5f, 8.0f),
                    PathNode.LineTo(14.664f, 8.0f),
                    PathNode.CurveTo(15.443539f, 8.051193f, 16.154331f, 8.463844f, 16.585314f, 9.115422f),
                    PathNode.CurveTo(17.016298f, 9.767f, 17.117918f, 10.582586f, 16.86f, 11.32f),
                    PathNode.CurveTo(17.992704f, 11.895927f, 18.639694f, 13.123005f, 18.475f, 14.383f),
                    PathNode.CurveTo(19.633396f, 15.037231f, 20.22256f, 16.376226f, 19.922298f, 17.672276f),
                    PathNode.CurveTo(19.622038f, 18.968323f, 18.504076f, 19.911821f, 17.176f, 19.99f),
                    PathNode.LineTo(17.0f, 19.99f),
                    PathNode.LineTo(7.0f, 19.99f),
                    PathNode.CurveTo(5.636556f, 19.990068f, 4.444536f, 19.07071f, 4.098231f, 17.751978f),
                    PathNode.CurveTo(3.751926f, 16.433247f, 4.338441f, 15.046837f, 5.526f, 14.377f),
                    PathNode.CurveTo(5.361755f, 13.117348f, 6.008677f, 11.8908f, 7.141f, 11.315f),
                    PathNode.CurveTo(6.883115f, 10.577744f, 6.984616f, 9.762329f, 7.415374f, 9.110795f),
                    PathNode.CurveTo(7.846133f, 8.45926f, 8.556642f, 8.046487f, 9.336f, 7.995f),
                    PathNode.LineTo(9.5f, 7.995f),
                    PathNode.CurveTo(11.0f, 7.995f, 12.0f, 5.995f, 11.0f, 3.995f),
                    PathNode.LineTo(11.0f, 4.0f)
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
        return _poo!!
    }

private var _poo: ImageVector? = null
