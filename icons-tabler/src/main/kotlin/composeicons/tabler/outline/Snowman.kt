package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Snowman: ImageVector
    get() {
        if (_snowman != null) return _snowman!!
        _snowman = tablerOutlineIcon(
            name = "Snowman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(13.598183f, 2.999496f, 15.043279f, 3.950357f, 15.675248f, 5.418281f),
                    PathNode.CurveTo(16.307217f, 6.886206f, 16.004751f, 8.589425f, 14.906f, 9.75f),
                    PathNode.CurveTo(17.299875f, 11.074648f, 18.494488f, 13.850961f, 17.810438f, 16.5f),
                    PathNode.CurveTo(17.126389f, 19.14904f, 14.736934f, 20.999857f, 12.001f, 20.999857f),
                    PathNode.CurveTo(9.265066f, 20.999857f, 6.875613f, 19.14904f, 6.191563f, 16.5f),
                    PathNode.CurveTo(5.507513f, 13.850961f, 6.702124f, 11.074648f, 9.096f, 9.75f),
                    PathNode.CurveTo(7.9975f, 8.589688f, 7.694899f, 6.886949f, 8.326357f, 5.4192f),
                    PathNode.CurveTo(8.957815f, 3.951451f, 10.402181f, 3.000295f, 12.0f, 3.0f)
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
                    PathNode.MoveTo(17.5f, 11.5f),
                    PathNode.LineTo(20.0f, 10.0f)
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
                    PathNode.MoveTo(6.5f, 11.5f),
                    PathNode.LineTo(4.0f, 10.0f)
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
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.LineTo(12.01f, 13.0f)
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
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.LineTo(12.01f, 16.0f)
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
        return _snowman!!
    }

private var _snowman: ImageVector? = null
