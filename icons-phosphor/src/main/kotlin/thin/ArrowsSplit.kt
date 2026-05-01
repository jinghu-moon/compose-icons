package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ArrowsSplit: ImageVector
    get() {
        if (_arrowsSplit != null) return _arrowsSplit!!
        _arrowsSplit = phosphorThinIcon(
            name = "ArrowsSplit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(226.83f, 186.83f),
                    PathNode.LineTo(194.83f, 218.83f),
                    PathNode.CurveTo(194.07973f, 219.58112f, 193.06163f, 220.00314f, 192.0f, 220.00314f),
                    PathNode.CurveTo(190.93837f, 220.00314f, 189.92027f, 219.58112f, 189.17f, 218.83f),
                    PathNode.LineTo(157.17f, 186.83f),
                    PathNode.CurveTo(155.60704f, 185.26703f, 155.60704f, 182.73297f, 157.17f, 181.17f),
                    PathNode.CurveTo(158.73297f, 179.60704f, 161.26703f, 179.60704f, 162.83f, 181.17f),
                    PathNode.LineTo(188.0f, 206.34f),
                    PathNode.LineTo(188.0f, 137.66f),
                    PathNode.LineTo(128.0f, 77.66f),
                    PathNode.LineTo(68.0f, 137.66f),
                    PathNode.LineTo(68.0f, 206.34f),
                    PathNode.LineTo(93.17f, 181.17f),
                    PathNode.CurveTo(94.73296f, 179.60704f, 97.26704f, 179.60704f, 98.83f, 181.17f),
                    PathNode.CurveTo(100.39297f, 182.73297f, 100.39297f, 185.26703f, 98.83f, 186.83f),
                    PathNode.LineTo(66.83f, 218.83f),
                    PathNode.CurveTo(66.07973f, 219.58112f, 65.06164f, 220.00314f, 64.0f, 220.00314f),
                    PathNode.CurveTo(62.938362f, 220.00314f, 61.920273f, 219.58112f, 61.17f, 218.83f),
                    PathNode.LineTo(29.17f, 186.83f),
                    PathNode.CurveTo(27.607035f, 185.26703f, 27.607035f, 182.73297f, 29.17f, 181.17f),
                    PathNode.CurveTo(30.732965f, 179.60704f, 33.267033f, 179.60704f, 34.83f, 181.17f),
                    PathNode.LineTo(60.0f, 206.34f),
                    PathNode.LineTo(60.0f, 136.0f),
                    PathNode.CurveTo(59.999165f, 134.93881f, 60.420044f, 133.92079f, 61.17f, 133.17f),
                    PathNode.LineTo(124.0f, 70.34f),
                    PathNode.LineTo(124.0f, 24.0f),
                    PathNode.CurveTo(124.0f, 21.790861f, 125.79086f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(130.20914f, 20.0f, 132.0f, 21.790861f, 132.0f, 24.0f),
                    PathNode.LineTo(132.0f, 70.34f),
                    PathNode.LineTo(194.83f, 133.17f),
                    PathNode.CurveTo(195.57996f, 133.92079f, 196.00084f, 134.93881f, 196.0f, 136.0f),
                    PathNode.LineTo(196.0f, 206.34f),
                    PathNode.LineTo(221.17f, 181.17f),
                    PathNode.CurveTo(222.73297f, 179.60704f, 225.26703f, 179.60704f, 226.83f, 181.17f),
                    PathNode.CurveTo(228.39296f, 182.73297f, 228.39296f, 185.26703f, 226.83f, 186.83f),
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
        return _arrowsSplit!!
    }

private var _arrowsSplit: ImageVector? = null
