package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Barn: ImageVector
    get() {
        if (_barn != null) return _barn!!
        _barn = phosphorBoldIcon(
            name = "Barn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 84.0f),
                    PathNode.CurveTo(100.0f, 77.37258f, 105.37258f, 72.0f, 112.0f, 72.0f),
                    PathNode.LineTo(144.0f, 72.0f),
                    PathNode.CurveTo(150.62741f, 72.0f, 156.0f, 77.37258f, 156.0f, 84.0f),
                    PathNode.CurveTo(156.0f, 90.62742f, 150.62741f, 96.0f, 144.0f, 96.0f),
                    PathNode.LineTo(112.0f, 96.0f),
                    PathNode.CurveTo(105.37258f, 96.0f, 100.0f, 90.62742f, 100.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(252.0f, 200.0f),
                    PathNode.CurveTo(252.0f, 206.62741f, 246.62741f, 212.0f, 240.0f, 212.0f),
                    PathNode.LineTo(16.0f, 212.0f),
                    PathNode.CurveTo(9.372583f, 212.0f, 4.0f, 206.62741f, 4.0f, 200.0f),
                    PathNode.CurveTo(4.0f, 193.37259f, 9.372583f, 188.0f, 16.0f, 188.0f),
                    PathNode.LineTo(20.0f, 188.0f),
                    PathNode.LineTo(20.0f, 139.31f),
                    PathNode.CurveTo(15.05579f, 141.065f, 9.544681f, 139.40463f, 6.392781f, 135.21053f),
                    PathNode.CurveTo(3.240881f, 131.01639f, 3.179002f, 125.26093f, 6.24f, 121.0f),
                    PathNode.LineTo(46.24f, 65.0f),
                    PathNode.CurveTo(47.043655f, 63.86951f, 48.03861f, 62.888096f, 49.18f, 62.1f),
                    PathNode.LineTo(116.74f, 15.45f),
                    PathNode.LineTo(116.91f, 15.34f),
                    PathNode.CurveTo(123.62124f, 10.848702f, 132.37875f, 10.848702f, 139.09f, 15.34f),
                    PathNode.LineTo(139.26f, 15.45f),
                    PathNode.LineTo(206.82f, 62.1f),
                    PathNode.CurveTo(207.9614f, 62.888096f, 208.95634f, 63.86951f, 209.76f, 65.0f),
                    PathNode.LineTo(249.76f, 121.0f),
                    PathNode.CurveTo(252.821f, 125.26093f, 252.75912f, 131.01639f, 249.60722f, 135.21053f),
                    PathNode.CurveTo(246.45532f, 139.40463f, 240.94421f, 141.065f, 236.0f, 139.31f),
                    PathNode.LineTo(236.0f, 188.0f),
                    PathNode.LineTo(240.0f, 188.0f),
                    PathNode.CurveTo(246.62741f, 188.0f, 252.0f, 193.37259f, 252.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 188.0f),
                    PathNode.LineTo(64.0f, 188.0f),
                    PathNode.LineTo(64.0f, 124.0f),
                    PathNode.CurveTo(64.0f, 117.37258f, 69.37258f, 112.0f, 76.0f, 112.0f),
                    PathNode.LineTo(180.0f, 112.0f),
                    PathNode.CurveTo(186.62741f, 112.0f, 192.0f, 117.37258f, 192.0f, 124.0f),
                    PathNode.LineTo(192.0f, 188.0f),
                    PathNode.LineTo(212.0f, 188.0f),
                    PathNode.LineTo(212.0f, 109.45f),
                    PathNode.LineTo(191.45f, 80.69f),
                    PathNode.LineTo(128.0f, 36.87f),
                    PathNode.LineTo(64.55f, 80.69f),
                    PathNode.LineTo(44.0f, 109.45f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 136.0f),
                    PathNode.LineTo(113.9f, 136.0f),
                    PathNode.LineTo(168.0f, 174.07f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 188.0f),
                    PathNode.LineTo(146.1f, 188.0f),
                    PathNode.LineTo(88.0f, 147.12f),
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
        return _barn!!
    }

private var _barn: ImageVector? = null
