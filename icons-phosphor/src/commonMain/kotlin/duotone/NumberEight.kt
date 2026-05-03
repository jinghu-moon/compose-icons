package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NumberEight: ImageVector
    get() {
        if (_numberEight != null) return _numberEight!!
        _numberEight = phosphorDuotoneIcon(
            name = "NumberEight",
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
                    PathNode.MoveTo(155.55f, 119.27f),
                    PathNode.CurveTo(172.7017f, 107.24832f, 180.07805f, 85.493324f, 173.77504f, 65.51899f),
                    PathNode.CurveTo(167.47205f, 45.544662f, 148.9452f, 31.963543f, 128.0f, 31.963543f),
                    PathNode.CurveTo(107.054794f, 31.963543f, 88.527954f, 45.544662f, 82.22495f, 65.51899f),
                    PathNode.CurveTo(75.92195f, 85.493324f, 83.298294f, 107.24832f, 100.45f, 119.27f),
                    PathNode.CurveTo(78.29956f, 131.7867f, 67.37051f, 157.66232f, 73.84167f, 182.26788f),
                    PathNode.CurveTo(80.312836f, 206.87344f, 102.55772f, 224.02446f, 128.0f, 224.02446f),
                    PathNode.CurveTo(153.44228f, 224.02446f, 175.68716f, 206.87344f, 182.15833f, 182.26788f),
                    PathNode.CurveTo(188.6295f, 157.66232f, 177.70044f, 131.7867f, 155.55f, 119.27f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 80.0f),
                    PathNode.CurveTo(96.0f, 62.32689f, 110.32689f, 48.0f, 128.0f, 48.0f),
                    PathNode.CurveTo(145.67311f, 48.0f, 160.0f, 62.32689f, 160.0f, 80.0f),
                    PathNode.CurveTo(160.0f, 97.67311f, 145.67311f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(110.32689f, 112.0f, 96.0f, 97.67311f, 96.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 208.0f),
                    PathNode.CurveTo(105.90861f, 208.0f, 88.0f, 190.09138f, 88.0f, 168.0f),
                    PathNode.CurveTo(88.0f, 145.90862f, 105.90861f, 128.0f, 128.0f, 128.0f),
                    PathNode.CurveTo(150.09138f, 128.0f, 168.0f, 145.90862f, 168.0f, 168.0f),
                    PathNode.CurveTo(168.0f, 190.09138f, 150.09138f, 208.0f, 128.0f, 208.0f),
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
        return _numberEight!!
    }

private var _numberEight: ImageVector? = null
