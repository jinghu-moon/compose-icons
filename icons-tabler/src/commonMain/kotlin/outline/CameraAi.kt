package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CameraAi: ImageVector
    get() {
        if (_cameraAi != null) return _cameraAi!!
        _cameraAi = tablerOutlineIcon(
            name = "CameraAi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(3.895431f, 20.0f, 3.0f, 19.10457f, 3.0f, 18.0f),
                    PathNode.LineTo(3.0f, 9.0f),
                    PathNode.CurveTo(3.0f, 7.895431f, 3.895431f, 7.0f, 5.0f, 7.0f),
                    PathNode.LineTo(6.0f, 7.0f),
                    PathNode.CurveTo(7.10457f, 7.0f, 8.0f, 6.10457f, 8.0f, 5.0f),
                    PathNode.CurveTo(8.0f, 4.447716f, 8.447715f, 4.0f, 9.0f, 4.0f),
                    PathNode.LineTo(15.0f, 4.0f),
                    PathNode.CurveTo(15.552285f, 4.0f, 16.0f, 4.447716f, 16.0f, 5.0f),
                    PathNode.CurveTo(16.0f, 6.10457f, 16.89543f, 7.0f, 18.0f, 7.0f),
                    PathNode.LineTo(19.0f, 7.0f),
                    PathNode.CurveTo(20.10457f, 7.0f, 21.0f, 7.895431f, 21.0f, 9.0f),
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
                    PathNode.MoveTo(14.362f, 11.15f),
                    PathNode.CurveTo(13.641253f, 10.229617f, 12.451512f, 9.811728f, 11.313524f, 10.079243f),
                    PathNode.CurveTo(10.175536f, 10.346757f, 9.296585f, 11.250948f, 9.061387f, 12.396052f),
                    PathNode.CurveTo(8.826189f, 13.541156f, 9.277585f, 14.718593f, 10.218f, 15.413f)
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
                    PathNode.MoveTo(14.0f, 21.0f),
                    PathNode.LineTo(14.0f, 17.0f),
                    PathNode.CurveTo(14.0f, 15.895431f, 14.895431f, 15.0f, 16.0f, 15.0f),
                    PathNode.CurveTo(17.10457f, 15.0f, 18.0f, 15.895431f, 18.0f, 17.0f),
                    PathNode.LineTo(18.0f, 21.0f)
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
                    PathNode.MoveTo(14.0f, 19.0f),
                    PathNode.LineTo(18.0f, 19.0f)
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
                    PathNode.MoveTo(21.0f, 15.0f),
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
        return _cameraAi!!
    }

private var _cameraAi: ImageVector? = null
