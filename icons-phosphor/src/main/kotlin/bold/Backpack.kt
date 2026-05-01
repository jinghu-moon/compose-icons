package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Backpack: ImageVector
    get() {
        if (_backpack != null) return _backpack!!
        _backpack = phosphorBoldIcon(
            name = "Backpack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 48.55f),
                    PathNode.LineTo(172.0f, 36.0f),
                    PathNode.CurveTo(172.0f, 20.536028f, 159.46397f, 8.0f, 144.0f, 8.0f),
                    PathNode.LineTo(112.0f, 8.0f),
                    PathNode.CurveTo(96.536026f, 8.0f, 84.0f, 20.536028f, 84.0f, 36.0f),
                    PathNode.LineTo(84.0f, 48.55f),
                    PathNode.CurveTo(54.246094f, 52.58818f, 32.04208f, 77.97334f, 32.0f, 108.0f),
                    PathNode.LineTo(32.0f, 220.0f),
                    PathNode.CurveTo(32.0f, 231.0457f, 40.954304f, 240.0f, 52.0f, 240.0f),
                    PathNode.LineTo(204.0f, 240.0f),
                    PathNode.CurveTo(215.0457f, 240.0f, 224.0f, 231.0457f, 224.0f, 220.0f),
                    PathNode.LineTo(224.0f, 108.0f),
                    PathNode.CurveTo(223.95792f, 77.97334f, 201.7539f, 52.58818f, 172.0f, 48.55f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 32.0f),
                    PathNode.LineTo(144.0f, 32.0f),
                    PathNode.CurveTo(146.20914f, 32.0f, 148.0f, 33.79086f, 148.0f, 36.0f),
                    PathNode.LineTo(148.0f, 48.0f),
                    PathNode.LineTo(108.0f, 48.0f),
                    PathNode.LineTo(108.0f, 36.0f),
                    PathNode.CurveTo(108.0f, 33.79086f, 109.79086f, 32.0f, 112.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 160.0f),
                    PathNode.LineTo(96.0f, 160.0f),
                    PathNode.LineTo(96.0f, 152.0f),
                    PathNode.CurveTo(96.0f, 149.79086f, 97.79086f, 148.0f, 100.0f, 148.0f),
                    PathNode.LineTo(156.0f, 148.0f),
                    PathNode.CurveTo(158.20914f, 148.0f, 160.0f, 149.79086f, 160.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 184.0f),
                    PathNode.LineTo(160.0f, 184.0f),
                    PathNode.LineTo(160.0f, 216.0f),
                    PathNode.LineTo(96.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 216.0f),
                    PathNode.LineTo(184.0f, 216.0f),
                    PathNode.LineTo(184.0f, 152.0f),
                    PathNode.CurveTo(184.0f, 136.53603f, 171.46397f, 124.0f, 156.0f, 124.0f),
                    PathNode.LineTo(100.0f, 124.0f),
                    PathNode.CurveTo(84.536026f, 124.0f, 72.0f, 136.53603f, 72.0f, 152.0f),
                    PathNode.LineTo(72.0f, 216.0f),
                    PathNode.LineTo(56.0f, 216.0f),
                    PathNode.LineTo(56.0f, 108.0f),
                    PathNode.CurveTo(56.0f, 88.11775f, 72.11775f, 72.0f, 92.0f, 72.0f),
                    PathNode.LineTo(164.0f, 72.0f),
                    PathNode.CurveTo(183.88223f, 72.0f, 200.0f, 88.11775f, 200.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 100.0f),
                    PathNode.CurveTo(160.0f, 106.62742f, 154.62741f, 112.0f, 148.0f, 112.0f),
                    PathNode.LineTo(108.0f, 112.0f),
                    PathNode.CurveTo(101.37258f, 112.0f, 96.0f, 106.62742f, 96.0f, 100.0f),
                    PathNode.CurveTo(96.0f, 93.37258f, 101.37258f, 88.0f, 108.0f, 88.0f),
                    PathNode.LineTo(148.0f, 88.0f),
                    PathNode.CurveTo(154.62741f, 88.0f, 160.0f, 93.37258f, 160.0f, 100.0f),
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
        return _backpack!!
    }

private var _backpack: ImageVector? = null
