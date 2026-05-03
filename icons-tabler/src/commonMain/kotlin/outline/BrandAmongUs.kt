package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAmongUs: ImageVector
    get() {
        if (_brandAmongUs != null) return _brandAmongUs!!
        _brandAmongUs = tablerOutlineIcon(
            name = "BrandAmongUs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.646f, 12.774f),
                    PathNode.CurveTo(8.707f, 13.17f, 6.179f, 13.091f, 4.412f, 12.173f),
                    PathNode.CurveTo(1.958f, 10.91f, 2.875f, 7.513f, 5.835f, 7.191f),
                    PathNode.CurveTo(8.089f, 6.967f, 9.649f, 6.837f, 11.485f, 7.405f),
                    PathNode.CurveTo(12.32f, 7.661f, 13.415f, 7.974f, 12.84f, 10.686f),
                    PathNode.CurveTo(12.649f, 11.753f, 11.77f, 12.59f, 10.646f, 12.774f)
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
                    PathNode.MoveTo(5.84f, 7.132f),
                    PathNode.CurveTo(5.923f, 6.568f, 6.054f, 6.012f, 6.232f, 5.471f),
                    PathNode.CurveTo(6.688f, 4.535f, 7.327f, 3.403f, 10.217f, 3.015f),
                    PathNode.CurveTo(11.173395f, 2.980569f, 12.131013f, 3.00729f, 13.084f, 3.095f),
                    PathNode.CurveTo(14.86f, 3.235f, 15.727f, 4.329f, 16.371f, 6.463f),
                    PathNode.CurveTo(16.71f, 7.62f, 16.831f, 8.805f, 17.0f, 10.0f),
                    PathNode.LineTo(17.0f, 21.0f),
                    PathNode.LineTo(4.296f, 20.981f),
                    PathNode.CurveTo(3.744f, 18.595f, 4.034f, 15.087f, 4.5f, 12.5f)
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
                    PathNode.MoveTo(17.0f, 10.0f),
                    PathNode.CurveTo(17.991f, 10.163f, 19.105f, 10.383f, 20.069f, 10.67f),
                    PathNode.CurveTo(20.324f, 10.8f, 20.589f, 10.945f, 20.603f, 11.175f),
                    PathNode.CurveTo(20.867f, 14.609f, 21.173f, 18.623f, 20.881f, 21.0f),
                    PathNode.LineTo(17.0f, 21.0f)
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
        return _brandAmongUs!!
    }

private var _brandAmongUs: ImageVector? = null
