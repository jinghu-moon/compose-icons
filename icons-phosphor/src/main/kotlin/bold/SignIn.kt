package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SignIn: ImageVector
    get() {
        if (_signIn != null) return _signIn!!
        _signIn = phosphorBoldIcon(
            name = "SignIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.49f, 136.49f),
                    PathNode.LineTo(104.49f, 176.49f),
                    PathNode.CurveTo(99.79558f, 181.18442f, 92.18442f, 181.18442f, 87.49f, 176.49f),
                    PathNode.CurveTo(82.79558f, 171.79558f, 82.79558f, 164.18442f, 87.49f, 159.49f),
                    PathNode.LineTo(107.0f, 140.0f),
                    PathNode.LineTo(24.0f, 140.0f),
                    PathNode.CurveTo(17.372583f, 140.0f, 12.0f, 134.62741f, 12.0f, 128.0f),
                    PathNode.CurveTo(12.0f, 121.37258f, 17.372583f, 116.0f, 24.0f, 116.0f),
                    PathNode.LineTo(107.0f, 116.0f),
                    PathNode.LineTo(87.51f, 96.49f),
                    PathNode.CurveTo(82.81558f, 91.79558f, 82.81558f, 84.18442f, 87.51f, 79.49f),
                    PathNode.CurveTo(92.20442f, 74.79558f, 99.81558f, 74.79558f, 104.51f, 79.49f),
                    PathNode.LineTo(144.51f, 119.49f),
                    PathNode.CurveTo(146.7668f, 121.74428f, 148.03322f, 124.80434f, 148.02946f, 127.99415f),
                    PathNode.CurveTo(148.02571f, 131.18398f, 146.7521f, 134.24104f, 144.49f, 136.49f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 28.0f),
                    PathNode.LineTo(136.0f, 28.0f),
                    PathNode.CurveTo(129.37259f, 28.0f, 124.0f, 33.37258f, 124.0f, 40.0f),
                    PathNode.CurveTo(124.0f, 46.62742f, 129.37259f, 52.0f, 136.0f, 52.0f),
                    PathNode.LineTo(188.0f, 52.0f),
                    PathNode.LineTo(188.0f, 204.0f),
                    PathNode.LineTo(136.0f, 204.0f),
                    PathNode.CurveTo(129.37259f, 204.0f, 124.0f, 209.37259f, 124.0f, 216.0f),
                    PathNode.CurveTo(124.0f, 222.62741f, 129.37259f, 228.0f, 136.0f, 228.0f),
                    PathNode.LineTo(200.0f, 228.0f),
                    PathNode.CurveTo(206.62741f, 228.0f, 212.0f, 222.62741f, 212.0f, 216.0f),
                    PathNode.LineTo(212.0f, 40.0f),
                    PathNode.CurveTo(212.0f, 33.37258f, 206.62741f, 28.0f, 200.0f, 28.0f),
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
        return _signIn!!
    }

private var _signIn: ImageVector? = null
