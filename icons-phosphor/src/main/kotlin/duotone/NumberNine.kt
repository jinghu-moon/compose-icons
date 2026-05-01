package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberNine: ImageVector
    get() {
        if (_numberNine != null) return _numberNine!!
        _numberNine = phosphorDuotoneIcon(
            name = "NumberNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(216.0f, 224.83656f, 208.83656f, 232.0f, 200.0f, 232.0f),
                    PathNode.LineTo(56.0f, 232.0f),
                    PathNode.CurveTo(47.163445f, 232.0f, 40.0f, 224.83656f, 40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 31.163445f, 47.163445f, 24.0f, 56.0f, 24.0f),
                    PathNode.LineTo(200.0f, 24.0f),
                    PathNode.CurveTo(208.83656f, 24.0f, 216.0f, 31.163445f, 216.0f, 40.0f),
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
                    PathNode.MoveTo(128.0f, 40.0f),
                    PathNode.CurveTo(106.08931f, 39.989964f, 86.185394f, 52.759254f, 77.06104f, 72.67971f),
                    PathNode.CurveTo(67.9367f, 92.60017f, 71.268166f, 116.01218f, 85.58708f, 132.59671f),
                    PathNode.CurveTo(99.906006f, 149.18126f, 122.581825f, 155.89156f, 143.62f, 149.77f),
                    PathNode.LineTo(113.0f, 204.07f),
                    PathNode.CurveTo(110.83228f, 207.93599f, 112.20901f, 212.82729f, 116.075f, 214.995f),
                    PathNode.CurveTo(119.940994f, 217.16272f, 124.83228f, 215.786f, 127.0f, 211.92f),
                    PathNode.LineTo(176.55f, 123.92f),
                    PathNode.CurveTo(186.51721f, 106.59036f, 186.49022f, 85.26158f, 176.47917f, 67.95722f),
                    PathNode.CurveTo(166.46814f, 50.65287f, 147.99153f, 39.99769f, 128.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 136.0f),
                    PathNode.CurveTo(105.90861f, 136.0f, 88.0f, 118.09139f, 88.0f, 96.0f),
                    PathNode.CurveTo(88.0f, 73.90861f, 105.90861f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(150.09138f, 56.0f, 168.0f, 73.90861f, 168.0f, 96.0f),
                    PathNode.CurveTo(168.0f, 118.09139f, 150.09138f, 136.0f, 128.0f, 136.0f),
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
        return _numberNine!!
    }

private var _numberNine: ImageVector? = null
