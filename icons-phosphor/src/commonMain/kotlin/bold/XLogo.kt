package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.XLogo: ImageVector
    get() {
        if (_xLogo != null) return _xLogo!!
        _xLogo = phosphorBoldIcon(
            name = "XLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(218.12f, 209.56f),
                    PathNode.LineTo(157.12f, 113.76f),
                    PathNode.LineTo(216.84f, 48.07f),
                    PathNode.CurveTo(221.2009f, 43.15425f, 220.79692f, 35.64535f, 215.93382f, 31.225838f),
                    PathNode.CurveTo(211.07071f, 26.80632f, 203.55751f, 27.120228f, 199.08f, 31.93f),
                    PathNode.LineTo(143.81f, 92.77f),
                    PathNode.LineTo(106.12f, 33.56f),
                    PathNode.CurveTo(103.91865f, 30.098845f, 100.10189f, 28.001892f, 96.0f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(43.62175f, 28.002018f, 39.59209f, 30.388386f, 37.485645f, 34.226612f),
                    PathNode.CurveTo(35.3792f, 38.06484f, 35.53034f, 42.745655f, 37.88f, 46.44f),
                    PathNode.LineTo(98.88f, 142.24f),
                    PathNode.LineTo(39.12f, 207.93f),
                    PathNode.CurveTo(36.175465f, 211.09306f, 35.15908f, 215.59502f, 36.459072f, 219.71634f),
                    PathNode.CurveTo(37.759064f, 223.83765f, 41.174625f, 226.94165f, 45.401115f, 227.84271f),
                    PathNode.CurveTo(49.6276f, 228.74379f, 54.012154f, 227.30273f, 56.88f, 224.07f),
                    PathNode.LineTo(112.19f, 163.23f),
                    PathNode.LineTo(149.88f, 222.44f),
                    PathNode.CurveTo(152.08134f, 225.90115f, 155.8981f, 227.99811f, 160.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(212.37825f, 227.99799f, 216.40791f, 225.61162f, 218.51436f, 221.77339f),
                    PathNode.CurveTo(220.6208f, 217.93517f, 220.46967f, 213.25435f, 218.12f, 209.56f),
                    PathNode.Close,
                    PathNode.MoveTo(166.59f, 204.0f),
                    PathNode.LineTo(69.86f, 52.0f),
                    PathNode.LineTo(89.41f, 52.0f),
                    PathNode.LineTo(186.14f, 204.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _xLogo!!
    }

private var _xLogo: ImageVector? = null
