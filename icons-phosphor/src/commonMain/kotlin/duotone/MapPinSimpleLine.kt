package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MapPinSimpleLine: ImageVector
    get() {
        if (_mapPinSimpleLine != null) return _mapPinSimpleLine!!
        _mapPinSimpleLine = phosphorDuotoneIcon(
            name = "MapPinSimpleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 80.0f),
                    PathNode.CurveTo(176.0f, 106.50967f, 154.50967f, 128.0f, 128.0f, 128.0f),
                    PathNode.CurveTo(101.49033f, 128.0f, 80.0f, 106.50967f, 80.0f, 80.0f),
                    PathNode.CurveTo(80.0f, 53.490334f, 101.49033f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(154.50967f, 32.0f, 176.0f, 53.490334f, 176.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 208.0f),
                    PathNode.LineTo(136.0f, 208.0f),
                    PathNode.LineTo(136.0f, 135.42f),
                    PathNode.CurveTo(165.07062f, 131.22401f, 185.95961f, 105.28053f, 183.85622f, 75.98408f),
                    PathNode.CurveTo(181.75284f, 46.687626f, 157.37187f, 23.994373f, 128.0f, 23.994373f),
                    PathNode.CurveTo(98.62813f, 23.994373f, 74.24717f, 46.687626f, 72.143776f, 75.98408f),
                    PathNode.CurveTo(70.04039f, 105.28053f, 90.92939f, 131.22401f, 120.0f, 135.42f),
                    PathNode.LineTo(120.0f, 208.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(35.581722f, 208.0f, 32.0f, 211.58173f, 32.0f, 216.0f),
                    PathNode.CurveTo(32.0f, 220.41827f, 35.581722f, 224.0f, 40.0f, 224.0f),
                    PathNode.LineTo(216.0f, 224.0f),
                    PathNode.CurveTo(220.41827f, 224.0f, 224.0f, 220.41827f, 224.0f, 216.0f),
                    PathNode.CurveTo(224.0f, 211.58173f, 220.41827f, 208.0f, 216.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 80.0f),
                    PathNode.CurveTo(88.0f, 57.90861f, 105.90861f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(150.09138f, 40.0f, 168.0f, 57.90861f, 168.0f, 80.0f),
                    PathNode.CurveTo(168.0f, 102.09139f, 150.09138f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(105.90861f, 120.0f, 88.0f, 102.09139f, 88.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mapPinSimpleLine!!
    }

private var _mapPinSimpleLine: ImageVector? = null
