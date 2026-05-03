package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CastleTurret: ImageVector
    get() {
        if (_castleTurret != null) return _castleTurret!!
        _castleTurret = phosphorDuotoneIcon(
            name = "CastleTurret",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 92.69f),
                    PathNode.CurveTo(207.99902f, 94.80891f, 207.15746f, 96.84087f, 205.66f, 98.34f),
                    PathNode.LineTo(192.0f, 112.0f),
                    PathNode.LineTo(192.0f, 224.0f),
                    PathNode.LineTo(152.0f, 224.0f),
                    PathNode.LineTo(152.0f, 168.0f),
                    PathNode.CurveTo(152.0f, 154.74516f, 141.25484f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(114.74516f, 144.0f, 104.0f, 154.74516f, 104.0f, 168.0f),
                    PathNode.LineTo(104.0f, 224.0f),
                    PathNode.LineTo(64.0f, 224.0f),
                    PathNode.LineTo(64.0f, 112.0f),
                    PathNode.LineTo(50.34f, 98.34f),
                    PathNode.CurveTo(48.84254f, 96.84087f, 48.00098f, 94.80891f, 48.0f, 92.69f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.CurveTo(48.0f, 43.581722f, 51.581722f, 40.0f, 56.0f, 40.0f),
                    PathNode.LineTo(80.0f, 40.0f),
                    PathNode.LineTo(80.0f, 72.0f),
                    PathNode.LineTo(112.0f, 72.0f),
                    PathNode.LineTo(112.0f, 40.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.LineTo(144.0f, 72.0f),
                    PathNode.LineTo(176.0f, 72.0f),
                    PathNode.LineTo(176.0f, 40.0f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.CurveTo(204.41827f, 40.0f, 208.0f, 43.581722f, 208.0f, 48.0f),
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
                    PathNode.MoveTo(216.0f, 216.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.LineTo(200.0f, 115.31f),
                    PathNode.LineTo(211.31f, 104.0f),
                    PathNode.CurveTo(214.32419f, 101.00975f, 216.01357f, 96.93579f, 216.0f, 92.69f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(216.0f, 39.163445f, 208.83656f, 32.0f, 200.0f, 32.0f),
                    PathNode.LineTo(176.0f, 32.0f),
                    PathNode.CurveTo(171.58173f, 32.0f, 168.0f, 35.581722f, 168.0f, 40.0f),
                    PathNode.LineTo(168.0f, 64.0f),
                    PathNode.LineTo(152.0f, 64.0f),
                    PathNode.LineTo(152.0f, 40.0f),
                    PathNode.CurveTo(152.0f, 35.581722f, 148.41827f, 32.0f, 144.0f, 32.0f),
                    PathNode.LineTo(112.0f, 32.0f),
                    PathNode.CurveTo(107.58172f, 32.0f, 104.0f, 35.581722f, 104.0f, 40.0f),
                    PathNode.LineTo(104.0f, 64.0f),
                    PathNode.LineTo(88.0f, 64.0f),
                    PathNode.LineTo(88.0f, 40.0f),
                    PathNode.CurveTo(88.0f, 35.581722f, 84.41828f, 32.0f, 80.0f, 32.0f),
                    PathNode.LineTo(56.0f, 32.0f),
                    PathNode.CurveTo(47.163445f, 32.0f, 40.0f, 39.163445f, 40.0f, 48.0f),
                    PathNode.LineTo(40.0f, 92.69f),
                    PathNode.CurveTo(39.986435f, 96.93579f, 41.67581f, 101.00975f, 44.69f, 104.0f),
                    PathNode.LineTo(56.0f, 115.31f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(35.581722f, 216.0f, 32.0f, 219.58173f, 32.0f, 224.0f),
                    PathNode.CurveTo(32.0f, 228.41827f, 35.581722f, 232.0f, 40.0f, 232.0f),
                    PathNode.LineTo(216.0f, 232.0f),
                    PathNode.CurveTo(220.41827f, 232.0f, 224.0f, 228.41827f, 224.0f, 224.0f),
                    PathNode.CurveTo(224.0f, 219.58173f, 220.41827f, 216.0f, 216.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(69.66f, 106.34f),
                    PathNode.LineTo(56.0f, 92.69f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.LineTo(72.0f, 48.0f),
                    PathNode.LineTo(72.0f, 72.0f),
                    PathNode.CurveTo(72.0f, 76.41828f, 75.58172f, 80.0f, 80.0f, 80.0f),
                    PathNode.LineTo(112.0f, 80.0f),
                    PathNode.CurveTo(116.41828f, 80.0f, 120.0f, 76.41828f, 120.0f, 72.0f),
                    PathNode.LineTo(120.0f, 48.0f),
                    PathNode.LineTo(136.0f, 48.0f),
                    PathNode.LineTo(136.0f, 72.0f),
                    PathNode.CurveTo(136.0f, 76.41828f, 139.58173f, 80.0f, 144.0f, 80.0f),
                    PathNode.LineTo(176.0f, 80.0f),
                    PathNode.CurveTo(180.41827f, 80.0f, 184.0f, 76.41828f, 184.0f, 72.0f),
                    PathNode.LineTo(184.0f, 48.0f),
                    PathNode.LineTo(200.0f, 48.0f),
                    PathNode.LineTo(200.0f, 92.69f),
                    PathNode.LineTo(186.34f, 106.34f),
                    PathNode.CurveTo(184.84007f, 107.841576f, 183.99834f, 109.87763f, 184.0f, 112.0f),
                    PathNode.LineTo(184.0f, 216.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.LineTo(160.0f, 168.0f),
                    PathNode.CurveTo(160.0f, 150.32689f, 145.67311f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(110.32689f, 136.0f, 96.0f, 150.32689f, 96.0f, 168.0f),
                    PathNode.LineTo(96.0f, 216.0f),
                    PathNode.LineTo(72.0f, 216.0f),
                    PathNode.LineTo(72.0f, 112.0f),
                    PathNode.CurveTo(72.00167f, 109.87763f, 71.15991f, 107.841576f, 69.66f, 106.34f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 216.0f),
                    PathNode.LineTo(112.0f, 216.0f),
                    PathNode.LineTo(112.0f, 168.0f),
                    PathNode.CurveTo(112.0f, 159.16344f, 119.163445f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(136.83656f, 152.0f, 144.0f, 159.16344f, 144.0f, 168.0f),
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
        return _castleTurret!!
    }

private var _castleTurret: ImageVector? = null
