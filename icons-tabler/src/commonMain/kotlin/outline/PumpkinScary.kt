package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PumpkinScary: ImageVector
    get() {
        if (_pumpkinScary != null) return _pumpkinScary!!
        _pumpkinScary = tablerOutlineIcon(
            name = "PumpkinScary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 15.0f),
                    PathNode.LineTo(10.5f, 16.0f),
                    PathNode.LineTo(12.0f, 15.0f),
                    PathNode.LineTo(13.5f, 16.0f),
                    PathNode.LineTo(15.0f, 15.0f)
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
                    PathNode.MoveTo(10.0f, 11.0f),
                    PathNode.LineTo(10.01f, 11.0f)
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
                    PathNode.MoveTo(14.0f, 11.0f),
                    PathNode.LineTo(14.01f, 11.0f)
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
                    PathNode.MoveTo(17.0f, 6.082f),
                    PathNode.CurveTo(19.609f, 6.67f, 20.627f, 10.244f, 19.723f, 14.065f),
                    PathNode.CurveTo(18.82f, 17.885f, 16.973f, 20.505f, 14.364f, 19.918f),
                    PathNode.CurveTo(14.095531f, 19.857107f, 13.835576f, 19.763403f, 13.59f, 19.639f),
                    PathNode.CurveTo(13.093129f, 19.87518f, 12.550144f, 19.99846f, 12.0f, 20.0f),
                    PathNode.CurveTo(11.444f, 20.0f, 10.91f, 19.873f, 10.41f, 19.638f),
                    PathNode.CurveTo(10.164713f, 19.763308f, 9.904686f, 19.857374f, 9.636f, 19.918f),
                    PathNode.CurveTo(7.027f, 20.506f, 5.18f, 17.885f, 4.276f, 14.065f),
                    PathNode.CurveTo(3.373f, 10.245f, 4.391f, 6.67f, 7.0f, 6.082f),
                    PathNode.CurveTo(8.085f, 5.838f, 8.575f, 6.148f, 9.585f, 6.869f),
                    PathNode.CurveTo(10.301f, 6.315f, 11.125f, 6.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(12.876f, 6.0f, 13.699f, 6.315f, 14.415f, 6.87f),
                    PathNode.CurveTo(15.425f, 6.148f, 15.915f, 5.838f, 17.0f, 6.082f)
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
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.CurveTo(12.0f, 4.774f, 12.693f, 3.654f, 13.789f, 3.106f),
                    PathNode.LineTo(14.0f, 3.0f)
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
        return _pumpkinScary!!
    }

private var _pumpkinScary: ImageVector? = null
