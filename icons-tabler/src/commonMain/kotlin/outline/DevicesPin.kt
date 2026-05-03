package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DevicesPin: ImageVector
    get() {
        if (_devicesPin != null) return _devicesPin!!
        _devicesPin = tablerOutlineIcon(
            name = "DevicesPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 14.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.CurveTo(13.0f, 8.447715f, 13.447715f, 8.0f, 14.0f, 8.0f),
                    PathNode.LineTo(20.0f, 8.0f),
                    PathNode.CurveTo(20.552284f, 8.0f, 21.0f, 8.447715f, 21.0f, 9.0f),
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
                    PathNode.MoveTo(18.0f, 8.0f),
                    PathNode.LineTo(18.0f, 5.0f),
                    PathNode.CurveTo(18.0f, 4.447716f, 17.552284f, 4.0f, 17.0f, 4.0f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.CurveTo(3.447715f, 4.0f, 3.0f, 4.447716f, 3.0f, 5.0f),
                    PathNode.LineTo(3.0f, 17.0f),
                    PathNode.CurveTo(3.0f, 17.552284f, 3.447715f, 18.0f, 4.0f, 18.0f),
                    PathNode.LineTo(12.0f, 18.0f)
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
                    PathNode.MoveTo(21.121f, 20.121f),
                    PathNode.CurveTo(21.979181f, 19.263077f, 22.236015f, 17.972652f, 21.771725f, 16.851519f),
                    PathNode.CurveTo(21.307436f, 15.730384f, 20.213469f, 14.999359f, 19.0f, 14.999359f),
                    PathNode.CurveTo(17.786531f, 14.999359f, 16.692564f, 15.730384f, 16.228275f, 16.851519f),
                    PathNode.CurveTo(15.763985f, 17.972652f, 16.020819f, 19.263077f, 16.879f, 20.121f),
                    PathNode.CurveTo(17.297f, 20.54f, 18.004f, 21.166f, 19.0f, 22.0f),
                    PathNode.CurveTo(20.051f, 21.11f, 20.759f, 20.484f, 21.121f, 20.121f)
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
                    PathNode.MoveTo(19.0f, 18.0f),
                    PathNode.LineTo(19.0f, 18.01f)
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
                    PathNode.MoveTo(16.0f, 9.0f),
                    PathNode.LineTo(18.0f, 9.0f)
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
        return _devicesPin!!
    }

private var _devicesPin: ImageVector? = null
