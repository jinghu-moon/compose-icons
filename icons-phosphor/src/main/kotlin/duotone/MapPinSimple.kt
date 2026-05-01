package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MapPinSimple: ImageVector
    get() {
        if (_mapPinSimple != null) return _mapPinSimple!!
        _mapPinSimple = phosphorDuotoneIcon(
            name = "MapPinSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 72.0f),
                    PathNode.CurveTo(176.0f, 98.50967f, 154.50967f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(101.49033f, 120.0f, 80.0f, 98.50967f, 80.0f, 72.0f),
                    PathNode.CurveTo(80.0f, 45.490334f, 101.49033f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(154.50967f, 24.0f, 176.0f, 45.490334f, 176.0f, 72.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 72.0f),
                    PathNode.CurveTo(184.003f, 42.11121f, 160.53313f, 17.488089f, 130.67854f, 16.05847f),
                    PathNode.CurveTo(100.82397f, 14.628852f, 75.10867f, 36.896687f, 72.2557f, 66.64901f),
                    PathNode.CurveTo(69.402725f, 96.40133f, 90.41776f, 123.15017f, 120.0f, 127.42f),
                    PathNode.LineTo(120.0f, 232.0f),
                    PathNode.CurveTo(120.0f, 236.41827f, 123.58172f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(132.41827f, 240.0f, 136.0f, 236.41827f, 136.0f, 232.0f),
                    PathNode.LineTo(136.0f, 127.42f),
                    PathNode.CurveTo(163.53015f, 123.40733f, 183.95857f, 99.82102f, 184.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 112.0f),
                    PathNode.CurveTo(105.90861f, 112.0f, 88.0f, 94.09139f, 88.0f, 72.0f),
                    PathNode.CurveTo(88.0f, 49.90861f, 105.90861f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(150.09138f, 32.0f, 168.0f, 49.90861f, 168.0f, 72.0f),
                    PathNode.CurveTo(168.0f, 94.09139f, 150.09138f, 112.0f, 128.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mapPinSimple!!
    }

private var _mapPinSimple: ImageVector? = null
