package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FishOff: ImageVector
    get() {
        if (_fishOff != null) return _fishOff!!
        _fishOff = lucideOutlineIcon(
            name = "FishOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 12.47f),
                    PathNode.LineTo(18.0f, 12.5f),
                    PathNode.MoveTo(18.0f, 12.0f),
                    PathNode.LineTo(18.0f, 12.47f),
                    PathNode.MoveTo(17.525f, 17.526f),
                    PathNode.CurveTo(16.721481f, 17.844336f, 15.864264f, 18.005257f, 15.0f, 18.0f),
                    PathNode.CurveTo(11.44f, 18.0f, 7.44f, 15.47f, 6.5f, 12.0f),
                    PathNode.CurveTo(6.848f, 10.72f, 7.614f, 9.567f, 8.621f, 8.62f),
                    PathNode.MoveTo(12.065f, 6.532f),
                    PathNode.CurveTo(13.005942f, 6.188982f, 13.998525f, 6.009066f, 15.0f, 6.0f),
                    PathNode.CurveTo(18.56f, 6.0f, 21.06f, 8.54f, 22.0f, 12.0f),
                    PathNode.CurveTo(21.691f, 13.14f, 21.214f, 14.177f, 20.587f, 15.058f)
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
                    PathNode.MoveTo(7.0f, 10.67f),
                    PathNode.CurveTo(7.0f, 8.0f, 5.58f, 5.97f, 2.73f, 5.5f),
                    PathNode.CurveTo(1.73f, 7.0f, 1.73f, 10.5f, 2.96f, 12.0f),
                    PathNode.CurveTo(1.72f, 13.5f, 1.72f, 17.0f, 2.73f, 18.5f),
                    PathNode.CurveTo(5.58f, 18.03f, 7.0f, 16.0f, 7.0f, 13.33f),
                    PathNode.MoveTo(14.48f, 8.958f),
                    PathNode.CurveTo(14.821161f, 7.91692f, 15.334994f, 6.940636f, 16.0f, 6.07f),
                    PathNode.MoveTo(16.0f, 17.93f),
                    PathNode.CurveTo(15.18007f, 16.856432f, 14.591681f, 15.624494f, 14.272f, 14.312f)
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
                    PathNode.MoveTo(16.01f, 17.93f),
                    PathNode.LineTo(15.78f, 19.33f),
                    PathNode.CurveTo(15.618302f, 20.296595f, 14.780019f, 21.003632f, 13.8f, 21.0f),
                    PathNode.LineTo(9.5f, 21.0f),
                    PathNode.CurveTo(10.46885f, 19.901493f, 10.999264f, 18.484684f, 10.99f, 17.02f),
                    PathNode.MoveTo(8.53f, 3.0f),
                    PathNode.LineTo(13.8f, 3.0f),
                    PathNode.CurveTo(14.780019f, 2.996369f, 15.618302f, 3.703406f, 15.78f, 4.67f),
                    PathNode.LineTo(16.01f, 6.07f),
                    PathNode.MoveTo(2.0f, 2.0f),
                    PathNode.LineTo(22.0f, 22.0f)
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
        return _fishOff!!
    }

private var _fishOff: ImageVector? = null
