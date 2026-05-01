package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaperclipHorizontal: ImageVector
    get() {
        if (_paperclipHorizontal != null) return _paperclipHorizontal!!
        _paperclipHorizontal = phosphorThinIcon(
            name = "PaperclipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 128.0f),
                    PathNode.CurveTo(243.96693f, 156.7051f, 220.7051f, 179.96693f, 192.0f, 180.0f),
                    PathNode.LineTo(48.0f, 180.0f),
                    PathNode.CurveTo(28.117748f, 180.0f, 12.0f, 163.88223f, 12.0f, 144.0f),
                    PathNode.CurveTo(12.0f, 124.11775f, 28.117748f, 108.0f, 48.0f, 108.0f),
                    PathNode.LineTo(192.0f, 108.0f),
                    PathNode.CurveTo(203.0457f, 108.0f, 212.0f, 116.95431f, 212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 139.0457f, 203.0457f, 148.0f, 192.0f, 148.0f),
                    PathNode.LineTo(80.0f, 148.0f),
                    PathNode.CurveTo(77.79086f, 148.0f, 76.0f, 146.20914f, 76.0f, 144.0f),
                    PathNode.CurveTo(76.0f, 141.79086f, 77.79086f, 140.0f, 80.0f, 140.0f),
                    PathNode.LineTo(192.0f, 140.0f),
                    PathNode.CurveTo(198.62741f, 140.0f, 204.0f, 134.62741f, 204.0f, 128.0f),
                    PathNode.CurveTo(204.0f, 121.37258f, 198.62741f, 116.0f, 192.0f, 116.0f),
                    PathNode.LineTo(48.0f, 116.0f),
                    PathNode.CurveTo(32.536026f, 116.0f, 20.0f, 128.53603f, 20.0f, 144.0f),
                    PathNode.CurveTo(20.0f, 159.46397f, 32.536026f, 172.0f, 48.0f, 172.0f),
                    PathNode.LineTo(192.0f, 172.0f),
                    PathNode.CurveTo(216.30052f, 172.0f, 236.0f, 152.30052f, 236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 103.69947f, 216.30052f, 84.0f, 192.0f, 84.0f),
                    PathNode.LineTo(80.0f, 84.0f),
                    PathNode.CurveTo(77.79086f, 84.0f, 76.0f, 82.20914f, 76.0f, 80.0f),
                    PathNode.CurveTo(76.0f, 77.79086f, 77.79086f, 76.0f, 80.0f, 76.0f),
                    PathNode.LineTo(192.0f, 76.0f),
                    PathNode.CurveTo(220.7051f, 76.033066f, 243.96693f, 99.2949f, 244.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _paperclipHorizontal!!
    }

private var _paperclipHorizontal: ImageVector? = null
