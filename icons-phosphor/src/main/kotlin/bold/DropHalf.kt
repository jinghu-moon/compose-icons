package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DropHalf: ImageVector
    get() {
        if (_dropHalf != null) return _dropHalf!!
        _dropHalf = phosphorBoldIcon(
            name = "DropHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(134.88f, 6.17f),
                    PathNode.CurveTo(130.74884f, 3.279156f, 125.25116f, 3.279156f, 121.12f, 6.17f),
                    PathNode.CurveTo(105.65732f, 17.565681f, 91.51032f, 30.646122f, 78.94f, 45.17f),
                    PathNode.CurveTo(50.85f, 77.43f, 36.0f, 111.63f, 36.0f, 144.0f),
                    PathNode.CurveTo(36.0f, 194.8102f, 77.18981f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(178.8102f, 236.0f, 220.0f, 194.8102f, 220.0f, 144.0f),
                    PathNode.CurveTo(220.0f, 66.64f, 138.36f, 8.6f, 134.88f, 6.17f),
                    PathNode.Close,
                    PathNode.MoveTo(194.08f, 160.0f),
                    PathNode.LineTo(140.0f, 160.0f),
                    PathNode.LineTo(140.0f, 144.0f),
                    PathNode.LineTo(196.0f, 144.0f),
                    PathNode.CurveTo(195.99644f, 149.39058f, 195.35193f, 154.76163f, 194.08f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 120.0f),
                    PathNode.LineTo(140.0f, 104.0f),
                    PathNode.LineTo(187.0f, 104.0f),
                    PathNode.CurveTo(189.28499f, 109.1861f, 191.18349f, 114.534f, 192.68f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(159.3f, 61.29f),
                    PathNode.CurveTo(164.46236f, 67.23416f, 169.26428f, 73.482f, 173.68f, 80.0f),
                    PathNode.LineTo(140.0f, 80.0f),
                    PathNode.LineTo(140.0f, 41.46f),
                    PathNode.CurveTo(146.80402f, 47.698814f, 153.24776f, 54.319504f, 159.3f, 61.29f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 144.0f),
                    PathNode.CurveTo(60.0f, 110.69f, 80.0f, 80.63f, 96.7f, 61.29f),
                    PathNode.CurveTo(102.75224f, 54.319504f, 109.19598f, 47.698814f, 116.0f, 41.46f),
                    PathNode.LineTo(116.0f, 210.92f),
                    PathNode.CurveTo(83.61668f, 205.07314f, 60.046597f, 176.90688f, 60.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 210.92f),
                    PathNode.LineTo(140.0f, 184.0f),
                    PathNode.LineTo(182.94f, 184.0f),
                    PathNode.CurveTo(172.63028f, 198.17125f, 157.24745f, 207.81508f, 140.0f, 210.92f),
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
        return _dropHalf!!
    }

private var _dropHalf: ImageVector? = null
