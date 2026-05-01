package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Infinity: ImageVector
    get() {
        if (_infinity != null) return _infinity!!
        _infinity = phosphorThinIcon(
            name = "Infinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 128.0f),
                    PathNode.CurveTo(244.00037f, 149.03232f, 231.33096f, 167.99382f, 211.89966f, 176.04259f),
                    PathNode.CurveTo(192.46835f, 184.09135f, 170.10191f, 179.64227f, 155.23f, 164.77f),
                    PathNode.LineTo(155.06f, 164.59f),
                    PathNode.LineTo(95.0f, 96.8f),
                    PathNode.CurveTo(77.791534f, 79.68797f, 49.977253f, 79.74008f, 32.833023f, 96.91646f),
                    PathNode.CurveTo(15.688791f, 114.092834f, 15.688791f, 141.90717f, 32.833023f, 159.08354f),
                    PathNode.CurveTo(49.977253f, 176.25992f, 77.791534f, 176.31203f, 95.0f, 159.2f),
                    PathNode.LineTo(103.6f, 149.48f),
                    PathNode.CurveTo(105.06355f, 147.82315f, 107.59315f, 147.66644f, 109.25f, 149.13f),
                    PathNode.CurveTo(110.90685f, 150.59355f, 111.06355f, 153.12314f, 109.6f, 154.78f),
                    PathNode.LineTo(100.92f, 164.59f),
                    PathNode.LineTo(100.75f, 164.77f),
                    PathNode.CurveTo(80.44261f, 185.07692f, 47.518257f, 185.07663f, 27.211193f, 164.76941f),
                    PathNode.CurveTo(6.904129f, 144.46217f, 6.904129f, 111.53783f, 27.211193f, 91.2306f),
                    PathNode.CurveTo(47.518257f, 70.92337f, 80.44261f, 70.9231f, 100.75f, 91.23f),
                    PathNode.LineTo(100.92f, 91.41f),
                    PathNode.LineTo(160.92f, 159.2f),
                    PathNode.CurveTo(178.12846f, 176.31203f, 205.94275f, 176.25992f, 223.08698f, 159.08354f),
                    PathNode.CurveTo(240.23122f, 141.90717f, 240.23122f, 114.092834f, 223.08698f, 96.91646f),
                    PathNode.CurveTo(205.94275f, 79.74008f, 178.12846f, 79.68797f, 160.92f, 96.8f),
                    PathNode.LineTo(152.32f, 106.52f),
                    PathNode.CurveTo(150.85645f, 108.17686f, 148.32686f, 108.33356f, 146.67f, 106.87f),
                    PathNode.CurveTo(145.01315f, 105.40645f, 144.85645f, 102.876854f, 146.32f, 101.22f),
                    PathNode.LineTo(155.0f, 91.41f),
                    PathNode.LineTo(155.17f, 91.23f),
                    PathNode.CurveTo(170.03624f, 76.314735f, 192.43059f, 71.8383f, 211.88821f, 79.89253f),
                    PathNode.CurveTo(231.34586f, 87.94676f, 244.02472f, 106.94129f, 244.0f, 128.0f),
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
        return _infinity!!
    }

private var _infinity: ImageVector? = null
