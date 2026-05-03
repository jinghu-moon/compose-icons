package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaintBrushBroad: ImageVector
    get() {
        if (_paintBrushBroad != null) return _paintBrushBroad!!
        _paintBrushBroad = phosphorThinIcon(
            name = "PaintBrushBroad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 28.0f),
                    PathNode.LineTo(72.0f, 28.0f),
                    PathNode.CurveTo(52.11775f, 28.0f, 36.0f, 44.11775f, 36.0f, 64.0f),
                    PathNode.LineTo(36.0f, 136.0f),
                    PathNode.CurveTo(36.0f, 147.0457f, 44.954304f, 156.0f, 56.0f, 156.0f),
                    PathNode.LineTo(104.0f, 156.0f),
                    PathNode.CurveTo(105.157425f, 155.99017f, 106.26237f, 156.4822f, 107.02944f, 157.34897f),
                    PathNode.CurveTo(107.79652f, 158.21579f, 108.15051f, 159.37238f, 108.0f, 160.52f),
                    PathNode.LineTo(100.1f, 207.33f),
                    PathNode.CurveTo(100.06018f, 207.55112f, 100.04011f, 207.77533f, 100.04f, 208.0f),
                    PathNode.CurveTo(100.04f, 223.46397f, 112.57603f, 236.0f, 128.04f, 236.0f),
                    PathNode.CurveTo(143.50397f, 236.0f, 156.04f, 223.46397f, 156.04f, 208.0f),
                    PathNode.CurveTo(156.0399f, 207.77533f, 156.01982f, 207.55112f, 155.98f, 207.33f),
                    PathNode.LineTo(148.0f, 160.52f),
                    PathNode.CurveTo(147.84949f, 159.37238f, 148.20348f, 158.21579f, 148.97055f, 157.34897f),
                    PathNode.CurveTo(149.73763f, 156.4822f, 150.84258f, 155.99017f, 152.0f, 156.0f),
                    PathNode.LineTo(200.0f, 156.0f),
                    PathNode.CurveTo(211.0457f, 156.0f, 220.0f, 147.0457f, 220.0f, 136.0f),
                    PathNode.LineTo(220.0f, 32.0f),
                    PathNode.CurveTo(220.0f, 29.790861f, 218.20914f, 28.0f, 216.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 36.0f),
                    PathNode.LineTo(180.0f, 36.0f),
                    PathNode.LineTo(180.0f, 80.0f),
                    PathNode.CurveTo(180.0f, 82.20914f, 181.79086f, 84.0f, 184.0f, 84.0f),
                    PathNode.CurveTo(186.20914f, 84.0f, 188.0f, 82.20914f, 188.0f, 80.0f),
                    PathNode.LineTo(188.0f, 36.0f),
                    PathNode.LineTo(212.0f, 36.0f),
                    PathNode.LineTo(212.0f, 108.0f),
                    PathNode.LineTo(44.0f, 108.0f),
                    PathNode.LineTo(44.0f, 64.0f),
                    PathNode.CurveTo(44.0f, 48.53603f, 56.53603f, 36.0f, 72.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 148.0f),
                    PathNode.LineTo(152.0f, 148.0f),
                    PathNode.CurveTo(148.5206f, 147.9997f, 145.21239f, 149.50961f, 142.93289f, 152.13832f),
                    PathNode.CurveTo(140.6534f, 154.76703f, 139.62709f, 158.25569f, 140.12f, 161.7f),
                    PathNode.CurveTo(140.12f, 161.7f, 140.12f, 161.76f, 140.12f, 161.8f),
                    PathNode.LineTo(148.0f, 208.32f),
                    PathNode.CurveTo(148.0f, 219.36569f, 139.0457f, 228.32f, 128.0f, 228.32f),
                    PathNode.CurveTo(116.95431f, 228.32f, 108.0f, 219.36569f, 108.0f, 208.32f),
                    PathNode.LineTo(115.86f, 161.8f),
                    PathNode.CurveTo(115.86f, 161.8f, 115.86f, 161.73f, 115.86f, 161.7f),
                    PathNode.CurveTo(116.352425f, 158.25916f, 115.32868f, 154.77383f, 113.053665f, 152.14586f),
                    PathNode.CurveTo(110.77865f, 149.5179f, 107.4759f, 148.0055f, 104.0f, 148.0f),
                    PathNode.LineTo(56.0f, 148.0f),
                    PathNode.CurveTo(49.37258f, 148.0f, 44.0f, 142.62741f, 44.0f, 136.0f),
                    PathNode.LineTo(44.0f, 116.0f),
                    PathNode.LineTo(212.0f, 116.0f),
                    PathNode.LineTo(212.0f, 136.0f),
                    PathNode.CurveTo(212.0f, 142.62741f, 206.62741f, 148.0f, 200.0f, 148.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _paintBrushBroad!!
    }

private var _paintBrushBroad: ImageVector? = null
