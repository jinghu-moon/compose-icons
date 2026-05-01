package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceAudioTape: ImageVector
    get() {
        if (_deviceAudioTape != null) return _deviceAudioTape!!
        _deviceAudioTape = tablerOutlineIcon(
            name = "DeviceAudioTape",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 7.0f),
                    PathNode.CurveTo(3.0f, 5.895431f, 3.895431f, 5.0f, 5.0f, 5.0f),
                    PathNode.LineTo(19.0f, 5.0f),
                    PathNode.CurveTo(20.10457f, 5.0f, 21.0f, 5.895431f, 21.0f, 7.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.CurveTo(21.0f, 18.10457f, 20.10457f, 19.0f, 19.0f, 19.0f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(3.895431f, 19.0f, 3.0f, 18.10457f, 3.0f, 17.0f),
                    PathNode.LineTo(3.0f, 7.0f)
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
                    PathNode.MoveTo(3.0f, 17.0f),
                    PathNode.LineTo(7.0f, 14.0f),
                    PathNode.LineTo(17.0f, 14.0f),
                    PathNode.LineTo(21.0f, 17.0f)
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
                    PathNode.MoveTo(7.0f, 9.5f),
                    PathNode.CurveTo(7.0f, 9.776142f, 7.223858f, 10.0f, 7.5f, 10.0f),
                    PathNode.CurveTo(7.776143f, 10.0f, 8.0f, 9.776142f, 8.0f, 9.5f),
                    PathNode.CurveTo(8.0f, 9.223858f, 7.776143f, 9.0f, 7.5f, 9.0f),
                    PathNode.CurveTo(7.223858f, 9.0f, 7.0f, 9.223858f, 7.0f, 9.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
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
                    PathNode.MoveTo(16.0f, 9.5f),
                    PathNode.CurveTo(16.0f, 9.776142f, 16.223858f, 10.0f, 16.5f, 10.0f),
                    PathNode.CurveTo(16.776142f, 10.0f, 17.0f, 9.776142f, 17.0f, 9.5f),
                    PathNode.CurveTo(17.0f, 9.223858f, 16.776142f, 9.0f, 16.5f, 9.0f),
                    PathNode.CurveTo(16.223858f, 9.0f, 16.0f, 9.223858f, 16.0f, 9.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _deviceAudioTape!!
    }

private var _deviceAudioTape: ImageVector? = null
