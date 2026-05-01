package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Shapes: ImageVector
    get() {
        if (_shapes != null) return _shapes!!
        _shapes = phosphorBoldIcon(
            name = "Shapes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(71.49f, 60.55f),
                    PathNode.CurveTo(69.974f, 55.463978f, 65.29716f, 51.97783f, 59.99f, 51.97783f),
                    PathNode.CurveTo(54.68285f, 51.97783f, 50.006f, 55.463978f, 48.49f, 60.55f),
                    PathNode.LineTo(12.49f, 180.55f),
                    PathNode.CurveTo(11.398492f, 184.18625f, 12.092108f, 188.12454f, 14.360244f, 191.16908f),
                    PathNode.CurveTo(16.62838f, 194.21362f, 20.203466f, 196.00526f, 24.0f, 196.0f),
                    PathNode.LineTo(96.0f, 196.0f),
                    PathNode.CurveTo(99.793015f, 195.99893f, 103.36223f, 194.20465f, 105.625725f, 191.16106f),
                    PathNode.CurveTo(107.88922f, 188.11745f, 108.58049f, 184.18288f, 107.49f, 180.55f),
                    PathNode.Close,
                    PathNode.MoveTo(40.13f, 172.0f),
                    PathNode.LineTo(60.0f, 105.76f),
                    PathNode.LineTo(79.87f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 74.0f),
                    PathNode.CurveTo(212.0f, 44.176624f, 187.82338f, 20.0f, 158.0f, 20.0f),
                    PathNode.CurveTo(128.17662f, 20.0f, 104.0f, 44.176624f, 104.0f, 74.0f),
                    PathNode.CurveTo(104.0f, 103.82338f, 128.17662f, 128.0f, 158.0f, 128.0f),
                    PathNode.CurveTo(187.80966f, 127.966934f, 211.96693f, 103.80967f, 212.0f, 74.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 74.0f),
                    PathNode.CurveTo(128.0f, 57.431458f, 141.43146f, 44.0f, 158.0f, 44.0f),
                    PathNode.CurveTo(174.56854f, 44.0f, 188.0f, 57.431458f, 188.0f, 74.0f),
                    PathNode.CurveTo(188.0f, 90.56854f, 174.56854f, 104.0f, 158.0f, 104.0f),
                    PathNode.CurveTo(141.43146f, 104.0f, 128.0f, 90.56854f, 128.0f, 74.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 144.0f),
                    PathNode.LineTo(136.0f, 144.0f),
                    PathNode.CurveTo(129.37259f, 144.0f, 124.0f, 149.37259f, 124.0f, 156.0f),
                    PathNode.LineTo(124.0f, 208.0f),
                    PathNode.CurveTo(124.0f, 214.62741f, 129.37259f, 220.0f, 136.0f, 220.0f),
                    PathNode.LineTo(224.0f, 220.0f),
                    PathNode.CurveTo(230.62741f, 220.0f, 236.0f, 214.62741f, 236.0f, 208.0f),
                    PathNode.LineTo(236.0f, 156.0f),
                    PathNode.CurveTo(236.0f, 149.37259f, 230.62741f, 144.0f, 224.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 196.0f),
                    PathNode.LineTo(148.0f, 196.0f),
                    PathNode.LineTo(148.0f, 168.0f),
                    PathNode.LineTo(212.0f, 168.0f),
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
        return _shapes!!
    }

private var _shapes: ImageVector? = null
