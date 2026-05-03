package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapPinSimpleArea: ImageVector
    get() {
        if (_mapPinSimpleArea != null) return _mapPinSimpleArea!!
        _mapPinSimpleArea = phosphorBoldIcon(
            name = "MapPinSimpleArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(116.0f, 106.32f),
                    PathNode.LineTo(116.0f, 176.0f),
                    PathNode.CurveTo(116.0f, 182.62741f, 121.37258f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(134.62741f, 188.0f, 140.0f, 182.62741f, 140.0f, 176.0f),
                    PathNode.LineTo(140.0f, 106.32f),
                    PathNode.CurveTo(161.1274f, 100.33094f, 174.60432f, 79.681046f, 171.58101f, 57.930298f),
                    PathNode.CurveTo(168.5577f, 36.179543f, 149.95987f, 19.98798f, 128.0f, 19.98798f),
                    PathNode.CurveTo(106.04014f, 19.98798f, 87.44231f, 36.179543f, 84.41899f, 57.930298f),
                    PathNode.CurveTo(81.395676f, 79.681046f, 94.872604f, 100.33094f, 116.0f, 106.32f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 44.0f),
                    PathNode.CurveTo(139.0457f, 44.0f, 148.0f, 52.954304f, 148.0f, 64.0f),
                    PathNode.CurveTo(148.0f, 75.04569f, 139.0457f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(116.95431f, 84.0f, 108.0f, 75.04569f, 108.0f, 64.0f),
                    PathNode.CurveTo(108.0f, 52.954304f, 116.95431f, 44.0f, 128.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 176.0f),
                    PathNode.CurveTo(244.0f, 197.59f, 220.1f, 210.0f, 205.85f, 215.48f),
                    PathNode.CurveTo(184.86f, 223.56f, 157.22f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(70.36f, 228.0f, 12.0f, 210.14f, 12.0f, 176.0f),
                    PathNode.CurveTo(12.0f, 153.77f, 38.12f, 135.8f, 81.88f, 127.94f),
                    PathNode.CurveTo(86.12865f, 127.11439f, 90.49269f, 128.64066f, 93.30071f, 131.93423f),
                    PathNode.CurveTo(96.108734f, 135.22781f, 96.92559f, 139.7783f, 95.43842f, 143.84291f),
                    PathNode.CurveTo(93.95126f, 147.90752f, 90.39054f, 150.85634f, 86.12f, 151.56f),
                    PathNode.CurveTo(51.93f, 157.71f, 36.0f, 169.78f, 36.0f, 176.0f),
                    PathNode.CurveTo(36.0f, 180.0f, 43.12f, 187.07f, 58.77f, 193.08f),
                    PathNode.CurveTo(77.07f, 200.08f, 101.66f, 204.0f, 128.0f, 204.0f),
                    PathNode.CurveTo(154.34f, 204.0f, 178.93f, 200.12f, 197.23f, 193.08f),
                    PathNode.CurveTo(212.87f, 187.07f, 220.0f, 180.0f, 220.0f, 176.0f),
                    PathNode.CurveTo(220.0f, 169.78f, 204.07f, 157.71f, 169.88f, 151.56f),
                    PathNode.CurveTo(165.60947f, 150.85634f, 162.04874f, 147.90752f, 160.56157f, 143.84291f),
                    PathNode.CurveTo(159.07442f, 139.7783f, 159.89127f, 135.22781f, 162.6993f, 131.93423f),
                    PathNode.CurveTo(165.50731f, 128.64066f, 169.87135f, 127.11439f, 174.12f, 127.94f),
                    PathNode.CurveTo(217.88f, 135.8f, 244.0f, 153.77f, 244.0f, 176.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mapPinSimpleArea!!
    }

private var _mapPinSimpleArea: ImageVector? = null
