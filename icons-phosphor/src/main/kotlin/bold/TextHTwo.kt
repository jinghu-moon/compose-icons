package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextHTwo: ImageVector
    get() {
        if (_textHTwo != null) return _textHTwo!!
        _textHTwo = phosphorBoldIcon(
            name = "TextHTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(156.0f, 56.0f),
                    PathNode.LineTo(156.0f, 176.0f),
                    PathNode.CurveTo(156.0f, 182.62741f, 150.62741f, 188.0f, 144.0f, 188.0f),
                    PathNode.CurveTo(137.37259f, 188.0f, 132.0f, 182.62741f, 132.0f, 176.0f),
                    PathNode.LineTo(132.0f, 128.0f),
                    PathNode.LineTo(52.0f, 128.0f),
                    PathNode.LineTo(52.0f, 176.0f),
                    PathNode.CurveTo(52.0f, 182.62741f, 46.62742f, 188.0f, 40.0f, 188.0f),
                    PathNode.CurveTo(33.37258f, 188.0f, 28.0f, 182.62741f, 28.0f, 176.0f),
                    PathNode.LineTo(28.0f, 56.0f),
                    PathNode.CurveTo(28.0f, 49.37258f, 33.37258f, 44.0f, 40.0f, 44.0f),
                    PathNode.CurveTo(46.62742f, 44.0f, 52.0f, 49.37258f, 52.0f, 56.0f),
                    PathNode.LineTo(52.0f, 104.0f),
                    PathNode.LineTo(132.0f, 104.0f),
                    PathNode.LineTo(132.0f, 56.0f),
                    PathNode.CurveTo(132.0f, 49.37258f, 137.37259f, 44.0f, 144.0f, 44.0f),
                    PathNode.CurveTo(150.62741f, 44.0f, 156.0f, 49.37258f, 156.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 196.0f),
                    PathNode.LineTo(216.0f, 196.0f),
                    PathNode.LineTo(244.74f, 157.67f),
                    PathNode.CurveTo(253.27536f, 146.34392f, 254.3657f, 131.06198f, 247.52483f, 118.638824f),
                    PathNode.CurveTo(240.68394f, 106.21567f, 227.1867f, 98.96647f, 213.0519f, 100.12385f),
                    PathNode.CurveTo(198.91707f, 101.28123f, 186.77885f, 110.62949f, 182.05f, 124.0f),
                    PathNode.CurveTo(179.84087f, 130.2491f, 183.1159f, 137.10587f, 189.365f, 139.315f),
                    PathNode.CurveTo(195.6141f, 141.52414f, 202.47084f, 138.2491f, 204.68f, 132.0f),
                    PathNode.CurveTo(205.08395f, 130.84245f, 205.66777f, 129.7558f, 206.41f, 128.78f),
                    PathNode.CurveTo(208.96179f, 125.27121f, 213.20883f, 123.41306f, 217.51767f, 123.92023f),
                    PathNode.CurveTo(221.82649f, 124.42739f, 225.52603f, 127.22087f, 227.19337f, 131.22627f),
                    PathNode.CurveTo(228.86072f, 135.23167f, 228.23619f, 139.82515f, 225.56f, 143.24f),
                    PathNode.LineTo(182.4f, 200.8f),
                    PathNode.CurveTo(179.67284f, 204.43622f, 179.23418f, 209.30115f, 181.26688f, 213.36656f),
                    PathNode.CurveTo(183.29956f, 217.43199f, 187.45474f, 220.0f, 192.0f, 220.0f),
                    PathNode.LineTo(240.0f, 220.0f),
                    PathNode.CurveTo(246.62741f, 220.0f, 252.0f, 214.62741f, 252.0f, 208.0f),
                    PathNode.CurveTo(252.0f, 201.37259f, 246.62741f, 196.0f, 240.0f, 196.0f),
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
        return _textHTwo!!
    }

private var _textHTwo: ImageVector? = null
