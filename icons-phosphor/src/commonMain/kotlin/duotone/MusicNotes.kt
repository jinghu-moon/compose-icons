package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MusicNotes: ImageVector
    get() {
        if (_musicNotes != null) return _musicNotes!!
        _musicNotes = phosphorDuotoneIcon(
            name = "MusicNotes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 164.0f),
                    PathNode.CurveTo(208.0f, 179.46397f, 195.46397f, 192.0f, 180.0f, 192.0f),
                    PathNode.CurveTo(164.53603f, 192.0f, 152.0f, 179.46397f, 152.0f, 164.0f),
                    PathNode.CurveTo(152.0f, 148.53603f, 164.53603f, 136.0f, 180.0f, 136.0f),
                    PathNode.CurveTo(195.46397f, 136.0f, 208.0f, 148.53603f, 208.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 168.0f),
                    PathNode.CurveTo(36.53603f, 168.0f, 24.0f, 180.53603f, 24.0f, 196.0f),
                    PathNode.CurveTo(24.0f, 211.46397f, 36.53603f, 224.0f, 52.0f, 224.0f),
                    PathNode.CurveTo(67.463974f, 224.0f, 80.0f, 211.46397f, 80.0f, 196.0f),
                    PathNode.CurveTo(80.0f, 180.53603f, 67.463974f, 168.0f, 52.0f, 168.0f),
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
                    PathNode.MoveTo(212.92f, 17.69f),
                    PathNode.CurveTo(210.97821f, 16.17697f, 208.44797f, 15.642151f, 206.06f, 16.24f),
                    PathNode.LineTo(78.06f, 48.24f),
                    PathNode.CurveTo(74.49896f, 49.13012f, 72.00056f, 52.3294f, 72.0f, 56.0f),
                    PathNode.LineTo(72.0f, 166.08f),
                    PathNode.CurveTo(58.26873f, 156.90541f, 40.05616f, 158.24998f, 27.82107f, 169.34157f),
                    PathNode.CurveTo(15.585978f, 180.43315f, 12.466534f, 198.4269f, 20.254114f, 212.98967f),
                    PathNode.CurveTo(28.041695f, 227.55244f, 44.73887f, 234.94907f, 60.75709f, 230.93193f),
                    PathNode.CurveTo(76.775314f, 226.9148f, 88.00608f, 212.51427f, 88.0f, 196.0f),
                    PathNode.LineTo(88.0f, 110.25f),
                    PathNode.LineTo(200.0f, 82.25f),
                    PathNode.LineTo(200.0f, 134.08f),
                    PathNode.CurveTo(186.26874f, 124.90541f, 168.05617f, 126.24998f, 155.82108f, 137.34157f),
                    PathNode.CurveTo(143.58598f, 148.43315f, 140.46654f, 166.4269f, 148.2541f, 180.98967f),
                    PathNode.CurveTo(156.04169f, 195.55244f, 172.73886f, 202.94907f, 188.7571f, 198.93193f),
                    PathNode.CurveTo(204.77531f, 194.9148f, 216.0061f, 180.51427f, 216.0f, 164.0f),
                    PathNode.LineTo(216.0f, 24.0f),
                    PathNode.CurveTo(216.00055f, 21.534422f, 214.86418f, 19.20633f, 212.92f, 17.69f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 216.0f),
                    PathNode.CurveTo(40.954304f, 216.0f, 32.0f, 207.0457f, 32.0f, 196.0f),
                    PathNode.CurveTo(32.0f, 184.9543f, 40.954304f, 176.0f, 52.0f, 176.0f),
                    PathNode.CurveTo(63.045696f, 176.0f, 72.0f, 184.9543f, 72.0f, 196.0f),
                    PathNode.CurveTo(72.0f, 207.0457f, 63.045696f, 216.0f, 52.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 93.75f),
                    PathNode.LineTo(88.0f, 62.25f),
                    PathNode.LineTo(200.0f, 34.25f),
                    PathNode.LineTo(200.0f, 65.75f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 184.0f),
                    PathNode.CurveTo(168.9543f, 184.0f, 160.0f, 175.0457f, 160.0f, 164.0f),
                    PathNode.CurveTo(160.0f, 152.9543f, 168.9543f, 144.0f, 180.0f, 144.0f),
                    PathNode.CurveTo(191.0457f, 144.0f, 200.0f, 152.9543f, 200.0f, 164.0f),
                    PathNode.CurveTo(200.0f, 175.0457f, 191.0457f, 184.0f, 180.0f, 184.0f),
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
        return _musicNotes!!
    }

private var _musicNotes: ImageVector? = null
