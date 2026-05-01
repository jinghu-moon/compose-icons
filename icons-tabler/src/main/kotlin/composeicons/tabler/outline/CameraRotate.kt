package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CameraRotate: ImageVector
    get() {
        if (_cameraRotate != null) return _cameraRotate!!
        _cameraRotate = tablerOutlineIcon(
            name = "CameraRotate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 7.0f),
                    PathNode.LineTo(6.0f, 7.0f),
                    PathNode.CurveTo(7.10457f, 7.0f, 8.0f, 6.10457f, 8.0f, 5.0f),
                    PathNode.CurveTo(8.0f, 4.447716f, 8.447715f, 4.0f, 9.0f, 4.0f),
                    PathNode.LineTo(15.0f, 4.0f),
                    PathNode.CurveTo(15.552285f, 4.0f, 16.0f, 4.447716f, 16.0f, 5.0f),
                    PathNode.CurveTo(16.0f, 6.10457f, 16.89543f, 7.0f, 18.0f, 7.0f),
                    PathNode.LineTo(19.0f, 7.0f),
                    PathNode.CurveTo(20.10457f, 7.0f, 21.0f, 7.895431f, 21.0f, 9.0f),
                    PathNode.LineTo(21.0f, 18.0f),
                    PathNode.CurveTo(21.0f, 19.10457f, 20.10457f, 20.0f, 19.0f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(3.895431f, 20.0f, 3.0f, 19.10457f, 3.0f, 18.0f),
                    PathNode.LineTo(3.0f, 9.0f),
                    PathNode.CurveTo(3.0f, 7.895431f, 3.895431f, 7.0f, 5.0f, 7.0f)
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
                    PathNode.MoveTo(11.245f, 15.904f),
                    PathNode.CurveTo(12.143971f, 16.137766f, 13.100524f, 15.941926f, 13.835296f, 15.373676f),
                    PathNode.CurveTo(14.570067f, 14.805427f, 15.000173f, 13.928868f, 15.0f, 13.0f),
                    PathNode.MoveTo(12.75f, 10.095f),
                    PathNode.CurveTo(11.851556f, 9.863023f, 10.896331f, 10.059852f, 10.162779f, 10.62811f),
                    PathNode.CurveTo(9.429227f, 11.196367f, 8.999919f, 12.072091f, 9.0f, 13.0f)
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
                    PathNode.MoveTo(14.0f, 13.0f),
                    PathNode.LineTo(16.0f, 13.0f),
                    PathNode.LineTo(16.0f, 15.0f)
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
                    PathNode.MoveTo(10.0f, 13.0f),
                    PathNode.LineTo(8.0f, 13.0f),
                    PathNode.LineTo(8.0f, 11.0f)
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
        return _cameraRotate!!
    }

private var _cameraRotate: ImageVector? = null
