package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CameraPin: ImageVector
    get() {
        if (_cameraPin != null) return _cameraPin!!
        _cameraPin = tablerOutlineIcon(
            name = "CameraPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.5f, 20.0f),
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
                    PathNode.MoveTo(14.933f, 12.366f),
                    PathNode.CurveTo(14.600778f, 10.826396f, 13.134833f, 9.805598f, 11.575587f, 10.028094f),
                    PathNode.CurveTo(10.016342f, 10.250589f, 8.894415f, 11.640661f, 9.006069f, 13.211739f),
                    PathNode.CurveTo(9.117723f, 14.782817f, 10.42496f, 16.000252f, 12.0f, 16.0f)
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
        }
        return _cameraPin!!
    }

private var _cameraPin: ImageVector? = null
