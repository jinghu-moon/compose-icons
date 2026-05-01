package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Gradient: ImageVector
    get() {
        if (_gradient != null) return _gradient!!
        _gradient = phosphorThinIcon(
            name = "Gradient",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(28.0f, 104.0f),
                    PathNode.CurveTo(28.0f, 101.79086f, 29.790861f, 100.0f, 32.0f, 100.0f),
                    PathNode.LineTo(112.0f, 100.0f),
                    PathNode.CurveTo(114.20914f, 100.0f, 116.0f, 101.79086f, 116.0f, 104.0f),
                    PathNode.CurveTo(116.0f, 106.20914f, 114.20914f, 108.0f, 112.0f, 108.0f),
                    PathNode.LineTo(32.0f, 108.0f),
                    PathNode.CurveTo(29.790861f, 108.0f, 28.0f, 106.20914f, 28.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 100.0f),
                    PathNode.LineTo(144.0f, 100.0f),
                    PathNode.CurveTo(141.79086f, 100.0f, 140.0f, 101.79086f, 140.0f, 104.0f),
                    PathNode.CurveTo(140.0f, 106.20914f, 141.79086f, 108.0f, 144.0f, 108.0f),
                    PathNode.LineTo(224.0f, 108.0f),
                    PathNode.CurveTo(226.20914f, 108.0f, 228.0f, 106.20914f, 228.0f, 104.0f),
                    PathNode.CurveTo(228.0f, 101.79086f, 226.20914f, 100.0f, 224.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 140.0f),
                    PathNode.LineTo(32.0f, 140.0f),
                    PathNode.CurveTo(29.790861f, 140.0f, 28.0f, 141.79086f, 28.0f, 144.0f),
                    PathNode.CurveTo(28.0f, 146.20914f, 29.790861f, 148.0f, 32.0f, 148.0f),
                    PathNode.LineTo(72.0f, 148.0f),
                    PathNode.CurveTo(74.20914f, 148.0f, 76.0f, 146.20914f, 76.0f, 144.0f),
                    PathNode.CurveTo(76.0f, 141.79086f, 74.20914f, 140.0f, 72.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 140.0f),
                    PathNode.LineTo(184.0f, 140.0f),
                    PathNode.CurveTo(181.79086f, 140.0f, 180.0f, 141.79086f, 180.0f, 144.0f),
                    PathNode.CurveTo(180.0f, 146.20914f, 181.79086f, 148.0f, 184.0f, 148.0f),
                    PathNode.LineTo(224.0f, 148.0f),
                    PathNode.CurveTo(226.20914f, 148.0f, 228.0f, 146.20914f, 228.0f, 144.0f),
                    PathNode.CurveTo(228.0f, 141.79086f, 226.20914f, 140.0f, 224.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 144.0f),
                    PathNode.CurveTo(100.0f, 146.20914f, 101.79086f, 148.0f, 104.0f, 148.0f),
                    PathNode.LineTo(152.0f, 148.0f),
                    PathNode.CurveTo(154.20914f, 148.0f, 156.0f, 146.20914f, 156.0f, 144.0f),
                    PathNode.CurveTo(156.0f, 141.79086f, 154.20914f, 140.0f, 152.0f, 140.0f),
                    PathNode.LineTo(104.0f, 140.0f),
                    PathNode.CurveTo(101.79086f, 140.0f, 100.0f, 141.79086f, 100.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 180.0f),
                    PathNode.LineTo(32.0f, 180.0f),
                    PathNode.CurveTo(29.790861f, 180.0f, 28.0f, 181.79086f, 28.0f, 184.0f),
                    PathNode.CurveTo(28.0f, 186.20914f, 29.790861f, 188.0f, 32.0f, 188.0f),
                    PathNode.LineTo(56.0f, 188.0f),
                    PathNode.CurveTo(58.20914f, 188.0f, 60.0f, 186.20914f, 60.0f, 184.0f),
                    PathNode.CurveTo(60.0f, 181.79086f, 58.20914f, 180.0f, 56.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 180.0f),
                    PathNode.LineTo(88.0f, 180.0f),
                    PathNode.CurveTo(85.79086f, 180.0f, 84.0f, 181.79086f, 84.0f, 184.0f),
                    PathNode.CurveTo(84.0f, 186.20914f, 85.79086f, 188.0f, 88.0f, 188.0f),
                    PathNode.LineTo(112.0f, 188.0f),
                    PathNode.CurveTo(114.20914f, 188.0f, 116.0f, 186.20914f, 116.0f, 184.0f),
                    PathNode.CurveTo(116.0f, 181.79086f, 114.20914f, 180.0f, 112.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 180.0f),
                    PathNode.LineTo(144.0f, 180.0f),
                    PathNode.CurveTo(141.79086f, 180.0f, 140.0f, 181.79086f, 140.0f, 184.0f),
                    PathNode.CurveTo(140.0f, 186.20914f, 141.79086f, 188.0f, 144.0f, 188.0f),
                    PathNode.LineTo(168.0f, 188.0f),
                    PathNode.CurveTo(170.20914f, 188.0f, 172.0f, 186.20914f, 172.0f, 184.0f),
                    PathNode.CurveTo(172.0f, 181.79086f, 170.20914f, 180.0f, 168.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 180.0f),
                    PathNode.LineTo(200.0f, 180.0f),
                    PathNode.CurveTo(197.79086f, 180.0f, 196.0f, 181.79086f, 196.0f, 184.0f),
                    PathNode.CurveTo(196.0f, 186.20914f, 197.79086f, 188.0f, 200.0f, 188.0f),
                    PathNode.LineTo(224.0f, 188.0f),
                    PathNode.CurveTo(226.20914f, 188.0f, 228.0f, 186.20914f, 228.0f, 184.0f),
                    PathNode.CurveTo(228.0f, 181.79086f, 226.20914f, 180.0f, 224.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 68.0f),
                    PathNode.LineTo(224.0f, 68.0f),
                    PathNode.CurveTo(226.20914f, 68.0f, 228.0f, 66.20914f, 228.0f, 64.0f),
                    PathNode.CurveTo(228.0f, 61.79086f, 226.20914f, 60.0f, 224.0f, 60.0f),
                    PathNode.LineTo(32.0f, 60.0f),
                    PathNode.CurveTo(29.790861f, 60.0f, 28.0f, 61.79086f, 28.0f, 64.0f),
                    PathNode.CurveTo(28.0f, 66.20914f, 29.790861f, 68.0f, 32.0f, 68.0f),
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
        return _gradient!!
    }

private var _gradient: ImageVector? = null
