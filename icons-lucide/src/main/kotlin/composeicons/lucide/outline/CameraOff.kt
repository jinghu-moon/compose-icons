package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CameraOff: ImageVector
    get() {
        if (_cameraOff != null) return _cameraOff!!
        _cameraOff = lucideOutlineIcon(
            name = "CameraOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.564f, 14.558f),
                    PathNode.CurveTo(13.917838f, 15.622073f, 12.681648f, 16.176517f, 11.457271f, 15.951403f),
                    PathNode.CurveTo(10.232894f, 15.726286f, 9.274765f, 14.76839f, 9.049352f, 13.544067f),
                    PathNode.CurveTo(8.823938f, 12.319745f, 9.378083f, 11.08342f, 10.442f, 10.437f)
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
                    PathNode.MoveTo(2.0f, 2.0f),
                    PathNode.LineTo(22.0f, 22.0f)
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
                    PathNode.MoveTo(20.0f, 20.0f),
                    PathNode.LineTo(4.0f, 20.0f),
                    PathNode.CurveTo(2.895431f, 20.0f, 2.0f, 19.10457f, 2.0f, 18.0f),
                    PathNode.LineTo(2.0f, 9.0f),
                    PathNode.CurveTo(2.0f, 7.895431f, 2.895431f, 7.0f, 4.0f, 7.0f),
                    PathNode.LineTo(5.997f, 7.0f),
                    PathNode.CurveTo(6.279291f, 7.000119f, 6.55841f, 6.940479f, 6.816f, 6.825f)
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
                    PathNode.MoveTo(9.695f, 4.024f),
                    PathNode.CurveTo(9.797224f, 4.00802f, 9.900535f, 3.999995f, 10.004f, 4.0f),
                    PathNode.LineTo(13.997f, 4.0f),
                    PathNode.CurveTo(14.732041f, 3.99999f, 15.407855f, 4.403174f, 15.757f, 5.05f),
                    PathNode.LineTo(16.243f, 5.95f),
                    PathNode.CurveTo(16.592144f, 6.596826f, 17.267958f, 7.000011f, 18.003f, 7.0f),
                    PathNode.LineTo(20.0f, 7.0f),
                    PathNode.CurveTo(21.10457f, 7.0f, 22.0f, 7.895431f, 22.0f, 9.0f),
                    PathNode.LineTo(22.0f, 16.344f)
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
        return _cameraOff!!
    }

private var _cameraOff: ImageVector? = null
