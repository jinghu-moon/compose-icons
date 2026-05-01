package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MusicNoteSimple: ImageVector
    get() {
        if (_musicNoteSimple != null) return _musicNoteSimple!!
        _musicNoteSimple = phosphorBoldIcon(
            name = "MusicNoteSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(211.45f, 52.51f),
                    PathNode.LineTo(131.45f, 28.51f),
                    PathNode.CurveTo(127.81712f, 27.419508f, 123.88255f, 28.110783f, 120.83895f, 30.37428f),
                    PathNode.CurveTo(117.79534f, 32.637775f, 116.001076f, 36.206985f, 116.0f, 40.0f),
                    PathNode.LineTo(116.0f, 140.22f),
                    PathNode.CurveTo(95.98137f, 127.42791f, 69.83858f, 129.82947f, 52.485546f, 146.05463f),
                    PathNode.CurveTo(35.13253f, 162.27979f, 30.982136f, 188.2025f, 42.402084f, 209.0344f),
                    PathNode.CurveTo(53.822037f, 229.86629f, 77.90825f, 240.30983f, 100.92003f, 234.40718f),
                    PathNode.CurveTo(123.93181f, 228.50453f, 140.01727f, 207.75674f, 140.0f, 184.0f),
                    PathNode.LineTo(140.0f, 56.13f),
                    PathNode.LineTo(204.55f, 75.49f),
                    PathNode.CurveTo(210.90128f, 77.395386f, 217.59462f, 73.791275f, 219.5f, 67.44f),
                    PathNode.CurveTo(221.40538f, 61.08873f, 217.80127f, 54.39538f, 211.45f, 52.49f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 212.0f),
                    PathNode.CurveTo(72.536026f, 212.0f, 60.0f, 199.46397f, 60.0f, 184.0f),
                    PathNode.CurveTo(60.0f, 168.53603f, 72.536026f, 156.0f, 88.0f, 156.0f),
                    PathNode.CurveTo(103.463974f, 156.0f, 116.0f, 168.53603f, 116.0f, 184.0f),
                    PathNode.CurveTo(116.0f, 199.46397f, 103.463974f, 212.0f, 88.0f, 212.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _musicNoteSimple!!
    }

private var _musicNoteSimple: ImageVector? = null
