package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceCameraPhone: ImageVector
    get() {
        if (_deviceCameraPhone != null) return _deviceCameraPhone!!
        _deviceCameraPhone = tablerOutlineIcon(
            name = "DeviceCameraPhone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 8.5f),
                    PathNode.CurveTo(16.0f, 9.880712f, 17.119287f, 11.0f, 18.5f, 11.0f),
                    PathNode.CurveTo(19.880713f, 11.0f, 21.0f, 9.880712f, 21.0f, 8.5f),
                    PathNode.CurveTo(21.0f, 7.119288f, 19.880713f, 6.0f, 18.5f, 6.0f),
                    PathNode.CurveTo(17.119287f, 6.0f, 16.0f, 7.119288f, 16.0f, 8.5f)
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
                    PathNode.MoveTo(13.0f, 7.0f),
                    PathNode.LineTo(5.0f, 7.0f),
                    PathNode.CurveTo(3.895431f, 7.0f, 3.0f, 7.895431f, 3.0f, 9.0f),
                    PathNode.LineTo(3.0f, 16.0f),
                    PathNode.CurveTo(3.0f, 17.10457f, 3.895431f, 18.0f, 5.0f, 18.0f),
                    PathNode.LineTo(18.0f, 18.0f),
                    PathNode.CurveTo(19.10457f, 18.0f, 20.0f, 17.10457f, 20.0f, 16.0f),
                    PathNode.LineTo(20.0f, 14.0f)
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
                    PathNode.MoveTo(17.0f, 15.0f),
                    PathNode.LineTo(17.0f, 14.0f)
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
        return _deviceCameraPhone!!
    }

private var _deviceCameraPhone: ImageVector? = null
