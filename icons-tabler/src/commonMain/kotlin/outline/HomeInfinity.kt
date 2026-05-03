package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeInfinity: ImageVector
    get() {
        if (_homeInfinity != null) return _homeInfinity!!
        _homeInfinity = tablerOutlineIcon(
            name = "HomeInfinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 14.0f),
                    PathNode.LineTo(19.0f, 12.0f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.LineTo(12.0f, 3.0f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.LineTo(5.0f, 12.0f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(5.0f, 20.10457f, 5.895431f, 21.0f, 7.0f, 21.0f),
                    PathNode.LineTo(9.5f, 21.0f)
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
                    PathNode.MoveTo(9.0f, 21.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.CurveTo(9.0f, 13.895431f, 9.895431f, 13.0f, 11.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.CurveTo(13.727631f, 13.00005f, 14.397826f, 13.395273f, 14.75f, 14.032f)
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
                    PathNode.MoveTo(15.536f, 17.586f),
                    PathNode.CurveTo(14.715986f, 16.804667f, 13.427013f, 16.804667f, 12.607f, 17.586f),
                    PathNode.CurveTo(12.21958f, 17.95431f, 12.000249f, 18.465448f, 12.000249f, 19.0f),
                    PathNode.CurveTo(12.000249f, 19.534552f, 12.21958f, 20.04569f, 12.607f, 20.414f),
                    PathNode.CurveTo(13.416f, 21.195f, 14.727f, 21.195f, 15.536f, 20.414f),
                    PathNode.CurveTo(16.345f, 19.633f, 14.731f, 21.192f, 15.536f, 20.414f),
                    PathNode.LineTo(16.996f, 19.004f),
                    PathNode.LineTo(18.456f, 17.585f)
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
                    PathNode.MoveTo(15.54f, 17.582f),
                    PathNode.LineTo(17.0f, 19.002f),
                    PathNode.LineTo(18.46f, 20.412f),
                    PathNode.CurveTo(19.269f, 21.192f, 17.655f, 19.633f, 18.46f, 20.412f),
                    PathNode.CurveTo(19.265f, 21.191f, 20.58f, 21.193f, 21.389f, 20.412f),
                    PathNode.CurveTo(21.77642f, 20.043692f, 21.99575f, 19.532553f, 21.99575f, 18.998f),
                    PathNode.CurveTo(21.99575f, 18.463448f, 21.77642f, 17.952309f, 21.389f, 17.584f),
                    PathNode.CurveTo(20.568987f, 16.802666f, 19.280014f, 16.802666f, 18.46f, 17.584f)
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
        return _homeInfinity!!
    }

private var _homeInfinity: ImageVector? = null
